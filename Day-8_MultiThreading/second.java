package Assignments.ThreadsAssignment;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class second {
    public static void main(String[] args) throws Exception {
        Map<String, Double> stockPrices = loadCSV("C:\\Users\\JuturuHarika\\IdeaProjects\\classes\\src\\ThreadsAssignment\\stocks.csv");
        List<String> symbolss = Arrays.asList("AAPL", "GOOGL", "MSFT");
        ExecutorService executor = Executors.newFixedThreadPool(symbolss.size());
        Map<String, Double> result = new ConcurrentHashMap<>();
        for (String s : symbolss) {
            executor.submit(() -> {
                if (stockPrices.containsKey(s)) {
                    Double res=stockPrices.get(s);
                    result.put(s, res);
                }
            });
        }
        executor.shutdown();
        executor.awaitTermination(5, TimeUnit.SECONDS);
        System.out.println("Fetched Stock Prices:");
        result.forEach((s, price) -> System.out.println(s + " : " + price));
    }
    public static Map<String, Double> loadCSV(String fileName) throws IOException {
        Map<String, Double> map = new HashMap<>();
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        String line;
        br.readLine();
        while ((line = br.readLine()) != null) {
            String[] parts = line.split(",");
            if (parts.length == 2) {
                map.put(parts[0].trim(), Double.parseDouble(parts[1].trim()));
            }
        }
        return map;
    }}

