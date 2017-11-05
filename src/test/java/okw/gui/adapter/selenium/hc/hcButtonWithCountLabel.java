package okw.gui.adapter.selenium.hc;

import java.util.ArrayList;

import javax.xml.xpath.XPathExpressionException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import okw.gui.OKWLocator;
import okw.gui.adapter.selenium.webdriver.SeDriver;


/**
 * @ingroup grouphcGuiAdapter 
 * 
 * \~german
 *  Diese Klasse representiert einen Button mit `hc-count-label`. Dieser wird mit Selenium angsteuert wird.
 *  
 *  <img src="https://user-images.githubusercontent.com/15831418/32337061-46c5b1b6-bff1-11e7-86ba-a3c12de9da54.png" width="100" height="auto" alt="Screenshot">
 *  
 *  Der unterschied zu einem "normalen" Button: ´VerifyLabel( "FN", "ExpVal" )´, ´MemorizeLabel( "FN", "ExpVal" )´ und ´LogLabel( "FN", "ExpVal" )´
 *  Interagieren mit dem hochgestelleten _Count-Label_ recht oben, - im Beispiel "10".
 *  
 *  # Unterstützte Tag-Strutur
 *  Folgende HTML-Tag-Struktur wird unterstützt: 
 *  
 *  \code{.xml}
 *  <button data-v-bce39362="" class="button is-primary">
 *    Over me, a count
 *       <span data-v-f73ffc22="" class="count" data-v-bce39362="">10</span>
 *  </button>
 *  \endcode
 * 
 * # VUE Code
 *  Folgende VUE-Tag-Struktur wird unterstützt: 
 *  
 *  \code{.xml}
 *  <button data-v-bce39362="" class="button is-primary">Caption des hcButtonWithCountLabel
 *       <span data-v-f73ffc22="" class="count" data-v-bce39362="">10</span>
 *  </button>
 *  \endcode
 *  
 * # Unterstützte GUI-Schlüsselwörter
 *
 * ## Kindobjekt Aktionen
 * 
 * | OpenKeyWord               | Implementiert | Beschreibung |
 * | ------------------------- | :-----------: | :----------- |
 * | `ClickOn( FN )`           | **JA**        |  |
 * | `DoubleClickOn( FN )`     | **NEIN**      | Ein Doppel-Klick ist auf ein Button nicht möglich -> OKWFrameObjectMethodNotImplemented | 
 * | `SetFocus( FN )`          | **JA**        |  |
 * | `SetValue( FN, Val )`     | **NEIN**      | Button hat keinen änderbaren Wert. -> throw OKWFrameObjectMethodNotImplemented |
 * | `Select( FN, Val )`       | **NEIN**      | Button hat keinen änderbaren Wert. -> throw OKWFrameObjectMethodNotImplemented |
 * | `SelectMenu( FN )`        | **NEIN**      | -> throw OKWFrameObjectMethodNotImplemented |
 * | `SelectMenu( FN, Val )`   | **NEIN**      | -> throw OKWFrameObjectMethodNotImplemented |
 * | `TypeKey( FN, Val )`      | **NEIN**      | -> OKWFrameObjectMethodNotImplemented |
 * 
 * ## Fensterbezogene Schlüsselwörter
 * 
 * | OpenKeyWord               | Implementiert | Beschreibung |
 * | ------------------------- | :-----------: | :----------- |
 * | `StarApp( AN )`           | **NEIN**      | Kein Fensterobjekt |
 * | `StopApp( AN )`           | **NEIN**      | Kein Fensterobjekt |
 * | `SelectWindow( FN )`      | **NEIN**      | Kein Fensterobjekt |
 * | `Sequence( FN, SQN, SEQ_ID )` | **NEIN**  | Kein Fensterobjekt |
 * 
 * ## Verifying, Memorizing, Logging Values
 * 
 * Group of keywords using the same GUI-Adapter Methods get*() <br/>
 * (e.g.: `VerifyExists( FN, ExpVal)`, `MemorizeExists( FN, MemKey)`,`LogExists( FN )` -> `getExists()` )
 * 
 * | OpenKeyWord | Implementiert | Beschreibung |
 * | ----------- | :-----------: | :----------- |
 * | `VerifyExists( FN, ExpVal)`,    <br>`MemorizeExists( FN, MemKey)`,    <br>`LogExists( FN )`   | **JA** |  |
 * | `VerifyHasFocus( FN, ExpVal )`, <br>`MemorizeHasFocus( FN, MemKey)`,  <br>`LogHasFocus( FN )` | **JA** |  |
 * | `VerifyIsActive( FN, ExpVal )`, <br>`MemorizeIsActive( FN, MemKey)`,  <br>`LogIsActive( FN )` | **JA** |  |
 * | `VerifyCaption( FN, ExpVal )`,  <br>`VerifyCaptionWCM( FN, ExpVal )`, <br>`VerifyCaptionREGX( FN, ExpVal )`, <br/>`MemorizeCaption( FN, ExpVal )`, <br>`LogCaption( FN, ExpVal )` | **JA** | Als \ref refCaption wird das Attribute `textContent` verwendet.. Im Beispiel: `Button Caption` |
 * | `VerifyLabel( FN, ExpVal )`,    <br>`VerifyLabelWCM( FN, ExpVal )`,   <br>`VerifyLabelREGX( FN, ExpVal )`,   <br/>`MemorizeLabel( FN, ExpVal )`, <br>`LogLabel( FN, ExpVal )`     | **JA** | Jedoch wir hier der wert des Count-Labels oben rechts ausgewertet |
 * | `VerifyTooltip( FN, ExpVal )`,  <br>`VerifyTooltipWCM( FN, ExpVal )`, <br>`VerifyTooltipREGX( FN, ExpVal )`, <br/>`MemorizeTooltip( FN, ExpVal )`, <br>`LogTooltip( FN, ExpVal )` | **JA** | Als Tooltip wird das Attribute `title` verwendet.  Im Beispiel: `Button title` |
 * | `VerifyValue( FN, ExpVal )`,    <br>`VerifyValueWCM( FN, ExpVal )`,   <br>`VerifyValueREGX( FN, ExpVal )`,   <br/>`MemorizeValue( FN, ExpVal )`, <br>`LogValue( FN, ExpVal )`     | **JA** | Als Tooltip wird das Attribute `value` verwendet. |
 *  
 *  \~english
 *  
 *  \~
 * @author Zoltán Hrabovszki
 * @date 2017.11.02
 */
public class hcButtonWithCountLabel extends hcButton
{
    public hcButtonWithCountLabel( String IframeID, String Locator, OKWLocator... Locators )
    {
        super( IframeID, Locator, Locators );
    }

    public hcButtonWithCountLabel( String Locator, OKWLocator... Locators )
    {
        super( Locator, Locators );
    }
    
  /** \~german
   *  Ermittelt den textuellen Inhalt des `hc-count-label`-s.
   *  
   *  @return Rückgabe des Count-Label. Hier im Beispiel: `"10"`
   *  \~english
   *  \~
   *  @author Zoltán Hrabovszki
   *  @date 2017.11.02
   */
   public ArrayList<String> getLabel()
   {
       ArrayList<String> lvLsReturn = new ArrayList<String>();

       try
       {
           this.LogFunctionStartDebug( "getLabel" );

           // Warten auf das Objekt. Wenn es nicht existiert wird mit OKWGUIObjectNotFoundException beendet...
           this.WaitForMe();

           // Kindelement (Span der Klass "count") dieses ObjeKtes suchen und Text auslesen...
           WebElement label = SeDriver.getInstance().driver.findElement( By.xpath( this.getLocator() + "//span[@class='count']" ) );
                      
           lvLsReturn.add( label.getAttribute( "outerText" ) );
       }
       finally
       {
           this.LogFunctionEndDebug( lvLsReturn );
       }

       return lvLsReturn;
   }
   
    /**
    * \~german Ermittelt den textuellen Inhalt der Caption/Überschrift des Objektes ohne Zähler!
    * 
    * Hinweis: Text wird getrimt: Führende, nachfolgende und überzählge "whitespaces" werden gelöscht!
    * 
    * @return Rückgabe des Textuellen Inhaltes der Caption/Überschrift: Beispiel "Over me, a count"
    * \~english
    * \~
    * @author Zoltán Hrabovszki
    * @date 2017.11.02
    */
    @Override // TODO define Prototype in BaseClass!
    public ArrayList<String> getCaption()
    {
        ArrayList<String> lvLsReturn = new ArrayList<String>();
        try
        {
            String myText = "";

            this.LogFunctionStartDebug( "getCaption" );

            // Warten auf das Objekt. Wenn es nicht existiert mit Exception
            // beenden...
            this.WaitForMe();

            // The Attribute "value" wird als Beschriftung angezeigt...
            String myOuterText = this.Me().getAttribute( "outerText" );
            String myLabelText = this.getLabel().get( 0 );

            try
            {
                myText = okw.OKW_Helper.getLeftFromDelimiterNumber( myOuterText, myLabelText, 1 );
            }
            catch (XPathExpressionException e)
            {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            
            // Whatspace am Anfang und Ende löschen...
            lvLsReturn.add( myText.trim() );
        }
        finally
        {
            this.LogFunctionEndDebug( lvLsReturn );
        }

        return lvLsReturn;
    }
}
