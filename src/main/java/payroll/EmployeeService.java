package payroll;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAll();

    Employee getOneByName(String name);

    Employee getOneByAge(Integer age);

    void add(Employee employee);

    Integer getEmployeesAgeSummary();
}
