package com.ne.latysh.dbproject.models.compositeKeys;

import com.ne.latysh.dbproject.models.Athlete;
import com.ne.latysh.dbproject.models.Sport;

import java.io.Serializable;

public class AthleteRankingKey implements Serializable {
    private Athlete athlete;
    private Sport sport;
}
