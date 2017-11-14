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
     * \~german
     * Testet das Schlüsselwort VerifyValue( FN, ExpVal ) der Klasse okw.gui.adapter.selenium.hc.hcEmoji ab.
     * 
     * @par Hinweis:
     * Die erlaubten/möglichen Werte sind in der Klasse okw.gui.adapter.selenium.hc.hcEmoji dokumentiert.
     * 
     *  \~
     *  @author Zoltán Hrabovszki
     *  @date 2017-11-04
     */ 
    @Test
    public void tcLogExists() throws Exception
    {
      EN.BeginTest( name.getMethodName() );
      EN.StartApp( ApplicationName );
      EN.SetValue( "URL", "http://165.227.153.233" );
      
      EN.SelectWindow( "HC Welcome" );
      EN.Click("Sign in")

      EN.StopApp( ApplicationName );
      EN.EndTest();
    }
  
    /**
     * \~german
     * Prüft, ob eine valide Anmeldung möglich ist.
	 * @TODO TODO: Welche GUI folg nach dem Login? - Auf diese muss geprüft werden.
     *  \~
     *  @author Zoltán Hrabovszki
     *  @date 2017-11-14
     */ 
    @Test
    public void tcLoginValidUser() throws Exception
    {
      EN.BeginTest( name.getMethodName() );
      EN.StartApp( ApplicationName );
      EN.SetValue( "URL", "http://165.227.153.233" );
      
      // Login mit validen Daten
      EN.SelectWindow( "HC Welcome" );
      EN.SetValue( "Email", "test@abcd.de" )
      EN.SetValue( "Password", "Geheim" )
      EN.Click( "Login" )

      EN.SelectWindow( "HC MainWindow" );
      EN.VerifyExists( "Charakteristisches GUI Elemnt der Haupmaske", "JA" );
      
      EN.StopApp( ApplicationName );
      EN.EndTest();
    }
  
  /**
     * \~german
     * Prüft, ob die Fehlemeldung "???" erscheint wenn ein User im falschen format eingegeben wird.
     * @TODO TODO: Welche Fehlermeldung soll hier ausgegeben werden?
     * 
     *  \~
     *  @author Zoltán Hrabovszki
     *  @date 2017-11-14
     */ 
    @Test
    public void tcLoginInvalidUser() throws Exception
    {
      EN.BeginTest( name.getMethodName() );
      EN.StartApp( ApplicationName );
      EN.SetValue( "URL", "http://165.227.153.233" );
      
      // Login Dialog mit invalidem User
      EN.SelectWindow( "HC Welcome" );
      EN.SetValue( "Email", "Uschi" )
      EN.SetValue( "Password", "Geheim" )
      EN.Click( "Login" )
      EN.VerifyExists( "Fehlermeldung ", "JA" );
      
      //@TODO TODO: Hier die _richtige_ Fehlermeldung eingeben?
      EN.VerifyValue( "Fehlermeldung ", "??????" );

      // Haupt Fenster darf nicht erscheinen
      EN.VerifyWindowExists( "HC MainWindow", "NO" );
      
      EN.StopApp( ApplicationName );
      EN.EndTest();
    }
}
