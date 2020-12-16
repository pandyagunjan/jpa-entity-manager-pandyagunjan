package repo;
import entities.Artist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ArtistRepo extends JpaRepository<Artist,Integer> {
    List<Artist> findAll();
    Artist findArtistById();
}