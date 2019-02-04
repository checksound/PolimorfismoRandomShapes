package polymorphisme.shape;

import static net.mindview.util.Print.*;

public class Circle extends Shape {
	@Override
	public void draw() {
		print("Circle.draw()");
	}

	public void erase() {
		print("Circle.erase()");
	}
}
