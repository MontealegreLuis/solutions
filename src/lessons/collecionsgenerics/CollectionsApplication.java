/**
 * This source file is subject to the license that is bundled with this package in the file LICENSE.
 */
package lessons.collecionsgenerics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

// This class has some examples using the List and Map API
// It
public class CollectionsApplication {
    public static void main(String[] args) {
        arrayListApi();
        mapsApi();
    }

    private static void mapsApi() {
        HashMap<String, Integer> map = new LinkedHashMap<>();

        map.put("Luis", 30);
        map.put("Ryan", 31);
        map.put("Zach", 32);
        map.put("Fer", 33);

        // Simplest way to iterate a map is using a lambda
        map.forEach((key, value) -> {
            System.out.println("key is:" + key);
            System.out.println("value is: " + value);
        });
    }

    private static void arrayListApi() {
        List names = new ArrayList(); // This list can hold any object

        // This one can only contain strings, because it's generic
        List<String> onlyStrings = new ArrayList<>();
        onlyStrings.add("Zach");
        onlyStrings.add("Justin");
        onlyStrings.add(names.toString());

        for (String string: onlyStrings) {
            System.out.println(string);
        }

        // `names` will accept any type of object
        System.out.println(names.isEmpty());
        names.add("Luis");
        System.out.println(names.isEmpty());
        System.out.println(names.size());
        names.add("Ryan");
        System.out.println(names.size());
        System.out.println(names.get(0));
        System.out.println(names.get(1));

        names.add(8);
        names.add(true);
        names.add(6.7);

        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }

        for (Object name: names) {
            System.out.println(name);
        }
    }
}
