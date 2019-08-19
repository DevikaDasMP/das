
package hexa;

import java.util.List;
import java.util.Scanner;

public class EmpCli {

  private Scanner option = new Scanner(System.in, "UTF-8"); 

  private void mainMenu() { 
    System.out.println("1. Show All Employees"); 
    System.out.println("2. Employee login"); 
    System.out.println("3. Manage Employees");
    System.out.println("4. exit"); 
    mainMenuDetails(); 
  } 
  private void mainMenuDetails() { 
    try { 
      System.out.println("Enter your choice:"); 
      int menuOption = option.nextInt(); 
      switch (menuOption) { 
        case 1: 
          showAllEmployees(); 
          break; 
        case 2: 
          doEmpLogin(); 
          break; 
        case 4: 
          Runtime.getRuntime().halt(0); 
          break;
        case 3:
          manageEmp();
        break;
        default: 
          System.out.println("Choose appropriate choice"); 
      } 
    } catch (Exception e) { 
      e.printStackTrace(); 
      System.out.println("enter a valid value"); 
    } 
    option.nextLine(); 
    mainMenu(); 
  }
  private void showAllEmployees(){
    List<Employee>  emp = EmpFactory.getEmployees(); 
    
    for (Employee e : emp) { 
    System.out.println(e);
    } 
  }
  private void doEmpLogin(){

    System.out.println("Enter employee name and password");
    String eName = option.next();
    String ePassword = option.next();

    Employee emp = EmpFactory.ValidateEmpLogin( eName, ePassword);
    System.out.println(emp);
  }
  
  private void manageEmp(){
    System.out.println("1. Add Employee"); 
    System.out.println("2. Update"); 
    System.out.println("3. delete"); 
    System.out.println("4. Exit"); 
    manageEmpDetails();
  }

  private void manageEmpDetails() { 
    try { 
      System.out.println("Enter your choice:"); 
      int menuOption = option.nextInt(); 
      switch (menuOption) { 
        case 1: 
          addEmployee(); 
          break; 
        case 2: 
          updateEmp(); 
          break; 
        case 3:
          deleteEmp();
        break;
        case 4: 
           return;
        default: 
          System.out.println("Choose appropriate choice"); 
      } 
    } catch (Exception e) { 
      e.printStackTrace(); 
      System.out.println("enter a valid value"); 
    } 
    option.nextLine(); 
    manageEmp(); 
  }

  void addEmployee(){
    System.out.println("Add employee name, password and hiredate(yyyy/MM/dd");
    String name = option.next();
    String password = option.next();
    String hiredate = option.next();

    System.out.println(name + " " + password + " " + hiredate);
    int val=EmpFactory.insertEmp(name, password, hiredate);
    System.out.println("Success value is :"+val);
  }
  void updateEmp(){
    System.out.println("Enter name to change :");
    String name=option.next();
    System.out.println("Enter Id to apply the change :");
    int id=option.nextInt();
    System.out.println(name+" "+"id " +id);
    int val=EmpFactory.updateEmp(id,name);
    System.out.println("Succes value is :"+val);
  }
  void deleteEmp(){
    System.out.println("Enter id to delete :");
    int id=option.nextInt();
    int val=EmpFactory.deleteEmp(id);
    System.out.println("Succes value is :"+val);
  }
  public static void main(final String[] args) { 
    final EmpCli mainObj = new EmpCli(); 
    mainObj.mainMenu(); 
  } 
}