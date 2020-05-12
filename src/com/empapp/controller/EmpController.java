package com.empapp.controller;
import com.empapp.model.Employee;

public class EmpController {

         public int EmployeeStatus() {
              
            int status=(int)Math.floor(Math.random()*10)%2;
             return status;
        }
}
