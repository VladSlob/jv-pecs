package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.Arrays;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {

    @Override
    public List<Excavator> get() {
        return Arrays.asList(new Excavator("Hitachi", "blue", 1.5),
                new Excavator("JCB", "red", 1.3));
    }
}
