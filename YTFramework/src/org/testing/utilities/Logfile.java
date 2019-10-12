package org.testing.utilities;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class Logfile {
	public static void logs(String test, String message) {
		DOMConfigurator.configure("D:\\eclipse_photon\\YTFramework\\layout.xml");
		Logger l= Logger.getLogger(test);
		l.info(message);
		
	}

}
