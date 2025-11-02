package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.Arrays;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {

    @Override
    public List<Truck> get() {
        return Arrays.asList(new Truck("Volvo", "violet", 20000),
                new Truck("MAN", "red", 15000));
    }
}
