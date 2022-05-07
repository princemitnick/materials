package com.prince.materials.repository;

import com.prince.materials.entity.Material;
import com.prince.materials.entity.Specification;
import com.prince.materials.entity.enums.State;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MaterialRepositoryTest {

    /**
    @Autowired
    private MaterialRepository materialRepository;

    @Test
    void createMaterial(){

        materialRepository.save(
                Material
                        .builder()
                        .manufacturer("HP")
                        .serialNumber("FQM24334")
                        .specification(
                                Specification
                                        .builder()
                                        .osDescription("Windows 11 Pro")
                                        .processorRate(Double.valueOf(2.4))
                                        .processorDescription("Core i3 - Intel")
                                        .ramAmount(Double.valueOf(16))
                                        .ramDescription("16 Go RAM")
                                        .state(State.NEW)
                                        .storageAmount(Double.valueOf(500))
                                        .storageDescription("500GB - SSD")
                                        .build()
                        )
                        .build()
        );

        System.out.println("Material Created");
    }

    @Test
    void getAll(){
        materialRepository.findAll().forEach(
                material -> {
                    System.out.println(material.toString());
                }
        );
    }
*/

}