package hc.testcases.hcLogin;

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

      EN.StopApp( ApplicationName );
      EN.EndTest();
    }

}