package Com.DemoJenkins;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoTest3 {
	@Test
	public void m3()
	{
		Reporter.log("TC3 is passed",true);
		Reporter.log("Tc3 is updated",true);
	}

}
