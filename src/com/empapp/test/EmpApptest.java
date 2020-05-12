package com.empapp.test;

import com.empapp.model.Employee;
import com.empapp.controller.EmpController;

 class EmpAppTest {
 
     public static void main(String[] args) {

        Employee employee = new Employee();
        EmpController empcontroller = new EmpController();
        int status = empcontroller.EmployeeStatus();
        switch( status )
        {
         case 0:
                 System.out.println("IsAbsent");
                 break;
         case 1:
                 System.out.println("IsPresent");
                 int workhrs = empcontroller.Employee_Workhrs();
                 switch( workhrs )
                 {
                   case 8:
                           System.out.println("fulltime is : "+  empcontroller.EmployeeWage(workhrs));
                           break;
                   default:
                           System.out.println("Parttime is : "+  empcontroller.EmployeeWage(workhrs));
                 }
         }
     }
}
       
