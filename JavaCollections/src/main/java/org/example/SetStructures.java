package org.example;

import java.util.*;

public class SetStructures {
    public static void main(String[] args) {
        // TreeSet
        //comparator default - invers fata de ordinea naturala, la string fiind cea lexicografica
        Set<String> jobs = new TreeSet<>(Comparator.reverseOrder());
        jobs.add("lawyer");
        jobs.add("fireman");
        jobs.add("programmer");
        jobs.add("doctor");
        System.out.println("Jobs: " + jobs);

        //comparator custom - defineste unicitatea indiferent de continutul real
        Set<String> fruits = new TreeSet<>(Comparator.comparing(String::length));
        fruits.add("watermelon");
        fruits.add("pear");
        fruits.add("strawberry"); //nu se adauga, pt ca are aceeasi lungime cu watermelon
        fruits.add("cherry");
        System.out.println("Fruits: " + fruits);

        //mai multi comparatori
        Set<String> veggies = new TreeSet<>(Comparator.comparing(String::length).thenComparing(Comparator.naturalOrder()));
        veggies.add("brocolli");
        veggies.add("onion");
        veggies.add("tomato");
        veggies.add("pepper");
        System.out.println("Veggies: " + veggies);

        //folosind obiecte create de mine
        Person p1 = new Person("Oliv", 24);
        Person p2 = new Person("Ivan", 24);
        Person p3 = new Person("Sandra", 33);
        Person p4 = new Person("Clara", 65);
        List<Person> allIndividuals = List.of(p1,p2,p3,p4);

        Comparator<Person> byAgeThenName = Comparator
                .comparingInt((Person p) -> p.age)
                .thenComparing(p -> p.name);
        Set<Person> individuals = new TreeSet<>(byAgeThenName);
        individuals.addAll(allIndividuals);
        System.out.println("Person TreeSet: " +individuals);


        //HashSet
        //cu numere
        Set<Integer> numbers = new HashSet<>();
        numbers.add(5);
        numbers.add(1);
        numbers.add(76);
        numbers.add(76);
        numbers.add(5);
        System.out.println(numbers);

        //cu obiecte de tip person
        Set<Person> personHashSet  = new HashSet<>(); // foloseste ca si comparator equals
        personHashSet.addAll(allIndividuals);
        System.out.println("Person hashSet: " + personHashSet); //ordine aleatoare


        //LinkedHashSet
        Set<Person> personLinkedHashSet = new LinkedHashSet<>();
        personLinkedHashSet.addAll(allIndividuals);
        System.out.println("Person LinkedHashSet: " + personLinkedHashSet);//aici mi le pune in ordinea in care le-am inserat eu
    }
}
