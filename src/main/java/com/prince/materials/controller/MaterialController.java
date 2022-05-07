package com.prince.materials.controller;

import com.prince.materials.entity.Material;
import com.prince.materials.service.MaterialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/materials")
public class MaterialController {

    @Autowired
    private MaterialService materialService;

    @PostMapping
    public Material createOne(@RequestBody Material material){
        return materialService.createOne(material);
    }

    @GetMapping("/{serialNumber}")
    public Material getBySerialNumber(@PathVariable("serialNumber") String serialNumber){
        return materialService.findBySerialNumber(serialNumber);
    }

    @GetMapping
    public List<Material> getAll(){
        return materialService.getAll();
    }

    @GetMapping("{id}")
    public Material getOne(@PathVariable("id") Integer id){
        return materialService.getOne(id);
    }
}
