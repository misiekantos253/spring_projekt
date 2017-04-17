package hello;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.repository.query.Parameters;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by misiekantos253 on 2017-04-15.
 */
public interface IuserRepository extends JpaRepository<user, Long>{

    @Query("SELECT u.name,u.lastname,u.adress FROM user u WHERE u.name = :name")
    String szukajName(@Param("name") String name);

    @Query(value = "SELECT u.name,u.lastname,u.adress FROM user u WHERE u.name = ?1")
    String[] szukajDane(String name);
}
