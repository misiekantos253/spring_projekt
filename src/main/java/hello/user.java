package hello;

import javax.persistence.*;

/**
 * Created by misiekantos253 on 2017-04-15.
 */

@Entity
@Table(name = "users")
@SequenceGenerator(allocationSize = 1, name = "SEKWENCJA", sequenceName = "gen_users_id")
public class user {



    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEKWENCJA")
    private long id;


    @Column(name="name", nullable = false, length = 20)
    private String name;


    @Column(name="lastname", nullable = false, length = 40)
    private String lastname;

    @Column(name="adress")
    private String adress;

    @Column(name="country")
    private String country;


    public user(){};

    public user(Long aid, String aname, String alastname, String aadress, String acountry){
        id = aid;
        name = aname;
        lastname = alastname;
        adress = aadress;
        country = acountry;
    }





    public long getId() {
        return id;
    }

    public void setId(long id) {
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
