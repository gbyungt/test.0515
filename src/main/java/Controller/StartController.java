package com.woori.layoutboard.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StartController {
    //브라우저에서 /요청시 index.html로 연결(전달)
    @GetMapping("/")
    public String start() {
        return "index";
    }
}
