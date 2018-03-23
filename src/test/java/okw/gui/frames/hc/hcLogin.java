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
     * User-Eingabefeld als Email-Adresse.
     */
    @OKW( FN = "Language" )
    public SeLink myLanguage = null;

    
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
        
        myLanguage = new SeLink( "%1$s//a/img[@class='flag']/..", this.getLOCATOR() );
        
        User = new SeInputText( "%1$s//input[@name='username']", this.getLOCATOR() );
        Password = new SeInputText( "%1$s//input[@name='password']", this.getLOCATOR() );
        Login = new hcButton( "%1$s//button[@name='submit']", this.getLOCATOR() );
    }
    
    /**
     *  * @ingroup grouphcGuiSequences 
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
     *  * @ingroup grouphcGuiSequences 
     *  Sequenz prüft, ob alle GUI Elemente "HC Login" existieren 
     *  und ob diese technisch (Objekt Erkennung)
     *  erreichbar sind.  
     */
    public void Sequens_SmokeTestExists( String SEQ_ID ) throws Exception
    {
        EN.SelectWindow( "HC Login" );
        EN.VerifyExists( "Language", "YES" );
        EN.VerifyExists( "User", "YES"  );
        EN.VerifyExists( "Password", "YES"  );
        EN.VerifyExists( "Login", "YES" );        
    }

    /**
     *  * @ingroup grouphcGuiSequences 
     *  Sequenz Prüft die Deutschen Texteinträge der GUI-Objekte. 
     */
    public void SequensSmokeTestTextDE( String SEQ_ID ) throws Exception
    {
        EN.SelectWindow( "HC Login" );
        
        EN.Select( "Language", "DE" );

        // Language
        EN.VerifyTooltip( "Language", "switch to englisch" );
        
        // User
        EN.VerifyExists( "User", "E-Mail"  );
        
        // Password
        EN.VerifyExists( "Password", "Passwort"  );

        // Login Button
        EN.VerifyCaption( "Login", "Anmelden" );        
    }

    /**
     *  * @ingroup grouphcGuiSequences 
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
