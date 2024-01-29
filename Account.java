import java.util.Scanner;
public class Account{
    private int money;
    private String accountBoss;
    private int lastMoney;

    public Account(int money, String accountBoss, int lastMoney){
        this.money = money;
        this.accountBoss = accountBoss;
        this.lastMoney = lastMoney;
    }
    public void printTotalMoney(int lastMoney){
        System.out.println("Total Money: "+ lastMoney);
    }
    public void WantDo(){
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("For see total money press 1\nTo withdraw money press 2\nTo deposit money press 3"
                                    +"\nQuit your account press 0");
            int controlDo = sc.nextInt();
            if(controlDo==0){
                System.out.println("Account is closed");
                break;
            }
            if(controlDo==1){
                System.out.println("Total Money: "+ lastMoney);
                continue;
            }
            if(controlDo==2){
                if(lastMoney<=0){
                    System.out.println("You do not have enough money");
                    continue;
                }
                else{
                    System.out.println("How much do you want withdraw");
                    int withdraw = sc.nextInt();
                    if(withdraw-lastMoney<-1){
                        System.out.println("You can not withdraw this money");
                    }else{
                        lastMoney-=withdraw;
                        System.out.println("Money withdrawed");
                    }
                }continue;
            }
            if(controlDo==3){
                System.out.println("How much deposit money");
                int deposit = sc.nextInt();
                lastMoney+=deposit;
                System.out.println("Money deposited");
                continue;
            }
        }
    }
    public void setMoney(int money){
        this.money = money;
    }
    public void setAccountBoss(String accountBoss){
        this.accountBoss = accountBoss;
    }
    public void setLastMoney(int lastMoney){
        this.lastMoney = lastMoney;
    }
    public int getMoney(){
        return money;
    }
    public int getLastmoney(){
        return lastMoney;
    }
    public String getAccountBoss(){
        return accountBoss;
    }
}