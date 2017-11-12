package hc.testcases.hc.hcWelcome;

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
public class hcWelcome_Test
{
    OKW_Memorize_Sngltn     myMem = OKW_Memorize_Sngltn.getInstance();

    protected static String ApplicationName;

    @Rule
    public TestName         name  = new TestName();

    /**
     * \~german
     * Prüft ob alle Oberflächen Elemente Vorhanden sind.
     * 
     *  \~
     *  @author Zoltán Hrabovszki
     *  @date 2017-11-04
     */ 
    @Test
    public void tcWelcomeAllGuiKomponents () throws Exception
    {
      EN.BeginTest( name.getMethodName() );
      EN.StartApp( ApplicationName ); // ApplicationName is in this case "Firefox" or "Chrome"
      
      // TODO -> Define Enviroment War for Base URL
      EN.SetValue( "URL", "http://165.227.153.233" );
      
      EN.SelectWindow( "HC Welcome" );
      
      EN.VerifyExists( "Suchen", "YES" );
      EN.VerifyIsActive( "Suchen", "YES" );
      
      EN.VerifyExists( "Login / Sign-Up", "YES" );
      EN.ClickOn( "Login / Sign-Up" );
      
      EN.SelectWindow( "HC Login" );
      EN.VerifyExists( "User", "YES" );
      EN.VerifyExists( "Password", "YES" );
      EN.VerifyExists( "Login", "YES" );

      EN.ClickOn( "Schließen" );

      EN.SelectWindow( "HC Welcome" );
      EN.VerifyExists( "Suchen", "YES" );
      
      EN.StopApp( ApplicationName );
      EN.EndTest();
    }

}
