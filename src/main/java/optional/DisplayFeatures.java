package optional;

public class DisplayFeatures {
    private String size;
    private ScreenResolition resolution;


    public DisplayFeatures(String size, ScreenResolition resolition) {
        this.size = size;
        this.resolution = resolition;
    }

    public String getSize() {
        return size;
    }

    public ScreenResolition getResolution() {
        return resolution;
    }

}
