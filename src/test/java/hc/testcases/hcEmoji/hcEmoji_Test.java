package hc.testcases.hcEmoji;

import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;

import okw.OKW_Memorize_Sngltn;
import okw.core.EN;

/**
* \~
* 
* @author zoltan
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
     * Testet das Schlüsselwort LogExists( FN ) eines SeMAXIMIZE Prüfen.
     * 
     *  \~
     *  @author Zoltan Hrabovszki
     *  @date 2017-07-23
     */ 
    @Test
    public void tcLogExists() throws Exception
    {
      EN.BeginTest( name.getMethodName() );
      EN.StartApp( ApplicationName );
      EN.LogExists( "MAXIMIZE" );
    
      EN.StopApp( ApplicationName );
      EN.EndTest();
    }

}
