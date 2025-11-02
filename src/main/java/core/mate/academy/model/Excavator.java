package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private double bucketCapacityCubikMeters;

    public Excavator() {
    }

    public Excavator(String name, String colour, double bucketCapacityCubikMeters) {
        super(name, colour);
        this.bucketCapacityCubikMeters = bucketCapacityCubikMeters;
    }

    public double getBucketCapacityCubikMeters() {
        return bucketCapacityCubikMeters;
    }

    public void setBucketCapacityCubicMeters(double bucketCapacityCubicMeters) {
        this.bucketCapacityCubikMeters = bucketCapacityCubicMeters;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
