package com.empapp.test;

import com.empapp.model.Employee;
import com.empapp.controller.EmpController;

 class EmpAppTest {
 
     public static void main(String[] args) {

        Employee employee = new Employee();
        EmpController empcontroller = new EmpController();
        int status = empcontroller.EmployeeStatus();
        if( status == 1)
          System.out.println("IsPresent");
        else
          System.out.println("IsAbsent");   
     }
}
