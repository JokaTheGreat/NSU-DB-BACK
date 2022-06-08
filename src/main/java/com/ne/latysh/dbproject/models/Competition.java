package com.ne.latysh.dbproject.models;

import com.ne.latysh.dbproject.models.Sport;
import com.ne.latysh.dbproject.models.sportsfacility.SportsFacility;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Data
public class Competition {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotNull
    private String title;
    @NotNull
    private Date period;
    @ManyToOne
    @JoinColumn(name = "main_sponsor", referencedColumnName = "id")
    private Sponsor sponsor;
    @ManyToOne
    @JoinColumn(name = "sport", referencedColumnName = "id")
    private Sport sport;
    @ManyToOne
    @JoinColumn(name = "location", referencedColumnName = "id")
    private SportsFacility sportsFacility;
}
