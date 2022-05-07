package com.prince.materials.entity;

import com.prince.materials.entity.enums.State;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Specification {

    private Double ramAmount;
    private String ramDescription;
    private Double processorRate;
    private String processorDescription;
    private Double storageAmount;
    private String storageDescription;
    private State state;
    private String osDescription;


}
