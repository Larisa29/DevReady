package org.example;

import java.util.*;

public class MapStructures {
    public static void main(String[] args) {
        Person p1 = new Person("Oliv", 24);
        Person p2 = new Person("Ivan", 24);
        Person p3 = new Person("Sandra", 33);
        Person p4 = new Person("Clara", 65);

        Map<LinkedList<String>, String> cityResidence = new HashMap<>();
        LinkedList<String> neamt = new LinkedList<>();
        neamt.add("Roman");
        neamt.add("Bicaz");

        cityResidence.put(neamt, "Piatra Neamt");
        for (Map.Entry<LinkedList<String>, String> entry : cityResidence.entrySet()) {
            System.out.println("Orase: " + entry.getKey() + " => judet: " + entry.getValue());
        }

        //cu obiecte person
        Map<Integer, Person> persons = new TreeMap<>();
        persons.put(4, p1);
        persons.put(2, p2);
        persons.put(11, p3);
        persons.put(6, p4);
        persons.forEach((key, value) -> System.out.println(key + "->" + value));

        //cu comparator personalizat
        Map<String, Person> individuals = new TreeMap<>(Comparator.comparing(String::length).thenComparing(Comparator.naturalOrder()));
        individuals.put("electrician", p1);
        individuals.put("zidar", p2);
        individuals.put("profesor", p3);
        individuals.put("inginer IT", p4);
        System.out.println("TreeMap pt person: " + individuals);
    }
}
