package chapter10;

public class IntereFaceTest {
	public static void main(String[] args) {

        // static method
        InterfaceEx.printPrice(0);

        // impl 
        InterfaceExImpl ie = new InterfaceExImpl();
        ie.getSalePrice(0); // default method

        ie.meanPrice(); // impl method
        ie.totalPrice(); // impl mehod

    }

}