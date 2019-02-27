package payroll;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getAll() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee getOneByName(String name) {  return employeeRepository.findByName(name);}

    @Override
    public Employee getOneByAge(Integer age) {  return employeeRepository.findByAge(age);}

    @Override
    public Integer getEmployeesAgeSummary() {
        int summaryAge =0;

        for (Employee employee:employeeRepository.getAllByAgeAfter(0)) {
            System.out.println(employee.getAge());
            summaryAge+=employee.getAge();

        }
        return summaryAge;
    }

    @Override
    @Transactional
    public void add(Employee employee) {
        employeeRepository.save(employee);
    }
}

