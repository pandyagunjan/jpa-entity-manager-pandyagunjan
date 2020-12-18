package runner.repo;
import runner.entities.Artist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import runner.entities.CD;

import java.util.List;
//@Repository
public interface ArtistRepo extends JpaRepository<Artist,Integer> {
    Artist findArtistById(Integer id);
    List<Artist> findAll();
    //update  --save
    //create -- save
    //delete --delete

    void deleteById(Integer integer);
}