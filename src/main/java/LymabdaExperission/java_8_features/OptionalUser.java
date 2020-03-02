package LymabdaExperission.java_8_features;

import java.util.Optional;

public class OptionalUser {
    private OptionalAdress adress;

    public Optional<OptionalAdress> getAdress(){
        return Optional.of(adress);
    }

    public void setAdress(OptionalAdress adress) {
        this.adress = adress;
    }
}
