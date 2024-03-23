import java.util.Scanner;

public class App {

    static EmployerService employer = new EmployerService();

    public static void main(String[] args) throws Exception {
        System.out.println("View Employer - Type: 1 ");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("case 1");
            case 2:
                System.out.println("View Employer: Enter Employer ID: ");
                int empID = sc.nextInt();
                employer.viewEmployer(empID);
        }
        sc.close();
    }
}
