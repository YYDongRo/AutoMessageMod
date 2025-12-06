package com.yydongro.autosarcasm;

import net.minecraft.client.Minecraft;
import net.minecraftforge.client.event.ClientChatReceivedEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class ChatListener {

    private final MessageManager manager = new MessageManager();

    @SubscribeEvent
    public void onChat(ClientChatReceivedEvent event) {

        String msg = event.message.getUnformattedText();
        String name = Minecraft.getMinecraft().thePlayer.getName();

        // Reset messages at game start
        if (msg.contains("The game starts in 5 seconds")) {
            manager.reset();
            return;
        }

        // Detect kill messages involving player
        if (msg.contains("by " + name) || msg.contains("from" + name)) {
            String m = manager.getNextMessage();
            Minecraft.getMinecraft().thePlayer.sendChatMessage("/shout " + m);
        }
    }
}
