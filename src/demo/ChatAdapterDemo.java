package demo;

import chat.ChatService;
import chat.ChatServiceAdapter;
import chat.LegacyChatService;

public class ChatAdapterDemo {
    public static void main(String[] args) {
        LegacyChatService legacyChat = new LegacyChatService();
        ChatService chatService = new ChatServiceAdapter(legacyChat);
        chatService.sendMessage("Hello world!");
    }
}
