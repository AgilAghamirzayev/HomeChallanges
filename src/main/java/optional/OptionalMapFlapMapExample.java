package optional;

import java.util.Optional;

public class OptionalMapFlapMapExample {
    public static void main(String[] args) {
        Optional<String> nonEmptyGender = Optional.of("male");
        Optional<String> emptyGender = Optional.empty();

        System.out.println("Non-empty Optional: " + nonEmptyGender.map(String::toUpperCase));
        System.out.println("Empty Optional: " + emptyGender.map(String::toLowerCase));

        Optional<Optional<String>> nonEmptyOptionalGender = Optional.of(Optional.of("male"));
        System.out.println("Optional value: " + nonEmptyOptionalGender);
        System.out.println("Optional.map(): " + nonEmptyOptionalGender.map(gender -> gender.map(String::toUpperCase)));
        System.out.println("Optional.flatMap: " + nonEmptyOptionalGender.flatMap(gender -> gender.map(String::toUpperCase)));

        Optional<String> gender = Optional.of("MALE");
        Optional<String> emptyGenders = Optional.empty();

        System.out.println(gender.filter(g->g.equals("male")));
        System.out.println(gender.filter(g->g.equals("MALE")));
        System.out.println(emptyGender.filter(g -> g.equalsIgnoreCase("MALE")));

        if (gender.isPresent()){
            System.out.println("Value aviable");
        } else {
            System.out.println("Value not aviable");
        }

        gender.ifPresent(g-> System.out.println("In gender option, value aviable"));
        emptyGender.ifPresent(s-> System.out.println("In emptyGender Option, value aviable"));

        System.out.println(gender.orElse("<N/A>"));
        System.out.println(emptyGender.orElse("<N/A>"));

        System.out.println(gender.orElseGet(()->"<N/A>"));
        System.out.println(emptyGender.orElseGet(()->"<N/A>"));

    }
}

