
package DatabaseConnection;
import java.sql.*;

public class Create {
    public Connection connect(){
        String url= "jdbc:sqlite:/Users/sena/Desktop/Users";
        Connection conn=null;
        try{
        conn=DriverManager.getConnection(url);
    }
        catch(SQLException e){
            System.out.println(e.getMessage());
    }
        return conn;
    }
      public void InsertEmployer(String userName, String password,String email,String name,String surname,String departman,int startyear,int age){
        String sql= "Insert into Employer (userName,password,email,name,surname,departman,startyear,age) Values(?,?,?,?,?,?,?,?)";
        try{
            Connection conn=connect();
            PreparedStatement pstmt=conn.prepareStatement(sql);
            pstmt.setString(1, userName);
            pstmt.setString(2, password);
            pstmt.setString(3, email);
            pstmt.setString(4, name);
            pstmt.setString(5, surname);
            pstmt.setString(6, departman);
            pstmt.setInt(7,startyear);
            pstmt.setInt(8, age);
            pstmt.executeUpdate();
            System.out.println("Registration Successful");
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
            
        }}
        public void InsertEmployee(String userName, String password,String email,String name,String surname,String departman,int startyear,int age){
        String sql= "Insert into Employee(userName,password,email,name,surname,departman,startyear,age) Values(?,?,?,?,?,?,?,?)";
        try{
            Connection conn=connect();
            PreparedStatement pstmt=conn.prepareStatement(sql);
            pstmt.setString(1, userName);
            pstmt.setString(2, password);
            pstmt.setString(3, email);
            pstmt.setString(4, name);
            pstmt.setString(5, surname);
            pstmt.setString(6, departman);
            pstmt.setInt(7,startyear);
            pstmt.setInt(8, age);
            pstmt.executeUpdate();
            System.out.println("Registration Successful");
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
            
        }
        
    }
 
}
