public class EmployeeInfo {
    private int empNum;
            private String empLastName;
            private String empFirstName;
            private double empSalary;
            public int getEmpNum(){
                return empNum;
            }
            public void setEmpNum(int emp) {
                empNum =emp;
            }
            public String getempLastName(){
                return empLastName;
            }
            public void setempLastName(String name){
                empLastName = name;
            }
            public String getempFirstName(){
                return empFirstName;
            }
            public void setempFirstName(String name){
                empFirstName = name;
            }
            public double getEmpSalary(){
                return empSalary;
            }
            public void setEmpSalary(double sal){
                empSalary = sal;
            }
}
