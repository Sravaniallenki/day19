package com.empapp.test;

import com.empapp.model.Employee;
import com.empapp.controller.EmpController;

 class EmpAppTest {
 
     public static void main(String[] args) {
       int status=0;
       int workhrs=0;
       int dailywage=0;
       int totalwage=0;
       int totalhrs=0;
       for(int days=0; days<20; days++){

               Employee employee = new Employee();
               EmpController empcontroller = new EmpController();
               status = empcontroller.EmployeeStatus();
               switch( status )
              {
               case 0:
                 System.out.println("IsAbsent");
                 break;
               case 1:
                 System.out.println("IsPresent");
                 workhrs = empcontroller.Employee_Workhrs();
                 /*switch( workhrs )
                 {
                   case 8:
                           System.out.println("fulltime is : "+  empcontroller.EmployeeWage(workhrs));
                           break;
                   default:
                           System.out.println("Parttime is : "+  empcontroller.EmployeeWage(workhrs));
                  }*/
                  totalwage+=empcontroller.EmployeeWage(workhrs);
         }
     }
     if(totalhrs<100)
        System.out.println("MonthlyWage is: "+ totalwage);
     else
         totalwage=2000;
         System.out.println("MonthlyWage is: "+ totalwage);

}
       
}

