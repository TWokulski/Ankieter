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

        int male = service.findNumberOfMaleRespondents();
        int female = service.findNumberOfFemaleRespondents();

        int gamers = service.findNumberOfGamers();
        int nonGamers = service.findNumberOfNonGamers();

        int spending = service.findNumberOfSpendingPlayers();
        int nonSpending = service.findNumberOfNonSpendingPlayers();

        int [] play_time = service.findNumbersOfPlayTime();


        model.addAttribute("Kobiety", female);
        model.addAttribute("Mezczyzni", male);

        model.addAttribute("ponizej_1h", play_time[0]);
        model.addAttribute("pomiedzy_1_2h", play_time[1]);
        model.addAttribute("pomiedzy_2_5h", play_time[2]);
        model.addAttribute("powyzej_5h", play_time[3]);

        model.addAttribute("Gracze", gamers);
        model.addAttribute("Nie_grajacy", nonGamers);

        model.addAttribute("Wydajacy", spending);
        model.addAttribute("Nie_wydajacy", nonSpending);


        return "stats";
    }
}
