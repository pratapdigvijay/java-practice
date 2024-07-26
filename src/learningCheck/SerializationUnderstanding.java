package learningCheck;

import java.io.Serializable;

class Shape {
	String shape;

	public Shape(String shape) {
		this.shape = shape;
	}
}

public class SerializationUnderstanding implements Serializable {

	private static final long serialVersionUID = 1L;

	private transient Shape shape; // This is not working example still the understanding is that all the dependent
									// classes should be serialized else transient or static

	private SerializationUnderstanding serializationUnderstanding;

	public SerializationUnderstanding(Shape shape, SerializationUnderstanding serializationUnderstanding) {
		this.shape = shape;
		this.serializationUnderstanding = serializationUnderstanding;

	}

	public static void main(String[] args) {
		Shape shape = new Shape("Circle");
		SerializationUnderstanding understanding = new SerializationUnderstanding(shape, null);
		System.out.println(understanding.shape.shape);
	}

}
