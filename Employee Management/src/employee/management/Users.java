
package employee.management;


public abstract class Users {

    
    protected String username;
    protected String password;
    protected String email;
    static String name;//helpboxda kullanmak için
    protected String surname;
    protected String departman ;
    static int startyear ;//salary de kullanmak için
    protected int age ;

    public Users(String username, String password, String email, String name, String surname, String departman, int startyear, int age) {
        this.username = username;
        this.password = password;
        this.email = email;
        Users.name = name;
        this.surname = surname;
        this.departman = departman;
        Users.startyear = startyear;
        this.age = age;
    }

    public Users(int startyear) {
        Users.startyear = startyear;
    }
   
    public void Success(){
        System.out.println("Users Registration Successful");
    }
   
    
    
    public abstract void register();
    public abstract void login(String username, String password);
    
    
    
    // get ve set 

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDepartman() {
        return departman;
    }

    public void setDepartman(String departman) {
        this.departman = departman;
    }

    public int getStartyear() {
        return startyear;
    }

    public void setStartyear(int startyear) {
        this.startyear = startyear;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
}

