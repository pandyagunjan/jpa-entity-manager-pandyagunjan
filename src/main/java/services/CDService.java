package services;

import repo.CDRepo;
import entities.CD;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CDService {
    @Autowired
    private CDRepo cdRepo;

//    public CDService(CDRepo repo)
//    {
//        this.cdRepo=repo;
//    }

    public CD create(CD cd)
    {
        return cdRepo.save(cd);
    }

    public CD readById(Integer cd_id)
    {
        return cdRepo.findCdById(cd_id);
    }

}
