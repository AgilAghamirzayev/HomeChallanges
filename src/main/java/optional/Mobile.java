package optional;

public class Mobile {
    private long id;
    private String brand;
    private String name;
    private DisplayFeatures displayFeatures;

    public Mobile(long id, String brand, String name, DisplayFeatures displayFeatures) {
        this.id = id;
        this.brand = brand;
        this.name = name;
        this.displayFeatures = displayFeatures;
    }

    public String getName() {
        return name;
    }

    public long getId() {
        return id;
    }

    public DisplayFeatures getDisplayFeatures() {
        return displayFeatures;
    }

    public String getBrand() {
        return brand;
    }
}
