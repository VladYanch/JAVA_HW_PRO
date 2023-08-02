import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
//    1. Дан список строк. Необходимо отфильтровать строки, длина которых больше 3 символов,
//    преобразовать их в верхний регистр, удалить повторяющиеся и вывести результат в отсортированном порядке.
    List<String> list = List.of("Anton", "Enn", "I", "Abba", "Anna", "A", "Dima", "Lena", "Anna", "No", "Andrey");
    System.out.println(
            list.stream()
                .filter(s-> s.length()>3)
                .distinct()
                .map(s-> s.toUpperCase())
                .sorted()
                .toList() // [ABBA, ANNA, DIMA, LENA]
    );

//  Дан список слов. Необходимо найти среднюю длину слов, начинающихся с буквы "A".
    System.out.println(
            list.stream()
                    .filter(s-> s.charAt(0) == 'A' || s.charAt(0) == 'a')
                    .mapToInt(s-> s.length())
                    .average()
                    .getAsDouble()
    );
    System.out.println("_".repeat(60));
//  Дан список слов. Необходимо сгруппировать их по длине и вывести результат.
    list.stream()
            .sorted(Comparator.comparing(s -> s.length()))
            .forEach(s-> System.out.print(s+" ") ); //I ,A ,No ,Enn ,Abba ,Anna ,Dima ,Lena ,Anna ,Anton ,Andrey


    System.out.println();
    System.out.println("_".repeat(60));
//  Дан список чисел. Необходимо найти наименьшее число, больше 0.
    List<Integer> list1 = List.of(-5, 6, 2, 4, -9, 0, 1);
    System.out.println(
            list1.stream()
                    .filter(s-> s > 0)
                    .mapToInt(s-> Integer.valueOf(s))
                    .min()
                    .getAsInt()
    );
    System.out.println("_".repeat(60));
//  Дан список чисел. Необходимо найти сумму квадратов всех положительных чисел.
    System.out.println(
            list1.stream()
                    .filter(s-> s > 0)
                    .mapToInt(s-> s*s)
                    .sum()
    );
    System.out.println("_".repeat(60));
//  Даны два списка чисел. Необходимо объединить их в один список, отсортировать по убыванию и удалить повторяющиеся элементы.
    List<Integer> list2 = List.of(-5, 6, 2, 4, -9, 0, 1);
    List<Integer> list3 = List.of(-2, 6, 7, 4, -3, 4, 1);
    System.out.println(
            Stream.concat(list2.stream(),list3.stream())
                .distinct()
                .sorted((a,b) -> b.compareTo(a))
                .toList()
    );
    System.out.println("_".repeat(60));
//  Дан список строк. Необходимо оставить только уникальные символы из всех строк и вывести их в алфавитном порядке.
//  List<String> list = List.of("Anton", "Enn", "I", "Abba", "Anna", "A", "Dima", "Lena", "Anna", "No", "Andrey");
    System.out.println(
            list.stream()
                    .flatMap(str -> str.toLowerCase()
                                    .chars()
                                    .mapToObj(ch -> (char) ch))
                    .distinct()
                    .sorted()
                    .toList()
    );
    System.out.println("_".repeat(60));
//  Дан список чисел. Необходимо найти второе максимальное число.
    List<Integer> list4 = List.of(-2, 6, 7, 4, -3, 4, 1);
    System.out.println(
            list4.stream()
                    .sorted((a,b) -> b.compareTo(a))
                    .skip(1)
                    .findFirst()
                    .get()
    );
    System.out.println("_".repeat(60));
//  Дан список строк. Необходимо удалить пустые строки, объединить оставшиеся строки в одну строку, разделенную запятой.
    List<String> list5 = List.of("Anton", "Enn", "I", "Abba", "Anna", "A", "", "Lena", "", "No", "Andrey");
    System.out.println(
                list5.stream()
                .filter(s-> s.length()>0)
                .collect(Collectors.joining(","))
                .toString()
    );
    System.out.println("_".repeat(60));
//  Дан список слов. Необходимо объединить все символы из всех слов в одну строку.
    System.out.println(
            list5.stream()
                    .flatMap(word -> Arrays.stream(word.split("")))
                    .collect(Collectors.joining())
    );
    System.out.println("_".repeat(60));
//  Даны два списка чисел. Необходимо найти разность множеств (элементы, присутствующие только в одном из списков) и вывести результат.
    List<Integer> listOne = List.of(-2, 6, 7, 2, 4, -3, 5, 4, 1);
    List<Integer> listTwo = List.of(-2, 6, 7, 4, -3, 3, 9, 7, 1);
    Set<Integer> setOne = new HashSet<>(listOne);
    Set<Integer> setTwo = new HashSet<>(listTwo);
    setOne.removeAll(listTwo);
    setTwo.removeAll(listOne);
    System.out.println(Stream.concat(setOne.stream(),setTwo.stream()).toList());
    System.out.println("_".repeat(60));
//  Дан список слов. Необходимо подсчитать количество символов в каждом слове и вывести результат.
    List<String> list6 = List.of("Anton", "Enn", "I", "Abba", "Anna", "A", "", "Lena", "", "No", "Andrey");
    System.out.println(
            list6.stream().mapToInt(s-> s.length()).sum()
    );
    System.out.println("_".repeat(60));
//  Дан список строк. Необходимо отфильтровать строки, которые начинаются с префикса "pre" и заканчиваются суффиксом "post".
    List<String> list7 = List.of("preOneSpost", "Anton", "Enn", "prepost", "I", "Abba", "Anna", "preTwopost");
    System.out.println(
            list7.stream()
                    .filter(s-> s.length()>=7
                        && s.startsWith("pre")
                        && s.endsWith("post"))
                    .toList()
    );
    System.out.println("_".repeat(60));
//  Дан список слов. Необходимо найти самое длинное слово с четной длиной.
    System.out.println(
            list7.stream()
                    .filter(str-> str.length()== list7.stream()
                            .filter(s-> s.length() % 2 == 0)
                            .mapToInt(String::length)
                            .max().getAsInt()).toList()
    );
    System.out.println("_".repeat(60));
}



//    Дан список слов. Необходимо отфильтровать слова, состоящие только из букв, разделить их на гласные и согласные, и вывести результат.
//    Дан список слов. Необходимо проверить, содержат ли они одинаковые символы (являются ли анаграммами) и вывести результат.
//    Дан список слов. Необходимо подсчитать количество слов для каждой длины и вывести результат.
//    Дан список чисел. Необходимо найти среднее значение всех уникальных чисел.
//    Дан список строк. Необходимо удалить все пробелы в каждой строке, отсортировать их в лексикографическом порядке и вывести результат.
//    Дан список слов. Необходимо проверить, являются ли они палиндромами, и вывести результат.
//    Дан список чисел. Необходимо найти максимальное четное число.
//    Дан список строк. Необходимо объединить все строки в одну строку, добавив префикс ">>" и суффикс "<<" к каждой строке.
//    Дан список строк. Необходимо объединить все символы из всех строк, удалить дубликаты и отсортировать их в лексикографическом порядке.
//    Дан список объектов Person с полем "возраст". Необходимо отфильтровать объекты, возраст которых находится в диапазоне от 25 до 40 лет, отсортировать по имени и вывести результат.`
//    Дан список чисел. Необходимо найти сумму всех четных чисел, которые являются положительными.
//    Дан список чисел. Необходимо найти второе минимальное число среди уникальных чисел.
//    Дан список слов. Необходимо разделить их на две группы: одна группа - слова с длиной менее или равной 4 символам, другая группа - слова с длиной более 4 символов. После этого подсчитать количество слов в каждой группе и вывести результат.
//    Дан список строк. Необходимо пропустить первые три символа в каждой строке и объединить оставшиеся символы в одну строку.
//    Дан список чисел. Необходимо найти три наименьших числа и вывести результат.
//    Дан список строк. Необходимо проверить, содержит ли хотя бы одна строка подстроку "an" и вывести результат.
}
