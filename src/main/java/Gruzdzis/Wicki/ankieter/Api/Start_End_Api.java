package Gruzdzis.Wicki.ankieter.Api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Start_End_Api {

    @GetMapping({"/"})
    String welcome_web() {
        return "start_page";
    }

    @GetMapping({"/end"})
    String end_web() {
        return "end_page";
    }


}
