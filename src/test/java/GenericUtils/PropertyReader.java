package GenericUtils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {
	static Properties prop= new Properties();
	public static void initProperty() throws FileNotFoundException, IOException
	{
		prop.load(new FileInputStream("C:\\Users\\sanchit.jain\\Desktop\\globallogic_training\\exampletravel\\config\\config.properties"));
	}
	public static String getProperty(String str)
	{
		return prop.getProperty(str);
	}
}
