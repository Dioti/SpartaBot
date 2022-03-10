package org.example;

import net.dv8tion.jda.api.events.message.MessageReceivedEvent;

public class PingPong implements CommandRunner {
    @Override
    public void start(MessageReceivedEvent event) {
        event.getChannel().sendMessage("pong!").queue();
    }
}