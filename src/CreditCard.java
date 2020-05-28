public class CreditCard {
    //instance variables
    private String number;
    private String name;
    private String bank;
    private double balance;
    private int limit;
    //Constructor
CreditCard(String no, String nm, String bk, double bal, int lim){
    number = no;
    name = nm;
    bank = bk;
    balance = bal;
    limit = lim;
}
//Access methods
    public String getNumber() {
    return number;
}
public  String getName(){
    return name;
}
public String getBank(){
    return bank;
}
public double getBalance(){
    return balance;
}
public int getLimit(){
    return limit;
}
//Action methods
    public boolean chargeIt(double price){
    if(price + balance > (double) limit) return false;
    balance += price;
    return true;
    }
    public void makePayment(double payment){
    balance -= payment;
    }
    public static void printCard(CreditCard card){
        System.out.println("Number = " + card.getNumber());
        System.out.println("Name = " + card.getName());
        System.out.println("Bank = " + card.getBank());
        System.out.println("Balance = " + card.getBalance());
        System.out.println("Limit = " + card.getLimit());
    }
}
