package runner.services;

import runner.repo.CDRepo;
import runner.entities.CD;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CDService {
    @Autowired
    private CDRepo cdRepo;

//    public CDService(CDRepo runner.repo)
//    {
//        this.cdRepo=runner.repo;
//    }

    public CD create(CD cd)
    {
        return cdRepo.save(cd);
    }

    public CD readById(Integer id)
    {
        return cdRepo.findCDById(id);
    }

    public List<CD> readAll() {
        Iterable<CD> allCDs = cdRepo.findAll();
        List<CD> CDList = new ArrayList<>();
        allCDs.forEach(CDList::add);
        return CDList;
    }

  public CD update(Integer id, CD cd)
  {
      CD cdInDatabase = this.readById(id);
      cdInDatabase.setTitle(cd.getTitle());
      cdInDatabase.setDescription(cd.getDescription());
      cdInDatabase.setYearofrelease(cd.getYearofrelease());
      cdInDatabase.setArtist(cd.getArtist());
      cdInDatabase.setPrice(cd.getPrice());
      cdInDatabase=cdRepo.save(cdInDatabase);
      return cdInDatabase;

  }

    public CD deleteById(Integer id) {
        CD cdToBeDeleted = this.readById(id);
        cdRepo.delete(cdToBeDeleted);
        return cdToBeDeleted;
    }
}
