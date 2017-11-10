package okw.gui.frames.hc;

import okw.OKW;
import okw.core.EN;
import okw.gui.adapter.selenium.*;
import okw.gui.adapter.selenium.hc.*;

/**
 * @ingroup grouphcGuiFrames
 * Klasse representiert den Login-Dialog von [Human Connection](https://www.humanconnection.org/login)
 * 
 * # Login Dialog
 * 
 * \image html hcLogin/hcLogin.png
 * 
 */
@OKW(FN = "HC Login")
public class hcLogin extends SeBrowserChild
{
    /**
     * User-Eingabefeld.
     */
    @OKW( FN = "User" )
    public SeInputText User = new SeInputText( "//input[@placeholder='Email']" );

    /**
     * Passwort-Eingabefeld.
     */
    @OKW( FN = "Password" )
    public SeInputText Password = new SeInputText( "//input[@placeholder='Email']" );

    /**
     * Login Button zur Anmeldung in HC
     */
    @OKW( FN = "Login" )
    public hcButton Login = new hcButton( "//input[@placeholder='Email']" );
    
    /**
     * Link zum Anlegen eines neuen Kontos.
     * @code
     * <a data-v-690c0af3=""
     *    href="/auth/register"
     *    class="card-footer-item"
     *   >Noch kein Konto?</a>
     * @endcode
     */
    @OKW( FN = "Noch kein Konto?" )
    public hcLink NochKeinKonto = new hcLink( "//input[@innerText='Noch kein Konto?']" );

    
    /**
     * Link zum "Passwort reset".
     * 
     * @code
     * <a data-v-690c0af3="" href="#" class="card-footer-item is-disabled disabled" style="cursor: not-allowed;">
     *   Passwort vergessen?
     * </a>
     * @endcode
     */
    @OKW( FN = "Passwort vergessen?" )
    public hcButton PasswortVergessen = new hcButton( "//input[@innerText='Passwort vergessen?']" );

    
    
    public hcLogin()
    {
        setLocator( "//div[@class='card']" );
    }
    
    /**
     *  * @ingroup grouphcGuiSequences 
     *  Sequenz führt eine valide Anmeldung in HC durch. 
     */
    public void Sequens_Login( String SEQ_ID ) throws Exception
    {
        EN.SelectWindow( "HC Login" );
        EN.SetValue( "User", "User" );
        EN.SetValue( "Password", "Password" );
        EN.ClickOn( "Login" );
        EN.VerifyExists( "Login", "NO" ); //@todo TODO: Prüfen ob anmeldung erfolgreich war, Fehlermeldung Vorhanden was auch immer?
    }
}
