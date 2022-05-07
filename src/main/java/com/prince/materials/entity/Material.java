package com.prince.materials.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Material {

    @Id
    @SequenceGenerator(
            name = "material_sequence",
            sequenceName = "material_sequence"
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "material_sequence"
    )
    private Integer id;

    @Column(
            unique = true
    )
    private String serialNumber;
    private String manufacturer;

    @Embedded
    Specification specification;

}
