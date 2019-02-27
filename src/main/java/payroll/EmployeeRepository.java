package payroll;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

interface EmployeeRepository extends JpaRepository<Employee, Long> {

    Employee findByName(String name);
    Employee findByAge(Integer age);
    List<Employee> getAllByAgeAfter(Integer age);
}