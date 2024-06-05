
package employee.management;


    

public class EmployeeManagement {

    
    public static void main(String[] args) {
        
       Users a1= new Employee("senah","1234","senayg348@gmail.com","Sena","Yiğit","Employee",2020,20);
       a1.register();
       a1.Success();
       a1.login("sena", "1234");
       ((Employee)a1).updatePassword("sena","12345");
       Users a2= new Employer("zehrakc","2342","zhr58@gmail.com","Zehra","Koç","employer",2021,20);
       a2.register();
       a2.Success(); //Override
       a2.login("zehrakc", "2342");
       ((Employer)a2).deleteEmployer("senygt", "2342");
        Salary a3= new Salary("sen",2022);  //overloading
        a3.totalSalary();
        Salary a4= new Salary("zehrakc",23,2020);
        a4.totalSalary();
//       HelpBox h1= new HelpBox();
//       h1.Problems();
      SalaryTime s1= new SalaryTime(a1,7);
      s1.slryPaid();
        Salary s3= new Salary("sena",2020);
        s3.Holiday(a1);
        
    
} 
}
