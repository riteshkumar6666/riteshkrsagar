package com.company;

public class LineUC2 {
    public static void main(String[] args) {
        int X1=2;
        int Y1=2;
        int X2=3;
        int Y2=3;
        int X3=4;
        int Y3=4;
        int X4=5;
        int Y4=5;
        System.out.println("Length at 2 points::"+"("+X1+","+Y1+")"+"and"+"("+X2+","+Y2+")");
        double Length_line=Math.sqrt(((X2-X1) * (X2-X1)) + ((Y2-Y1) * (Y2-Y1)));
        System.out.println("Length of a line::"+ Length_line);
        String str=Double.toString(Length_line);
        System.out.println("the coordinate of line 2 are::" + "("+X3+ ","+Y3+ " )" + "and" + "("+X4+","+Y4+ ")" );
        double Length_line1=Math.sqrt(((X4-X3) * (X4-X3)) + ((Y4-Y3) * (Y4-Y3)));
        System.out.println("Length of a line::"+ Length_line1);
        String str2=Double.toString(Length_line1);
        System.out.println(str.equals(str2));

    }
}
