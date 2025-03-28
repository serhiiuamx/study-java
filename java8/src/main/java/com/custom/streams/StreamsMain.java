package com.custom.streams;

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsMain {
    public void start() {
        String[] arr = new String[] { "1", "2", "3" };
        int value = Arrays.stream(arr).mapToInt(Integer::parseInt).reduce(0, Integer::sum);
        List<Integer> res = Arrays.stream(arr).mapToInt(Integer::parseInt).boxed().collect(Collectors.toList());
        System.out.println("value=" + value);
        System.out.println("res=" + res);

        List<String> words = Arrays.asList("apple", "banana", "cherry");
        int total1 = words.stream().map(t -> t.length()).reduce(0, (a, b) -> a + b);
        int total2 = words.parallelStream().reduce(0, (a, b) -> a + b.length(), (a, b) -> a + b);
        System.out.printf("total1=%d, total2=%d\n\n", total1, total2);

        List<Double> res2 = Stream.generate(Math::random).limit(5).collect(Collectors.toList());
        System.out.println("res2=" + res2);

        List<Integer> list = Arrays.stream(new Integer[] { 1, 4, 7, 8 }).collect(LinkedList::new, (l, e) -> l.add(e),
                (l1, l2) -> l1.addAll(l2));
        System.out.println("Array converted to list: " + list);

        // HashSet<NamePhone> npSet = nameAndPhone.collect(HashSet::new, HashSet::add,
        // HashSet::addAll);

        List<Person> people = Arrays.asList(new Person("Alice", Arrays.asList("Reading", "Hiking")),
                new Person("Bob", Arrays.asList("Gaming")), new Person("Carol", Arrays.asList("Swimming", "Running")));

        List<List<String>> hobbyLists = people.stream().map(Person::getHobbies).collect(Collectors.toList());
        System.out.println("hobbyLists: " + hobbyLists);

        List<String> hobbies = people.stream().flatMap(t -> t.getHobbies().stream()).collect(Collectors.toList());
        System.out.println("hobbies: " + hobbies);
    }
}
