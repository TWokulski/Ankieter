package Gruzdzis.Wicki.ankieter.Repository;

import Gruzdzis.Wicki.ankieter.Model.Feelings;
import Gruzdzis.Wicki.ankieter.Model.Test;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FeelingsRepository extends JpaRepository<Feelings, Long >
{

}
