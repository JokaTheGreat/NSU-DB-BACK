package com.ne.latysh.dbproject.repository;

import com.ne.latysh.dbproject.models.Sponsor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Date;

public interface SponsorRepository extends CrudRepository<Sponsor, Long> {
    @Query(name = "getAndCountSponsorByPeriod", nativeQuery = true)
    public Iterable<?> getAndCountSponsorByPeriod(Date startDate, Date endDate);
}
