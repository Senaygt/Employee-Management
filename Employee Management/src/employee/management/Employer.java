
package employee.management;



import DatabaseConnection.*;
import java.util.ArrayList;



public class Employer extends Users {
    private boolean didLogin = false;
    public static String [] loggedInUsername = new String[1];


   public Employer(String username, String password, String email, String name, String surname, String departman, int startyear, int age) {
        super(username, password, email, name, surname, departman, startyear, age);
    }

    @Override
   public void Success(){
       System.out.println("Employer Registration Successful");
   }
      
     @Override
    public void register() {
      
       Create insert = new Create();
        insert.InsertEmployer(username, password, email, name, surname, departman, startyear, age);

    
    }

    public void logout(){
        didLogin = false; 
             System.out.println("You are logged out");
        }
        
        
      @Override
     public void login(String username, String password) {

        ArrayList<String> userData;

        Select select = new Select();
        didLogin = select.selectEmployer(username,password);

        if(didLogin){
            System.out.println("You've logged in successfully");
            loggedInUsername[0] = username;

            userData = select.getUserData();
            setName(userData.get(0));
            setSurname(userData.get(1));
            setUsername(userData.get(2));
            setPassword(userData.get(3));
            setEmail(userData.get(4));
        } else {
            System.out.println("Password or username is wrong");
        }

    }
    public void updateUsername(String oldUsername, String newUsername) {
        if (!oldUsername.equals(newUsername)){
            if (didLogin == true) {
                this.username = newUsername;
                Update update = new Update();
                update.updateUsernameEmployer(oldUsername,newUsername);
                loggedInUsername[0] = newUsername;

            } else {
                System.out.println("YOU HAVE TO LOG IN !!!");
            }

        } else {
            System.out.println("New username must be different!");
        }

    }
    
    
    public void updatePassword(String username, String newPassword) {

        if (didLogin == true) { // if you don't log in, you cannot update your password

            this.password = newPassword;

            Update update = new Update();
            update.updatePasswordEmployer(username,newPassword);
        } else {
            System.out.println("YOU HAVE TO LOG IN !!!");
        }
    }
    
public void updateEmail(String newEmail) {

        if (didLogin == true) {

            this.email = newEmail;

            Update update = new Update();
            update.updateEmailEmployer(newEmail);

        } else {
            System.out.println("YOU HAVE TO LOG IN !!!");
        }
    }

public void updateNameAndSurname(String newName, String newSurname) {
        if (didLogin) {
            this.name = newName;
            this.surname = newSurname;

            Update update = new Update();
            update.updateNameAndSurnameEmployer(newName,newSurname);
        } else {
            System.out.println("YOU HAVE TO LOG IN !!!");
        }
    }
public void deleteEmployer(String userName,String password){
    if(didLogin==true){
        Delete delete=new Delete();
        delete.deleteEmployer(userName);
    }

    
}}