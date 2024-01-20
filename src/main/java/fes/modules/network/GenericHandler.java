package fes.modules.network;

import fes.generated.GenericPacket;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import lombok.val;

public class GenericHandler extends ChannelInboundHandlerAdapter {
    @Override
    public void handlerAdded(ChannelHandlerContext ctx) throws Exception {
        val channel = ctx.channel();
        ConnectionManager.getInstance().onConnect(channel);
    }

    @Override
    public void handlerRemoved(ChannelHandlerContext ctx) throws Exception {
        val channel = ctx.channel();
        ConnectionManager.getInstance().onDisconnect(channel);
    }

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        GenericPacket packet = (GenericPacket) msg;
        if (packet.getType() != GenericPacket.GenericType.REQUEST)
            return;

        // Dispatch event with the request packet
        val request = packet.getRequest();
    }
}
