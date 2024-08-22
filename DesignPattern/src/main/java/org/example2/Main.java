package org.example2;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class Main {

  public static void main(String[] args)
  {
    Map<String, Integer> people = new HashMap<>();
    people.put("Ali", 25);
    people.put("Ayşe", 32);
    people.put("Mehmet", 28);
    people.put("Fatma", 35);
    people.put("Zeynep", 40);

    List<String> collect = people.entrySet().stream()
        .filter(x -> x.getValue() > 30)
        .map(y -> y.getKey())
        .collect(Collectors.toList());

    Integer total = people.values().stream()
        .mapToInt(Integer::intValue)
        .sum();

    Map<Integer,List<String>> result = people.keySet().stream()
        .collect(Collectors.groupingBy(String::length));

    OptionalDouble ortalama = people.values().stream()
        .mapToInt(Integer::intValue)
        .average();

    if (ortalama.isPresent()) {
      System.out.println("ortalama yas : " + ortalama.getAsDouble());
    }

    String youngerPerson = people.entrySet().stream()
        .min(Map.Entry.comparingByValue())
        .map(x -> x.getKey() + " : " + x.getValue())
        .orElse("Kişi yok");

    String olderPerson = people.entrySet().stream()
        .max(Map.Entry.comparingByValue())
        .map(x -> x.getKey() + " : " + x.getValue())
        .orElse("Kişi yok");



    Map<String, Integer> pep = new HashMap<>();
    pep.put("Ali", 25);
    pep.put("Ayşe", 32);
    pep.put("Mehmet", 28);
    pep.put("Fatma", 32);
    pep.put("Zeynep", 25);
    pep.put("Can", 28);

    Map<Integer,Long> frequency = pep.values().stream()
        .collect(Collectors.groupingBy(
            Integer::intValue,
            Collectors.counting()));



  }
}
