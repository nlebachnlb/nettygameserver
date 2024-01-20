package fes.modules.network;

import io.netty.channel.Channel;
import lombok.val;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class ConnectionManager {
    private static volatile ConnectionManager instance;

    Map<String, Integer> channelToUserId = new ConcurrentHashMap<>();
    Map<Integer, Channel> userIdToChannel = new ConcurrentHashMap<>();

    private ConnectionManager() {
        if (instance != null) {
            throw new IllegalStateException("Singleton already initialized.");
        }
    }

    public void onConnect(Channel channel) {

    }

    public void onLogin(Channel channel, int userId) {
        val userConnection = getUserConnection(userId);
        if (userConnection != null) {
            userConnection.disconnect();
        }

        userIdToChannel.put(userId, channel);
        channelToUserId.put(channel.id().asLongText(), userId);
    }

    public void onDisconnect(Channel channel) {
        val id = channel.id().asLongText();
        if (!channelToUserId.containsKey(id))
            return;

        val userId = channelToUserId.get(id);
        userIdToChannel.remove(userId);
        channelToUserId.remove(id);
    }

    public Channel getUserConnection(int userId) {
        return userIdToChannel.getOrDefault(userId, null);
    }

    public static synchronized ConnectionManager getInstance() {
        if (instance == null) {
            instance = new ConnectionManager();
        }

        return instance;
    }
}
