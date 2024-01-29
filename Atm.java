public class Atm {
    public static void main(String[] args){
        Login access = new Login("null", 0);
        Account account = new Account(0, null, 0);
        access.Check();
        account.printTotalMoney(0);
        account.WantDo();
    }
}