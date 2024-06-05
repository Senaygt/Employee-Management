/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employee.management;

import java.util.Scanner;


public class HelpBox {

    public void Problems(){
        Scanner keyb=new Scanner(System.in);
        System.out.print("Please Choose Your Problem\n"
                + "Enter 1 for Salary Problem\n"
                + "Enter 2 for Holiday Problem\n"
                + "Enter 3 for Employee Problem\n"
                + "Enter 4 for Employer Problem\n"
                +"Enter other number for another problems"
                + ": ");
        int problem=keyb.nextInt();
        switch (problem){
            case 1: System.out.println(Users.name+" have salary Problem");
            break;
            case 2: System.out.println(Users.name+" have holiday Problem");
            break;
            case 3: System.out.println(Users.name+" have Employee Problem");
            break;
            case 4: System.out.println(Users.name+" have Employer Problem");
            break;
            default:
                Scanner keyba= new Scanner(System.in); 
                System.out.println("Please Enter your Problem:");
                String prob=keyba.nextLine();
                System.out.println( Users.name + " have "+ prob);
                break;
        }     
        }
    
    
    
    
    
  
    
    
    
}
