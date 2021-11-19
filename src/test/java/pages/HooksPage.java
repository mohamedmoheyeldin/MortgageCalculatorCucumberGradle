package pages;


import library.Driver;
import library.DriverInitializer;

public class HooksPage extends Driver {

	public void setUp() {
		try {
			driver = DriverInitializer.startDriver();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void tearDown() {
		try {
			Thread.sleep(500);
			driver.close();
			driver.quit();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
