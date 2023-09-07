package org.run;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;
import net.masterthought.cucumber.Reportable;

public class Jvmreport {

	public static void jvmreport(String jsonpath) {
		File f = new File("TecovasNg\\allreport\\jvmreport");
	    Configuration c = new Configuration(f, "projectname");
	    List l = new ArrayList();
	    l.add(jsonpath);
	    ReportBuilder r = new ReportBuilder(l, c);
	    Reportable g = r.generateReports();
	}
	
}
