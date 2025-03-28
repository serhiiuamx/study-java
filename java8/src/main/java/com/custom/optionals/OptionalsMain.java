package com.custom.optionals;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class OptionalsMain {
    public void start() {
        TestClass t = null;
        // Optional<TestClass> opT = Optional.of(t); - cannot do that
        Optional<TestClass> opT = Optional.ofNullable(t);
        System.out.println("");
        System.out.println("opT=" + opT);
        System.out.println("opT.isPresent=" + opT.isPresent());
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list1 = Optional.ofNullable(list).orElseGet(Collections::emptyList).stream().filter(n -> n != 2)
                .collect(Collectors.toList());
        System.out.println("list=" + list);
        System.out.println("list1=" + list1);
    }
}
