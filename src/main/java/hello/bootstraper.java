package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

/**
 * Created by misiekantos253 on 2017-04-15.
 */

@Service
public class bootstraper implements ApplicationListener<ContextRefreshedEvent>{
    private final Logger log = Logger.getLogger(this.getClass().getName());

    @Autowired
    private IuserRepository userRepo;

    public void onApplicationEvent(ContextRefreshedEvent event){
        log.info("Importowanie danych do bazy...");

        userRepo.save(( new user(userRepo.count()+1,"Janek","Kowalski","Warszawa, głogowicza 14/2","Polska")));
        userRepo.save(( new user(userRepo.count()+1,"Adrian","Mietczynski","Lodz, pilsudzkiego 17","Polska")));
        userRepo.save(( new user(userRepo.count()+1,"Maciek","Abramowicz","Kraków, marokańska 23/4","Polska")));

        log.info("Zaimportowano "+userRepo.count()+" rekordow");
    }
}
