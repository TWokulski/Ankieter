package Gruzdzis.Wicki.ankieter.Repository;

import Gruzdzis.Wicki.ankieter.Model.Addiction;
import Gruzdzis.Wicki.ankieter.Model.Test;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddictionRepository extends JpaRepository<Addiction, Long >
{

}
