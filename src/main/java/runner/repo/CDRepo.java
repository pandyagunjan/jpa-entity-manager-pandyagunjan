package runner.repo;

import runner.entities.CD;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import runner.entities.Musician;

import java.util.List;

@Repository
public interface CDRepo extends JpaRepository<CD,Integer> {
    CD findCDById(Integer id);
    List<CD> findCDByMusiciansIn(List<Musician> musicians);
    List<CD> findAll();
    //update  --save
    //create -- save
    //delete --delete

    void deleteById(Integer integer);


    // CD findCdByArtistOneFirstName(String firstname);
    //@Query("select c from CD c where c.artist = ?1")
    //  CD findMyCustomCd(String artist);
}
