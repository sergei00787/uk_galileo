package com.jbond.app;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.*;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.codec.bytes.ByteArrayDecoder;
import io.netty.handler.codec.bytes.ByteArrayEncoder;

import java.nio.ByteOrder;

public class GalileoCommService implements Runnable {
    private final int port;

    public GalileoCommService(int port) {
        this.port = port;
    }

    public static void main(String[] args) {
        int port = args.length > 0 ? Integer.parseInt(args[0]) : 8888;
        new GalileoCommService(port).run();
    }

    public void run() {
        EventLoopGroup bossGroup = new NioEventLoopGroup();
        EventLoopGroup workerGroup = new NioEventLoopGroup();
        try {
            ServerBootstrap b = new ServerBootstrap();
            ChannelInitializer<NioSocketChannel> initializer = new ChannelInitializer<>() {
                @Override
                protected void initChannel(NioSocketChannel channel) {
                    channel.pipeline().addLast(
                            //new LoggingHandler(getClass(), LogLevel.INFO),
                            new GalileoLengthFieldFrameDecoder(ByteOrder.LITTLE_ENDIAN,
                                    1002,
                                    1,
                                    2,
                                    2,
                                    0,
                                    false),
                            new ByteArrayDecoder(),
                            new ByteArrayEncoder(),
                            new ProcessingHandler());
                }
            };

            b.group(bossGroup, workerGroup).channel(NioServerSocketChannel.class)
                    .childHandler(initializer)
                    .option(ChannelOption.SO_BACKLOG, 128)
                    .childOption(ChannelOption.SO_KEEPALIVE, true);

            ChannelFuture f = b.bind(port).sync();
            System.out.println("Server started. Ready to accept clients.");

            f.channel().closeFuture().sync();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            workerGroup.shutdownGracefully();
            bossGroup.shutdownGracefully();
        }
    }
}
