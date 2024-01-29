import java.util.Scanner;
public class Login{
    private String userName;
    private int password;

    public Login(String userName, int password){
        this.userName = userName;
        this.password = password;
    }
    public void Check(){
        Scanner sc = new Scanner(System.in);
        boolean controlıd = false;
        boolean controlpassword = false;
        
        System.out.println("Please enter User Name");
        String userName = sc.next();
        if(userName.equals("Admin")) controlıd=true;
        while(!userName.equals("Admin")){
            System.out.println("Wrong ıd please enter again");
            userName = sc.next();
            if(!userName.equals("Admin")){
                controlıd = true;
                break;
            }
        }
        System.out.println("Please enter password");
        int password = sc.nextInt();
        if(password==1234) controlpassword=true;
        while(password!=1234){ 
            System.out.println("Wrong password please enter again");
            password=sc.nextInt();
            if(password==1234){
                controlpassword = true;
                break;
            }
        }
        if(controlıd==true && controlpassword==true) System.out.println("Welcome Batuhan");
    }
    public void setUserName(String userName){
        this.userName = userName;
    }
    public void setPassword(int password){
        this.password = password;
    }
    public String getUserName(){
        return userName;
    }
    public int getPassword(){
        return password;
    }
    
}