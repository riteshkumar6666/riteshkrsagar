public class EmpwageBuilderIf {
    public static void main(String[] args) {
        //constants
        int IS_PART_TIME = 1;
        int IS_FULL_TIME = 2;
        int EMP_RATE_PER_HOUR = 20;
        //variables
        int empHRS = 0;
        int empwage = 0;
        //computation
        double empCheck =Math.floor(Math.random() * 10) % 3;
                if (empCheck == IS_PART_TIME)
                    empHRS = 4;
                else if (empCheck == IS_FULL_TIME)
                    empHRS = 8;

                 else
                     empHRS = 0;
                 empwage = empHRS * EMP_RATE_PER_HOUR;
        System.out.println("Emp wage: " + empwage);



    }
}
