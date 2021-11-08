package Bartosz.week8.oop.training.basics;

import java.util.HashMap;

public class Hashmaps {
    public static void main(String[] args) {

        HashMap<String, Integer> zH = new HashMap<String, Integer>();
        zH.put("a", 10);
        zH.put("b", 0);
        zH.put("c", 69);
        zH.put("d", 69);

        System.out.println(zH.containsValue(69));
        System.out.println(zH.containsKey("f"));
        System.out.println("HashMap contains " + zH.size() + " keys");
    }
}
