package collections;

import java.util.*;

public class Mapp {
    public static void main(String[] args) {
        Map<String, String > map = new HashMap<>();
        map.put("db", "oracle");
        map.put("username","user1");
        map.put("password","pass2");


        for (Map.Entry<String, String> entry : map.entrySet()){
            String k = entry.getKey();
            String v = entry.getValue();
            System.out.println("Ket : " + k+ ", Value: " + v);
        }

        Set<String> keys = map.keySet();
        for (String k: keys){
            System.out.println("Key: " + k);
        }

        Collection<String> values = map.values();
        for (String v: values){
            System.out.println("Value: " + v);
        }

        map.forEach((k,v)->{
            System.out.println("Key: "+ k + ", Value: " + v);
        });
    }
}
