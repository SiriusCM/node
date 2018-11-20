package com.sirius.server.channer.udp;

import com.sirius.server.proto.MsgRequest;
import com.sirius.server.proto.ProtoBuf;
import com.sirius.server.proto.protobuf.Match;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.channel.socket.DatagramPacket;

public class ClientUdpInHandler extends SimpleChannelInboundHandler<DatagramPacket> {

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, DatagramPacket msg) throws Exception {
        byte[] data = new byte[msg.content().readableBytes()];
        msg.content().readBytes(data);
        ProtoBuf.Message message = ProtoBuf.Message.parseFrom(data);
        MsgRequest msgRequest = MsgRequest.getMsgRequest(message.getId());
        Match.Position position = Match.Position.parseFrom(message.getData());
        System.out.println("(" + position.getX() + "," + position.getY() + "," + position.getZ() + ")");
        ctx.close();
    }
}