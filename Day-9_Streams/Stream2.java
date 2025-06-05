package Assignments.StreamsEx;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Stream2 {
    public static void main(String[] args) {
        String s = "Mini is a good girl";
        LinkedHashMap<String,Long> li = Arrays.stream(s.split("")).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));
        System.out.println(li);
    }
}
