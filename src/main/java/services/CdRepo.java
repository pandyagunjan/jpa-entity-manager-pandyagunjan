package services;

import entities.Cd;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CdRepo extends JpaRepository<Cd,Integer> {



}
