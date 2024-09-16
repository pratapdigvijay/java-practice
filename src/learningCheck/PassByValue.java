package learningCheck;

public class PassByValue {
	
	public static void main(String[] args) {
		//Primitive
		int number = 10;
        System.out.println("Before: " + number); // Output: Before: 10
        modifyNumber(number);
        System.out.println("After: " + number); // Output: After: 10
        
        
        //Objects
        Point point = new Point(2, 3);
        System.out.println("Before: " + point); // Output: Before: (2, 3)
        modifyPoint(point);
        System.out.println("After: " + point); // Output: After: (20, 30)
        
    }

    public static void modifyNumber(int value) {
        value = value * 2;
        System.out.println("Modified: " + value); // Output: Modified: 20
    }
    public static void modifyPoint(Point point) {
        point.setX(point.getX() * 10);
        point.setY(point.getY() * 10);
        System.out.println("Modified: " + point); // Output: Modified: (20, 30)
    }
}

class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
