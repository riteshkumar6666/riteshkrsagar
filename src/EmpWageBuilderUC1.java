public class EmpWageBuilderUC1 {
    public static void main(String[] args) {
        int Is_FULL_TIME = 1;
        double empcheck = Math.floor(Math.random() * 10) %2;
        if(empcheck == Is_FULL_TIME) {
            System.out.println("Employee is present");
        }
        else {
            System.out.println("Employee is abscent");
        }
    }
}
