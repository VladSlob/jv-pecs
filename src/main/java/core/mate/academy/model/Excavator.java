package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator


    public Excavator() {
    }

    public Excavator(String name, String colour, double bucketCapacityCubikMeters) {
        super(name, colour);
        this.bucketCapacityCubikMeters = bucketCapacityCubikMeters;
    }

    public double getBucketCapacityCubikMeters() {
 
        this.bucketCapacityCubikMeters = bucketCapacityCubicMeters;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
