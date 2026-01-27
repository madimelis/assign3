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
            System.out.println("6. Change patient's doctor");
            System.out.println("7. Show patients by doctor");
            System.out.println("8. Change doctor's surname");

            System.out.println("0. Exit");

            System.out.print("Choose: ");
            int ch = sc.nextInt();

            switch (ch) {
                case 1 -> {
                    System.out.print("Doctor name: ");
                    String n = sc.next();
                    System.out.print("Doctor surname: ");
                    String l = sc.next();
                    System.out.print("Specialization: ");
                    String s = sc.next();
                    h.addDoctor(n, l, s);
                }

                case 2 -> h.getDoctors().forEach(System.out::println);

                case 3 -> {
                    System.out.print("Patient name: ");
                    String n = sc.next();
                    System.out.print("Patient surname: ");
                    String l = sc.next();
                    System.out.print("Age: ");
                    int a = sc.nextInt();
                    System.out.print("Doctor ID: ");
                    int d = sc.nextInt();
                    h.addPatient(n, l, a, d);
                }

                case 4 -> h.getPatients().forEach(System.out::println);

                case 5 -> {
                    System.out.print("Patient ID: ");
                    h.deletePatient(sc.nextInt());
                }

                case 6 -> {
                    System.out.println("Patients:");
                    h.getPatients().forEach(System.out::println);

                    System.out.print("Patient ID: ");
                    int p = sc.nextInt();

                    System.out.println("Doctors:");
                    h.getDoctors().forEach(System.out::println);

                    System.out.print("New Doctor ID: ");
                    int d = sc.nextInt();

                    h.updatePatientDoctor(p, d);
                }

                case 7 -> {
                    System.out.println("Doctors:");
                    h.getDoctors().forEach(System.out::println);

                    System.out.print("Doctor ID: ");
                    int d = sc.nextInt();

                    h.filterPatientsByDoctor(d).forEach(System.out::println);
                }

                case 0 -> {
                    System.out.println("Bye");
                    return;
                }
            }
        }
    }
}