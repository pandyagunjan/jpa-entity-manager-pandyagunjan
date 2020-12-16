package services;

import repo.CdRepo;
import entities.CD;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CDService {
    @Autowired
    CdRepo cdRepo;

    public void saveCD(CD cd)
    {
        cdRepo.save(cd);

    }

    public CD findTheCD(Integer id)
    {
        return cdRepo.findCdById(id);
    }

}
