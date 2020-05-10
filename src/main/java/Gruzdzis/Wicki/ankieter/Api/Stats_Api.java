package Gruzdzis.Wicki.ankieter.Api;


import Gruzdzis.Wicki.ankieter.Service.StatsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Stats_Api {

    StatsService service;
    private final Logger logger = LoggerFactory.getLogger(Stats_Api.class);

    public Stats_Api(StatsService service) {
        this.service = service;
    }


    @RequestMapping("/stats")
    public String show_stats(Model model) {
        model.addAttribute("female", "10");
        model.addAttribute("male", "20");
        logger.info("wynik z serwisu: " + service.findNumberOfRespondents());
        return "stats";
    }
}
