package okw.gui.adapter.selenium.hc;

import java.util.ArrayList;

import okw.gui.OKWLocator;
import okw.gui.adapter.selenium.SeButton;

/**
 * @ingroup grouphcGuiAdapter 
*/
public class hcLink extends SeButton
{

    public hcLink( String IframeID, String Locator, OKWLocator... Locators )
    {
        super( IframeID, Locator, Locators );
    }

    public hcLink( String Locator, OKWLocator... Locators )
    {
        super( Locator, Locators );
    }
    
    /**
     * \~german Ermittelt den textuellen Inhalt der Caption/Überschrift des
     * Objektes.
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
            lvLsReturn.add( this.Me().getAttribute( "innerText" ) );
        }
        finally
        {
            this.LogFunctionEndDebug( lvLsReturn );
        }

        return lvLsReturn;
    }
}
