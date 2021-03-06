package com.sirius.server.channer.tcp;

import com.sirius.server.msg.ProtoBuf;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.codec.protobuf.ProtobufDecoder;
import io.netty.handler.codec.protobuf.ProtobufEncoder;

/**
 * @Date:2019/6/28 17:37
 * @Author:高连棣
 */
public class TcpInit extends ChannelInitializer<SocketChannel> {

    @Override
    public void initChannel(SocketChannel ch) {
        ChannelPipeline pipeline = ch.pipeline();
        //出口
        //pipeline.addLast("frameEncoder", new ProtobufVarint32LengthFieldPrepender());
        pipeline.addLast("encoder", new ProtobufEncoder());
        pipeline.addLast("wrap", new TcpOutHandler());
        //入口
        //pipeline.addLast("frameDecoder", new ProtobufVarint32FrameDecoder());
        pipeline.addLast("decoder", new ProtobufDecoder(ProtoBuf.Message.getDefaultInstance()));
        pipeline.addLast("handler", new TcpInHandler());
    }
}
