package hc.testcases.hcEmoji;

import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;

import okw.OKW_Memorize_Sngltn;
import okw.core.EN;

/**
* @ingroup grouphcGuiTestcases
* 
* Test-Klasse zur Implementierungsprüfung der Klasse okw.gui.adapter.selenium.hc.hcEmoji
* 
* \~
*  @author Zoltan Hrabovszki
*  @date 2017-11-04
*/
@Ignore
public class hcEmoji_Test
{
    OKW_Memorize_Sngltn     myMem = OKW_Memorize_Sngltn.getInstance();

    protected static String ApplicationName;

    @Rule
    public TestName         name  = new TestName();

    /**
     * \~german
     * Testet das Schlüsselwort VerifyValue( FN, ExpVal ) für Klasse hcEmoji ab.
     * 
     * Hinweis: Für die möglichen Werte siehe okw.gui.adapter.selenium.hc.hcEmoji
     *  \~
     *  @author Zoltan Hrabovszki
     *  @date 2017-11-04
     */ 
    @Test
    public void tcLogExists() throws Exception
    {
      EN.BeginTest( name.getMethodName() );
      EN.StartApp( ApplicationName );
      EN.SetValue( "URL", "http://localhost:6060/#hc-count-label" );
      
      EN.SelectWindow( "HC Introduction" );

      EN.VerifyValue( "HC Emoji Beispiel 1", "happy" );
      EN.VerifyValue( "HC Emoji Beispiel 2", "funny" );
      EN.VerifyValue( "HC Emoji Beispiel 3", "surprised" );
      EN.VerifyValue( "HC Emoji Beispiel 4", "cry" );
      EN.VerifyValue( "HC Emoji Beispiel 5", "angry" );

      EN.StopApp( ApplicationName );
      EN.EndTest();
    }

}
