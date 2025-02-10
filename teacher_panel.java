import java.util.*;

class teacher { // Properties teacher information
    int teacher_id;
    String name;
    String dept = "Physics , Math , Chemistry";
    int salary = 124000;

    // mehtods
    // rollno
    public void teacher_id() {
        System.out.println("Enter your id no: "); // input the id no from the user.....
        Scanner reader = new Scanner(System.in);
        int input = reader.nextInt(); // Call the constructer to create a obj in main class...
        System.out.println("Your id no is " + input); // Print the id no...
    }

    public void name() {
        System.out.println("Enter your name: "); // input the name from the user...
        Scanner reader1 = new Scanner(System.in); // Call the constructer to create a obj in main class...
        String input_name = reader1.nextLine();
        System.out.println("Teacher name =  " + input_name); // Print the user name..
    }

    // dept change
    public void changedept() {
        System.out.println("If you want to change a dept?");
        System.out.println("Input 1 / 0");
        Scanner reader = new Scanner(System.in);
        int input = reader.nextInt();
        if (input == 1) {
            System.out.println("Enter new department name: ");
            Scanner reader2 = new Scanner(System.in);
            String input_dept = reader2.nextLine();
            System.out.println("Teacher department changed into: " + input_dept);
        }
        // else if (input == 0 ){
        // System.out.println("Exit");
        // }
    }
}

public class teacher_panel { // Create main class
    public static void main(String[] args) {

        teacher obj = new teacher(); // Create constructor..
        obj.dept = "Physics"; // data properties...
        obj.teacher_id(); // Call the all mehtod and properties...
        obj.name();
        System.out.println("Teacher dept name: " + obj.dept);
        obj.changedept();
        // obj.input_dept();
        System.out.println("Minimum teacher salary is " + obj.salary);
    }
}
