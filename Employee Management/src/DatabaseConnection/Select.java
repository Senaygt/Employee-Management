
package DatabaseConnection;
import java.sql.*;
import java.util.ArrayList;

public class Select {

    public ArrayList<String> get;
     private Connection connect(){
        String url = "jdbc:sqlite:/Users/sena/Desktop/Users";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return conn;
    }

    public void selectEmployer(){
        String sql = "SELECT * FROM Employer";

        try{
            Connection conn = this.connect();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()){
                System.out.println(
                        rs.getInt("userName") + "\t" +
                        rs.getString("password") + "\t" +
                        rs.getString("email")+"\t"+
                        rs.getString("name")+ "\t" +
                        rs.getString("surname") + "\t" +
                        rs.getString("departman")+"\t"+
                        rs.getInt("startyear")+"\t"+
                        rs.getInt("age"));            
            }
            conn.close();
        } catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }

    private ArrayList<String> userData = new ArrayList<>();

    public boolean selectEmployer(String userName, String password){
        String sql = "SELECT * FROM Employer  WHERE userName = ? AND password = ?";

        boolean doesUserExists = false;
        try{
            Connection conn = this.connect();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, userName);
            pstmt.setString(2, password);
            ResultSet rs = pstmt.executeQuery();

            if(rs.next()){
                doesUserExists = true;
                userData.add(rs.getString("userName"));
                userData.add(rs.getString("password"));
                userData.add(rs.getString("email"));
                userData.add(rs.getString("name"));
                userData.add(rs.getString("surname"));
                userData.add(rs.getString("departman"));  
                userData.add(rs.getString(("startyear")));
                userData.add(rs.getString("age"));
                System.out.println(userData.get(1));
            } else {
                doesUserExists = false;
            }
            conn.close();
        } catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return doesUserExists;
        
    }

    public ArrayList<String> getGet() {
        return get;
    }

    public void setGet(ArrayList<String> get) {
        this.get = get;
    }

    public ArrayList<String> getUserData() {
        return userData;
    }

    public void setUserData(ArrayList<String> userData) {
        this.userData = userData;
    }

     public void selectEmployee(){
        String sql = "SELECT * FROM Employee";

        try{
            Connection conn = this.connect();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()){
                System.out.println(
                        rs.getInt("userName") + "\t" +
                        rs.getString("password") + "\t" +
                        rs.getString("email")+"\t"+
                        rs.getString("name")+ "\t" +
                        rs.getString("surname") + "\t" +
                        rs.getString("departman")+"\t"+
                        rs.getInt("startyear")+"\t"+
                        rs.getInt("age"));            
            }
            conn.close();
        } catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }


    public boolean selectEmployee(String userName, String password){
        String sql = "SELECT * FROM Employee WHERE userName = ? AND password = ?";

        boolean doesUserExists = false;
        try{
            Connection conn = this.connect();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, userName);
            pstmt.setString(2, password);
            ResultSet rs = pstmt.executeQuery();

            if(rs.next()){
                doesUserExists = true;
                userData.add(rs.getString("userName"));
                userData.add(rs.getString("password"));
                userData.add(rs.getString("email"));
                userData.add(rs.getString("name"));
                userData.add(rs.getString("surname"));
                userData.add(rs.getString("departman"));  
                userData.add(rs.getString(("startyear")));
                userData.add(rs.getString("age"));
                System.out.println(userData.get(1));
            } else {
                doesUserExists = false;
            }
            conn.close();
        } catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return doesUserExists;
        
    }
    
}
