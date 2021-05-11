package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("nhap gia tri cua a ,b,c");
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhập giá trị của a:");
        double a=scanner.nextDouble();
        System.out.println("nhập giá trị của b;");
        double b=scanner.nextDouble();
        System.out.println("nhập giá trị của c:");
        double c=scanner.nextDouble();
        Quadraticequation quadraticequation=new Quadraticequation(a,b,c);
        if(quadraticequation.getDiscriminant()<0){
            System.out.println("phương trình vô nghiệm");
        }else if(quadraticequation.getDiscriminant()==0){
            System.out.println("phương trình có nghiệm kép x1=x2=" +quadraticequation.getRoot1());
        }else {
            System.out.println("phương trình có nghiệm x1=" +quadraticequation.getRoot1());
            System.out.println("phương trình có nghiệm x2=" +quadraticequation.getRoot2());
        }

    }
}
