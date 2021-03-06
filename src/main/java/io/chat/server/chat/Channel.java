package io.chat.server.chat;

import java.util.ArrayList;
import java.util.List;

public class Channel {
    private String channelName;
    private List<Message> messages;

    public Channel() {
        messages = new ArrayList<Message>();
    }

    public Channel(String channelName) {
        this.channelName = channelName;
        messages = new ArrayList<Message>();
    }

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    public List<Message> getMessages() {
        return messages;
    }

    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }
}
