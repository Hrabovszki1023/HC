package okw.gui.adapter.selenium.hc;

import java.util.ArrayList;

import javax.xml.xpath.XPathExpressionException;

import okw.OKW_Helper;
import okw.gui.OKWLocator;
import okw.gui.adapter.selenium.SeButton;

/**
 * @ingroup grouphcGuiAdapter 
*/
public class hcButton extends SeButton
{

    public hcButton( String IframeID, String Locator, OKWLocator... Locators )
    {
        super( IframeID, Locator, Locators );
    }

    public hcButton( String Locator, OKWLocator... Locators )
    {
        super( Locator, Locators );
    }
    
    /**
     * \~german Ermittelt den textuellen Inhalt der Caption/Überschrift des
     * Objektes.
     * 
     * Methode wird Überschrieben, weil bei HC ein trim() der Werte notwendig ist.
     * 
     * @return Rückgabe des Textuellen Inhaltes der Caption/Überschrift.
     * \~english
     * \~
     * @author Zoltán Hrabovszki
     * @throws Exception
     * @date 2013.12.07
     */
    @Override // TODO define Prototype in BaseClass!
    public ArrayList<String> getCaption()
    {
        ArrayList<String> lvLsReturn = new ArrayList<String>();
        try
        {
            this.LogFunctionStartDebug( "getCaption" );

            // Warten auf das Objekt. Wenn es nicht existiert mit Exception
            // beenden...
            this.WaitForMe();

            // The Attribute "value" wird als Beschriftung angezeigt...
            String innerText = this.Me().getAttribute( "innerText" ).trim();
            
            /*try
            {
                innerText = okw.OKW_Helper.getRightFromDelimiterNumber( innerText, " ", 1 );
            }
            catch (XPathExpressionException e)
            {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            */
            lvLsReturn.add( innerText );
        }
        finally
        {
            this.LogFunctionEndDebug( lvLsReturn );
        }

        return lvLsReturn;
    }
}
