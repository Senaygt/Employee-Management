
package DatabaseConnection;
import java.sql.*;
import employee.management.*;



public class Update {

   

   
  

     Employee update = new Employee(" "," "," "," "," "," ",0,0);
     Employer update1=new Employer(" "," "," "," "," "," ",0,0);

    private Connection connect(){
        String url = "jdbc:sqlite:/Users/sena/Desktop/Users";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);

        } catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return conn;
    }
    
    
       public void updateUsernameEmployee(String oldUsername, String newUsername){
        String sql = "UPDATE Employee SET userName = ? WHERE userName = ?";
        try {
            Connection conn = this.connect();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1,newUsername);
            pstmt.setString(2,oldUsername);

            int affectedRows = pstmt.executeUpdate();
            if (affectedRows > 0) {
                System.out.printf("Your username updated to \"%s\" from \"%s\"!%n", newUsername, oldUsername);
            } else {
                System.out.println("User not found.");
            }

        } catch(SQLException e){
            System.out.println("There is a mistake on username!");
        }}

       
        public void updateUsernameEmployer(String oldUsername, String newUsername){
         String sql = "UPDATE Employer SET userName = ? WHERE userName = ?";
        try {
            Connection conn = this.connect();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1,newUsername);
            pstmt.setString(2,oldUsername);

            int affectedRows = pstmt.executeUpdate();
            if (affectedRows > 0) {
                System.out.printf("Your username updated to \"%s\" from \"%s\"!%n", newUsername, oldUsername);
            } else {
                System.out.println("User not found.");
            }

        } catch(SQLException e){
            System.out.println("There is a mistake on username!");
        }}
    
       
       public void updatePasswordEmployee(String username, String newPassword){
        String sql = "UPDATE Employee SET password = ? WHERE username = ?";
        try {
            Connection conn = this.connect();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1,newPassword);
            pstmt.setString(2,username);

            int affectedRows = pstmt.executeUpdate();
            if (affectedRows > 0) {
                System.out.println("Password updated successfully.");
            } else {
                System.out.println("Password cannot change.");
            }

        } catch(SQLException e){
            System.out.println("There is a mistake on password!");
        }}
        public void updatePasswordEmployer(String username, String newPassword){
        String sql = "UPDATE Employer SET password = ? WHERE username = ?";
        try {
            Connection conn = this.connect();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1,newPassword);
            pstmt.setString(2,username);

            int affectedRows = pstmt.executeUpdate();
            if (affectedRows > 0) {
                System.out.println("Password updated successfully.");
            } else {
                System.out.println("Password cannot change.");
            }

        } catch(SQLException e){
            System.out.println("There is a mistake on password!");
        }
    }
       public void updateEmailEmployee(String newEmail){
        String sql = "UPDATE Employee SET email = ? WHERE username = ?";
        try {
            Connection conn = this.connect();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1,newEmail);
            pstmt.setString(2,Employee.loggedInUsername[0]);


            int affectedRows = pstmt.executeUpdate();
            if (affectedRows > 0) {
                System.out.printf("Your email updated to \"%s\"!%n", newEmail);
            } else {
                System.out.println("Email cannot change.");
            }

        } catch(SQLException e){
            System.out.println(e.getMessage());
        }}
        public void updateEmailEmployer(String newEmail){
        String sql = "UPDATE Employer SET email = ? WHERE username = ?";
        try {
            Connection conn = this.connect();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1,newEmail);
            pstmt.setString(2,Employee.loggedInUsername[0]);


            int affectedRows = pstmt.executeUpdate();
            if (affectedRows > 0) {
                System.out.printf("Your email updated to \"%s\"!%n", newEmail);
            } else {
                System.out.println("Email cannot change.");
            }

        } catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
        public void updateNameAndSurnameEmployee(String newName, String newSurname){
        String sql = "UPDATE Employee\n" +
                "SET name = ?, surname = ?\n" +
                "WHERE username = ?;";
        try {
            Connection conn = this.connect();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1,newName);
            pstmt.setString(2,newSurname);
            pstmt.setString(3,Employee.loggedInUsername[0]);

            int affectedRows = pstmt.executeUpdate();
            if (affectedRows > 0) {
                System.out.printf("Your name and surname updated as %s and %s%n", newName, newSurname);
            } else {
                System.out.println("Name and surname cannot change.");
            }

        } catch(SQLException e){
            System.out.println(e.getMessage());
        }}
        public void updateNameAndSurnameEmployer(String newName, String newSurname){
        String sql = "UPDATE Employer\n" +
                "SET name = ?, surname = ?\n" +
                "WHERE username = ?;";
        try {
            Connection conn = this.connect();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1,newName);
            pstmt.setString(2,newSurname);
            pstmt.setString(3,Employee.loggedInUsername[0]);

            int affectedRows = pstmt.executeUpdate();
            if (affectedRows > 0) {
                System.out.printf("Your name and surname updated as %s and %s%n", newName, newSurname);
            } else {
                System.out.println("Name and surname cannot change.");
            }

        } catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }

       
        
        
        
        
        
        
       
}
