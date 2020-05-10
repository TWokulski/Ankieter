package Gruzdzis.Wicki.ankieter.Service;

import Gruzdzis.Wicki.ankieter.Repository.*;
import org.springframework.stereotype.Service;

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

    public int findNumberOfRespondents()
    {
        int numberOfRespondents = respondentRepository.findAll().size();
        return numberOfRespondents;
    }


}
