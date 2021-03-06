package com.constant;

import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;

public class TestConstant {

	public static boolean bResult;

	public static String cybersafe_URL = "https://apbuat.airtelbank.com/Cybersafetest/index.php?module=Users&action=Login";

	// public static String cybersafe_URL =
	// "https://apbuat.airtelbank.com/Cybersafetest/index.php?module=AIR_User&action=EditView&return_module=AIR_User&return_action=DetailView";

	public static String driver_chomre = "webdriver.chrome.driver";

	public static String driver_ie = "webdriver.ie.driver";

	public static String driver_firefox = "webdriver.gecko.driver";

	public static final String setProperty_chrome = "D:\\Software\\Selenium Drivers\\chromedriver_win32\\chromedriver.exe";

	public static final String setProperty_ie = "D:\\Software\\Selenium Drivers\\IEDriverServer_x64_3.13.0\\IEDriverServer.exe";

	public static final String setProperty_firefox = "D:\\Software\\Selenium Drivers\\geckodriver-v0.21.0-win64\\geckodriver.exe";

	public static WebDriver driver = null;

	public static final int pageload = 120;

	public static String userEntityNameValue = "Cybersafe";

	public static String userEntityNameCode = "CYS00003";

	public static WebElement cyber_logo;

	public static WebElement username = null;

	public static WebElement password = null;

	public static WebElement login_btn = null;

	public static WebElement log_out = null;

	public static WebElement log_out_username = null;

	public static WebElement forget_username = null;

	public static WebElement forget_password = null;

	public static WebElement forget_submit_btn = null;

	public static final WebElement Forgot_Password = null;

	public static final String logOutUserIconElementField = "Login.logoutxPath";

	public static String windowtitle = null;

	public static String windowURL = null;

	public static String sTestCaseName = null;

	Action Builder;

	public static String usernameElementField = "Login.usernameElementField";

	public static String passwordElementField = "Login.passwordElementField";

	public static String ButtonElementField = "Login.ButtonElementField";

	public static String cyber_logo_ElementField = "Login.cyber_logo_ElementField";

	public static String log_out_usernameElementField = "login.logoutUserWelcomeIcon";

///////////////////////////// FOOTERS  //////////////////////////////////////	

	public static String superCharged = "� Supercharged by SuiteCRM";

	public static String poweredBy = "� Powered By SugarCRM";

	public static String homeaffairs = "�In initiative of Home Affairs";

	public static String airtelPaymentsBank = "�Technology Partner Airtel Payments Bank";

///////////////////////////// LOGIN HEADERS //////////////////////////////////////	

	public static String homeELementField = "Header.homeELementField";

	public static String userManualElementFiled = "Header.userManualElementFiled";

	public static String aboutUsElementFiled = "Header.aboutUsElementFiled";

	public static String headerLogoElementField = "Header.LogoElementField";

///////////////////////////// FORGET PASSWORD //////////////////////////////////////	

	public static String forgetLinkElementField = "Forget.forgetLinkElementField";

	public static String forgetusernameElementField = "Forget.forgetusernameElementField";

	public static String forgetemailElementField = "Forget.forgetemailElementField";

	public static String forgetSubmitElementField = "Forget.forgetSubmitElementField";

	public static String forgetErrorMessageElementFields = "Forget.forgetErrorMessageElementFields";

///////////////////////////// READ EXCEL FILE //////////////////////////////////////

	public static String path = "D:\\Eclipse\\CyberSafe.Automation\\src\\test\\resources\\test-input\\Type of All Data.xlsx";

	public static String sheetname = "Cybersafe Users";

	public static int RowNum = 1;

	public static int ColNum = 1;

/////////////////////////////CONFIGURATIONFILE//////////////////////////////////////

	/** The Constant xpath_file. */
	public static final String xpath_file = "D:\\Eclipse\\CyberSafe.Automation\\src\\test\\resources\\configuration\\xpath.property";

	/** The input. */
	public static InputStream input = null;

	/** The properties. */
	public static Properties properties = null;
	
///////////////////////////// MENU HEADERS  //////////////////////////////////////	
	
	public static WebElement userHeaderClick = null;

	public static WebElement userSubMenuHeader = null;
	
	public static WebElement entityHeaderClick = null;
	
	public static WebElement entitySubMenuHeader = null;
	
	public static WebElement fraudHeaderClick = null;
	
	public static WebElement fraudSubMenuHeader = null;
	
	public static String userHeaderClickElementFiled = "User.MenuHeaderClickElementFiled";

	public static String userSubMenuHeaderClickElementFiled = "User.SubMenuHeaderClickElementField";
	
	public static String entityHeaderClickElementFiled = "Entity.MenuHeaderClickElementFiled";

	public static String entitySubMenuHeaderClickElementFiled = "Entity.SubMenuHeaderClickElementField";
	
	public static String fraudHeaderClickElementFiled = "Fraud.MenuHeaderClickElementFiled";

	public static String fraudSubMenuHeaderClickElementFiled = "Fraud.SubMenuHeaderClickElementField";


///////////////////////////// CREATE USER //////////////////////////////////////	


	public static WebElement userCreateTab = null;

	public static WebElement userFirstName = null;

	public static WebElement userLastName = null;

	public static WebElement userEmail = null;

	public static WebElement userDOB = null;

	public static WebElement description = null;

	public static WebElement userMobile = null;

	public static WebElement userStatus = null;

	public static WebElement userEntityName = null;

	public static WebElement userLine1 = null;

	public static WebElement userLine2 = null;

	public static WebElement userPincode = null;

	public static WebElement userState = null;

	public static WebElement userDistrict = null;

	public static WebElement userSub_District = null;

	public static WebElement userCountry = null;

	public static WebElement userSaveButton = null;

	public static WebElement userCancelButton = null;

	/*Element Locator xpath*/
	
	public static String userCreateTabElementField = "User.CreateUserTabElementField";

	public static String userFirstNameElementField = "User.FirstNameElementField";

	public static String userLastNameElementField = "User.LastNameElementField";

	public static String userEmailElementField = "User.EmailElementField";

	public static String userDOBElementField = "User.DOBElementField";

	public static String userMobileElementField = "User.MobileElementField";

	public static String UserDescriptionElementField = "User.DescriptionElementField";

	public static String LevelElementField = "User.LevelElementField";

	public static String userStatusElementField = "User.StatusElementField";

	public static String userEntityNameElementField = "User.UserEntityNameElementField";

	public static String userLine1ElementField = "User.Line1ElementField";

	public static String userLine2ElementField = "User.Line2ElementField";

	public static String userPincodeElementField = "User.PinCodeElementField";

	public static String userStateElementField = "";

	public static String userDistrictElementField = "";

	public static String userSub_DistrictElementField = "";

	public static String userCountryElementField = "";

	public static String userSaveButtonElementField = "User.SaveButtonElementField";

	public static String userCancelButtonElementField = "User.CancelButtonElementField";

///////////////////////////// CREATE ENTITY //////////////////////////////////////	

	public static WebElement entityCreateTab = null;

	public static WebElement entityName = null;

	public static WebElement entityMobile = null;

	public static WebElement entityLandline = null;

	public static WebElement entityEmailID = null;

	public static WebElement entityWebsite = null;

	public static WebElement entityType = null;
	
	public static WebElement entityStatus = null;

	public static WebElement entityLine1 = null;

	public static WebElement entityLine2 = null;

	public static WebElement entityPincode = null;

	public static WebElement entityState = null;

	public static WebElement entityDistrict = null;

	public static WebElement entitySub_District = null;

	public static WebElement entityCountry = null;

	public static WebElement entityAuthSignFirstName = null;

	public static WebElement entityAuthSignMiddleName = null;

	public static WebElement entityAuthSignLastName = null;

	public static WebElement entityAuthSignMobile = null;

	public static WebElement entityAuthSignlandline = null;

	public static WebElement entityAuthSignEmail = null;

	public static WebElement entitySaveButton = null;

	public static WebElement entityCancelButton = null;
	
	/* Elements Locators */


	public static String entityCreateTabElementField = "Entity.CreateUserTabElementField";

	public static String entityFirstNameElementField = "Entity.FirstNameElementField";

	public static String entityMobileElementField = "Entity.MobileElementField";

	public static String entityEmailElementField = "Entity.EmailElementField";

	public static String entitySTDElementField = "Entity.STDElementField";

	public static String entityPhoneElementField = "Entity.PhoneElementField";

	public static String entityWebsiteElementField = "Entity.WebsiteElementField";

	public static String entityEntityTypeElementField = "Entity.EntityTypeElementField";

	public static String entityEntityStatusElementField = "Entity.EntityStatusElementField";
		
	public static String entityRegAddressLine1ElementField = "Entity.RegAddressLine1ElementField";
	
	public static String entityRegAddressLine2ElementField = "Entity.RegAddressLine2ElementField";
	
	public static String entityPincodeElementField = "Entity.PincodeElementField";
	
	public static String entityAuthSignFirstElementField = "Entity.AuthSignFirstElementField";

	public static String entityAuthSignMidElementField = "Entity.AuthSignMidElementField";

	public static String entityAuthSignLastElementField = "Entity.AuthSignLastElementField";

	public static String entityAuthSignMobileElementField = "Entity.AuthSignMobileElementField";

	public static String entityAuthSinghSTDElementField = "Entity.AuthSinghSTDElementField";

	public static String entityAuthSignLandline = "Entity.AuthSignLandline";

	public static String entityAuthSignEmailElementField = "Entity.AuthSignEmailElementField";

	public static String entityDescriptionElementField = "Entity.DescriptionElementField";

	public static String entitySaveButtonElementField = "User.SaveButtonElementField";

	public static String entityCancelButtonElementField = "User.CancelButtonElementField";
	
		
///////////////////////////// CREATE FRAUD //////////////////////////////////////	
	
	public static WebElement createFraudTicket  =  null;
	
	public static WebElement victimFirstName  =  null;
	
	public static WebElement victimMiddleName  =  null;
	
	public static WebElement victimLastName  =  null;
	
	public static WebElement victimMobile   =  null;
	
	public static WebElement victimLandline  =  null;
	
	public static WebElement victimEmail  =  null;
	
	public static WebElement victimLine1  =  null;

	public static WebElement victimLine2  =  null;

	public static WebElement victimPincode  =  null;
	
	public static WebElement victimTransactionDetails  =  null;
	
	public static WebElement cardSixDigit  = null;
	
	public static WebElement cardFourDigit  = null;
	
	public static WebElement addTransactions  = null;
	
	public static WebElement fraudsterMobile  = null;
	
	public static WebElement fraudsterEmail  = null;
	
	public static WebElement Description  = null;
	
	/*Element Locators xpath*/
	
	public static String createFraudTicketElementField = "Fraud.createFraudTicketElementField";
	
	public static String victimFirstNameElementField = "Fraud.victimFirstNameElementField";
	
	public static String victimMiddleNameElementField = "Fraud.victimMiddleNameElementField";
	
	public static String victimLastNameElementField = "Fraud.victimLastNameElementField";
	
	public static String victimMobileElementField = "Fraud.victimMobileElementField";
	
	public static String victimLandlineElementField ="Fraud.victimLandlineElementField";
	
	public static String victimEmailElementField = "Fraud.victimEmailElementField";
	
	public static String victimLine1ElementField = "Fraud.victimLine1ElementField";
	
	public static String victimLine2ElementField = "Fraud.victimLine2ElementField";
	
	public static String victimPincodeElementField = "Fraud.victimPincodeElementField";
	
	public static String victimTransactionDetailsElementField = "Fraud.victimTransactionDetailsElementField";
	
	public static String cardSixDigitElementField = "Fraud.cardSixDigitElementField";
	
	public static String cardFourDigitElementField = "Fraud.cardFourDigitElementField";

	public static String addTransactionsElementField = "Fraud.addTransactionsElementField";
		
	public static String fraudsterMobileElementField = "Fraud.fraudsterMobileElementField";
	
	public static String fraudsterEmailElementField = "Fraud.fraudsterEmailElementField";
	
	public static String DescriptionFraudElementField = "Fraud.DescriptionFraudElementField";
	
	
	
	
}
