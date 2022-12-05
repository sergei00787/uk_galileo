package com.jbond.app;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.util.ReferenceCountUtil;

public class ProcessingHandler extends SimpleChannelInboundHandler<byte[]> {
    @Override
    public void channelActive(final ChannelHandlerContext ctx) {
        System.out.println();
        System.out.println("Client joined - " + ctx);
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) {
        System.out.println("Closing connection for client - " + ctx);
        System.out.println("Couse=" + cause);
        ctx.close();
    }

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, byte[] msg) throws Exception {
        try {
            System.out.println("Message-" + ByteArr.toHEXString(msg));
            //String testHex = "012000019A021803383631323330303433393037363236043200FE06000100000000008F29";
            GalileoPacket packet = new GalileoPacket(msg);

            if (GalileoPacket.isValid(msg)) {
                System.out.println("Insert packet in DB - " + packet.getTagsData());
                byte[] crc16 = packet.getCrc16().getBytes();
                byte[] responsePkg = new byte[]{0x02, crc16[0], crc16[1]};
                ctx.writeAndFlush(responsePkg);
                ReferenceCountUtil.release(msg);
            } else {
                ctx.close();
            }

            ctx.flush();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            ctx.close();
        }
    }
}
