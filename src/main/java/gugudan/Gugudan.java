package gugudan;

import java.util.Scanner;

public class Gugudan {

    public static void main(String[] args) {
        // 2단
        System.out.println("2단");
        System.out.println(2 * 1);
        System.out.println(2 * 2);
        System.out.println(2 * 3);
        System.out.println(2 * 4);
        System.out.println(2 * 5);
        System.out.println(2 * 6);
        System.out.println(2 * 7);
        System.out.println(2 * 8);
        System.out.println(2 * 9);

        // 3단
        System.out.println("3단");
        System.out.println(3 * 1);
        System.out.println(3 * 2);
        System.out.println(3 * 3);
        System.out.println(3 * 4);
        System.out.println(3 * 5);
        System.out.println(3 * 6);
        System.out.println(3 * 7);
        System.out.println(3 * 8);
        System.out.println(3 * 9);

        // 4단
        System.out.println("4단");
        int result = 4 * 1;
        System.out.println(result);
        result = 4 * 2;
        System.out.println(result);
        result = 4 * 3;
        System.out.println(result);
        result = 4 * 4;
        System.out.println(result);
        result = 4 * 5;
        System.out.println(result);
        result = 4 * 6;
        System.out.println(result);
        result = 4 * 7;
        System.out.println(result);
        result = 4 * 8;
        System.out.println(result);
        result = 4 * 9;
        System.out.println(result);

        // 5단
        System.out.println("출력할 단은?");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(number * 1);
        System.out.println(number * 2);
        System.out.println(number * 3);
        System.out.println(number * 4);
        System.out.println(number * 5);
        System.out.println(number * 6);
        System.out.println(number * 7);
        System.out.println(number * 8);
        System.out.println(number * 9);

        // 6단 - While
        System.out.println("6단");
        int i = 1;
        while(i < 10) {
            System.out.println(6 * i);
            i = i + 1;
        }

        // 7단 - for
        System.out.println("7단");
        for(int j = 1; j < 10; j++) {
            System.out.println(7 * j);
        }

        // 8단
        System.out.println("출력할 단은?: ");
        Scanner scanner1 = new Scanner(System.in);
        int number1 = scanner1.nextInt();
        System.out.println("사용자가 입력한 값: " + number1);

        if (number1 < 2) {
            System.out.println("1보다 큰 값을 입력하세요.");
        } else if (number1 > 9) {
            System.out.println("9보다 작은값을 입력하세요");
        } else {
            for(int k = 1; k < 10; k++) {
                System.out.println(number1 * k);
            }
        }

        // 9단
        int[] results = new int[9];
        for(int l=0; l < results.length; l++) {
            results[l] = 9 * (l + 1);
        }
        for(i=0; i < results.length; i++) {
            System.out.println(results[i]);
        }
    }
}
