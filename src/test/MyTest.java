
import org.apache.commons.math3.complex.Complex;

public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        myTest.testComplex();
    }
    public void testComplex() {
        Complex  myComplex1= new Complex(3,12);
        Complex  myComplex2= new Complex(4,15);
        Complex  myComplex3= myComplex1.add(myComplex2);
        Complex  myComplex4= myComplex1.conjugate();
        if(myComplex1.isNaN() == false) {
            System.out.println("Complex.isNaN() OK!");
        } else {
            System.out.println("Error in Complex.isNaN()!");
        }

        if(myComplex4.getReal()==3 && myComplex4.getImaginary()==-12) {
            System.out.println("Complex.conjugate() OK!");
        } else {
            System.out.println("Error in Complex.conjugate()!");
        }

        if(myComplex3.getReal()==7 && myComplex3.getImaginary()==27) {
            System.out.println("Complex.add() OK!");
        } else {
            System.out.println("Error in Complex.add()!");
        }
    }
}
