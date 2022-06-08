package com.ne.latysh.dbproject.models;

import com.ne.latysh.dbproject.models.compositeKeys.AthleteRankingKey;
import com.ne.latysh.dbproject.models.AthleteRank;
import com.ne.latysh.dbproject.models.Sport;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@IdClass(AthleteRankingKey.class)
public class AthleteRanking {
    @Id
    @ManyToOne
    @JoinColumn(name = "athlete_id", referencedColumnName = "id")
    private Athlete athlete;
    @Id
    @ManyToOne
    @JoinColumn(name = "sport", referencedColumnName = "id")
    private Sport sport;
    @ManyToOne
    @JoinColumn(name = "rank", referencedColumnName = "id")
    private AthleteRank rank;
}
