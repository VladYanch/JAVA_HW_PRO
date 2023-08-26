import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int floors = 2;
        while (floors > 1) {
            System.out.println("Введите количество этажей: ");
            floors = scanner.nextInt();
            int elev1 = random.nextInt(1, floors);
            int elev2 = random.nextInt(1, floors);
            int request = random.nextInt(1, floors);

            if (Math.abs(request - elev1) <= Math.abs(request - elev2)) {
                System.out.println("На вызов с " + request + " этажа едет лифт 1 c "
                        + elev1 + " этажа, т.к. лифт 2 стоит на " + elev2 + " этаже");
            } else {
                System.out.println("На вызов с " + request + " этажа едет лифт 2 c "
                        + elev2 + " этажа, т.к. лифт 1 стоит на " + elev1 + " этаже");
            }
        }
    }
}