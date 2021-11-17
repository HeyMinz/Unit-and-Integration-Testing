package org.apache.commons.math3.complex;

import org.junit.Test;

import static org.junit.Assert.*;

public class ComplexTest {

    @org.junit.Test
    public void add() {
        Complex  myComplex1= new Complex(3,12);
        Complex  myComplex2= new Complex(4,15);
        Complex  myComplex3= myComplex1.add(myComplex2);
        if(myComplex3.getReal()==7 && myComplex3.getImaginary()==27) {
            System.out.println("Complex.add() OK!");
        } else {
            System.out.println("Error in Complex.add()!");
        }
    }

    @org.junit.Test
    public void conjugate() {
        Complex  myComplex1= new Complex(3,12);
        Complex  myComplex4= myComplex1.conjugate();
        if(myComplex4.getReal()==3 && myComplex4.getImaginary()==-12) {
            System.out.println("Complex.conjugate() OK!");
        } else {
            System.out.println("Error in Complex.conjugate()!");
        }
    }

    @org.junit.Test
    public void isNaN() {
        Complex  myComplex1= new Complex(3,12);

        if(myComplex1.isNaN() == false) {
            System.out.println("Complex.isNaN() OK!");
        } else {
            System.out.println("Error in Complex.isNaN()!");
        }

    }
}