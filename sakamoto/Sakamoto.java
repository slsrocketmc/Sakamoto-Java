//Sakamoto's Algorithm java script by River (Hayden) Cranch

import java.util.Scanner;

public class Sakamoto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Sets month offset table as an array
        int[] monthOffset = {0, 3, 2, 5, 0, 3, 5, 1, 4, 6, 2, 4};

        //New line
        System.out.println();

        //Requests and saves year, month, and day as integers
        System.out.println("Enter a year as a four digit integer:");
        int inputYear = scanner.nextInt();
        System.out.println("Enter a month as a two digit integer");
        int inputMonth = scanner.nextInt();
        System.out.println("Enter a day as a two digit integer");
        int inputDay = scanner.nextInt();

        //Adjusts the year (Step 1)
        if (inputMonth < 3) {
            inputYear = (inputYear - 1);
        }

        int result = (inputYear + Math.floorDiv())
    }
}