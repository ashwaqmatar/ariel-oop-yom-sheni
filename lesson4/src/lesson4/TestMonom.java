/**
 * 
 */
package lesson4;

/**
 * This is a test for class Monom.
 * 
 * @author erelsgl
 * @since 2017-11-13
 */
public class TestMonom {

	/**
	 * This is the main method and it runs all the tests.
	 */
	public static void main(String[] args) {
		System.out.println("Start test Monom");
		
		double coefficient = 5;
		int power = 2;
		Monom m = new Monom(coefficient,power);
		System.out.println(m);  // should print 5x^2
		
		int degree = m.getDegree();
		System.out.println(degree);  // should print 2
		
		System.out.println(m.getCoefficient()); // should print 5.0
		m.setCoefficient(6.0);
		System.out.println(m);  // should print 6.0x^2	
		testPower();
		System.out.println(m);  // should print 6.0x^2
		testDerivative();
		
		System.out.println(m.valueAt(2)); // 24 
		m.plot(0.0, 1.01, 101); // should print 100 numbers: 0.0,..., ~6.0 
		
		System.out.println("End   test Monom");
	}
	
	public static void testPower() {
		Monom m = new Monom(6,2);
		
		m.setPower(3);
		System.out.println(m);   // should print 6.0x^3
		
		/*
		try {
			m.setPower(-3);  // should throw exception
		} catch(RuntimeException ex) {
			System.out.println(ex.getMessage()); // should print "power cannot be negative"
			ex.printStackTrace(System.out);
		}
		*/
	}
	
	public static void testDerivative() {
		Monom m = new Monom(6,2);
		
		Monom mDerivative = m.getDerivative();
		System.out.println(mDerivative); // 12x
		System.out.println(mDerivative.getDerivative()); //12
		System.out.println(mDerivative.getDerivative().getDerivative()); //0
		System.out.println(mDerivative.getDerivative().getDerivative().getDerivative()); //0
		System.out.println(m); // 6 x^2
		
	}

}
