package hc.testcases.hc.hcContibutionPost;

import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;

import okw.OKW_Memorize_Sngltn;
import okw.core.EN;

/**
* @ingroup grouphcGuiTestcases
* 
* Test-Klasse zur Prüfung des HC-Beitrages "Post"
* 
* Beitrag anlegen, speichern, ändern, löschen(?)
* 
* - Titel: anlegen, speichern, ändern, anzeige
* - Titel: Löschen erlaubt(?)
* - Inhalt: anlegen, speichern, ändern, anzeige
* - Themenkategorien:
* -- anlegen, speichern, ändern, anzeige, löschen. max 3 auswählbar
* -- Anzeige anzahl Kategorien ausgewählt
* -- Disablete kategorien wenn 3 erreicht.
* - Tags:
* -- anlegen, speichern, löschen, ändern, anzeige
* -- xax 5 tags
* -- Anzeige Anzahl Kategorien ausgewählt
* -- Disablete kategorien wenn 5 erreicht.
* 
* - Stimmung: anlegen, speichern, löschen, ändern, anzeige
* 
* - Wir ein Beitrag unter meine Chronik gelistet?
* 
* - Sichtbarkeit
* -- "Public" auch für andere sichtbar?
* -- "Public" für ander sichtbar?
* -- "Public" für Freunde sichtbar?
* 
* -- "Private" nur für mich sichtbar?
* -- "Private" für ander nicht sichtbar?
* -- "Private" für Freunde nicht sichtbar?
* 
* -- "Für Freunde"  nur für mich sichtbar?
* -- "Für Freunde"  für andere nicht sichtbar?
* -- "Für Freunde"  für Freunde sichtbar?
* 
* 
* \~
*  @author Zoltan Hrabovszki
*  @date 2017-11-04
*/
@Ignore
public class hcContibutionPost_Test
{
    OKW_Memorize_Sngltn     myMem = OKW_Memorize_Sngltn.getInstance();

    protected static String ApplicationName;

    @Rule
    public TestName         name  = new TestName();

  
  /**
     * \~german
     * Legt einen neuen öffentlichen Beitrag "Post" an.
     *  \~
     *  @author Zoltán Hrabovszki
     *  @date 2018-03-14
     */ 
    @Test
    public void tcCreateNewPost() throws Exception
    {
      EN.BeginTest( name.getMethodName() );
      EN.StartApp( ApplicationName );
      EN.SetValue( "URL", "http://alpha.human-connection.org" );
      
      // Login Dialog mit validem User
      EN.Sequence( "HC Login", "Sequens_Login", "TestUser1" );

      // Im Hauptfenster auf "+" Neuer Betrag Klicken
      EN.SelectWindow( "HC Home" );
      EN.ClickOn( "Add New Contribution" );
      
      // Im Contribution-Create-Fenster einen Post anlegen und Speichern
      EN.SelectWindow( "New Contribution" );
      
      EN.Select("Contribution Type", "Post");
      
      EN.TypeKey( "Title", "${TCN}" ); // Testfallnamen als Überschrift
      EN.TypeKey( "Content", "Lorem Ipsum" );
      
      // Attribute einstellen      
      EN.SetValue( "Category", "" );
      EN.SetValue( "Tag", "" );
      EN.Select( "Visibility", "Public" );
      
      EN.Select( "Language", "Deutsch" );
      EN.ClickOn( "Publish" );
      
      EN.StopApp( ApplicationName );
      EN.EndTest();
    }
    
    /*
    *  Post anlegen, speichern, ändern, löschen(?)
    * 
    * - Titel: anlegen, speichern, ändern, anzeige
    * - Titel: Löschen erlaubt(?)
    * - Inhalt: anlegen, speichern, ändern, anzeige
    * - Themenkategorien:
    * -- anlegen, speichern, ändern, anzeige, löschen. max 3 auswählbar
    * -- Anzeige anzahl Kategorien ausgewählt
    * -- Disablete kategorien wenn 3 erreicht.
    * - Tags:
    * -- anlegen, speichern, löschen, ändern, anzeige
    * -- xax 5 tags
    * -- Anzeige Anzahl Kategorien ausgewählt
    * -- Disablete kategorien wenn 5 erreicht.
    * 
    * - Stimmung: anlegen, speichern, löschen, ändern, anzeige
    * 
    * - Wir ein Beitrag unter meine Chronik gelistet?
    * 
    * - Sichtbarkeit
    * -- "Public" auch für andere sichtbar?
    * -- "Public" für ander sichtbar?
    * -- "Public" für Freunde sichtbar?
    * 
    * -- "Private" nur für mich sichtbar?
    * -- "Private" für ander nicht sichtbar?
    * -- "Private" für Freunde nicht sichtbar?
    * 
    * -- "Für Freunde"  nur für mich sichtbar?
    * -- "Für Freunde"  für andere nicht sichtbar?
    * -- "Für Freunde"  für Freunde sichtbar?
    * */

}
