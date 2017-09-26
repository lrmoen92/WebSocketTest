package websockettest.controllers;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import websockettest.domain.*;

import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class ChatController {

    @MessageMapping("/chat")
    @SendTo("/topic/messages")
    public OutputMessage send(final Message message) throws Exception {
        String time = new SimpleDateFormat("HH:mm").format(new Date());
        return new OutputMessage(message.getFrom(), message.getText(), time);
    }

    @MessageMapping("/cards")
    @SendTo("/topic/cards")
    public CardOutputMessage send(final CardInputMessage card) throws Exception {
        String time = new SimpleDateFormat("HH:mm").format(new Date());
        return new CardOutputMessage(card.getPlayer(), card.getSuit(), card.getValue(), time);
    }

}
