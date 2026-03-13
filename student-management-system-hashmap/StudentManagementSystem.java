/*
 Student Management System
 Using Java Collection Framework (HashMap)

 Features:
 - Add student
 - View students
 - Search student
 - Delete student
*/

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Student {
  
    int id;
    String name;
    int age;
  
    Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("ID: " + id + " Name: " + name + " Age: " + age);
    }
}

public class StudentManagementSystem {

    public static void main(String[] args) {

        HashMap<Integer, Student> students = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        while (choice != 5) {
			    System.out.println("=================================");
          System.out.println("Student Management System");
			    System.out.println("=================================");
          System.out.println("1. Add Student");
          System.out.println("2. View Students");
          System.out.println("3. Search Student");
          System.out.println("4. Delete Student");
          System.out.println("5. Exit");
  
	    		System.out.println("----------------------------------");
          System.out.println("Enter your choice: ");
          choice = scanner.nextInt();

          switch (choice) {
                
          // Add a new student
            case 1: {
              System.out.print("Enter Student ID: ");
              int id = scanner.nextInt();
              scanner.nextLine();
              System.out.print("Enter Student Name: ");
              String name = scanner.nextLine();
              System.out.print("Enter Student Age: ");
              int age = scanner.nextInt();
		          Student s = new Student(id, name, age);
              students.put(id, s);
					    System.out.println();
              System.out.println("Student added successfully!");
		          System.out.println();
              break;
            }

            case 2: {
              if (students.isEmpty()) {
  						  System.out.println();
                System.out.println("No students found!!");
              } 
              else {
						    System.out.println();
						    System.out.println("------Students Details------ ");
						    System.out.println();
                for (Map.Entry<Integer, Student> entry : students.entrySet()) {
                  entry.getValue().display();
                }
						    System.out.println();
              }
              break;
            }

            case 3: {
					    System.out.println();
              System.out.println("Enter Student ID to search: ");
              int searchId = scanner.nextInt();
              if (students.containsKey(searchId)) {
                students.get(searchId).display();
              }
              else {
						    System.out.println();
                System.out.println("Student not found!!");
              }
					    System.out.println();
              break;
				    }

            case 4: {
					    System.out.println();
              System.out.println("Enter Student ID to delete: ");
              int deleteId = scanner.nextInt();

              if (students.remove(deleteId) != null) {
						    System.out.println();
                System.out.println("Student deleted successfully!!");
              } 
					    else {
                System.out.println("Student not found!!");
              }
					    System.out.println();
              break;
            }

            case 5: {
              System.out.println("Exiting program...");
					    System.out.println();
              break;
            }
            
            default: {
              System.out.println("Invalid choice...");
					    System.out.println();
				    }
          }
        }
        scanner.close();
    }
}
