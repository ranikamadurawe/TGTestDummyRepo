import java.util.Properties;
import java.io.FileInputStream;
import java.io.IOException;

class test{
	public static void main(String args[]){
              try {

         // create a new input and output stream
         FileInputStream fis = new FileInputStream("../../../infrastructure.properties");

	 Properties prop = new Properties();
         // load from input stream
         prop.load(fis);
	 System.out.println((String)prop.getProperty("RCLocation"));
         System.out.println(prop.getProperty("BoolVal").getClass());

         // print the properties list from System.out
         prop.list(System.out);
      } catch (IOException ex) {
         ex.printStackTrace();
      }
	}
}
