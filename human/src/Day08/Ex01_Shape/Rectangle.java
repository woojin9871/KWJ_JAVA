package Day08.Ex01_Shape;

public class Rectangle extends Shape {

	double width, heigth;

	public Rectangle() {
		super();
	}

	public Rectangle(double width, double heigth) {
		this.width = width;
		this.heigth = heigth;
	}

	@Override
	double area() {
		// (가로) x (세로)
		return width * heigth;
	}

	@Override
	double round() {
		// (정사각형) : (한 변의 길이) x 4
		return width * 4;
	}

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", heigth=" + heigth + "]";
	}

}
