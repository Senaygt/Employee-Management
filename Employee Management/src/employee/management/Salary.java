/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employee.management;


public class Salary implements salaryPaid{
     static int holidayDays=0;
    private String username;
    private double salary;
    public int overtime;
   public Users startYear; //composition

    

    public Salary(String username,int overtime,int startYear) {
        this.username=username;
        this.overtime = overtime;
        this.salary = 17000;
        startYear=Users.startyear ;
    }
    public Salary(String username,int startYear) {
        this.username=username;
        this.salary = 17000;
        startYear=Users.startyear ;
    }
    
    public void totalSalary(){
        System.out.println(username+"'s Salary: "+ getSalary());
        
    }
    public void Holiday(Users a1){
        if(Users.startyear>=0 || Users.startyear<=5){
            holidayDays=15;
            System.out.println(username+"'s have "+getHolidayDays()+" holiday"); 
                if(holidayDays==0){
                System.out.println(username+" DO NOT HAVE HOLİDAY");
            }
        }
        else {
            holidayDays=25;
            holidayDays--;
             if(holidayDays==0){
                System.out.println(username+" DO NOT HAVE HOLİDAY");
            }
        }
    }

    @Override
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


    @Override
    public double getSalary() {
        return ((overtime*50)+salary)+((2024-Users.startyear)*100);
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public static int getHolidayDays() {
        return --holidayDays;
    }

    public static void setHolidayDays(int holidayDays) {
        Salary.holidayDays = holidayDays;
    }
    
    
}
