package xyz.testbot.cmds;

import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import xyz.testbot.TestBOT;

public class TestCommand extends ListenerAdapter {


    @Override
    public void onMessageReceived(MessageReceivedEvent event) {
        String[] args = event.getMessage().getContentRaw().split("\\s+");

        if(args[0].equalsIgnoreCase(TestBOT.prefix + "test")) {
            event.getChannel().sendMessage("Hi there!").queue();
        }
    }
}
