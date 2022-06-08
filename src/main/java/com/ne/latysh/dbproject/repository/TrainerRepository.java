package com.ne.latysh.dbproject.repository;

import com.ne.latysh.dbproject.models.Trainer;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface TrainerRepository extends CrudRepository<Trainer, Long> {
    @Query(name = "getTrainerByAthlete", nativeQuery = true)
    public Iterable<Trainer> getTrainerByAthlete(Long athleteId);
    @Query(name = "getTrainersBySport", nativeQuery = true)
    public Iterable<Trainer> getTrainersBySport(Long sportId);
}
