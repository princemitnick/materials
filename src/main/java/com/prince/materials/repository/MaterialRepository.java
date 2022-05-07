package com.prince.materials.repository;

import com.prince.materials.entity.Material;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MaterialRepository extends JpaRepository<Material, Integer> {

    Optional<Material> findBySerialNumber(String serialNumber);
}
