package hc.testcases.hcguicomponent.hcButtonWithCountLabel;

import org.junit.*;
import org.junit.rules.TestName;

import okw.OKW_Memorize_Sngltn;
import okw.core.EN;

/**
* @ingroup grouphcGuiTestcases
* \~
* 
* @author zoltan
*/
@Ignore
public class hcButtonWithCountLabel_Test
{
    OKW_Memorize_Sngltn     myMem = OKW_Memorize_Sngltn.getInstance();

    protected static String ApplicationName;

    @Rule
    public TestName         name  = new TestName();

    /**
     * \~german
     * Testet das Schlüsselwort VerifyExists( FN, ExpVal ) eines hcButtonWithCountLabel Prüfen.
     * 
     *  \~
     *  @author Zoltan Hrabovszki
     *  @date 2017-11-01
     */ 
    @Test
    public void tcVerifyExists() throws Exception
    {
      EN.BeginTest( name.getMethodName() );
      EN.StartApp( ApplicationName );
      EN.SetValue( "URL", "http://localhost:6060/#hc-count-label" );
    
      EN.SelectWindow( "HC Introduction" );

      EN.VerifyExists( "HC Count Label", "YES" );
      
      EN.StopApp( ApplicationName );
      EN.EndTest();
    }

    /**
     * \~german
     * Testet das Schlüsselwort VerifyLabel( FN, ExpVal ) eines hcButtonWithCountLabel Prüfen.
     * 
     *  \~
     *  @author Zoltan Hrabovszki
     *  @date 2017-11-01
     */ 
    @Test
    public void tcVerifyLabel() throws Exception
    {
      EN.BeginTest( name.getMethodName() );
      EN.StartApp( ApplicationName );
      EN.SetValue( "URL", "http://localhost:6060/#hc-count-label" );
    
      EN.SelectWindow( "HC Introduction" );

      EN.VerifyExists( "HC Count Label", "YES" );
      EN.VerifyLabel( "HC Count Label", "10" );
      
      EN.StopApp( ApplicationName );
      EN.EndTest();
    }

    
    /**
     * \~german
     * Testet das Schlüsselwort VerifyLabel( FN, ExpVal ) eines hcButtonWithCountLabel Prüfen.
     * 
     *  \~
     *  @author Zoltan Hrabovszki
     *  @date 2017-11-01
     */ 
    @Test
    public void tcVerifyCaption() throws Exception
    {
      EN.BeginTest( name.getMethodName() );
      EN.StartApp( ApplicationName );
      EN.SetValue( "URL", "http://localhost:6060/#hc-count-label" );
    
      EN.SelectWindow( "HC Introduction" );

      EN.VerifyExists( "HC Count Label", "YES" );
      EN.VerifyCaption( "HC Count Label", "Over me, a count" );
      
      EN.StopApp( ApplicationName );
      EN.EndTest();
    }

}
