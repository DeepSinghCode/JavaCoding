// add Emplyer Service class - management service - add, update, delete record 

import java.util.HashSet;

public class EmployerService {

    int id;

    HashSet<Employer> empSet = new HashSet<>();

    Employer emp1 = new Employer(101, "Name1", "Address1");
    Employer emp2 = new Employer(102, "Name2", "Address2");
    Employer emp3 = new Employer(103, "Name3", "Address3");

    EmployerService() {
        empSet.add(emp1);
        empSet.add(emp2);
        empSet.add(emp3);

    }

    public void viewEmployer(int id) {
        // this.id = id;
        for (Employer emp : empSet) {
            if (emp.getID() == id) {
                System.out.println(emp.name + " " + emp.address);
                // return emp;
            }
        }

    }

}
