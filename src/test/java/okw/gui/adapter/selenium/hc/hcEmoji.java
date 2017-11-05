package okw.gui.adapter.selenium.hc;

import java.util.ArrayList;

import okw.gui.OKWLocator;
import okw.gui.adapter.selenium.SeImage;

/**
 * @ingroup grouphcGuiAdapter 
 * 
 * \~german
 *  Diese Klasse representiert einen `hc-imoji` Image. Dieser wird mit Selenium angsteuert wird und ist von der Klasse SeImage abgeleitet.
 *  
 *  # Unterstützter Tag
 *  Folgender HTML-Tag Struktus wird unterstützt:
 *  
 *  \code{.xml}
 *  <img data-v-25439cc6="" src="/assets/svg/emoji/happy.svg" style="display: inline-block;" width="80" height="auto">
 *  \endcode
 * 
 * \par Hinweis:
 * Entscheidend ist der Wert des Attributes `src`. Implementiert/erlaubt sind folgende Werte:
 *  - `happy.svg`,
 *  - `funny.svg`,
 *  - `surprised.svg`,
 *  - `cry.svg`,
 *  - `angry.svg`
 * 
 * 
 * # VUE Code
 *  Folgender VUE-Tag wird unterstützt:
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
 * | `DoubleClickOn( FN )`     | **NEIN**      | Ein Doppel-Klick ist auf ein Image nicht möglich -> OKWFrameObjectMethodNotImplemented | 
 * | `SetFocus( FN )`          | **JA**        |  |
 * | `SetValue( FN, Val )`     | **NEIN**      | hcEmoji hat keinen änderbaren Wert. -> throw OKWFrameObjectMethodNotImplemented |
 * | `Select( FN, Val )`       | **NEIN**      | hcEmoji hat keinen änderbaren Wert. -> throw OKWFrameObjectMethodNotImplemented |
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
 * | `VerifyValue( FN, ExpVal )`,    <br>`VerifyValueWCM( FN, ExpVal )`,   <br>`VerifyValueREGX( FN, ExpVal )`,   <br/>`MemorizeValue( FN, ExpVal )`, <br>`LogValue( FN, ExpVal )`     | **JA** | Als Wert wird das verwendete Image (svg) ausgewertet und als `value` zurückgeliefer. |
 *  
 *  \~english
 *  
 *  \~
 * @author Zoltán Hrabovszki
 * @date 2017.11.02
 */
public class hcEmoji extends SeImage
{

    public hcEmoji( String IframeID, String Locator, OKWLocator... Locators )
    {
        super( IframeID, Locator, Locators );
    }

    public hcEmoji( String Locator, OKWLocator... Locators )
    {
        super( Locator, Locators );
    }
    
    /**
     *  Der Wert eines "hc-emoji" wird aus dem Attributte `src` ausgelesen 
     *  
     * | Rückgabe Wert      | Image | 
     * | ------------------ | :-----------: | 
     * | happy | <img src="https://user-images.githubusercontent.com/15831418/32339463-2098a0f0-bff8-11e7-8c28-7187bc701624.png" width="40" height="auto" alt="happy"> |
     * | funny | <img src="https://user-images.githubusercontent.com/15831418/32339454-18226500-bff8-11e7-856b-189d5924b5ec.png" width="40" height="auto" alt="funny"> |
     * | surprised | <img src="https://user-images.githubusercontent.com/15831418/32339480-2c2f8ec4-bff8-11e7-8b29-93e0fb6d8e35.png" width="40" height="auto" alt="surprised"> |
     * | cry | <img src="https://user-images.githubusercontent.com/15831418/32339440-10706ce4-bff8-11e7-9b64-40c9e62ba576.png" width="40" height="auto" alt="cry"> |
     * | angry | <img src="https://user-images.githubusercontent.com/15831418/32339373-eed1259c-bff7-11e7-991e-15396e3052b2.png" width="40" height="auto" alt="angry"> |
     * | angry | <img src="https://user-images.githubusercontent.com/15831418/32339373-eed1259c-bff7-11e7-991e-15396e3052b2.png" width="40" height="auto" alt="angry"> |
     *  
     *  @return "happy", "funny", "surprised", "cry", "angry" - entsprechend Image Lise in der Beschreibung oben.
     *          Sonst "uknown", wenn keines der 1. Werte zutrifft, wird  zurückgeliefert
     *  
     *  @author Zoltán Hrabovszki
     *  @date 2017-11-04
     */
    @Override
    public ArrayList<String> getValue()
    {
        ArrayList<String> lvLsReturn = new ArrayList<String>();

        try
        {
            this.LogFunctionStartDebug( "getValue" );

            // Warten auf das Objekt. Wenn es nicht existiert wird mit OKWGUIObjectNotFoundException beendet...
            this.WaitForMe();

            String mySrc = this.Me().getAttribute( "src" );
            
            if ( mySrc.matches( ".*happy\\.svg$" ) ) lvLsReturn.add( "happy" ) ;
            else if ( mySrc.matches( ".*funny\\.svg$" ) ) lvLsReturn.add( "funny" ) ;
            else if ( mySrc.matches( ".*surprised\\.svg$" ) ) lvLsReturn.add( "surprised" ) ;
            else if ( mySrc.matches( ".*cry\\.svg$" ) ) lvLsReturn.add( "cry" ) ;
            else if ( mySrc.matches( ".*angry\\.svg$" ) ) lvLsReturn.add( "angry" ) ;
            else lvLsReturn.add( "unkown" ) ;
        }
        finally
        {
            this.LogFunctionEndDebug( lvLsReturn );
        }

        return lvLsReturn;
    }
    
}
