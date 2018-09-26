package Pkg_Test_Car;

import static org.junit.Assert.*;

import org.junit.Test;
	
public class Car_Tests {
	private Car_payment test = new Car_payment(35000,0,60,0.1);
	
	@Test
	public void Monthly_payment() {
		assertEquals(743.65,test.monthlyPayment(),0.01);
	}
	@Test
	public void total_spent_interest() {
		assertEquals(9618.79,test.totalIntrest(),0.01);
	}
}
