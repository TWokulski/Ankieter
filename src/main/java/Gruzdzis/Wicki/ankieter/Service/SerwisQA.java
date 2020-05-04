package Gruzdzis.Wicki.ankieter.Service;

import Gruzdzis.Wicki.ankieter.Model.*;
import Gruzdzis.Wicki.ankieter.Repository.*;
import org.springframework.stereotype.Service;

@Service
public class SerwisQA {

    private RespondentRepository respondentRepository;
    private AddictionRepository addictionRepository;
    private DegreesRepository degreesRepository;
    private FeelingsRepository feelingsRepository;
    private GameRepository gameRepository;
    private MoneyRepository moneyRepository;
    private SocialRepository socialRepository;

    private Addiction addiction;
    private Degrees degrees;
    private Feelings feelings;
    private Game game;
    private Money money;
    private Respondent respondent;
    private Social_life social_life;

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

    public void setAddiction(Addiction addiction) {
        this.addiction = addiction;
    }

    public void setDegrees(Degrees degrees) {
        this.degrees = degrees;
    }

    public void setFeelings(Feelings feelings) {
        this.feelings = feelings;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public void setMoney(Money money) {
        this.money = money;
    }

    public void setRespondent(Respondent respondent) {
        this.respondent = respondent;
    }

    public void setSocial_life(Social_life social_life) {
        this.social_life = social_life;
    }


    public void saveAnswers(){

      

        socialRepository.save(social_life);
        moneyRepository.save(money);
        feelingsRepository.save(feelings);
        degreesRepository.save(degrees);
        addictionRepository.save(addiction);
        gameRepository.save(game);
        respondentRepository.save(respondent);

    }
}
