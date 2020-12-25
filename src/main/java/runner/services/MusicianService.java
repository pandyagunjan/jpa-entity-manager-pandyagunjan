package runner.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import runner.entities.Musician;
import runner.repo.MusicianRepo;
import java.util.ArrayList;
import java.util.List;

@Service
public class MusicianService {

    @Autowired
    private MusicianRepo artistRepo;

    public Musician create(Musician artist)
    {
        return artistRepo.save(artist);
    }

    public Musician readById(Integer id)
    {
        return artistRepo.findMusicianById(id);
    }

    public List<Musician> readAll() {
        Iterable<Musician> allCDs = artistRepo.findAll();
        List<Musician> CDList = new ArrayList<>();
        allCDs.forEach(CDList::add);
        return CDList;
    }

    public Musician update(Integer id, Musician artist)
    {
        Musician artistInDB = this.readById(id);
        artistInDB.setFirst_name(artist.getFirst_name());
        artistInDB.setLast_name(artist.getLast_name());
        artistInDB.setInstrument(artist.getLast_name());
        artistInDB=artistRepo.save(artistInDB);
        return artistInDB;

    }

    public Musician deleteById(Integer id) {
        Musician artistToBeDeleted = this.readById(id);
        artistRepo.delete(artistToBeDeleted);
        return artistToBeDeleted;
    }
}
