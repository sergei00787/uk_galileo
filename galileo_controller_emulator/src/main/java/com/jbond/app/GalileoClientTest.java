package com.jbond.app;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.*;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.codec.bytes.ByteArrayDecoder;
import io.netty.handler.codec.bytes.ByteArrayEncoder;

public class GalileoClientTest implements Runnable {
    public static void main(String[] args) throws InterruptedException {
        while (true) {
            GalileoClientTest client = new GalileoClientTest();
            client.run();
            Thread.sleep(10000);
        }
    }

    @Override
    public void run() {
        String host = "localhost";
        int port = 8888;

        EventLoopGroup workerGroup = new NioEventLoopGroup();
        try {
            Bootstrap b = new Bootstrap();
            b.group(workerGroup);
            b.channel(NioSocketChannel.class);
            b.option(ChannelOption.SO_KEEPALIVE, true);
            b.handler(new ChannelInitializer<SocketChannel>() {

                @Override
                public void initChannel(SocketChannel ch)
                        throws Exception {
                    ch.pipeline().addLast(
                            new ByteArrayDecoder(),
                            new ByteArrayEncoder(),
                            new ClientHandler());
                }
            });

            ChannelFuture f = b.connect(host, port).sync();
            try {

                String testHex = "012080019A021803383631323330303433393037363236043200FE06000100000000008EDF";
                byte[] testData = ByteArr.fromString(testHex);
                Channel channel = f.sync().channel();
                channel.write(testData);
                System.out.println("Channel send Test Data");
                channel.flush();
            } catch (Exception e) {
                System.out.println("No connection to the server ");
            }

            f.channel().closeFuture().sync();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            workerGroup.shutdownGracefully();
        }
    }
}
