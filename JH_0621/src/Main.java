import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("one",1);
        map.put("two",2);
        map.put("three",3);

        //todo  СДЕЛАЛ ТОЛЬКО ПОЛЕЗНЫЕ ДЛЯ МЕНЯ ЗАДАЧИ

        // Вывести все ключи из мапы на экран.
        System.out.println(map);
        System.out.println("Вывести все ключи из мапы на экран");
        for (String key :map.keySet() ) {
            System.out.println(key);
        }
        System.out.println("-".repeat(50));
        //--------------------------------------------------------
        // Проверить, содержит ли мапа определенное значение. 2 true
        System.out.println(map.containsKey("two"));
        //--------------------------------------------------------
        //  Найти ключ, связанный с определенным значением.
        int value = 3; // three
        for (Map.Entry<String,Integer> entry: map.entrySet() ) {
            if (entry.getValue()==value) {
                System.out.println(entry.getKey());
            }
        }
        System.out.println("-".repeat(50));
        //--------------------------------------------------------
        System.out.println("Найти ключ в мапе с максимальным значением.");
        System.out.println(mapFindMapMaxValue(map));
        System.out.println("-".repeat(50));
        //--------------------------------------------------------
        // Подсчитать количество ключей, значение которых содержит определенное слово.
        Map<String,String> map1 = new HashMap<>();
        map1.put("1","coffee");
        map1.put("2","milk");
        map1.put("3","coffee");
        map1.put("4","butter");
        map1.put("5","bread");
        System.out.println(map1);
        System.out.println(mapFindMapWord(map1,"coffee"));
        System.out.println("-".repeat(50));
        //--------------------------------------------------------
        //         Подсчитать сумму числовых значений в мапе.
        System.out.println(map);
        System.out.println(mapSum(map));
        System.out.println("-".repeat(50));
        //--------------------------------------------------------
        // Создать новую мапу, где значениями будут ключи, а ключами - значения исходной мапы.
        System.out.println(map);
        System.out.println(mapReverseKeyValue(map));
        System.out.println("-".repeat(50));
        //--------------------------------------------------------
        // Очистить мапу и вывести сообщение о ее пустом состоянии.
        System.out.println(map);
        map.clear();
        System.out.println(map);
        if (map.isEmpty()) System.out.println("Мапа очищена");
        System.out.println("-".repeat(50));
        //--------------------------------------------------------
        // Создать список List, заполнить его несколькими значениями.
        // Затем перебрать список и вывести элементы в обратном порядке.
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        System.out.println(list);
        listReversePrint(list);
        System.out.println();
        System.out.println("-".repeat(50));
        //--------------------------------------------------------
        //Найти среднее значение элементов в каждом столбце и вывести его.[][]
        double[][] arr = new double[][] {{2,3,4,5}, {4,7,7,8}, {1,4,3,7}};
        System.out.println(Arrays.toString(findIntAvgColumn(arr)));

    }

    public static int mapFindMapMaxValue(Map<String,Integer> map) {
        // Найти ключ с максимальным значением.
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        int max = iterator.next().getValue();
        while (iterator.hasNext()) {
            if (iterator.next().getValue()>max) max = iterator.next().getValue();
        }
        return max;
    }

    public static int mapFindMapWord(Map<String,String> map, String word) {
//         Подсчитать количество ключей, значение которых содержит определенное слово.
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        int count = 0;
        while (iterator.hasNext()) {
            if (iterator.next().getValue().equals(word)) count++;
        }
        return count;
    }

    public static int mapSum(Map<String,Integer> map) {
//         Подсчитать сумму числовых значений в мапе.
        int sum = 0;
        for (Map.Entry<String,Integer> entry : map.entrySet()) {
            sum += entry.getValue();
        }
        return sum;
    }

    public static Map<Integer,String> mapReverseKeyValue(Map<String,Integer> map) {
        Map<Integer,String> result = new HashMap<>();
//         Создать новую мапу, где значениями будут ключи, а ключами - значения исходной мапы.
        for (Map.Entry<String,Integer> entry : map.entrySet()) {
            result.put(entry.getValue(), entry.getKey());
        }
        return result;
    }

    public static void listReversePrint(List<?> list) {
        for (int i = list.size()-1; i >= 0 ; i--) {
            System.out.print(list.get(i)+", ");
        }
    }

    public static double[] findIntAvgColumn (double[][] arr) {
    //Найти среднее значение элементов в каждом столбце и вывести его.[][]
        double[] res = new double[arr[0].length];
        double sum = 0;
        for (int i = 0; i < arr[0].length; i++) {
            for (int j = 0; j <arr.length ; j++) {
                sum += arr[j][i];
            }
            res[i] = sum / arr.length;
            sum = 0;
        }
        return res;
    }
}
