package pardiarom.main.test.methods;

import perdiarom.shape.trigonometry.TrigonometryFunction;

public class TestTrignonometryFunction {

	static //Global /?keep
	
	TrigonometryFunction tf = new TrigonometryFunction();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.out.println(tf.pythagoreanTheorem(17.45, 0, 23.27));
		//System.out.println(tf.trigonometricRatios(4.6, 7, 0, 0, 56));
		//System.out.println(tf.trigonometricRatios(7.2,5.1, 0d, 102d, 0d));	
		//tf.trigonometricRatios(adjacent_a, opposite_b, hypotenuse_c, angleA, angleB, autoComplete)
		//tf.trigonometricRatios_AUTO(7.2,5.1, 0d, 0d, 102d);
		tf.trigonometricRatios_AUTO(2.26995, 0d, 5d, 63d, 0d); 

	}

}
