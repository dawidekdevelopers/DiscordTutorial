package xyz.testbot;

import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.requests.GatewayIntent;
import xyz.testbot.cmds.TestCommand;

import javax.security.auth.login.LoginException;

public class TestBOT {

    public static String prefix = ";";

    public static void main(String[] args) {
        start();
    }

    public static void start() {
        try {
            JDABuilder.create("Nzg4NDg1MDgxNDAzODgzNTYw.X9kL9A.UgyH14ZdRwymppMHvMSK7NYRGWo", GatewayIntent.GUILD_EMOJIS, GatewayIntent.GUILD_INVITES, GatewayIntent.GUILD_MEMBERS, GatewayIntent.GUILD_MESSAGES, GatewayIntent.GUILD_PRESENCES, GatewayIntent.GUILD_MESSAGE_REACTIONS)
                    .addEventListeners(new TestCommand())
                    .setStatus(OnlineStatus.DO_NOT_DISTURB)
                    .setActivity(Activity.playing("Fajny bocik :D"))
                    .build();
        } catch (LoginException e) {
            e.printStackTrace();
        }
    }
}
