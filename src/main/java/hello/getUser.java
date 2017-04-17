package hello;

/**
 * Created by misiekantos253 on 2017-04-15.
 */
public class getUser {

    private Long id;
    private String name;
    private String lastname;
    private String adress;
    private String country;


//    public getUser(){}
//
//
//    public getUser(Long aid, String aname, String alastname, String aadress, String acountry){
//        id = aid;
//        name = aname;
//        lastname = alastname;
//        adress = aadress;
//        country = acountry;
//    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
