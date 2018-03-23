package okw.gui.frames.hc;

import okw.OKW;
import okw.core.EN;
import okw.gui.adapter.selenium.*;
import okw.gui.container.hc.hcMainNavigation;

/**
 * @ingroup grouphcGuiFrames
 * Frame-Klasse representiert die 'Welcome - Human Connection'-Seite von 
 * [Human Connection](https://www.humanconnection.org/login)
 * 
 */
@OKW(FN = "HC MainPage")
public class hcMainPage extends SeBrowserChild
{

    /**
     * Kontainer-Klasse okw.gui.container.hc.hcMainNavigation - bindet die hc-navbar auf dieser Seite ein.
     */
    public hcMainNavigation myHeader = null;
    
    
    /**
     * Recht Unten das grüne (+)-Kreis zum erstellen neuer Beiträge
     */
    @OKW(FN = "Add New Contribution")
    public hcMainNavigation myNewPost = null;
    
    public hcMainPage()
    {
        setLocator( "//div[@id='page-name-index']" );
        
        myHeader = new hcMainNavigation("%1$s", this.getLOCATOR());
        myNewPost = new hcMainNavigation("%1$s//a[@href='/contributions/write']", this.getLOCATOR() );
        
    }
    
    /**
     *  * @ingroup grouphcGuiSequences 
     *  Sequenz prüft, ob alle GUI Elemente "HC MainPage" existieren 
     *  und ob diese technisch (Objekt Erkennung)
     *  erreichbar sind.  
     */
    public void Sequens_Smoke( String SEQ_ID ) throws Exception
    {
        EN.SelectWindow( "HC MainPage" );
        
        // Kopfzeile
        EN.VerifyExists( "Logo", "YES" );        
        EN.VerifyExists( "Suchen", "YES" );
        EN.VerifyExists( "Filter", "YES" );        
        EN.VerifyExists( "Sprache", "YES" );        
        EN.VerifyExists( "Benachrichtigung", "YES" );
        EN.VerifyExists( "Benutzer", "YES" );
        
        EN.VerifyExists( "Add New Contribution", "YES" );      
        
    }

}
