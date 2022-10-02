package lab_08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EmployeeController {

    public int totalSalary(List<Employee> employeeList) {
        int totalSalary = 0;
        for (Employee employee : employeeList) {
            totalSalary += employee.getSalary();
        }
        return totalSalary;
    }

    public static void main(String[] args) {
        Employee fte = new FTE();
        Contractor contractor = new Contractor();
        EmployeeController employeeController = new EmployeeController();
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(fte);
        employeeList.add(fte);
        employeeList.add(fte);
        employeeList.add(contractor);
        employeeList.add(contractor);

        int totalMonthlySalary = employeeController.totalSalary(employeeList);
        System.out.println("Total monthly salary: " + totalMonthlySalary);

    }
}
