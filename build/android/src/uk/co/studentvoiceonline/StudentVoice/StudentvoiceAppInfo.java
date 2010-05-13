package uk.co.studentvoiceonline.StudentVoice;

import org.appcelerator.titanium.ITiAppInfo;
import org.appcelerator.titanium.TiApplication;
import org.appcelerator.titanium.TiProperties;
import org.appcelerator.titanium.util.Log;

/* GENERATED CODE
 * Warning - this class was generated from your application's tiapp.xml
 * Any changes you make here will be overwritten
 */
public class StudentvoiceAppInfo implements ITiAppInfo
{
	private static final String LCAT = "AppInfo";
	
	public StudentvoiceAppInfo(TiApplication app) {
		TiProperties properties = app.getAppProperties();
					
		properties.setString("ti.deploytype", "development");
		properties.setBool("ti.android.loadfromsdcard", true);
	}
	
	public String getId() {
		return "uk.co.studentvoiceonline.StudentVoice";
	}
	
	public String getName() {
		return "StudentVoice";
	}
	
	public String getVersion() {
		return "1.0";
	}
	
	public String getPublisher() {
		return "antony";
	}
	
	public String getUrl() {
		return "http://studentvoiceonline.co.uk";
	}
	
	public String getCopyright() {
		return "2010 by StudentVoiceOnline";
	}
	
	public String getDescription() {
		return "No description provided";
	}
	
	public String getIcon() {
		return "default_app_logo.png";
	}
	
	public boolean isAnalyticsEnabled() {
		return true;
	}
	
	public String getGUID() {
		return "b3998114-e00a-422a-bf23-507176032989";
	}
}
