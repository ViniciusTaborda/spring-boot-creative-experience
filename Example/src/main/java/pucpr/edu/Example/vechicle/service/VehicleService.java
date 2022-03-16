package pucpr.edu.Example.vechicle.service;

import org.springframework.stereotype.Service;
import pucpr.edu.Example.vechicle.entity.Vehicle;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

@Service
public class VehicleService {

    Logger logger = Logger.getLogger(VehicleService.class.getName());

    public Vehicle save(Vehicle vehicle){
        logger.info(vehicle.getPlate());
        logger.info(vehicle.getModel());
        return null;
    }

    public List<Vehicle> list(){
        List<Vehicle> vehicles = new ArrayList<>();
        Vehicle v = new Vehicle();
        v.setPlate("ABC-0101");
        v.setModel("Golf gti");
        vehicles.add(v);
        return vehicles;

    }
    public void delete (Vehicle vehicle){
        return;
    }
}
