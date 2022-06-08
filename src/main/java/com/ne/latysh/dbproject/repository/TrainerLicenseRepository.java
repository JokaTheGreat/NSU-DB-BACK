package com.ne.latysh.dbproject.repository;

import com.ne.latysh.dbproject.models.TrainerLicense;
import com.ne.latysh.dbproject.models.compositeKeys.TrainerLicenseKey;
import org.springframework.data.repository.CrudRepository;

public interface TrainerLicenseRepository extends CrudRepository<TrainerLicense, TrainerLicenseKey> {
}
