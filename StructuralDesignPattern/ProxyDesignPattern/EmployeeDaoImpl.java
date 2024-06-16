package StructuralDesignPattern.ProxyDesignPattern;

//Concreate class
public class EmployeeDaoImpl implements EmployeeDao {

    @Override
    public void create(String client, EmployeeDo obj) throws Exception {
        // create a new row
        System.out.println("Created a new row in the Employee table");
    }

    @Override
    public void delete(String client, int employeeId) throws Exception {
        // delete a row
        System.out.println("Deleted a row in the Employee table");
    }

    @Override
    public EmployeeDo get(String client, int employeeId) throws Exception {
        // get a row
        System.out.println("Got a row in the Employee table from DB");
        return new EmployeeDo();
    }
}
