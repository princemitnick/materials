package com.prince.materials.service;

import com.prince.materials.entity.Material;
import com.prince.materials.repository.MaterialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MaterialServiceImpl implements MaterialService{

    @Autowired
    MaterialRepository materialRepository;

    @Override
    public Material createOne(Material material) {
        return materialRepository.save(material);
    }

    @Override
    public List<Material> getAll() {
        return materialRepository.findAll();
    }

    @Override
    public Material getOne(Integer id) {
        Optional<Material> optionalMaterial = materialRepository.findById(id);

        if (optionalMaterial.isEmpty())
            throw new RuntimeException("Material "+id+" does not exit");

        return optionalMaterial.get();
    }

    @Override
    public Material findBySerialNumber(String serialNumber) {
        Optional<Material> optionalMaterial = materialRepository.findBySerialNumber(serialNumber);
        if (optionalMaterial.isEmpty())
            throw new RuntimeException("Material with S/N "+serialNumber+" is not found");

        return optionalMaterial.get();
    }
}
