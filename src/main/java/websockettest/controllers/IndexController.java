package websockettest.controllers;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import websockettest.domain.Message;
import websockettest.domain.OutputMessage;

import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class IndexController {

    @RequestMapping("/")
    public String getIndex(){
        return "index";
    }

}
