package lab12;

import java.util.LinkedHashSet;

public class Task1 {
    public static void main(String[] args) {
        LinkedHashSet<String> set1 = new LinkedHashSet<>();
        LinkedHashSet<String> set2 = new LinkedHashSet<>();

        set1.add("George");
        set1.add("Jim");
        set1.add("John");
        set1.add("Blake");
        set1.add("Kevin");
        set1.add("Michael");

        set2.add("George");
        set2.add("Katie");
        set2.add("Kevin");
        set2.add("Michelle");
        set2.add("Ryan");

        LinkedHashSet<String> union = (LinkedHashSet<String>) set1.clone();
        LinkedHashSet<String> difference = (LinkedHashSet<String>) set1.clone();
        LinkedHashSet<String> intersection = (LinkedHashSet<String>) set1.clone();

        union.addAll(set2);
        System.out.println("Union: " + union);

        difference.removeAll(set2);
        System.out.println("Difference: " + difference);

        intersection.retainAll(set2);
        System.out.println("Intersection: " + intersection);
    }
}

