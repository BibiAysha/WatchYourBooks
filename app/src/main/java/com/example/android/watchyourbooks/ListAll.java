package com.example.android.watchyourbooks;

import android.content.Intent;
import android.database.SQLException;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;

import java.io.IOException;


public class ListAll extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_all);
        //Create a cursor try {


    }
    public void OpenBrowser1(View view) {



        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://181.143.243.20/areas/ingles/talleres/The%20Fault%20In%20Our%20Stars.pdf"));
        startActivity(browserIntent);
    }

    public void OpenBrowser2(View view) {



        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=W0zljY9Tm78"));
        startActivity(browserIntent);
    }

    public void OpenBrowser3(View view) {



        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=9ItBvH5J6ss"));
        startActivity(browserIntent);
    }


    public void OpenBrowser4(View view) {



        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://yippiie.files.wordpress.com/2011/06/1-stephenie-meyer-twilight.pdf"));
        startActivity(browserIntent);
    }

    public void OpenBrowser5(View view)
    {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=euHGXlYrLNk"));
        startActivity(browserIntent);
    }

    public void OpenBrowser6(View view)
    {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=fFLrRlPBg0A"));
        startActivity(browserIntent);
    }

    public void OpenBrowser7(View view)
    {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://learningstorm.org/wp-content/uploads/2016/02/RMEOJLET-1.pdf"));
        startActivity(browserIntent);
    }

    public void OpenBrowser8(View view)
    {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=s2SSnOS47Twlist=PLEC31EA4F4858DC8F"));
        startActivity(browserIntent);
    }


    public void OpenBrowser9(View view)
    {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=jTGWNHa1wIQ"));
        startActivity(browserIntent);
    }

    public void OpenBrowser10(View view)
    {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.kkoworld.com/kitablar/Stefani_Mayer_Subh-eng.pdf"));
        startActivity(browserIntent);
    }

    public void OpenBrowser11(View view)
    {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=IkVaMYoRwaQ"));
        startActivity(browserIntent);
    }

    public void OpenBrowser12(View view)
    {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=gmKzwqQTqPw"));
        startActivity(browserIntent);
    }

    public void OpenBrowser13(View view)
    {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://english4success.ru/upload/books/1793.pdf"));
        startActivity(browserIntent);
    }


    public void OpenBrowser14(View view)
    {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=RVDwrZ4u3F4"));
        startActivity(browserIntent);
    }


    public void OpenBrowser15(View view)
    {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=Ym3LB0lOJ0o"));
        startActivity(browserIntent);
    }

    public void OpenBrowser16(View view)
    {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://onedrive.live.com/?authkey=%21AFGMhtH%5FFXSZPsw&cid=6BDB7A7C936A6917&id=6BDB7A7C936A6917%211477&parId=6BDB7A7C936A6917%21986&o=OneUp"));
        startActivity(browserIntent);
    }

    public void OpenBrowser17(View view)
    {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=xcpjSMmWUDw"));
        startActivity(browserIntent);
    }

    public void OpenBrowser18(View view)
    {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=-qhszFGf9kY"));
        startActivity(browserIntent);
    }


    public void OpenBrowser19(View view)
    {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://danbrown.com/wp-content/themes/danbrown/assets/db_AD_book_excerpts.pdf"));
        startActivity(browserIntent);
    }


    public void OpenBrowser20(View view)
    {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=4zq6iC02TCA"));
        startActivity(browserIntent);
    }

    public void OpenBrowser21(View view)
    {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=zzjv-GUEDfg"));
        startActivity(browserIntent);
    }


    public void OpenBrowser22(View view)
    {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://vk.com/doc14694589_409323573?hash=768318c7539ad51ac7dl=76b89356d41cd3763a"));
        startActivity(browserIntent);
    }


    public void OpenBrowser23(View view)
    {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=iDnzQK_Tg70"));
        startActivity(browserIntent);
    }

    public void OpenBrowser24(View view)
    {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=fE7gFnuYPHw"));
        startActivity(browserIntent);
    }


    public void OpenBrowser25(View view)
    {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://vk.com/doc219081570_410511545?hash=21e45515cf11a5d0b0dl=90b84fb8234e72df04"));
        startActivity(browserIntent);
    }


    public void OpenBrowser26(View view)
    {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=tPOORaiA1Qo"));
        startActivity(browserIntent);
    }


    public void OpenBrowser27(View view)
    {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=DqQe3OrsMKI"));
        startActivity(browserIntent);
    }


    public void OpenBrowser28(View view)
    {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://vk.com/doc14694589_346174893?hash=c6aa484476c51f915fdl=eb0548051914d97351"));
        startActivity(browserIntent);
    }

    public void OpenBrowser29(View view)
    {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=aUaNHjB1hy0"));
        startActivity(browserIntent);
    }

    public void OpenBrowser30(View view)
    {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=D2KpYlEfYdQ"));
        startActivity(browserIntent);
    }

    public void OpenBrowser31(View view)
    {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://izt.ciens.ucv.ve/ecologia/Archivos/Filosofia-II/Dune%201%20-%20Dune%20-%20Frank%20Herbert.pdf"));
        startActivity(browserIntent);
    }

    public void OpenBrowser32(View view)
    {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=NMnM1Qww2xs"));
        startActivity(browserIntent);
    }

    public void OpenBrowser33(View view)
    {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=KwPTIEWTYEI"));
        startActivity(browserIntent);
    }


    public void OpenBrowser34(View view)
    {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://marie4homer.weebly.com/uploads/1/3/0/0/13005660/shatter_me_-_tahereh_mafi.pdf"));
        startActivity(browserIntent);
    }

    public void OpenBrowser35(View view)
    {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=49tpIMDy9BE"));
        startActivity(browserIntent);
    }

    public void OpenBrowser36(View view)
    {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=oknTJheOXCY"));
        startActivity(browserIntent);
    }

    public void OpenBrowser37(View view)
    {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.scribd.com/doc/276884569/Vaughan-Brian-K-Staples-Fiona-2012-Saga-Vol-1-pdf"));
        startActivity(browserIntent);
    }
    public void OpenBrowser38(View view)
    {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=glXeCbFjh-o"));
        startActivity(browserIntent);
    }
    public void OpenBrowser39(View view)
    {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=xIqJCm7R9l8"));
        startActivity(browserIntent);
    }


    public void OpenBrowser40(View view)
    {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://bookpdfs.weebly.com/uploads/2/7/0/3/27039309/insurgent2.pdf"));
        startActivity(browserIntent);
    }
    public void OpenBrowser41(View view)
    {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=2jK60GOw5twlist=PL6OE0mCraZIFJPxSPWV3Rls41M402815o"));
        startActivity(browserIntent);
    }
    public void OpenBrowser42(View view)
    {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=suZcGoRLXkU"));
        startActivity(browserIntent);
    }

    public void OpenBrowser43(View view)
    {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://eienglish.org/crucible.pdf"));
        startActivity(browserIntent);
    }
    public void OpenBrowser44(View view)
    {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=NWaNW-aYhVYlist=PLJ8RkR3hN-sOzA5wIy0RMBoH_UzRh-nJv"));
        startActivity(browserIntent);
    }
    public void OpenBrowser45(View view)
    {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=iUIAxTxrnCc"));
        startActivity(browserIntent);
    }

    public void OpenBrowser46(View view)
    {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.thehazeleyacademy.com/wp-content/uploads/2014/07/IB-English-The-Kite-Runner-Full-Text.pdf"));
        startActivity(browserIntent);
    }
    public void OpenBrowser47(View view)
    {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=6ea8BBpLhyc"));
        startActivity(browserIntent);
    }

    public void OpenBrowser48(View view)
    {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=muW9Ob7V7ME"));
        startActivity(browserIntent);
    }

    public void OpenBrowser49(View view)
    {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://sparks.eserver.org/books/shakespeare-tempest.pdf"));
        startActivity(browserIntent);
    }
    public void OpenBrowser50(View view)
    {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=9oxp2_OOdvs"));
        startActivity(browserIntent);
    }
    public void OpenBrowser51(View view)
    {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=DDyGl2uIQ-Q"));
        startActivity(browserIntent);
    }


    public void OpenBrowser52(View view)
    {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://mthoyibi.files.wordpress.com/2011/05/antigone_2.pdf"));
        startActivity(browserIntent);
    }

    public void OpenBrowser53(View view)
    {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=aNND5Dys4pQ"));
        startActivity(browserIntent);
    }

    public void OpenBrowser54(View view)
    {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=pNjgRCOuQ88"));
        startActivity(browserIntent);
    }


    public void OpenBrowser55(View view)
    {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://vk.com/doc16932426_192537697?hash=dc4b61838972fe9c1ddl=a4ae144001b8881b80"));
        startActivity(browserIntent);
    }

    public void OpenBrowser56(View view)
    {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=eumh8_ZZZo0"));
        startActivity(browserIntent);
    }


    public void OpenBrowser57(View view)
    {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=HP4NxUFgFrs"));
        startActivity(browserIntent);
    }

    public void OpenBrowser58(View view)
    {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://archive.org/stream/RulesForRadicals/RulesForRadicals_djvu.txt"));
        startActivity(browserIntent);
    }

    public void OpenBrowser59(View view)
    {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=wq160PIYjHo"));
        startActivity(browserIntent);
    }

    public void OpenBrowser60(View view)
    {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.constitution.org/mac/prince.pdf"));
        startActivity(browserIntent);

    }

    public void OpenBrowser61(View view)
    {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=wtteBRZ6csg"));
        startActivity(browserIntent);
    }

    public void OpenBrowser62(View view)
    {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=XdZuyp6DpnI"));
        startActivity(browserIntent);
    }


    public void OpenBrowser63(View view)
    {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://7chan.org/lit/src/Kurt_Vonnegut_-_Slaughterhouse_Five.pdf"));
        startActivity(browserIntent);
    }

    public void OpenBrowser64(View view)
    {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=OixVPcCbcx0"));
        startActivity(browserIntent);
    }

    public void OpenBrowser65(View view)
    {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=3wWHTMAg-Bk"));
        startActivity(browserIntent);
    }



    public void OpenBrowser66(View view)
    {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.planetebook.com/ebooks/1984.pdf"));
        startActivity(browserIntent);
    }


    public void OpenBrowser67(View view)
    {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=1osVHtbSv44"));
        startActivity(browserIntent);
    }

    public void OpenBrowser68(View view)
    {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=Z4rBDUJTnNU"));
        startActivity(browserIntent);
    }

    public void OpenBrowser69(View view)
    {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.aaronswartzday.org/wp-content/uploads/2016/01/Understanding_Power_The_Indispensable_Chomsky.pdf"));
        startActivity(browserIntent);
    }
    public void OpenBrowser70(View view)
    {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=sO9cBXRcBvolist=PL_-ui04sEawG0dX1s39JWjXfHFQXFS6gG"));
        startActivity(browserIntent);
    }
    public void OpenBrowser71(View view)
    {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=7jy3UtlIfVk"));
        startActivity(browserIntent);
    }


    public void OpenBrowser72(View view)
    {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://geekynerd.cf/pdfs/notebook.pdf"));
        startActivity(browserIntent);
    }


    public void OpenBrowser73(View view)
    {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=JoZhcWlrM5M"));
        startActivity(browserIntent);
    }


    public void OpenBrowser74(View view)
    {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=4M7LIcH8C9U"));
        startActivity(browserIntent);
    }
}




