package Gruzdzis.Wicki.ankieter.Repository;

import Gruzdzis.Wicki.ankieter.Model.Respondent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RespondentRepository extends JpaRepository<Respondent, Long >
{

}
