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
    
    /* Meldungen: Überprüfe Deine Zugangsdaten!
     *
     * <div class="notices is-top">
     *     <div class="toast is-danger is-top" style="">
     *          <div>Überprüfe Deine Zugangsdaten!</div>
     *     </div>
     * </div>
     * 
     * Hinweis: Diese Meldung hängt nicht unter dem Baum 
     */
    @OKW( FN = "Error", VerifyTooltip_PT=1000, VerifyTooltip_TO=2 )
    public hcNoticesToastDanger myNoticesToastDanger = new hcNoticesToastDanger( "//div[class='notices is-top']" );
        
    /**
     * User-Eingabefeld als Email-Adresse.
     */
    @OKW( FN = "Language", VerifyTooltip_PT=1000, VerifyTooltip_TO=2 )
    public hcLanguageSwitch myLanguage = null;

    
    /**
     * User-Eingabefeld als Email-Adresse.
     */
    @OKW( FN = "User" )
    public SeInputText User = null;

    /**
     * Passwort-Eingabefeld.
     */
    @OKW( FN = "Password" )
    public SeInputText Password = null;

    /**
     * Button/Knopf zur Anmeldung in HC
     */
    @OKW( FN = "Login" )
    public hcButton Login = null;
    
    
    public hcLogin()
    { 
        this.setLocator( "//div[@id='page-name-auth-login']" );
        // this.setLocator( "//div[@TESTID='HC Login']" );
        
        myLanguage = new hcLanguageSwitch( "$L1$//a/img[@class='flag']/..", this.getLOCATOR() );
        
        User = new SeInputText( "$L1$//input[@name='email']", this.getLOCATOR() );
        Password = new SeInputText( "$L1$//input[@name='password']", this.getLOCATOR() );
        Login = new hcButton( "$L1$//button[@name='submit']", this.getLOCATOR() );

        // Überprüfe Deine Zugangsdaten!
        
    }
    
    /**
     *  @ingroup grouphcGuiSequences 
     *  Sequenz führt eine valide Anmeldung in HC durch. 
     */
    public void Sequens_Login( String SEQ_ID ) throws Exception
    {
        EN.SelectWindow( "HC Login" );
        EN.SetValue( "User", "zh@openkeyword.de" );
        EN.SetValue( "Password", "hannaveronika" );
        EN.ClickOn( "Login" );
        EN.VerifyExists( "Login", "NO" ); //@todo TODO: Prüfen ob anmeldung erfolgreich war, Fehlermeldung Vorhanden was auch immer?
    }

    /**
     *  @ingroup grouphcGuiSequences 
     *  Sequenz Prüft die Deutschen Texteinträge der GUI-Objekte. 
     */
    public void SequensSmokeTestTextEN( String SEQ_ID ) throws Exception
    {
        EN.SelectWindow( "HC Login" );
        
        EN.Select( "Language", "EN" );

        // Language
        EN.VerifyTooltip( "Language", "zu deutsch wechseln" );
        
        // User
        //EN.VerifyPlaceholder( "User", "Email"  );
        //EN.VerifyTooltip( "User", "" );
        
        // Password
        //EN.VerifyPlaceholder( "Password", "Password"  );
        //EN.VerifyTooltip( "User", "" );

        // Login Button
        EN.VerifyCaption( "Login", "Login" );
        //EN.VerifyTooltip( "Login", "" );        
    }

}
