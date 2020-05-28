public class Main {
    public static void main(String[] args) {
CreditCard wallet[] = new CreditCard[10];
wallet[0] = new CreditCard("5544 8877 2244 3366",
        "John Bowman","UBA",0.0,2500);
wallet[1] = new CreditCard("7771 5541 2211 0022",
        "John Bowman","FCMB",0.0,3500);
        wallet[2] = new CreditCard("7751 5571 2201 5522",
                "John Bowman","Access",0.0,5000);

        for (int i = 1; i <16 ; i++) {
            wallet[0].chargeIt((double) i);
            wallet[1].chargeIt(2.0*i);
            wallet[2].chargeIt((double)3*i);
        }
        for (int i = 0; i <3 ; i++) {
            CreditCard.printCard(wallet[i]);
            while (wallet[i].getBalance() > 100.0){
                wallet[i].makePayment(100.0);
                System.out.println("New balance = " + wallet[i].getBalance());
            }
        }


    }


}
