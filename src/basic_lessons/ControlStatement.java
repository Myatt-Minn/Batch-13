package basic_lessons;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ControlStatement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age");
        int userInput = scanner.nextInt();
        userInput = userInput+3;
        System.out.println(userInput);

        int number = 0;
        while(number<5){
            System.out.println(number);
            number++;
        }
    }
}
