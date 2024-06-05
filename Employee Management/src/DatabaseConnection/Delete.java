
package DatabaseConnection;
import java.sql.*;

public class Delete {
    
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
      public void deleteEmployee(String userName){
        String sql = "DELETE FROM Employee WHERE userName = ?";
        try{
            Connection conn= this.connect();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1,userName);
            int deletedUser = pstmt.executeUpdate();
            if(deletedUser > 0){
                System.out.println("User "+ userName+" has deleted");
            } else {
                System.out.println("There is no user with such username");
            }
        } catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
       public void deleteEmployer(String userName){
        String sql = "DELETE FROM Employer WHERE userName = ?";
        try{
            Connection conn= this.connect();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1,userName);
            int deletedUser = pstmt.executeUpdate();
            if(deletedUser > 0){
                System.out.println("User "+ userName+" has deleted");
            } else {
                System.out.println("There is no user with such username");
            }
        } catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
