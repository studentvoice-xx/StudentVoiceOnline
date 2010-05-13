package uk.co.studentvoiceonline.StudentVoice;

import org.appcelerator.titanium.TiApplication;

public class StudentvoiceApplication extends TiApplication {

	@Override
	public void onCreate() {
		super.onCreate();
		
		appInfo = new StudentvoiceAppInfo(this);
	}
}
