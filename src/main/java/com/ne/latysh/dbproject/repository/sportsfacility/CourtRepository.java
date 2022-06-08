package com.ne.latysh.dbproject.repository.sportsfacility;

import com.ne.latysh.dbproject.models.sportsfacility.Court;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CourtRepository extends JpaRepository<Court, Long> {
    @Query(name = "getCourtWithSurface", nativeQuery = true)
    List<Court> getCourtWithSurface(String surface);
}
