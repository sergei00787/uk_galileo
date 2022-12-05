package com.jbond.app;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ReplayingDecoder;
import java.util.List;

public class RequestDecoder extends ReplayingDecoder<RequestData> {

    @Override
    protected void decode(ChannelHandlerContext channelHandlerContext, ByteBuf in, List<Object> list) throws Exception {
        RequestData data = new RequestData();
        System.out.println("ServerRequestDecoder reciev data:" + ByteArr.toHEXString(in.array()));
        data.setData(in.array());
        list.add(data);
    }
}
