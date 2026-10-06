
package employee;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeManagementSystem {

    public static void main(String[] args) {

        ArrayList<Employee> list = new ArrayList<Employee>();
        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n1.Add  2.View  3.Search  4.Update  5.Delete  6.Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            if (choice == 1) {

                System.out.print("ID: ");
                int id = sc.nextInt();

                sc.nextLine();
                System.out.print("Name: ");
                String name = sc.nextLine();

                System.out.print("Department: ");
                String dept = sc.nextLine();

                System.out.print("Salary: ");
                double salary = sc.nextDouble();

                list.add(new Employee(id, name, dept, salary));
                System.out.println("Employee added!");

            } else if (choice == 2) {

                for (Employee e : list)
                    e.display();

            } else if (choice == 3) {

                System.out.print("Enter ID: ");
                int id = sc.nextInt();

                for (Employee e : list) {
                    if (e.id == id)
                        e.display();
                }

            } else if (choice == 4) {

                System.out.print("Enter ID to update: ");
                int id = sc.nextInt();

                sc.nextLine();

                for (Employee e : list) {
                    if (e.id == id) {

                        System.out.print("New Name: ");
                        e.name = sc.nextLine();

                        System.out.print("New Department: ");
                        e.department = sc.nextLine();

                        System.out.print("New Salary: ");
                        e.salary = sc.nextDouble();

                        System.out.println("Employee updated!");
                    }
                }

            } else if (choice == 5) {

                System.out.print("Enter ID: ");
                int id = sc.nextInt();

                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i).id == id) {
                        list.remove(i);
                        System.out.println("Employee deleted!");
                    }
                }

            } else if (choice == 6) {

                System.out.println("Thank you!");
                break;

            } else {

                System.out.println("Invalid choice!");
            }
        }

        sc.close();
    }
}
