package payroll;

import javax.persistence.*;

public class EmployeePhone {
    @Entity

    public class ContactTelDetailEntity {
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

        @Basic

        public String getTelType() {
            return telType;
        }

        public void setTelType(String telType) {
            this.telType = telType;
        }

        @Basic

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

        /*@Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ContactTelDetailEntity that = (ContactTelDetailEntity) o;

            if (id != that.id) return false;
            if (telType != null ? !telType.equals(that.telType) : that.telType != null) return false;
            if (telNumber != null ? !telNumber.equals(that.telNumber) : that.telNumber != null) return false;

            return true;
        }

        @Override
        public int hashCode() {
            int result = id;
            result = 31 * result + (telType != null ? telType.hashCode() : 0);
            result = 31 * result + (telNumber != null ? telNumber.hashCode() : 0);
            return result;
        }

        @Override
        public String toString() {
            return "ContactTelDetailEntity{" +
                    "id=" + id +
                    ", contact id: " + getContact().getId() +
                    ", telType='" + telType + '\'' +
                    ", telNumber='" + telNumber + '\'' +
                    ", employee=" + employee +
                    '}';
        }*/
    }
}
