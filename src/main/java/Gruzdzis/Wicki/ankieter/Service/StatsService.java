package Gruzdzis.Wicki.ankieter.Service;

import Gruzdzis.Wicki.ankieter.Repository.*;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class StatsService {

    private RespondentRepository respondentRepository;
    private GameRepository gameRepository;
    private  MoneyRepository moneyRepository;

    public StatsService(RespondentRepository respondentRepository, GameRepository gameRepository, MoneyRepository moneyRepository) {
        this.respondentRepository = respondentRepository;
        this.gameRepository = gameRepository;
        this.moneyRepository = moneyRepository;
    }

    public int findNumberOfRespondents() {
        return respondentRepository.findAll().size();
    }

    public int findNumberOfGamers() {
        return gameRepository.findAll().size();
    }

    public int findNumberOfSpendingPlayersFormMoneyRepo() {
        return moneyRepository.findAll().size();
    }

    public int findNumberOfSpendingPlayers(){
        int numberOfSpendingGamers = 0;
        for(Long i = 0L; i<= findNumberOfGamers(); i++ ) {

            if(gameRepository.findById(i).get().isSpending())
                numberOfSpendingGamers++;

        }
        return numberOfSpendingGamers;
    }


}
