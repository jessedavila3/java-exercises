import java.util.*;

/**
 * Created by jessedavila on 11/28/16.
 */
public class StudentScores {
    public static void main(String[] args) {
        String firstName, lastName, keepGoing;
        int score;

        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        System.out.println("Welcome to this thing");

        do {
            System.out.println("What is the first name?");
            firstName = sc.nextLine().trim();
            System.out.println("And the last name?");
            lastName = sc.nextLine().trim();
            System.out.println("Score?");
            score = Integer.parseInt(sc.nextLine());

            Student newStudent = new Student(firstName,lastName,score);
            students.add(newStudent);

            System.out.println("Continue?");
            keepGoing = sc.nextLine();
        } while (keepGoing.equalsIgnoreCase("y"));

        Collections.sort(students); //sorts the last names then first names if need be.

        System.out.println("-----"); //iterates through ArrayList to display all info, sorted.
        for(Student student: students) {
            System.out.println(student.lastName +", " + student.firstName);
            System.out.println("Score: " + student.score);
            System.out.println("-----");
        }



    }
}
