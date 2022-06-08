package com.ne.latysh.dbproject.repository.sportsfacility;

import com.ne.latysh.dbproject.models.sportsfacility.Arena;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface ArenaRepository extends CrudRepository<Arena, Long> {
    @Query(name = "getArenaByTrackNumber", nativeQuery = true)
    public Iterable<Arena> getArenaByTrackNumber(Long trackNumber);
}
