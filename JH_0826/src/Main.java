import java.util.*;
public class Main {
    public static int request = 0;
    public static int distMin = Integer.MAX_VALUE;
    public static void main(String[] args) {
        Map<String,Integer> map = new LinkedHashMap<>();
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Введите количество этажей >=2: ");
        int floors = scanner.nextInt();
//        int floors = 4;

        System.out.println("Введите количество лифтов >=2: ");
        int elevators = scanner.nextInt();
//        int elevators = 4;

        Character elev = 'A';
        for (int i = 0; i < elevators; i++) {
            map.put(elev.toString(),random.nextInt(1, floors));
            elev ++;
        }

        request = random.nextInt(1, floors);

        System.out.println("Лифты расположены: ");
        System.out.println(map);
        System.out.println("Вызов сделан с: " + request + " этажа");

        distMin = map.entrySet()
                .stream()
                .mapToInt(x -> Math.abs(x.getValue() - request))
                .min()
                .getAsInt();

        if (distMin == 0) {
            Map.Entry<String, Integer> elevActive = map.entrySet()
                    .stream()
                    .filter(x -> x.getValue() == request)
                    .findFirst()
                    .get();
            System.out.println("На этаже " + request + " стоит лифт " + elevActive.getKey());

        } else {
            Map.Entry<String, Integer> elevActive = map.entrySet()
                    .stream()
                    .filter(x -> x.getValue() == (request - distMin)
                            || x.getValue() == (request + distMin))
                    .findFirst()
                    .get();

            System.out.println("На вызов с " + request + " этажа едет лифт " + elevActive.getKey()
                    + " с " + elevActive.getValue() + " этажа");
        }
    }
}