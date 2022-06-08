package com.ne.latysh.dbproject.repository;

import com.ne.latysh.dbproject.models.Sport;
import org.springframework.data.repository.CrudRepository;

public interface SportRepository extends CrudRepository<Sport, Long> {
    public Sport findByValue(String value);
}
