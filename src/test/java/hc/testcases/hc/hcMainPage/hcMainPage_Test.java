package hc.testcases.hc.hcMainPage;

import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;

import okw.OKW_Memorize_Sngltn;
import okw.core.EN;

/**
* 
* Test-Klasse zur Prüfung der Implementierung der Klasse okw.gui.adapter.selenium.hc.hcEmoji
* 
* \~
*  @author Zoltan Hrabovszki
*  @date 2017-11-04
*/
@Ignore
public class hcMainPage_Test
{
    OKW_Memorize_Sngltn     myMem = OKW_Memorize_Sngltn.getInstance();

    protected static String ApplicationName;

    @Rule
    public TestName         name  = new TestName();

    /**
     * \~german
     * * @ingroup grouphcGuiTestcases
     * 
     * Smoketest prüft, ob alle GUI-Elemente existieren.
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
      
      // \todo TODO: ZH -> Define enviroment var for HC URL!
      //EN.SetValue( "URL", "http://165.227.153.233" );
      EN.SetValue( "URL", "http://alpha.human-connection.org" );
      
      // Anmelden mit validem User
      EN.Sequence( "HC Login", "Sequens_Login", "TestUser1" );

      // Alle Elemente Der Haupseite Prüfen
      EN.Sequence( "HC MainPage", "Sequens_Smoke", "TestUser1" );
      
      EN.StopApp( ApplicationName );
      EN.EndTest();
    }

}
