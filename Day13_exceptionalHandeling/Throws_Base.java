package Day13_exceptionalHandeling;
import java.io.FileInputStream;
import java.io.IOException;

class ThrowsDemo{
    // Method declares that it may throw IOException
    void readFile() throws IOException
    {
        // Using try-with-resources ensures FileInputStream is closed automatically
        try (FileInputStream fis = new FileInputStream("test.txt"))
        {
            // Read first byte from the file
            int data = fis.read();
            System.out.println("First byte of the file: " + data);
        }
    }
}

public class Throws_Base {
	public static void main(String[] args) {
		try
        {
            ThrowsDemo obj = new ThrowsDemo();

            // Caller method handles the IOException thrown by readFile()
            obj.readFile();
        }
        catch (IOException e)
        {
            // Exception is caught and handled here
            System.out.println("Exception handled: " + e);
        }
		
		finally {
			System.out.println("Inside finnlly method");
		}
		
		
	}
  }

