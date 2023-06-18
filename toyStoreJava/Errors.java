package toyStoreJava;

import java.util.Scanner;

public class Errors {
    static Scanner scanner = new Scanner(System.in);

    public static int err() {
        int num = scanner.nextInt();

        while (num < 1 || num > 3) {
            System.out.println("Другой команды еще не предусмотрено");
            System.out.println("Сделайте правильный выбор: ");
            num = scanner.nextInt();
        }
        
        return num;
    }
    
}
