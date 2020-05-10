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

        logger.info("logg przed male");
        int male = service.findNumberOfMaleRespondents();
        int female = service.findNumberOfFemaleRespondents();

        logger.info("logg przed gamers");
        int gamers = service.findNumberOfGamers();
        int nonGamers = service.findNumberOfNonGamers();

       

        model.addAttribute("Kobiety", female);
        model.addAttribute("Mezczyzni", male);



        model.addAttribute("Gracze", gamers);
        model.addAttribute("Nie_grajacy", nonGamers);



        //logger.info("wynik z serwisu: " + service.findNumberOfRespondents());
       // logger.info("liczba wydajacych pieniazki graczy: " + service.findNumberOfSpendingPlayers());

        return "stats";
    }
}
