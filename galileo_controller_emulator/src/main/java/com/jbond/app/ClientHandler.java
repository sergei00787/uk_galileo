package com.jbond.app;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.util.ReferenceCountUtil;

public class ClientHandler extends SimpleChannelInboundHandler<byte[]> {

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, byte[] msg) throws Exception {
        try {
            byte[] data = msg;
            System.out.println("Recieve response  - " + ByteArr.toHEXString(msg));
            ReferenceCountUtil.release(msg);
            ctx.close();
        } catch (Exception e){
            System.out.println(e);
        } finally {
            ctx.close();
        }
    }
}
