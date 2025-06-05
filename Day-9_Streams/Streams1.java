package Assignments.StreamsEx;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams1 {
    public static void main(String[] args) {
        List<List<String>> emps = List.of(
                List.of("ramu", "sriya", "harika"),
                List.of("sunitha", "arun", "mini"),
                List.of("keshav", "rahul", "mahesh")
        );
        //strem-1C
        List<String> a = emps.stream().flatMap(List::stream).collect(Collectors.toList());
        //System.out.println(a);

        //stream-2
        List<String> b = a.stream().filter(i->i.startsWith("r")).collect(Collectors.toList());
        //System.out.println(b);

        //stream-3
        List<String> c = b.stream().sorted().collect(Collectors.toList());
        //System.out.println(c);

        //stream-4
        Map<Character,List<String>> d = a.stream().sorted().collect(Collectors.groupingBy(ca -> ca.charAt(0)));
        System.out.println(d);

        //stream-5
        Collections.shuffle(a);
        int total = a.size();
        int teamSize = total / 5 + 1;
        List<List<String>> e = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            int start = i * teamSize;
            int end = (i == 4) ? total : (i + 1) * teamSize;
            e.add(a.subList(start, end));
        }
        System.out.println(e);

        //stream-6
        List<String> div1 = Stream.concat(e.get(0).stream(), e.get(1).stream()).collect(Collectors.toList());
        List<String> div2 = Stream.concat(e.get(2).stream(), e.get(3).stream()).collect(Collectors.toList());
        List<String> div3 = new ArrayList<>(e.get(4));
        List<List<String>> divs = List.of(div1,div2,div3);
        System.out.println(divs);

    }
}
