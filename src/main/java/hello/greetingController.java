package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by misiekantos253 on 2017-04-15.
 */

@RestController
public class greetingController {

    @Autowired
    private userService userData;

    //private static final String szablon = "Siemandero %s!";
    private final AtomicLong licznik = new AtomicLong();

    @RequestMapping("/hello")
    public greeting greetInst(@RequestParam(value = "imie", defaultValue = "anon") String imie){
        return new greeting(licznik.incrementAndGet(), "Siemandero "+imie);
    }

    @RequestMapping(value="/podajJeden", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public getUser usr(@RequestParam(value="id") Long id){
        System.out.println("Podane id: "+id);
        return userData.giveUserdata(id);
    }

    @RequestMapping(value = "/podajWszystkich", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<getUser> usrL(){
        return userData.giveAll();
    }

    @RequestMapping(value="/dodaj",  method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public void dodaj(@RequestBody getUser us){
        userData.save(us);
    }

    @RequestMapping(value = "/skasujJeden", method = RequestMethod.POST, consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public void skasuj(@RequestParam(value = "id") Long id){
        userData.delete(id);
    }

    @RequestMapping(value = "/podajId", method = RequestMethod.POST, produces = MediaType.TEXT_PLAIN_VALUE)
    public String podajId(@RequestParam(value = "name") String name){
        return userData.dajDane(name);
    }

}
