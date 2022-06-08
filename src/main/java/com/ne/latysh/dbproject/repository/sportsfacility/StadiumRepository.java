package com.ne.latysh.dbproject.repository.sportsfacility;

import com.ne.latysh.dbproject.models.sportsfacility.Stadium;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface StadiumRepository extends CrudRepository<Stadium, Long> {
    @Query(name = "getStadiumByCapacity", nativeQuery = true)
    public Iterable<Stadium> getStadiumByCapacity(Long capacity);
}
