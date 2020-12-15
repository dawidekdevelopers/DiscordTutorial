package xyz.testbot;

import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.requests.GatewayIntent;

import javax.security.auth.login.LoginException;

public class TestBOT {

    public static void main(String[] args) {
        start();
    }

    public static void start() {
        try {
            JDABuilder.create("Nzg4NDg1MDgxNDAzODgzNTYw.X9kL9A.F2b-LDClDk9A0b34Jd2n4isMnAQ", GatewayIntent.GUILD_EMOJIS, GatewayIntent.DIRECT_MESSAGE_REACTIONS, GatewayIntent.DIRECT_MESSAGE_TYPING, GatewayIntent.DIRECT_MESSAGES, GatewayIntent.GUILD_BANS, GatewayIntent.GUILD_MEMBERS, GatewayIntent.GUILD_MESSAGE_TYPING, GatewayIntent.GUILD_PRESENCES)
                    .setStatus(OnlineStatus.DO_NOT_DISTURB)
                    .setActivity(Activity.playing("Fajny bocik :D"))
                    .build();
        } catch (LoginException e) {
            e.printStackTrace();
        }
    }
}
