package constant;

public class ConstantPath {	
	private static final String BASEDIR = "./src/main/resources/config";
	public static final String LOGINPAGELOCATOR = BASEDIR + "/LoginPageLocators.properties";
	public static final String DASHBOARDPAGELOCATOR = BASEDIR + "/DashboardPageLocators.properties";  
	public static final String USERSPAGELOCATOR = BASEDIR + "/UsersPageLocators.properties";  
	public static final String SKILLSPAGELOCATOR = BASEDIR + "/SkillsPageLocators.properties";
	
	public static final int WAITTIMEOUT = 30;
	
	public static final String CHROMEDRIVERKEY = "webdriver.chrome.driver";
	public static final String CHROMEDRIVERVALUE = "./src/test/resources/drivers/chromedriver.exe";
	public static final String TESTDATA = "./src/test/resources/testdata";
	
	public static final int LONGWAIT = 60;
	public static final int WAIT = 30;
	public static final int FASTWAIT = 5;
}
