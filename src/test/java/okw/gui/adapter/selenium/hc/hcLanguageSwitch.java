package okw.gui.adapter.selenium.hc;

import java.util.ArrayList;

import javax.xml.xpath.XPathExpressionException;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebElement;

import okw.OKW;
import okw.OKW_Helper;
import okw.core.EN;
import okw.gui.OKWLocator;
import okw.gui.adapter.selenium.SeImage;
import okw.gui.adapter.selenium.SeLink;

/**
 * @ingroup grouphcGuiAdapter
 * \~german Ermittelt den textuellen Inhalt der Caption/Überschrift des
 * 
 * 
 *  <a data-v-09bccec8="" data-v-cbd6070a="" style="display: block; position: absolute; left: 1.5rem; top: 1rem;">
 *      <img data-v-09bccec8="" src="/assets/svg/flags/de.svg" alt="switch to english" title="switch to english" class="flag">
 *  </a>
 *  
 *  Hinweis: Locator wird dynamisch durch das Schlüsselwor Select geändert um ggf auf die Flagge zu 
 *  Klicken wenn dieser nicht der Vorgeschlagenen Sprache enspricht.
 *  Daher als Locator nur den Locator des Eltern-Fensters übergeben.
 * 
 * \~english
 * \~
 * @author Zoltán Hrabovszki
 * @throws Exception
 * @date 2018.04.07
 */
public class hcLanguageSwitch extends SeLink
{
    
    private OKWLocator Language = new OKWLocator("");
  
    @OKW( FN = "Flag", VerifyExists_PT = 3, VerifyExists_TO = 2 )
    SeImage Flag = new SeImage("$L1$");

    @OKW( FN = "FlagTitle", VerifyExists_PT = 3, VerifyExists_TO = 2 )
    SeImage FlagTitle = new SeImage("$L1$");

    
    public hcLanguageSwitch( String IframeID, String Locator, OKWLocator... Locators )
    {
        super( IframeID, Locator, Locators );        
    }
    
    public hcLanguageSwitch( String Locator, OKWLocator... Locators )
    {
        super( Locator, Locators );
        
        Flag      = new SeImage( "$L1$/img[@src='/assets/svg/flags/$L2$.svg']", this.getLOCATOR(), Language );
        FlagTitle = new SeImage( "$L1$/img", this.getLOCATOR() );
    }
    
    
    /**
     * \~german Wählt die Sprache aus, "en" für Englisch, "de" für Deutsch.
     * 
     * @return Rückgabe des Textuellen Inhaltes der Caption/Überschrift.
     * \~english
     * \~
     * @author Zoltán Hrabovszki
     * @throws Exception
     * @date 2013.12.07
     */
    @Override // TODO define Prototype in BaseClass!
    public void Select( ArrayList<String> Values )
    {
        try
        {
            this.LogFunctionStartDebug( "Select", "ArrayList<String> Values", Values.toString() );
            
            // Locator Language auf die gewollte sprache setzten: 
            // Zusammenbau des Locators wird in der Schlüsselwort Methode Select definiert.
            Language.setLocator( Values.get( 0 ) );
            
            // Warten auf das Objekt. Wenn es nicht existiert mit Exception
            // beenden...
            this.WaitForMe();
            
            // Wenn die FLagge nicht Existiert dann auf Language klicken.
            if ( ! this.Flag.getExists() ) 
            {
                try
                {
                    EN.ClickOn( "Language" );
                }
                catch (Exception e)
                {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
            // The Attribute "value" wird als Beschriftung angezeigt...
        }
        finally
        {
            this.LogFunctionEndDebug( );
        }
    }
    
    /**
     * \~german Ermittelt den textuellen Inhalt des Tooltips des
     * Objektes.
     * 
     * Methode Muss Überschreiben werden, weil der angezeigte Tooltip nicht am link (tag \<a\> ) 
     * hängt sonder am Kind-Tag \<img\>
     * 
     * @return Rückgabe des Textuellen Inhaltes der Tooltips.
     * \~english
     * \~
     * @author Zoltán Hrabovszki
     * @throws Exception
     * @date 2013.12.07
     */
    @Override // TODO define Prototype in BaseClass!
    public ArrayList<String> getTooltip()
    {
        ArrayList<String> lvLsReturn = new ArrayList<String>();
        try
        {
            this.LogFunctionStartDebug( "getCaption" );

            // Warten auf das Objekt. Wenn es nicht existiert mit Exception
            // beenden...
            this.WaitForMe();
            
            WebElement MyCurrentWebElement = this.Me();
            WebElement imgTitleChild = MyCurrentWebElement.findElement(By.xpath("./img"));

            String myTooltip = imgTitleChild.getAttribute( "title" );
            
            lvLsReturn.add( myTooltip );
        }
        finally
        {
            this.LogFunctionEndDebug( lvLsReturn );
        }

        return lvLsReturn;
    }

   
    /**
     * \~german Ermittelt den Wert des Objektes.
     * 
     * Methode muss Überschreiben werden, weil der aktuelle Wert nicht am link (tag \<a\> ) 
     * hängt sonder am Kind-Tag \<img\> hängt.
     * 
     * 
     * @return Rückgabe des Textuellen Inhaltes der Tooltips.
     * \~english
     * \~
     * @author Zoltán Hrabovszki
     * @throws Exception
     * @date 2013.12.07
     */
    @Override // TODO define Prototype in BaseClass!
    public ArrayList<String> getValue()
    {
        ArrayList<String> lvLsReturn = new ArrayList<String>();
        try
        {
            this.LogFunctionStartDebug( "getCaption" );

            // Warten auf das Objekt. Wenn es nicht existiert mit Exception
            // beenden...
            this.WaitForMe();
            
            WebElement MyCurrentWebElement = this.Me();
            WebElement imgTitleChild = MyCurrentWebElement.findElement(By.xpath("./img"));

            String myValue = imgTitleChild.getAttribute( "src" );
            
            try
            {
                // /assets/svg/flags/de.svg
                myValue = OKW_Helper.getRightFromDelimiterNumber( myValue, "flags/", 1 );
                myValue = OKW_Helper.getLeftFromDelimiterNumber( myValue, ".", 1 );
            }
            catch (XPathExpressionException e)
            {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            
            lvLsReturn.add( myValue );
        }
        finally
        {
            this.LogFunctionEndDebug( lvLsReturn );
        }

        return lvLsReturn;
    }
}
