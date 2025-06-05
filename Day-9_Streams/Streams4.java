package Assignments.StreamsEx;

import java.util.*;
import java.util.stream.Collectors;

public class Streams4 {
    public static void main(String[] args) {
        List<Laptop> laptops = List.of(
                new Laptop("Dell XPS", "Intel i7", 16, 4, 512, new Date(2025,06,03)),
                new Laptop("HP Pavilion", "Intel i5", 8, 2, 256, new Date(2025,07,20)),
                new Laptop("Lenovo Legion", "Intel i7", 32, 6, 1024,new Date(2025,01,15)),
                new Laptop("Acer Nitro", "AMD Ryzen 5", 16, 4, 512, new Date(2025,01,10)),
                new Laptop("MacBook Pro", "Apple M1", 16, 0, 256, new Date(2025,03,23))
        );
        //filter by ram, graphics
        int minram = 16;
        int mingraphics = 4;
        List<Laptop> filtered = laptops.stream().filter(l -> (l.ram >= minram && l.graphics >= mingraphics)).toList();

        //grp by processor model
        Map<String, List<Laptop>> grouped = filtered.stream().collect(Collectors.groupingBy(l -> l.processor));

        //sort within grp
        grouped.replaceAll((processor, list) -> list.stream()
                .sorted(Comparator.comparing((Laptop l) -> l.ram).reversed()
                        .thenComparing((Laptop l) -> l.hardDisk).reversed()
                        .thenComparing((Laptop l) -> l.manuDate).reversed())
                .collect(Collectors.toList()));

        System.out.println(grouped);

    }
}
