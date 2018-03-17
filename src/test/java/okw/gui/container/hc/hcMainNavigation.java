package okw.gui.container.hc;

import okw.OKW;
import okw.gui.OKWLocator;
import okw.gui.adapter.selenium.*;

/**
 * @ingroup grouphcGuiContainer
 * main navigation
 * GUI-Container Klasse enthält alle GUI-Objekte der Kopfzeile (Header).
 * 
 */
public class hcMainNavigation extends SeAnyChildWindow
{
    /**
     * Eingabefeld "Suchen..."
     * 
     * \image html hcHead/hc-navbar-search.png
     * \TODO TODO: Greg: Das Suchfeld in der "Main Navigation" benötigt eine eindeutige ID.
     */
    @OKW( FN = "Suchen" )
    public SeInputText Search = new SeInputText( "//input[@placeholder='Suchen ...']" );


    /**
     * Das ist die 1. Dropdown-Liste rechts neben dem Suchfeld, welche die FilterBox zur Auswahl aufklappt"
     * 
     * \image html hcHead/hc-navbar-filter.png
     * 
     * \TODO TODO: Greg: Das Suchfeld in der "Main Navigation" benötigt eine eindeutige ID.
     */
    @OKW( FN = "Filter" )
    public SeAnyChildWindow navBarFilter = new SeAnyChildWindow( "//div[@class='hc-navbar-item hc-navbar-filter']" );
    
    /**
     * Das ist die 2. Dropdown-Liste rechts neben dem Suchfeld, welche die Sprachen zur Auswahl aufklappt"
     * 
     * \image html hcHead/hc-navbar-language.png
     * 
     * \TODO TODO: Greg: Das Suchfeld in der "Main Navigation" benötigt eine eindeutige ID.
     */
    @OKW( FN = "Sprache" )
    public SeAnyChildWindow navBarLanguage = new SeAnyChildWindow( "//div[@class='hc-navbar-item hc-navbar-language']" );

    
    /**
     * Das ist die 3. Dropdown-Liste rechts neben dem Suchfeld, welche die BenachritigungsMenu zur Auswahl aufklappt"
     * 
     * \image html hcHead/hc-navbar-notification.png
     * 
     * \TODO TODO: Greg: Das Suchfeld in der "Main Navigation" benötigt eine eindeutige ID.
     */
    @OKW( FN = "Benachrichtigung" )
    public SeAnyChildWindow navBarNotification = new SeAnyChildWindow( "//div[@class='hc-navbar-item hc-navbar-notification']" );

    
    
    /**
     * Schaltfläche, um zum Anmelde-Dialog zu gelangen.
     * 
     * \image html hcHead/LoginSignUp.png
     */
    @OKW( FN = "Login / Sign-Up" )
    public SeLink Login = new SeLink( "//a[@href='/auth/login']" );
    
    public hcMainNavigation(String Locator, OKWLocator... Locators)
    {
        super( Locator, Locators );
    }
    
}
