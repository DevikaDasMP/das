package hexa;
import java.util.List;
import org.skife.jdbi.v2.DBI;
public class EmpFactory {
  public static EmployeeDAO getDAO() {
    DBI dbi = DbConnection.getConnect();
    EmployeeDAO eDAO=dbi.onDemand(EmployeeDAO.class);
    return eDAO;
  }
  public static List<Employee> getEmployees() {
    EmployeeDAO eDAO=getDAO();
    List<Employee> eList=eDAO.getAllEmployees();
    return eList;
  }
  public static Employee ValidateEmpLogin(String eN, String eP) {
    EmployeeDAO eDAO=getDAO();
    Employee emp=eDAO.validateLogin(eN, eP);
    return emp;
  }
  public static int insertEmp(String eN, String eP, String eH) {
    EmployeeDAO eDAO=getDAO();
    int val=eDAO.insertOneEmployee(eN, eP, eH);
    return val;
  }
  public static int updateEmp(int id, String name) {
    EmployeeDAO eDAO=getDAO();
    int val=eDAO.updateNameGivenId(id, name);
    return val;
  }
    public static int deleteEmp(int id) {
      EmployeeDAO eDAO=getDAO();
      int val=eDAO.deleteGivenId(id);
      return val;
  }
}