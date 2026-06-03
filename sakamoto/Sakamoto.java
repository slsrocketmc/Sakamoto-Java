//Sakamoto's Algorithm in Java, created by River (Hayden) Cranch

import java.util.Scanner;

public class Sakamoto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Sets month offset table as an array
        int[] monthOffset = {0, 3, 2, 5, 0, 3, 5, 1, 4, 6, 2, 4};

        //Creates a string array for use with "day codes"
        String[] dayString = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        //Requests and saves a date as a single string
        System.out.println("Please enter a date (DD/MM/YYYY):");
        String inputDate = scanner.nextLine();

        //Converts the input string to an array
        String[] inputDateArray = inputDate.split("/");

        //Parses values for day, month, and year from the string array
        int inputDay = Integer.parseInt(inputDateArray[0]);
        int inputMonth = Integer.parseInt(inputDateArray[1]);
        int inputYear = Integer.parseInt(inputDateArray[2]);

        //Adjusts the year (Step 1)
        if (inputMonth < 3) {
            inputYear = inputYear - 1;
        }

        //"Computes the sum" (Step 2)
        int result = inputYear + Math.floorDiv(inputYear, 4) - Math.floorDiv(inputYear, 100) + Math.floorDiv(inputYear, 400) + monthOffset[inputMonth - 1] + inputDay;

        //Finds the "day code" (Step 3)
        int dayCode = result % 7;

        //Prints the day as a string based on the "day code"
        System.out.println(dayString[dayCode]);
    }
}