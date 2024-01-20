package fes.modules.network;

import io.netty.channel.Channel;

public interface SubHandler<T> {
    void onReceiveCmd(Channel channel, T cmd);
    void onReceiveError(Channel channel, int errorCode);
}
