package optional;

import java.util.Optional;

public class OptionalMapFlapMapExample {
    public static void main(String[] args) {
        Optional<String> nonEmptyGender = Optional.of("male");
        Optional<String> emptyGender = Optional.empty();
    }
}
