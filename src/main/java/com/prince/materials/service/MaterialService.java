package com.prince.materials.service;

import com.prince.materials.entity.Material;

import java.util.List;

public interface MaterialService {

    Material createOne(Material material);
    List<Material> getAll();

    Material getOne(Integer id);

    Material findBySerialNumber(String serialNumber);
}
