package hexa;

import java.util.List;

import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.SqlUpdate;
import org.skife.jdbi.v2.sqlobject.customizers.Mapper;
public interface EmployeeDAO {
  
  @SqlQuery("SELECT * from Employee")
  @Mapper(EmployeeMapper.class)
  List<Employee>getAllEmployees();

  @SqlQuery("Select * from Employee where empName=:eName and empPassword=:ePassword")
  @Mapper(EmployeeMapper.class)
  Employee validateLogin(@Bind("eName") String eName, @Bind("ePassword") String ePass);
  @SqlUpdate("insert into Employee(empName, empPassword,empHireDate) "+ 
          "values(:eName, :ePassword, :eHireDate)" )
  int insertOneEmployee(@Bind("eName") String eName,
                        @Bind("ePassword") String ePassword,
                        @Bind("eHireDate") String eHireDate);
  @SqlUpdate("Update Employee set empName=:eName where empId=:id")
  int updateNameGivenId(@Bind("id") int id, @Bind("eName") String eName);
  @SqlUpdate("Delete from Employee where empId=:id")
  int deleteGivenId(@Bind("id") int id);
}