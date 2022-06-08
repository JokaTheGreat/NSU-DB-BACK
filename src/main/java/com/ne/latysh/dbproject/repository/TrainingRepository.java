package com.ne.latysh.dbproject.repository;

import com.ne.latysh.dbproject.models.Training;
import com.ne.latysh.dbproject.models.compositeKeys.TrainingKey;
import org.springframework.data.repository.CrudRepository;

public interface TrainingRepository extends CrudRepository<Training, TrainingKey> {
}
