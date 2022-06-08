package com.ne.latysh.dbproject.models.compositeKeys;

import com.ne.latysh.dbproject.models.Trainer;
import com.ne.latysh.dbproject.models.Sport;

import java.io.Serializable;

public class TrainerLicenseKey implements Serializable {
    private Trainer trainer;
    private Sport sport;
}
