import java.util.Scanner;

public class Prog2StudentMarks {
    /**
     * student mark sheet programme
     * Write a java program to input student Name, roll No, and three subjects Math, Science and
     * * English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
     * * Input, Marks should between 0 to 100”) and find out total, percentage and result.
     * * If he is pass or fail on basis of percentage (pass>=35) and also give them grade if
     * * %> = 80 A+, %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet
     */

    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        Scanner scn = new Scanner(System.in);
        System.out.print("\nEnter Student Name      \t \t:\t");
        String name = scn.next();
        System.out.print("Enter Student Roll Number \t\t:\t");
        int rollNum = scn.nextInt();

        int mathsMarks, scienceMarks, englishMarks;
        do {
            System.out.println("Enter Maths Subject Mark between 0 and 100: ");
            mathsMarks = scn.nextInt();
            if (mathsMarks < 0 || mathsMarks > 100) {
                System.out.print("Invalid input, Marks should between 0 to 100");
                System.out.print("\nPlease enter correct marks:  ");
                mathsMarks = scn.nextInt();
            }
        } while (mathsMarks < 0 || mathsMarks > 100);

        do {
            System.out.println("Enter Science Subject Mark between 0 and 100:");
            scienceMarks = scn.nextInt();
            if (scienceMarks < 0 || scienceMarks > 100) {
                System.out.print("Invalid input, Marks should between 0 to 100");
                System.out.print("\nPlease enter correct marks: ");
                scienceMarks = scn.nextInt();
            }
        } while (scienceMarks < 0 || scienceMarks > 100);

        do {
            System.out.println("Enter English Subject Mark between 0 and 100:");
            englishMarks = scn.nextInt();
            if (englishMarks < 0 || englishMarks > 100) {
                System.out.print("Invalid input, Marks should between 0 to 100");
                System.out.print("\nPlease enter correct marks: ");
                englishMarks = scn.nextInt();
            }
        } while (englishMarks < 0 || englishMarks>100);

        int total = sum(mathsMarks, scienceMarks, englishMarks);
        int percentage = (total * 100) / 300;
        String result = calculateResult(mathsMarks, scienceMarks, englishMarks);
        String grade = calculateGrade(percentage, result);
        printTheMarkSheet(name, rollNum, mathsMarks, scienceMarks, englishMarks, total, percentage, result, grade);
        //Closing the scanner object
        scn.close();
    }

    //calculating the sun
    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    // Calculating the results on subjects marks
    public static String calculateResult(int mathsMarks, int scienceMarks, int englishMarks) {
        if (mathsMarks < 35 || scienceMarks < 35 || englishMarks < 35) {
            return "Fail";
        } else {
            return "Pass";
        }
    }

    // Calculating the grade on percentage and result
    public static String calculateGrade(int percentage, String result) {
        String grade = null;
        if (result.equalsIgnoreCase("pass")) {
            if (percentage >= 80) {
                grade = "A+";
            } else if (percentage >= 60) {
                grade = "A";
            } else if (percentage >= 50) {
                grade = "B";
            } else if (percentage >= 35) {
                grade = "C";
            }
        } else {
            grade = "-";
        }
        return grade;
    }

    // Printing the Marks sheet
    public static void printTheMarkSheet(String name, int rollNum, int mathsMarks, int scienceMarks,
                                         int englishMarks, double total, double percentage, String result,
                                         String grade) {
        System.out.println("-----------------------------");
        System.out.println("|                           |");
        System.out.println("| Mark Sheet                |");
        System.out.println("|___________________________|");
        System.out.println("| Name:" + name + "                  |");
        System.out.println("| Roll No:" + rollNum + "                |");
        System.out.println("|___________________________|");
        System.out.println("| Subjects: Marks           |");
        System.out.println("|___________________________|");
        System.out.println("| Math:" + mathsMarks + "                   |");
        System.out.println("| Science:" + scienceMarks + "                |");
        System.out.println("| English:" + englishMarks + "                |");
        System.out.println("|___________________________|");
        System.out.println("| Total:" + total + "             |");
        System.out.println("|___________________________|");
        System.out.println("| Percentage:" + percentage + "           |");
        System.out.println("| Result:" + result + "               |");
        System.out.println("| Grade:" + grade + "                  |");
        System.out.println("|___________________________|");
    }
}




