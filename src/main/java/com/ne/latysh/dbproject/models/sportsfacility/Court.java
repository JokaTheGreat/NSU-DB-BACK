package com.ne.latysh.dbproject.models.sportsfacility;

import com.ne.latysh.dbproject.models.CourtSurface;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Court {
    @Id
    private Long id;
    @ManyToOne
    @JoinColumn(name = "surface", referencedColumnName = "id")
    private CourtSurface surface;
    @OneToOne
    @JoinColumn(name = "sports_facility_id", referencedColumnName = "id")
    private SportsFacility sportsFacility;
}
