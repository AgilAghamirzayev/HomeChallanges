package LymabdaExperission.java_8_features;

public class Vehicle {
    void moveTo(long altitude, long longitude) {

    }

    static String producer(){
        return "N&F Vehicles";
    }

    long[] startPosition(){
        return new long[]{23,15};
    }

    String getOverwiew(){
        return "ATV made by" + producer();
    }
}
