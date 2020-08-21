import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Vector;

public class SerializationDemo2 {
	public static void main(String[] args) {
		Vector<Car> vector = new Vector<Car>(3);
		
		vector.addElement(new Car("Sonata", 25_000_000,"Hyundai"));
		vector.addElement(new Car("Carnival", 35_000_000,"Kia"));
		vector.addElement(new Car("Matiz", 10_000_000,"Daewoo"));
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("C:/temp/mycars.ser")))){
			oos.writeObject(vector);
			System.out.println("Save Success");
		}catch(IOException e) {
			System.out.println(e);
		}
	}
}