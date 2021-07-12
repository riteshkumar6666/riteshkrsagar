import java.util.Scanner;

public class LineComparison1 {
    public static void main(String[] args) {
        double Length_line;
        System.out.println(" WELCOME TO LINE COMPARISON PROGRAM");
        Scanner sc=new Scanner(System.in);
        //enter coordinate
        System.out.println("Enter (x1 y1) coordinate : ");
        float x1 = sc.nextFloat();
        float y1 = sc.nextFloat();
        System.out.println("Enter (x2 y2) coordinate : ");
        float x2 =sc.nextFloat();
        float y2 = sc.nextFloat();
        //calculate line model
        System.out.println("Length at 2 points::"+"("+x1+","+y1+")"+"and"+"("+x2+","+y2+")");
        Length_line=Math.sqrt(((x2-x1)*(x2-x1)) + ((y2-y1)*(y2-y1)));
        System.out.println("Length of a line::" + Length_line);
    }
}
