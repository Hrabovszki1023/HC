package hc.testcases.hc.hcLogin;

import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;

import okw.OKW_Memorize_Sngltn;
import okw.core.EN;

/**
* @ingroup grouphcGuiTestcases
* 
* Test-Klasse zur Prüfung der Implementierung der Klasse okw.gui.adapter.selenium.hc.hcEmoji
* 
* \~
*  @author Zoltan Hrabovszki
*  @date 2017-11-04
*/
@Ignore
public class hcLogin_Test
{
    OKW_Memorize_Sngltn     myMem = OKW_Memorize_Sngltn.getInstance();

    protected static String ApplicationName;

    @Rule
    public TestName         name  = new TestName();

    /**
     * @ingroup grouphcGuiTestcases
     * 
     * Smoketest prüft, ob alle GUI-Elemente des Login Dialoges existieren.
     * 
     *  \~
     *  @author Zoltán Hrabovszki
     *  @date 2018-04-23
     */ 
    //@Test
    public void tcSmoke_VerifyExistsOfAllGuiComponents() throws Exception
    {
        EN.BeginTest( name.getMethodName() );
        EN.StartApp( ApplicationName ); // ApplicationName is in this case "Firefox" or "Chrome"
        
        // \todo TODO: ZH -> Define enviroment var for HC URL!
        //EN.SetValue( "URL", "http://165.227.153.233" );
        EN.SetValue( "URL", "http://alpha.human-connection.org" );
      
        EN.SelectWindow( "HC Login" );
        EN.VerifyExists( "Language", "YES" );
        EN.VerifyExists( "User", "YES"  );
        EN.VerifyExists( "Password", "YES"  );
        EN.VerifyExists( "Login", "YES" );        
        
        EN.StopApp( ApplicationName );
        EN.EndTest();
    }

  
    /**
         * @ingroup grouphcGuiTestcases
         * 
         * \~german
         * Prüft alle angezeigten Texte für Language = en.
         * 
         *  \~
         *  @author Zoltán Hrabovszki
         *  @date 2018-04-07
         */ 
         @Test
       public void tcSmoke_VerifyTextEN( ) throws Exception
       {
           EN.BeginTest( name.getMethodName() );
           EN.StartApp( ApplicationName );
           EN.SetValue( "URL", "http://alpha.human-connection.org" );
           
           EN.SelectWindow( "HC Login" );
           
           EN.Select( "Language", "en" );
    
           // Language
           EN.VerifyTooltip( "Language", "zu deutsch wechseln" );
           
           // User
           //EN.VerifyExists( "User", "E-Mail"  );
           
           // Password
           //EN.VerifyExists( "Password", "Passwort"  );
    
           // Login Button
           EN.VerifyCaption( "Login", "Login" );
    
           EN.StopApp( ApplicationName );
           EN.EndTest();
    
       }


    /**
      * \~german
      * Prüft alle angezeigten Texte für Language = de.
      * 
      *  \~
      *  @author Zoltán Hrabovszki
      *  @date 2018-04-07
      */ 
      @Test
    public void tcSmoke_VerifyTextDE( ) throws Exception
    {
        EN.BeginTest( name.getMethodName() );
        EN.StartApp( ApplicationName );
        EN.SetValue( "URL", "http://alpha.human-connection.org" );
        
        EN.SelectWindow( "HC Login" );
        
        EN.Select( "Language", "de" );
    
        // Language
        EN.VerifyTooltip( "Language", "switch to english" );
        
        // User
        //EN.VerifyExists( "User", "E-Mail"  );
        
        // Password
        //EN.VerifyExists( "Password", "Passwort"  );
    
        // Login Button
        EN.VerifyCaption( "Login", "Anmelden" );
        
        EN.StopApp( ApplicationName );
        EN.EndTest();
    }


    /**
     * @ingroup grouphcGuiTestcases
     * 
     * \~german
     * Prüft, ob eine valide Anmeldung möglich ist.
	 * @TODO TODO: Welche GUI folgt nach dem Login? - Auf diese muss geprüft werden.
     *  \~
     *  @author Zoltán Hrabovszki
     *  @date 2017-11-14
     */ 
    //@Test
    public void tcLoginValidUser() throws Exception
    {
      EN.BeginTest( name.getMethodName() );
      EN.StartApp( ApplicationName );

      // \todo TODO: ZH -> Define enviroment var for HC URL!
      //EN.SetValue( "URL", "http://165.227.153.233" );
      EN.SetValue( "URL", "http://alpha.human-connection.org" );
      
      // Login mit validen Daten
      EN.SelectWindow( "HC Login" );
      EN.SetValue( "Email", "test@abcd.de" );
      EN.SetValue( "Password", "Geheim" );
      EN.ClickOn( "Login" );

      EN.SelectWindow( "HC MainWindow" );
      EN.VerifyExists( "Charakteristisches GUI Elemnt der Haupmaske", "JA" );
      
      EN.StopApp( ApplicationName );
      EN.EndTest();
    }
  
  /**
     * @ingroup grouphcGuiTestcases
     * 
     * \~german
     * Prüft, ob die Fehlemeldung "???" erscheint wenn ein User im falschen format eingegeben wird.
     * @TODO TODO: Welche Fehlermeldung soll hier ausgegeben werden?
     * 
     *  \~
     *  @author Zoltán Hrabovszki
     *  @date 2017-11-14
     */ 
    //@Test
    public void tcLoginInvalidUser() throws Exception
    {
      EN.BeginTest( name.getMethodName() );
      EN.StartApp( ApplicationName );
      EN.SetValue( "URL", "http://165.227.153.233" );
      
      // Login Dialog mit invalidem User
      EN.SelectWindow( "HC Welcome" );
      EN.SetValue( "Email", "Uschi" );
      EN.SetValue( "Password", "Geheim" );
      EN.ClickOn( "Login" );
      EN.VerifyExists( "Fehlermeldung ", "JA" );
      
      //@TODO TODO: Hier die _richtige_ Fehlermeldung eingeben?
      EN.VerifyValue( "Fehlermeldung ", "??????" );

      // Haupt Fenster darf nicht erscheinen
      EN.VerifyExists( "HC MainWindow", "NO" );
      
      EN.StopApp( ApplicationName );
      EN.EndTest();
    }
    
    
    /**
     * \~german
     *  Prüft ob die Spreche umgestellt werden kann.
     *  
     *  Die Sprache wird zweimal gewechselt, (de->en->de->en) damit evetuelle Voreinstellungen
     *  keinen einfluss haben.
     * 
     *  \~
     *  @author Zoltán Hrabovszki
     *  @date 2018-04-07
     */ 
     @Test
   public void tc_SwitchLanguage( ) throws Exception
   {
       EN.BeginTest( name.getMethodName() );
       EN.StartApp( ApplicationName );
       EN.SetValue( "URL", "http://alpha.human-connection.org" );
       
       EN.SelectWindow( "HC Login" );
       
       EN.Select( "Language", "de" );

       EN.VerifyValue( "Language", "de" );       
       EN.VerifyTooltip( "Language", "switch to english" );
       

       EN.Select( "Language", "en" );

       EN.VerifyValue( "Language", "en" );       
       EN.VerifyTooltip( "Language", "zu deutsch wechseln" );

       EN.Select( "Language", "de" );

       EN.VerifyValue( "Language", "de" );       
       EN.VerifyTooltip( "Language", "switch to english" );
       

       EN.Select( "Language", "en" );

       EN.VerifyValue( "Language", "en" );       
       EN.VerifyTooltip( "Language", "zu deutsch wechseln" );
       
       EN.StopApp( ApplicationName );
       EN.EndTest();
   }      
}
