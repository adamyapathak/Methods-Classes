public class DeclaringTwoEmployees {
    public static void main(String[] args){
        Employee clerk = new Employee();
        Employee driver = new Employee();
        clerk.setEmpNum(12);
        driver.setEmpNum(3000);
        System.out.println( " The clerk's number is " + clerk.getEmpNum() + " and the driver's number is " + driver.getEmpNum());
        

    }
    
}
