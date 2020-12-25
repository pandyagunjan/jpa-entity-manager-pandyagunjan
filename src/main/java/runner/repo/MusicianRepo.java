package runner.repo;
import org.springframework.stereotype.Repository;
import runner.entities.Musician;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
@Repository
public interface MusicianRepo extends JpaRepository<Musician,Integer> {
    Musician findMusicianById(Integer id);
    List<Musician> findMusiciansById(Integer id);

    List<Musician> findAll();
    //update  --save
    //create -- save
    //delete --delete

    void deleteById(Integer integer);
}