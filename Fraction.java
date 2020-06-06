package com.bootcamp.assesmentFinal;

public class Fraction {
    private int nominator;
    private int denominator;
    public Fraction (){
        this (0,1);
    }
    public Fraction (int n){
        this (3,1);
    }
    public Fraction (int n, int d){
        this.nominator=n;
        this.denominator=d;
        if (denominator!=0){
        System.out.println(nominator+"/"+denominator);
    }
        else {
            System.out.println("the denominator can't be zero");

}
    }
}
class TestInput{
    public static void main(String[] args) {
        Fraction fract2=new Fraction(4, 9);
        Fraction fract1=new Fraction(4);
        Fraction fract0=new Fraction();
    }
}