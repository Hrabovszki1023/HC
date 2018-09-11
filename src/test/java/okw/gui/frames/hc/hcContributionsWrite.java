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
@OKW(FN = "Add New Contribution")
public class hcContributionsWrite extends SeBrowserChild
{

    /**
     * Kontainer-Klasse okw.gui.container.hc.hcMainNavigation - bindet die hc-navbar auf dieser Seite ein.
     */
    public hcMainNavigation myHeader = null;
    
    // ===========================================
    // ContributionType : Post; Can Do

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

    // ===========================================
    // Title
    /**
     * Setzt den Titel/Überschrift eines Beitrages.
     */
    @OKW(FN = "Title")
    public SeInputText myTitle = null;
    
    // Content (I): ${TheQuickBrownFox}
    
    // Categories of Content (I):
    // Art, Culture & Sports; Consumption & Sustainability; Cooperation & Development;Democracy & Politics; Economy & Finances; Education & Sciences; Energy & Technology; Environment & Nature; Freedom of Press & Opinion; Global Peace & Non-Violence; Happiness & Values; Health & Wellbeing; Human Rights & Justice; IT, Internet & Data Privacy; Just For Fun
    
    // Tags (I): ${IGNORE}
    
    // Language (I): ${IGNORE}; English; Deutsch
    
    // Visibility (I): ${IGNORE}; Public; Private; Friends
    
    public hcContributionsWrite()
    {
        setLocator( "//div[@id='page-name-contributions-write'" );
        
        myHeader   = new hcMainNavigation("$L1$", this.getLOCATOR());
        myNewPost  = new hcLink("$L1$//a[@textContent='Post']", this.getLOCATOR() );
        myNewCanDo = new hcLink("$L1$//a[@textContent='Can Do']", this.getLOCATOR() );
        myTitle    = new SeInputText("$L1$//a[@innertText='Post']", this.getLOCATOR() );
    }    
}
