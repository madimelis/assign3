import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Hospital h = new Hospital();

        while (true) {
            System.out.println("\n1. Add doctor");
            System.out.println("2. Show doctors");
            System.out.println("3. Add patient");
            System.out.println("4. Show patients");
            System.out.println("5. Delete patient");
            System.out.println("0. Exit");

            System.out.print("Choose: ");
            int ch = sc.nextInt();

            switch (ch) {
                case 1 -> {
                    System.out.print("Doctor name: ");
                    String n = sc.next();
                    System.out.print("Specialization: ");
                    String s = sc.next();
                    h.addDoctor(n, s);
                }

                case 2 -> h.getDoctors().forEach(System.out::println);

                case 3 -> {
                    System.out.print("Patient name: ");
                    String n = sc.next();
                    System.out.print("Age: ");
                    int a = sc.nextInt();
                    System.out.print("Doctor ID: ");
                    int d = sc.nextInt();
                    h.addPatient(n, a, d);
                }

                case 4 -> h.getPatients().forEach(System.out::println);

                case 5 -> {
                    System.out.print("Patient ID: ");
                    h.deletePatient(sc.nextInt());
                }

                case 0 -> {
                    System.out.println("Bye");
                    return;
                }
            }
        }
    }
}


