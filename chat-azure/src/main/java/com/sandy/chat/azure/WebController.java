package com.sandy.chat.azure;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

    @GetMapping("/")
    public String chatPage() {
        return "chat"; // 返回chat.html
    }
}