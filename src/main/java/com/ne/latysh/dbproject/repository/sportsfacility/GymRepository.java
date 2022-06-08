package com.ne.latysh.dbproject.repository.sportsfacility;

import com.ne.latysh.dbproject.models.sportsfacility.Gym;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface GymRepository extends CrudRepository<Gym, Long> {
    @Query(name = "getGymByFloorArea", nativeQuery = true)
    public Iterable<Gym> getGymByFloorArea(Double floorArea);
}
