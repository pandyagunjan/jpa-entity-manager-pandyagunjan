package runner.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import runner.entities.Artist;
import runner.repo.ArtistRepo;
import java.util.ArrayList;
import java.util.List;

@Service
public class ArtistService {

    @Autowired
    private ArtistRepo artistRepo;

    public Artist create(Artist artist)
    {
        return artistRepo.save(artist);
    }

    public Artist readById(Integer id)
    {
        return artistRepo.findArtistById(id);
    }

    public List<Artist> readAll() {
        Iterable<Artist> allCDs = artistRepo.findAll();
        List<Artist> CDList = new ArrayList<>();
        allCDs.forEach(CDList::add);
        return CDList;
    }

    public Artist update(Integer id, Artist artist)
    {
        Artist artistInDB = this.readById(id);
        artistInDB.setFirst_name(artist.getFirst_name());
        artistInDB.setLast_name(artist.getLast_name());
        artistInDB.setInstrument(artist.getLast_name());
        artistInDB=artistRepo.save(artistInDB);
        return artistInDB;

    }

    public Artist deleteById(Integer id) {
        Artist artistToBeDeleted = this.readById(id);
        artistRepo.delete(artistToBeDeleted);
        return artistToBeDeleted;
    }
}
