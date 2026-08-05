package javadsa;

import java.util.Scanner;

public class Method {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Addition of two numbers="+add(a,b));
        System.out.println("Subtracrtion of two numbers="+sub(a,b));
        System.out.println("Multiplication of two numbers="+mul(a,b));
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int sub(int a, int b) {
        return a - b;
    }


    public static int mul(int a, int b) {
        return a * b;
    }

}


