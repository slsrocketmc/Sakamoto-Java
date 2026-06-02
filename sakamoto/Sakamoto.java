//Sakamoto's Algorithm in Java, created by River (Hayden) Cranch

import java.util.Scanner;

public class Sakamoto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Sets month offset table as an array
        int[] monthOffset = {0, 3, 2, 5, 0, 3, 5, 1, 4, 6, 2, 4};

        //Creates a string array for use with "day codes"
        String[] dayString = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

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

        //"Computes the sum" (Step 2)
        int result = inputYear + Math.floorDiv(inputYear, 4) - Math.floorDiv(inputYear, 100) + Math.floorDiv(inputYear, 400) + monthOffset[inputMonth - 1] + inputDay;

        //Finds the "day code" (Step 3)
        int dayCode = result % 7;

        //Prints the day as a string based on the "Day Code"
        System.out.println(dayString[dayCode]);
    }
}