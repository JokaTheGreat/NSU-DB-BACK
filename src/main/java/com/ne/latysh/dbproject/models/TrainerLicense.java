package com.ne.latysh.dbproject.models;

import com.ne.latysh.dbproject.models.compositeKeys.TrainerLicenseKey;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity
@Data
@IdClass(TrainerLicenseKey.class)
public class TrainerLicense implements Serializable {
    @NotNull
    @Column(unique = true)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Id
    @ManyToOne
    @JoinColumn(name = "trainer_id", referencedColumnName = "id")
    private Trainer trainer;
    @Id
    @ManyToOne
    @JoinColumn(name = "sport", referencedColumnName = "id")
    private Sport sport;
}
