package logics;
public class LoopExample {

    public static void main(String[] args) {

        // 1. FOR LOOP
        System.out.println("For loop:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }

        // 2. WHILE LOOP
        System.out.println("\nWhile loop:");
        int j = 1;
        while (j <= 5) {
            System.out.println("j = " + j);
            j++;
        }

        // 3. DO-WHILE LOOP
        System.out.println("\nDo-while loop:");
        int k = 1;
        do {
            System.out.println("k = " + k);
            k++;
        } while (k <= 5);
    }
}