package org.example;

import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        System.out.println(emailFindMap("text.txt"));
        System.out.println("-".repeat(100));
        replaceHTTP("input_url.txt");
        productAnalyse("product.txt");
    }

    public static void productAnalyse(String file) {
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String str;
            while ((str = reader.readLine()) != null) {
                String[] arr = str.split(":");
                if (Integer.valueOf(arr[1]) > 10) {
                    System.out.println(str);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void replaceHTTP(String file) {
        try (BufferedReader reader = new BufferedReader(new FileReader(file));
             BufferedWriter writer = new BufferedWriter(new FileWriter("output_url.txt"))) {
            String str;
            while ((str = reader.readLine()) != null) {
                writer.write(str.replace("https://www", "http://www"));
                writer.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static Map emailFindMap(String file) {
        Map<String, Integer> map = new HashMap<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String str;
            Pattern pattern = Pattern.compile("\\w+\\\\@\\w+\\.\\w+");
            while ((str = reader.readLine()) != null) {
                Matcher matcher = pattern.matcher(str);
                while (matcher.find()) {
                    map.merge(str.substring(matcher.start(), matcher.end()), 1, Integer::sum);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return map;
    }
}