package com.company;

public class Quadraticequation {
   private double a;
   private double b;
   private double c;
   public Quadraticequation(double a,double b,double c){
this.a=a;
this.b=b;
this.c=c;
   }

   public double getA() {
      return a;
   }

   public double getB() {
      return b;
   }

   public double getC() {
      return c;
   }

   public void setA(double a) {
      this.a = a;
   }

   public void setB(double b) {
      this.b = b;
   }

   public void setC(double c) {
      this.c = c;
   }
   public double getDiscriminant(){
      return b*b-4*a*c;
   }
   public double  getRoot1(){
      return (-b+Math.sqrt(b*b-4*a*c))/(2*a);

   }
   public double  getRoot2(){
      return (-b-Math.sqrt(b*b-4*a*c))/(2*a);

   }
}
