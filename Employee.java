package hexa;
public class Employee {
  private int empId;
  private String empName;
  private String empPassword;
  private String empHireDate;

  Employee(){}

  public Employee(int empId, String empName, String empPassword, String empHireDate) {
    this.empId = empId;
    this.empName = empName;
    this.empPassword = empPassword;
    this.empHireDate = empHireDate;
  }

  @Override
  public String toString() {
    return "Employee [empHireDate=" + empHireDate + ", empId=" + empId + ", empName=" + empName + ", empPassword="
        + empPassword + "]";
  }

  public int getEmpId() {
    return empId;
  }

  public void setEmpId(int empId) {
    this.empId = empId;
  }

  public String getEmpName() {
    return empName;
  }

  public void setEmpName(String empName) {
    this.empName = empName;
  }

  public String getEmpPassword() {
    return empPassword;
  }

  public void setEmpPassword(String empPassword) {
    this.empPassword = empPassword;
  }

  public String getEmpHireDate() {
    return empHireDate;
  }

  public void setEmpHireDate(String empHireDate) {
    this.empHireDate = empHireDate;
  }
}