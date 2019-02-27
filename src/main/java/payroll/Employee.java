package payroll;

import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;


@Data
@Entity
@Table(name = "employee", schema = "", catalog = "payroll")
public class Employee {
    Employee(){};
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //generated DataBase auto_increment when insert value
    private Long id;

    private String name;
    private String role;
    private Integer age;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }
    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }

    Employee(String name, String role, Integer age) {
        this.name = name;
        this.role = role;
        this.age = age;
    }
    public Set<EmployeePhone> employeePhone = new HashSet<EmployeePhone>();

    @OneToMany(targetEntity = EmployeePhone.class, mappedBy = "employee", cascade = CascadeType.ALL, orphanRemoval = true)
    public Set<EmployeePhone> getemployeePhone() {
        return this.employeePhone;
    }

    public void setemployeePhone(Set<EmployeePhone> employeePhone) {
        this.employeePhone = employeePhone;
    }

    public void addContactTelDetail(EmployeePhone employeePhone) {
        employeePhone.setEmployee(this);
        getemployeePhone().add(employeePhone);
    }

    public void removeContactTelDetail(EmployeePhone employeePhone) {
        getemployeePhone().remove(employeePhone);
    }
}