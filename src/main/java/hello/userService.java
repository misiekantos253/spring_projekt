package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;


/**
 * Created by misiekantos253 on 2017-04-15.
 */

@Service
public class userService {

    @Autowired
    private IuserRepository userRepo;     // zaladowanie danych z bazy, autowirde robi magie i wie ze ma sie odwolywac do usera


    //private static List<user> users = new ArrayList<>();    // zaladowani uzytkownicy z bazy danych


    public getUser giveUserdata(Long id){
        getUser out = new getUser();
        user u = userRepo.findOne(id);


        out.setId(u.getId());
        out.setName(u.getName());
        out.setLastname(u.getLastname());
        out.setAdress(u.getAdress());
        out.setCountry(u.getCountry());

        System.out.println("Wyswietlono rekord o id "+id);
        return out;
    }

    public List<getUser> giveAll(){
        List<getUser> outL = new ArrayList<>();
        List<user> uL = userRepo.findAll();
        for(user u : uL){
            getUser out = new getUser();
            out.setId(u.getId());
            out.setName(u.getName());
            out.setLastname(u.getLastname());
            out.setAdress(u.getAdress());
            out.setCountry(u.getCountry());

            outL.add(out);
        }
        System.out.println("Wyswietlono "+ outL.size()+" rekordow");
        return outL;
    }

    public void save(getUser us){
        user u = new user();

        u.setId(userRepo.count()+1);
        u.setName(us.getName());
        u.setLastname(us.getLastname());
        u.setAdress(us.getAdress());
        u.setCountry(us.getCountry());

        userRepo.save(u);

        System.out.println("Dodano do bazy, id "+u.getId());

    }

    public void delete(Long id){
        userRepo.delete(id);
        System.out.println("Skasowano uzytkownika o id "+id);
    }


    public String dajId(String name){
        return userRepo.szukajName(name);
    }

    public String dajDane(String name){
        return userRepo.szukajDane(name)[0];
    }




}
