package okw.gui.container.hc;

import okw.OKW;
import okw.gui.OKWLocator;
import okw.gui.adapter.selenium.*;

/**
 * @ingroup grouphcGuiContainer
 * GUI-Klasse enthält alle GUI-Objekte der Kopfzeile (Header).
 * 
 */
@OKW(FN = "HC Login")
public class hcHead extends SeAnyChildWindow
{
    /**
     * Eingabefeld "Suchen..."
     * 
     * \image html hcHead/Suchen.png
     */
    @OKW( FN = "Suchen" )
    public SeInputText Search = new SeInputText( "//input[@placeholder='Suchen ...']" );

    /**
     * Schaltfläche, um zum Anmelde-Dialog zu gelangen.
     * 
     * \image html hcHead/LoginSignUp.png
     */
    @OKW( FN = "Login / Sign-Up" )
    public SeLink Login = new SeLink( "//a[@href='/auth/login']" );
    
    public hcHead(String Locator, OKWLocator... Locators)
    {
        super( Locator, Locators );
    }
    
}
