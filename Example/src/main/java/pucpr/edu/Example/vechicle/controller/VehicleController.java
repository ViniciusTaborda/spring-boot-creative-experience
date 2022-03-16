package pucpr.edu.Example.vechicle.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pucpr.edu.Example.vechicle.entity.Vehicle;
import pucpr.edu.Example.vechicle.service.VehicleService;

import java.util.List;

@RestController
@RequestMapping("/vehicle")
public class VehicleController {

    @Autowired
    private VehicleService vehicleService;


    @PostMapping
    public Vehicle save(@RequestBody Vehicle vehicle){
        return vehicleService.save(vehicle);
    }

    @GetMapping
    public List<Vehicle> list(){
        return vehicleService.list();

    }

    @DeleteMapping
    public void delete(Vehicle vehicle){
        vehicleService.delete(vehicle);
    }

}
