package websockettest.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping("/")
    public String getIndex(){
        return "index";
    }

    @RequestMapping("/chat")
    public String getChat() {return "chat";}

    @RequestMapping("/cards")
    public String getCards() {return "cards";}

}
