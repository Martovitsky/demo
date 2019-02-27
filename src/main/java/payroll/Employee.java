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
    @Column(name = "id", nullable = false, insertable = true, updatable = true)
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
    private Set<EmployeePhone.ContactTelDetailEntity> contactTelDetails = new HashSet<EmployeePhone.ContactTelDetailEntity>();

    @OneToMany(mappedBy = "employee", cascade = CascadeType.ALL, orphanRemoval = true)
    public Set<EmployeePhone.ContactTelDetailEntity> getContactTelDetails() {
        return this.contactTelDetails;
    }

    public void setContactTelDetails(Set<EmployeePhone.ContactTelDetailEntity> contactTelDetails) {
        this.contactTelDetails = contactTelDetails;
    }

    public void addContactTelDetail(EmployeePhone.ContactTelDetailEntity contactTelDetail) {
        contactTelDetail.setEmployee(this);
        getContactTelDetails().add(contactTelDetail);
    }

    public void removeContactTelDetail(EmployeePhone.ContactTelDetailEntity contactTelDetail) {
        getContactTelDetails().remove(contactTelDetail);
    }
}