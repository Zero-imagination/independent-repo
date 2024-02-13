package com.disagreed.independentrepo.controller;

import com.disagreed.independentrepo.api.ManufacturerService;
import com.disagreed.independentrepo.model.entity.ManufacturerEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/manufacturer", produces = MediaType.APPLICATION_JSON_VALUE)
public class ManufacturerController {

    private final ManufacturerService manufacturerService;

    @GetMapping(value = "/all")
    public List<ManufacturerEntity> getAllManufacturer() {
        return manufacturerService.getAll();
    }
}
