package okw.gui.frames.hc;

import okw.OKW;
import okw.gui.adapter.selenium.*;
import okw.gui.adapter.selenium.hc.hcLink;
import okw.gui.container.hc.hcMainNavigation;

/**
 * @ingroup grouphcGuiFrames
 * Frame-Klasse representiert die 'Neuen Beitrag Anlegen'-Seite von 
 * [Human Connection](https://www.humanconnection.org/login)
 * 
 */
@OKW(FN = "HC Neuen Beitrag Anlegen")
public class hcContributionsWrite extends SeBrowserChild
{

    /**
     * Kontainer-Klasse okw.gui.container.hc.hcMainNavigation - bindet die hc-navbar auf dieser Seite ein.
     */
    public hcMainNavigation myHeader = null;
    
    
    /**
     * Wählt den Beitragstyp "Post" aus.
     */
    @OKW(FN = "Post")
    public hcLink myNewPost = null;
    

    /**
     * Wählt den Beitragstyp "Ca Do" aus.
     */
    @OKW(FN = "Can Do")
    public hcLink myNewCanDo = null;


    /**
     * Setzt den Titel/Überschrift eines Beitrages.
     */
    @OKW(FN = "Title")
    public SeInputText myTitle = new SeInputText("%1$s//a[@innertText='Post']", this.getLOCATOR() );
    
    
    public hcContributionsWrite()
    {
        setLocator( "//div[@id='page-name-contributions-write'" );
        myHeader   = new hcMainNavigation("%1$", this.getLOCATOR());
        myNewPost  = new hcLink("%1$s//a[@textContent='Post']", this.getLOCATOR() );
        myNewCanDo = new hcLink("%1$s//a[@textContent='Can Do']", this.getLOCATOR() );
        myTitle    = new SeInputText("%1$s//a[@innertText='Post']", this.getLOCATOR() );
        
    }    
}
