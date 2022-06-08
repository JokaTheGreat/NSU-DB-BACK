package com.ne.latysh.dbproject.models;

import com.ne.latysh.dbproject.models.compositeKeys.TrainingKey;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@IdClass(TrainingKey.class)
public class Training {
    @Id
    @ManyToOne
    @JoinColumn(name = "athlete_id", referencedColumnName = "id")
    private Athlete athlete;
    @Id
    @ManyToOne
    @JoinColumn(name = "trainer_license_id", referencedColumnName = "id")
    private TrainerLicense trainerLicense;
}
