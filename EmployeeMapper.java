package hexa;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.skife.jdbi.v2.StatementContext;
import org.skife.jdbi.v2.tweak.ResultSetMapper;
public class EmployeeMapper implements ResultSetMapper<Employee> {
  @Override
  public Employee map(int idx, ResultSet rs, StatementContext ctx)
  throws SQLException {
    int id=rs.getInt("empId");
    String name=rs.getString("empName");
    String password=rs.getString("empPassword");
    String hiredate=rs.getString("empHireDate");

    Employee emp=new Employee(id, name, password, hiredate);
    return emp;
  }
}