package polymorphisme.shape;

import java.util.Arrays;

public class Shapes {
	private static RandomShapeGenerator gen = new RandomShapeGenerator();

	public static void main(String[] args) {
		Shape[] s = new Shape[9];
		// Fill up the array with shapes:
		for (int i = 0; i < s.length; i++)
			s[i] = gen.next();
		
		System.out.println(s);
		System.out.println("------------");
		
		System.out.println(Arrays.toString(s));
		
		/*
		// for printind array
		for (Shape shp : s) {
			System.out.println("***");
			shp.toString();
		}
		*/
		
		System.out.println("------------");
		// Make polymorphic method calls:
		for (Shape shp : s)
			shp.draw();
	}
}
