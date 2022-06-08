package com.ne.latysh.dbproject.models.compositeKeys;

import com.ne.latysh.dbproject.models.Athlete;
import com.ne.latysh.dbproject.models.Competition;

import java.io.Serializable;

public class CompetitionPlayerKey implements Serializable {
    private Athlete athlete;
    private Competition competition;
}
