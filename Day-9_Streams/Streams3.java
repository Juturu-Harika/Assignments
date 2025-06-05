package Assignments.StreamsEx;

import java.util.*;
import java.util.stream.Collectors;

public class Streams3 {
    public static void main(String[] args) {
        //List<String> str = List.of("mini","gibu");
        Map<String, String> genderMap = Map.of(
                "Raj", "Male",
                "Sita", "Female",
                "Ravi", "Male",
                "Anita", "Female",
                "Kiran", "Male"
        );
        List<String> students = List.of("Raj", "Sita", "Ravi", "Anita");
        List<String> res = students.stream().map(name -> {
                    String gender = genderMap.get(name);
                    String prefix = switch (gender) {
                        case "Male" -> "Mr. ";
                        case "Female" -> "Ms. ";
                        default -> "";
                    };
                    return prefix + name;
                })
                .collect(Collectors.toList());
        res.forEach(System.out::println);
    }
}

