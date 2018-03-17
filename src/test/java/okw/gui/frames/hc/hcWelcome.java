package okw.gui.frames.hc;

import okw.OKW;
import okw.gui.adapter.selenium.*;
import okw.gui.container.hc.hcMainNavigation;

/**
 * @ingroup grouphcGuiFrames
 * Frame-Klasse representiert die 'Welcome - Human Connection'-Seite von 
 * [Human Connection](https://www.humanconnection.org/login)
 * 
 */
@OKW(FN = "HC Welcome")
public class hcWelcome extends SeBrowserChild
{

    /**
     * Kontainer-Klasse okw.gui.container.hc.hcHead - bindet den HC-Header auf dieser Seite ein.
     */
    public hcMainNavigation myHeader = new hcMainNavigation("", this.locator);
    
    public hcWelcome()
    {
        setLocator( "//title[text()='Welcome - Human Connection']/../.." );
    }    
}
