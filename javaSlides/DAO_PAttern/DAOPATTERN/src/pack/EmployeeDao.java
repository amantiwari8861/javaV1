/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack;

import java.util.List;

public interface EmployeeDao
{
  public List<Employee> getAllEmployees();

  public void addEmployee( Employee employee );
  
  public Employee getEmployee( int employeeId );

  public void updateEmployee( Employee employee );

  public void deleteEmployee( int employeeId );

}