import java.util.Scanner;

class Student {

    private int id;
    private String name;
    private double marks;

    // Constructor
    Student(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    String getGrade() {
        if (marks >= 80)
            return "A+";
        else if (marks >= 70)
            return "A";
        else if (marks >= 60)
            return "B";
        else if (marks >= 50)
            return "C";
        else
            return "F";
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + getGrade());
        System.out.println();
    }
}

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Student[] students = new Student[10];
        int count = 0;

        int choice;

        do {

            System.out.println("\n1. Add Student");
            System.out.println("2. Show All Students");
            System.out.println("3. Exit");

            System.out.print("Enter Choice: ");
            choice = Integer.parseInt(sc.nextLine());

            if (choice == 1) {

                if (count < 10) {

                    System.out.print("Enter ID: ");
                    int id = Integer.parseInt(sc.nextLine());

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Marks: ");
                    double marks = Double.parseDouble(sc.nextLine());

                    students[count] = new Student(id, name, marks);
                    count++;

                    System.out.println("Student Added!");

                } else {
                    System.out.println("List Full!");
                }

            } else if (choice == 2) {

                if (count == 0) {
                    System.out.println("No Student Found!");
                } else {
                    for (int i = 0; i < count; i++) {
                        students[i].display();
                    }
                }

            } else if (choice != 3) {
                System.out.println("Invalid Choice!");
            }

        } while (choice != 3);

        sc.close();
        System.out.println("Program Ended.");
    }
}