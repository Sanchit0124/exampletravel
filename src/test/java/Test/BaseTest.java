package Test;


import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import GenericUtils.DriverUtils;
import GenericUtils.PropertyReader;

public class BaseTest {
	@BeforeMethod
	public void Precondition() throws FileNotFoundException, IOException
	{
		{
			DriverUtils.createDriver();
            PropertyReader.initProperty();
			
			
		}
		
	}
}
