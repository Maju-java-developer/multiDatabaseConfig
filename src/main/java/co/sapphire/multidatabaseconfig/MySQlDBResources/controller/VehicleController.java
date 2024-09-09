package co.sapphire.multidatabaseconfig.MySQlDBResources.controller;

import co.sapphire.multidatabaseconfig.MySQlDBResources.enttiy.VehicleEntity;
import co.sapphire.multidatabaseconfig.MySQlDBResources.repo.VehicleRepo;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("Vehicle")
@AllArgsConstructor
public class VehicleController {

    private final VehicleRepo vehicleRepo;

    @PostMapping("getAll")
    public List<?> getAll() {
        return vehicleRepo.findAll();
    }

    @PostMapping("addVehicle")
    public VehicleEntity addStudent(@RequestBody VehicleEntity vehicleEntity) {
        return vehicleRepo.save(vehicleEntity);
    }

}

