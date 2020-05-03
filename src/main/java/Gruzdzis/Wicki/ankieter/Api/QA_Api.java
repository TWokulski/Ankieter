package Gruzdzis.Wicki.ankieter.Api;

import Gruzdzis.Wicki.ankieter.Model.*;
import Gruzdzis.Wicki.ankieter.Repository.*;
import Gruzdzis.Wicki.ankieter.Service.SerwisQA;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class QA_Api {

    //private TestRepository repository;

    //SerwisQA serwis;

    private RespondentRepository respondentRepository;
    private AddictionRepository addictionRepository;
    private DegreesRepository degreesRepository;
    private FeelingsRepository feelingsRepository;
    private GameRepository gameRepository;
    private MoneyRepository moneyRepository;
    private SocialRepository socialRepository;

    public QA_Api(RespondentRepository respondentRepository, AddictionRepository addictionRepository, DegreesRepository degreesRepository, FeelingsRepository feelingsRepository, GameRepository gameRepository, MoneyRepository moneyRepository, SocialRepository socialRepository) {
        this.respondentRepository = respondentRepository;
        this.addictionRepository = addictionRepository;
        this.degreesRepository = degreesRepository;
        this.feelingsRepository = feelingsRepository;
        this.gameRepository = gameRepository;
        this.moneyRepository = moneyRepository;
        this.socialRepository = socialRepository;
    }

    @GetMapping("/respondent_q")
    String respondent_Q(Model model) {
        model.addAttribute("respondent", new Respondent());
        return "respondent_q";
    }

    @PostMapping("/add_respondent")
    String addRespondent(@ModelAttribute Respondent respondent) {


        /*
        respondent.setAddiction(addiction);
        respondent.setDegrees(degrees);
        respondent.setGame(game);
        respondent.setSocial_life(social_life);

        addiction.setRespondent(respondent);
        degrees.setRespondent(respondent);
        social_life.setRespondent(respondent);

        game.setRespondent(respondent);
        game.setFeelings(feelings);
        game.setMoney(money);

        money.setGame(game);
        feelings.setGame(game);
         */

        /*

        socialRepository.save(social_life);
        moneyRepository.save(money);
        feelingsRepository.save(feelings);
        degreesRepository.save(degrees);
        addictionRepository.save(addiction);
        gameRepository.save(game);
        respondentRepository.save(respondent);
         */
        respondentRepository.save(respondent);

        if(respondent.isPlaying_games())
            return "redirect:/game_q";
        else
            return "redirect:/addiction_q";

    }

    @GetMapping("/game_q")
    String game_Q(Model model) {
        model.addAttribute("game", new Game());
        return "game_q";
    }

    @PostMapping("/add_game")
    String addGame(@ModelAttribute Game game) {

        gameRepository.save(game);

        if(game.isSpending())

            return "redirect:/money_q";
        else
            return "redirect:/feelings_q";

    }

    @GetMapping("/money_q")
    String money_Q(Model model) {
        model.addAttribute("money", new Money());
        return "money_q";
    }

    @PostMapping("/add_money")
    String addMoney(@ModelAttribute Money money) {
        moneyRepository.save(money);
        return "redirect:/feelings_q";
    }

    @GetMapping("/addiction_q")
    String addiction_Q(Model model) {
        model.addAttribute("addiction", new Addiction());
        return "addiction_q";
    }

    @PostMapping("/add_addiction")
    String addAddiction(@ModelAttribute Addiction addiction) {
        addictionRepository.save(addiction);
        return "redirect:/degrees_q";
    }

    @GetMapping("/degrees_q")
    String degrees_Q(Model model) {
        model.addAttribute("degrees", new Degrees());
        return "degrees_q";
    }

    @PostMapping("/add_degrees")
    String addDegrees(@ModelAttribute Degrees degrees) {
        degreesRepository.save(degrees);
        return "redirect:/social_q";
    }

    @GetMapping("/feelings_q")
    String feelings_Q(Model model) {
        model.addAttribute("feelings", new Feelings());
        return "feelings_q";
    }

    @PostMapping("/add_feelings")
    String addFeelings(@ModelAttribute Feelings feelings) {
        feelingsRepository.save(feelings);
        return "redirect:/addiction_q";
    }

    @GetMapping("/social_q")
    String social_Q(Model model) {
        model.addAttribute("social_life", new Social_life());
        return "social_q";
    }

    @PostMapping("/add_social")
    String addSocial(@ModelAttribute Social_life social_life) {
        socialRepository.save(social_life);
        return "redirect:/end";
    }

    @GetMapping("/end")
    String end() {
        return "end";
    }


}
