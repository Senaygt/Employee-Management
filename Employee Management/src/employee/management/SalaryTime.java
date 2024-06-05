
package employee.management;




public class SalaryTime  {
    
    public int day;
    public int month;
    public Users Username; //composition

    public SalaryTime(Users Username,int day) {
        this.day=day;
        this.Username = Username;
    }
    public void slryPaid(){
        if(day==5){
            System.out.println("SALARY PAİD!");
        }
        else{
                if(day<5){
                    System.out.println(5-day+" days left until salary is paid");
                }
                else{
                    System.out.println(((30-day)+5)+" days left until salary is paid");
                    
                }
                    }
    }
  public void towrite(){
        System.out.printf("%s receives your salary on %d every month\n",Username,day);
  }

    
    
}
