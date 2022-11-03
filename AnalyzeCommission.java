public class AnalyzeCommission {
    public static void main(String[] args){
        char vType = 'A';
        int value = 91500;
        double commissionRate = 2.5;
        analyzeCommission(value, commissionRate, vType);
        analyzeCommission(100000, 1.50, 'P');

    }

    public static void analyzeCommission(int value, double rate, char vehicle){
        double commission;
        commission = value * rate;
        System.out.println(" \nThe "  + vehicle + " type vehicle is worth $ " + value );
        System.out.println(" With " + ( rate  *  500 ) + " % commission rate, the commission is $ " + commission );

    }
    
}
