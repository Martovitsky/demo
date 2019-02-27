package payroll;

import javax.persistence.*;

@Entity
public class EmployeePhone {


        private int id;
        private String telType;
        private String telNumber;

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }


        public String getTelType() {
            return telType;
        }

        public void setTelType(String telType) {
            this.telType = telType;
        }

        public String getTelNumber() {
            return telNumber;
        }

        public void setTelNumber(String telNumber) {
            this.telNumber = telNumber;
        }

         /*
         * EXAMPLE Many To One
         */
        private Employee employee;

        @ManyToOne
        @JoinColumn(name = "employee_id")
        public Employee getContact() {
            return this.employee;
        }

        public void setEmployee(Employee employee) {
            this.employee = employee;
        }


}
