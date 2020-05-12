package com.empapp.test;

import com.empapp.model.Employee;
import com.empapp.controller.EmpController;

 class EmpAppTest {
 
     public static void main(String[] args) {

        Employee employee = new Employee();
        EmpController empcontroller = new EmpController();
        int status = empcontroller.EmployeeStatus();
        if( status == 1)
        {

          System.out.println("IsPresent");
          int workhrs = empcontroller.Employee_Workhrs();
          if(workhrs == 8)
               System.out.println("fulltime is : "+  empcontroller.EmployeeWage(workhrs));
          else
               System.out.println("Parttime is : "+  empcontroller.EmployeeWage(workhrs));
     
        }
        else
          System.out.println("IsAbsent");   
     }
}
