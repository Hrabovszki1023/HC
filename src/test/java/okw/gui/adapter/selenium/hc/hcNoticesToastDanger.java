package okw.gui.adapter.selenium.hc;

import okw.gui.OKWLocator;
import okw.gui.adapter.selenium.SeAnyChildWindow;

// <div class="notices is-top">
//     <div class="toast is-danger is-top" style="">
//         <div>Überprüfe Deine Zugangsdaten!</div>
//     </div>
// </div>
public class hcNoticesToastDanger extends SeAnyChildWindow
{

    public hcNoticesToastDanger( String Locator, OKWLocator... Locators )
    {
        super( Locator, Locators );
        // TODO Auto-generated constructor stub
    }
}
