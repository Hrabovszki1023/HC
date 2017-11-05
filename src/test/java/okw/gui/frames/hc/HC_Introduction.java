package okw.gui.frames.hc;

import okw.OKW;
import okw.gui.adapter.selenium.SeBrowserChild;
import okw.gui.adapter.selenium.hc.hcButtonWithCountLabel;
import okw.gui.adapter.selenium.hc.hcEmoji;

/**
 * @ingroup grouphcGuiFrames 
 */
@OKW(FN = "HC Introduction")
public class HC_Introduction extends SeBrowserChild
{
    @OKW( FN = "HC Emoji Beispiel 1",
            VerifyLabel_PT=500, VerifyLabel_TO=1,
            VerifyIsActive_PT=500, VerifyIsActive_TO=1,
            VerifyValue_PT=500, VerifyValue_TO=1,
            VerifyTooltip_PT=500, VerifyTooltip_TO=1,
            VerifyCaption_PT=500, VerifyCaption_TO=1,
            VerifyExists_PT=500, VerifyExists_TO=1,
            VerifyHasFocus_PT=500, VerifyHasFocus_TO=1
             )
    
    public hcEmoji HCEmojiSample_1 = new hcEmoji( "//h3[text()=\"Emoji\"]/..//img[1]" );

    @OKW( FN = "HC Emoji Beispiel 2",
                    VerifyLabel_PT=500, VerifyLabel_TO=1,
                    VerifyIsActive_PT=500, VerifyIsActive_TO=1,
                    VerifyValue_PT=500, VerifyValue_TO=1,
                    VerifyTooltip_PT=500, VerifyTooltip_TO=1,
                    VerifyCaption_PT=500, VerifyCaption_TO=1,
                    VerifyExists_PT=500, VerifyExists_TO=1,
                    VerifyHasFocus_PT=500, VerifyHasFocus_TO=1
                     )
    public hcEmoji HCEmojiSample_2 = new hcEmoji( "//h3[text()=\"Emoji\"]/..//img[2]" );

    @OKW( FN = "HC Emoji Beispiel 3",
                    VerifyLabel_PT=500, VerifyLabel_TO=1,
                    VerifyIsActive_PT=500, VerifyIsActive_TO=1,
                    VerifyValue_PT=500, VerifyValue_TO=1,
                    VerifyTooltip_PT=500, VerifyTooltip_TO=1,
                    VerifyCaption_PT=500, VerifyCaption_TO=1,
                    VerifyExists_PT=500, VerifyExists_TO=1,
                    VerifyHasFocus_PT=500, VerifyHasFocus_TO=1
                     )
    public hcEmoji HCEmojiSample_3 = new hcEmoji( "//h3[text()=\"Emoji\"]/..//img[3]" );


    @OKW( FN = "HC Emoji Beispiel 4",
                    VerifyLabel_PT=500, VerifyLabel_TO=1,
                    VerifyIsActive_PT=500, VerifyIsActive_TO=1,
                    VerifyValue_PT=500, VerifyValue_TO=1,
                    VerifyTooltip_PT=500, VerifyTooltip_TO=1,
                    VerifyCaption_PT=500, VerifyCaption_TO=1,
                    VerifyExists_PT=500, VerifyExists_TO=1,
                    VerifyHasFocus_PT=500, VerifyHasFocus_TO=1
                     )
    public hcEmoji HCEmojiSample_4 = new hcEmoji( "//h3[text()=\"Emoji\"]/..//img[4]" );

    @OKW( FN = "HC Emoji Beispiel 5",
                    VerifyLabel_PT=500, VerifyLabel_TO=1,
                    VerifyIsActive_PT=500, VerifyIsActive_TO=1,
                    VerifyValue_PT=500, VerifyValue_TO=1,
                    VerifyTooltip_PT=500, VerifyTooltip_TO=1,
                    VerifyCaption_PT=500, VerifyCaption_TO=1,
                    VerifyExists_PT=500, VerifyExists_TO=1,
                    VerifyHasFocus_PT=500, VerifyHasFocus_TO=1
                     )
    public hcEmoji HCEmojiSample_5 = new hcEmoji( "//h3[text()=\"Emoji\"]/..//img[5]" );

    @OKW( FN = "HC Count Label",
                    VerifyLabel_PT=500, VerifyLabel_TO=1,
                    VerifyIsActive_PT=500, VerifyIsActive_TO=1,
                    VerifyValue_PT=500, VerifyValue_TO=1,
                    VerifyTooltip_PT=500, VerifyTooltip_TO=1,
                    VerifyCaption_PT=500, VerifyCaption_TO=1,
                    VerifyExists_PT=500, VerifyExists_TO=1,
                    VerifyHasFocus_PT=500, VerifyHasFocus_TO=1
                     )
    public hcButtonWithCountLabel HCCountLabel = new hcButtonWithCountLabel( "//h3//a[text()=\"hc-count-label\"]/../../..//button[@class=\"button is-primary\"]" );
    
    
    public HC_Introduction()
    {
        setLocator( "//title[text()='HC Style Guide']/../.." );
    }
}
