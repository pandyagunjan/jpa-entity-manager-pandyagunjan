package repo;

import entities.CD;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CDRepo extends JpaRepository<CD,Integer> {

    List<CD> findAll();
    CD findCdById(Integer id);
    // CD findCdByArtistOneFirstName(String firstname);
    //@Query("select c from CD c where c.artist = ?1")
    //  CD findMyCustomCd(String artist);
}
