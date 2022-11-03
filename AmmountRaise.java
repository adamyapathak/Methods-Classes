public class AmmountRaise {
    public static void main(String [] args){
        double myEarning = 100000;
        double paycheckAmmount = 450000;
        System.out.println("Demonstrating some growth");
        expectionGrowth(500000);
        expectionGrowth(myEarning);
        expectionGrowth(paycheckAmmount);
    }
        public static void expectionGrowth(double paycheckAmmount){
            double latestAmount;
            final double GROWTH = 9.50;
            latestAmount = paycheckAmmount * GROWTH;
            System.out.println("With growth, salary is " + latestAmount);


    }
    
}
