package okw.gui.container.hc;

import okw.OKW;
import okw.gui.OKWLocator;
import okw.gui.adapter.selenium.*;

/**
 * @ingroup grouphcGuiContainer
 * 
 * main navigation
 * GUI-Container Klasse enthält alle GUI-Objekte der Kopfzeile (Header).
 * 
 * \image html hcHead/hc-navbar.png
 * 
 * FB | GUI-Adapter  | Bild
 * ------------- | ------------- | -------------
 *  "Logo" | hcMainNavigation.navBarBrand | \image html hcHead/hc-navbar-brand.png
 *  "Suchen" | hcMainNavigation.navBarSearch | \image html hcHead/hc-navbar-search.png
 *  "Filter" | hcMainNavigation.navBarFilter | \image html hcHead/hc-navbar-filter.png
 *  "Sprache" | hcMainNavigation.navBarLanguage | \image html hcHead/hc-navbar-language.png
 *  "Benachrichtigung" | hcMainNavigation.navBarNotifications | \image html hcHead/hc-navbar-notifications.png
 *  "Benutzer" | hcMainNavigation.navbarUserMenu | \image html hcHead/hc-navbar-user-menu.png
 * \~
 * @author Zoltán Hrabovszki
 * @date 2018-03-17
 */
public class hcMainNavigation extends SeAnyChildWindow
{
    /**
     * HC-Logo ganz Links. - Ein Klick springt zur Hauptseite des HC
     * 
     * \image html hcHead/hc-navbar-brand.png
     * 
     * \TODO TODO: Greg: Das Logo in der "Main Navigation" benötigt eine eindeutige ID.
     * \~
     * @author Zoltán Hrabovszki
     * @date 2018-03-17
     */
    @OKW( FN = "Logo" )
    public SeInputText navBarBrand = new SeInputText( "//div[@class='hc-navbar-item hc-navbar-brand']" );

    /**
     * Eingabefeld "Suchen..."
     * 
     * \image html hcHead/hc-navbar-search.png
     * \TODO TODO: Greg: Das Suchfeld in der "Main Navigation" benötigt eine eindeutige ID.
     * \~
     * @author Zoltán Hrabovszki
     * @date 2018-03-17
     */
    @OKW( FN = "Suchen" )
    public SeInputText navBarSearch = new SeInputText( "//input[@placeholder='Suchen ...']" );


    /**
     * Das ist die 1. Dropdown-Liste rechts neben dem Suchfeld, welche die FilterBox zur Auswahl aufklappt"
     * 
     * \image html hcHead/hc-navbar-filter.png
     * 
     * \TODO TODO: Greg: Das Suchfeld in der "Main Navigation" benötigt eine eindeutige ID.
     * \~
     * @author Zoltán Hrabovszki
     * @date 2018-03-17
     */
    @OKW( FN = "Filter" )
    public SeAnyChildWindow navBarFilter = new SeAnyChildWindow( "//div[@class='hc-navbar-item hc-navbar-filter']" );

    
    /**
     * Das ist die 2. Dropdown-Liste rechts neben dem Suchfeld, welche die Sprachen zur Auswahl aufklappt"
     * 
     * \image html hcHead/hc-navbar-language.png
     * 
     * \TODO TODO: Greg: Das Suchfeld in der "Main Navigation" benötigt eine eindeutige ID.
     * \~
     * @author Zoltán Hrabovszki
     * @date 2018-03-17
     */
    @OKW( FN = "Sprache" )
    public SeAnyChildWindow navBarLanguage = new SeAnyChildWindow( "//div[@class='hc-navbar-item hc-navbar-language']" );

    
    /**
     * Das ist die 3. Dropdown-Liste rechts neben dem Suchfeld, welche das BenachritigungsMenu zur Auswahl aufklappt"
     * 
     * \image html hcHead/hc-navbar-notifications.png
     * 
     * \TODO TODO: Greg: Das Suchfeld in der "Main Navigation" benötigt eine eindeutige ID.
     * \~
     * @author Zoltán Hrabovszki
     * @date 2018-03-17
     */
    @OKW( FN = "Benachrichtigung" )
    public SeAnyChildWindow navBarNotifications = new SeAnyChildWindow( "//div[@class='hc-navbar-item hc-navbar-notifications']" );

    
    /**
     * Das ist die 4. Dropdown-Liste rechts neben dem Suchfeld, welche das User-Menu zur Auswahl aufklappt"
     * 
     * \image html hcHead/hc-navbar-user-menu.png
     * 
     * \TODO TODO: Greg: Das Suchfeld in der "Main Navigation" benötigt eine eindeutige ID.
     * \~
     * @author Zoltán Hrabovszki
     * @date 2018-03-17
     */
    @OKW( FN = "Benutzer" )
    public SeAnyChildWindow navbarUserMenu = new SeAnyChildWindow( "//div[@class='hc-navbar-item hc-navbar-user-menu']" );
    
    
    /**
     * Schaltfläche, um zum Anmelde-Dialog zu gelangen.
     * 
     * \image html hcHead/LoginSignUp.png
     * \~
     * @author Zoltán Hrabovszki
     * @date 2018-03-17
     */
    @OKW( FN = "Login / Sign-Up" )
    public SeLink Login = new SeLink( "//a[@href='/auth/login']" );
    
    public hcMainNavigation(String Locator, OKWLocator... Locators)
    {
        super( Locator, Locators );
    }
    
}
