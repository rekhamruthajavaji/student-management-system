
import java.sql.SQLException;
import java.util.Scanner;

public class StudentManagement {

    public static void main(String[] args)
            throws SQLException {

        Scanner sc = new Scanner(System.in);

        StudentDAO dao = new StudentDAO();

        while(true) {

            System.out.println("\n1.Add Student");
            System.out.println("2.View Students");
            System.out.println("3.Search By ID");
            System.out.println("4.Search By Name");
            System.out.println("5.Update Student");
            System.out.println("6.Delete Student");
            System.out.println("7.Top 5 Students");
            System.out.println("8.Branch Report");
            System.out.println("9.Exit");

            System.out.print("Enter Choice : ");
            int choice = sc.nextInt();

            switch(choice) {

            case 1:

                System.out.print("Id: ");
                int id = sc.nextInt();

                sc.nextLine();

                System.out.print("Name: ");
                String name = sc.nextLine();

                System.out.print("Branch: ");
                String branch = sc.nextLine();

                System.out.print("Year: ");
                int year = sc.nextInt();

                sc.nextLine();

                System.out.print("Email: ");
                String email = sc.nextLine();

                System.out.print("CGPA: ");
                double cgpa = sc.nextDouble();

                Student s =
                        new Student(id,
                                name,
                                branch,
                                year,
                                email,
                                cgpa);

                dao.addStudent(s);
                break;

            case 2:
                dao.viewStudents();
                break;

            case 3:
                System.out.print("Enter Id: ");
                dao.searchById(sc.nextInt());
                break;

            case 4:
                sc.nextLine();
                System.out.print("Enter Name: ");
                dao.searchByName(sc.nextLine());
                break;

            case 5:
                System.out.print("Enter Id: ");
                int sid = sc.nextInt();

                sc.nextLine();

                System.out.print("New Email: ");
                String em = sc.nextLine();

                System.out.print("New CGPA: ");
                double c = sc.nextDouble();

                dao.updateStudent(sid, em, c);
                break;

            case 6:
                System.out.print("Enter Id: ");
                dao.deleteStudent(sc.nextInt());
                break;

            case 7:
                dao.topStudents();
                break;

            case 8:
                sc.nextLine();
                System.out.print("Enter Branch: ");
                dao.branchReport(sc.nextLine());
                break;

            case 9:
                System.out.println("Thank You");
                System.exit(0);

            default:
                System.out.println("Invalid Choice");
            }
        }
    }
}
