package com.empapp.controller;
import com.empapp.model.Employee;

public class EmpController {

         public int EmployeeStatus() {
              
            int status=(int)(Math.random()*10)%2;
             return status;
        }

        public int EmployeeWage() {

               int dailywage=((int)((Math.random()*10)%8)+1)*20;
               return dailywage;
        }
}
