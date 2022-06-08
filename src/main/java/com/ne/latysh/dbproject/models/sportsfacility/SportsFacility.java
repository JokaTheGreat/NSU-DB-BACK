package com.ne.latysh.dbproject.models.sportsfacility;

import com.ne.latysh.dbproject.models.SportsFacilityType;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
public class SportsFacility implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String address;
    @ManyToOne
    @JoinColumn(name = "type", referencedColumnName = "id")
    private SportsFacilityType type;
}
