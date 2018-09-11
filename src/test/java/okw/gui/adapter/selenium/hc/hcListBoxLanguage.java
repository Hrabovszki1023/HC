package okw.gui.adapter.selenium.hc;


import java.util.ArrayList;

import okw.gui.OKWLocator;
import okw.gui.adapter.selenium.SeLink;
import okw.gui.adapter.selenium.SeSelect;

public class hcListBoxLanguage extends SeSelect
{

    SeLink SelectLanguage = null;
    
    public void Select( ArrayList<String> fps_Values )
    {
        SelectLanguage.getLOCATOR().setLocator( "");
    }
    
    public hcListBoxLanguage( String Locator, OKWLocator... Locators )
    {
        super( Locator, Locators );
        // TODO Auto-generated constructor stub
    }
}
