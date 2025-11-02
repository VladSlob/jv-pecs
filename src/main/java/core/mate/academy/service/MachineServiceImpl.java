package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl<T extends Machine> implements MachineService<T> {
    private final Map<Class<? extends Machine>, MachineProducer<? extends Machine>> producersMap;

    public MachineServiceImpl() {
        producersMap = new HashMap<>();
        producersMap.put(Bulldozer.class, new BulldozerProducer());
        producersMap.put(Excavator.class, new ExcavatorProducer());
        producersMap.put(Truck.class, new TruckProducer());
    }

    @Override
    public List<T> getAll(Class<? extends Machine> type) {
        MachineProducer<? extends Machine> producer = producersMap.get(type);
        if (producer == null) {
            return List.of();
        }
        List<? extends Machine> machines = producer.get();
        return new ArrayList<>((List<T>) machines);
    }

    @Override
    public void fill(List<? super T> machines, T value) {
        for (int i = 0; i < machines.size(); i++) {
            machines.set(i, value);
        }
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        for (Machine machine : machines) {
            machine.doWork();
        }
    }
}
