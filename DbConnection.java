package hexa;
import org.skife.jdbi.v2.DBI;
public class DbConnection {
  /**
   * Connecting to mysql DB
   * @return database connection
   */
  static DBI dbi=null;
  public static final DBI getConnect() {
    if (dbi==null){
    try {
      Class.forName("com.mysql.jdbc.Driver");
      String dbc ="Localhost:3306";
      DBI dbi=new DBI("jdbc:mysql://"+dbc+"/test? useSSL=false","root","Password123");
      return dbi;
    }
    catch (ClassNotFoundException e) {
      throw new RuntimeException(e);
    }
  }
  else
  return dbi;
}
}