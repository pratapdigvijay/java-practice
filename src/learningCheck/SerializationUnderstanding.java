package learningCheck;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Shape implements Serializable{
	private static final long serialVersionUID = 1L;
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
		
		 try (FileOutputStream fileOut = new FileOutputStream("person.ser");
	             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
	            out.writeObject(understanding);
	            System.out.println("Serialized data is saved in person.ser");
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
		 
			Shape deserializedShape = null;
			try (FileInputStream fileIn = new FileInputStream("person.ser");
					ObjectInputStream in = new ObjectInputStream(fileIn)) {
				deserializedShape = (Shape) in.readObject();
				System.out.println(deserializedShape.shape);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			if(deserializedShape !=null) {
				System.out.println(deserializedShape.shape);
			}
	}
}
