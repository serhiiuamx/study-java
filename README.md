# study-java
## Java 6 (2006)
### [ ] 8 features: Scripting API, Compiler API, JDBC 4.0, Pluggable Annotations

## Java 7 (2011)
### 10 features: Try-with-resources, Diamond Operator, Strings in Switch, NIO.2, ForkJoinPool (Fork/Join Framework (Parallel Processing))
1. java.util.concurrent.atomic

## Java 8 (2014)
### [x] 15 features: Lambdas, Streams, Optional, Date/Time API, Default Methods, Functional Interfaces
1. JDK 8 includes Java DB 10.10
2. HotSpot: Removal of PermGen
3. Method/Constructor References
4. Lambdas: expressions(need interface + method), Method References, Constructor References
5. Functional Interfaces:

| Functional Interface | Method | Purpose |
| ------------- | ------------- | ------------- |
| Predicate<T> | boolean test(T t) | Condition check |
| Consumer<T> | void accept(T t) | Performs an action |
| Function<T, R> | R apply(T t) | Data transformation |
| Supplier<T> | T get() | Provides a value |
| BiPredicate<T, U> | boolean test(T t, U u) | Two-arg |
| BiConsumer<T, U> | void accept(T t, U u) | Two-arg |
| BiFunction<T, U> | R apply(T t, U u) | Two-arg |
6. Streams 
    * Functional, Lazy, Immutable
    * Intermediate Operations: Transform stream (map, filter, sorted)
    * Terminal Operations: Produce result (collect, forEach, reduce)
    * Parallel Streams: Enable parallel processing for performance
7. Streams: Iterator vs Spliterator (Java 8)
8. Intermediate Operations: map, flatMap, filter, peek, distinct, sorted, skip, limit
9. Terminal Operations: collect, reduce, count/max/min, match/allMatch/noneMatch/findFirst
10. Collectors (used with collect()): toList/toSet/toMap, joining, groupingBy, partitioningBy, summarizingInt, counting
11. map(one-to-one) vs flatMap(one-to-many)
12. Date/Time API(java.time): LocalDate, LocalTime, LocalDateTime, ZonedDateTime, Instant, Period, Duration
    * java.util.Date and java.util.Calendar were mutable and not thread-safe
    * Hard to format/parse correctly


## Java 9 (2017)
- [ ] 12 features: 

## Java 10 (2018)
- [ ] 6 features: 

## Java 11 (2018, LTS)
- [ ] 9 features: 

## Java 12 (2019)
- [ ] 6 features: 

## Java 13 (2019)
- [ ] 5 features: 

## Java 14 (2020)
- [ ] 7 features: 

## Java 15 (2020)
- [ ] 6 features: 

## Java 16 (2021)
- [ ] 6 features: 

## Java 17 (2021, LTS)
- [ ] 10 features: 

## Java 18 (2022)
- [ ] 6 features: 

## Java 19 (2022)
- [ ] 7 features: 

## Java 20 (2023)
- [ ] 6 features: 

## Java 21 (2023, LTS)
- [ ] 15 features: 