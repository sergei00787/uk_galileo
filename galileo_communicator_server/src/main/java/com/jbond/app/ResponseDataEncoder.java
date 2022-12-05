package com.jbond.app;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;

public class ResponseDataEncoder extends MessageToByteEncoder<ResponseData> {

    @Override
    protected void encode(ChannelHandlerContext channelHandlerContext, ResponseData responseData, ByteBuf byteBuf) throws Exception {
        System.out.println("ServerResponseEncoder send data:" + ByteArr.toHEXString(responseData.getResponseData()));
        byteBuf.writeBytes(responseData.getResponseData());
    }



}
