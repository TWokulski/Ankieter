package Gruzdzis.Wicki.ankieter.Service;

import Gruzdzis.Wicki.ankieter.Model.*;
import Gruzdzis.Wicki.ankieter.Repository.*;
import org.springframework.stereotype.Service;


public class SerwisQA {

    private RespondentRepository respondentRepository;
    private AddictionRepository addictionRepository;
    private DegreesRepository degreesRepository;
    private FeelingsRepository feelingsRepository;
    private GameRepository gameRepository;
    private MoneyRepository moneyRepository;
    private SocialRepository socialRepository;


    public SerwisQA() {
    }

    public SerwisQA(RespondentRepository respondentRepository, AddictionRepository addictionRepository, DegreesRepository degreesRepository, FeelingsRepository feelingsRepository, GameRepository gameRepository, MoneyRepository moneyRepository, SocialRepository socialRepository) {
        this.respondentRepository = respondentRepository;
        this.addictionRepository = addictionRepository;
        this.degreesRepository = degreesRepository;
        this.feelingsRepository = feelingsRepository;
        this.gameRepository = gameRepository;
        this.moneyRepository = moneyRepository;
        this.socialRepository = socialRepository;
    }




}
