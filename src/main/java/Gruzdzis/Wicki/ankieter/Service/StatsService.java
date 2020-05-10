package Gruzdzis.Wicki.ankieter.Service;

import Gruzdzis.Wicki.ankieter.DTO.GameForStatsDTO;
import Gruzdzis.Wicki.ankieter.DTO.RespondentForStatsDTO;
import Gruzdzis.Wicki.ankieter.Repository.*;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class StatsService {

    private RespondentRepository respondentRepository;
    private GameRepository gameRepository;

    public StatsService(RespondentRepository respondentRepository, GameRepository gameRepository) {
        this.respondentRepository = respondentRepository;
        this.gameRepository = gameRepository;
    }


    private List<RespondentForStatsDTO> findAllRespondents(){
        return respondentRepository
                .findAll()
                .stream()
                .map(RespondentForStatsDTO::new)
                .collect(Collectors.toList());
    }


    private List<GameForStatsDTO> findAllGamers(){
        return gameRepository
                .findAll()
                .stream()
                .map(GameForStatsDTO::new)
                .collect(Collectors.toList());
    }


    private int findNumberOfRespondents() {
        return respondentRepository.findAll().size();
    }


    public int findNumberOfGamers() {
        int numberOfGamers = 0;
        List<RespondentForStatsDTO> respondentList = findAllRespondents();

        for(int i = 0; i < findNumberOfRespondents(); i++ ) {

            if(respondentList.get(i).isPlaying_games())
                numberOfGamers++;

        }
        return numberOfGamers;
    }


    public int findNumberOfNonGamers(){
        return (findNumberOfRespondents() - findNumberOfGamers());
    }


    public int findNumberOfSpendingPlayers(){
        int numberOfSpendingGamers = 0;
        List<GameForStatsDTO> gameList = findAllGamers();

        for(int i = 0; i < findNumberOfGamers(); i++ ) {

            if(gameList.get(i).isSpending())
                numberOfSpendingGamers++;

        }
        return numberOfSpendingGamers;
    }


    public int findNumberOfNonSpendingPlayers(){
        return (findNumberOfGamers() - findNumberOfSpendingPlayers());
    }


    public int[] findNumbersOfPlayTime(){
        int under_1h = 0;
        int between_1_2h = 0;
        int between_2_5h = 0;
        int over_5h = 0;
        List<GameForStatsDTO> gameList = findAllGamers();

        for(int i = 0; i < findNumberOfGamers(); i++ ) {

            if(gameList.get(i).getGaming_time().equals("Ponizej 1h"))
                under_1h++;

            else if(gameList.get(i).getGaming_time().equals("1-2h"))
                between_1_2h++;

            else if(gameList.get(i).getGaming_time().equals("2-5h"))
                between_2_5h++;

            else
                over_5h++;
        }
        int [] numbers = {under_1h, between_1_2h, between_2_5h, over_5h };

        return numbers;
    }

    public int findNumberOfMaleRespondents(){
        int numberOfMale = 0;
        List<RespondentForStatsDTO> respondentList = findAllRespondents();

        for(int i = 0; i < findNumberOfRespondents(); i++ ) {

            if(!respondentList.get(i).isSex())
                numberOfMale++;

        }
        return numberOfMale;
    }


    public int findNumberOfFemaleRespondents(){
        return (findNumberOfRespondents() - findNumberOfMaleRespondents());
    }



}
