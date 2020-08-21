import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;

public class SerializationDemo {
	public static void main(String[] args) {
		Date now = new Date();
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("C:/temp/mydate.ser")))){
			oos.writeObject(now);
			System.out.println("Save Success");
		}catch(IOException e) {
			System.out.println(e);
		}
	}
}
