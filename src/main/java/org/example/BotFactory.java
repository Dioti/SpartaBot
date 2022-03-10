package org.example;

import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import org.example.utils.CommandErrorHandler;

public class BotFactory {

    public static void runBot(MessageReceivedEvent event) {
        String command = event.getMessage().getContentRaw().split(" ")[0];

        System.out.println("command: " + command);

        switch (command) {
            case "!piing":
                //do something
                new PingPong().start(event);
                break;
            default:
                new CommandErrorHandler().start(event);
                break;
        }
    }
}
