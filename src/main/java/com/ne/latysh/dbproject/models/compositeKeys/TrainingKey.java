package com.ne.latysh.dbproject.models.compositeKeys;

import com.ne.latysh.dbproject.models.Athlete;
import com.ne.latysh.dbproject.models.TrainerLicense;

import java.io.Serializable;

public class TrainingKey implements Serializable {
    private Athlete athlete;
    private TrainerLicense trainerLicense;
}
