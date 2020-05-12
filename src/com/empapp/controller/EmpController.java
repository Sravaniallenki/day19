package com.empapp.controller;
import com.empapp.model.Employee;

public class EmpController {

         public int EmployeeStatus() {
              
            int status=(int)(Math.random()*10)%2;
             return status;
        }

        public int Employee_Workhrs() {

               int dailywage=((int)((Math.random()*10)%8)+1)*20;
               return dailywage;
        }

        public int EmployeeWage(int hours){

               int dailywage=hours*20;
               return dailywage;
        }
}
