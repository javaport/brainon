package mistcoder.com.brainon;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.ShareActionProvider;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

import com.google.android.gms.common.api.GoogleApiClient;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {
    private ShareActionProvider mShareActionProvider;

    private Intent mShareIntent;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MobileAds.initialize(getApplicationContext(), "ca-app-pub-3495910937090990/6178903930");

        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);


    }



    public void mess(View v) {



        ImageView im = (ImageView) findViewById(R.id.imageView1);
        //get clicked button id from view object
        switch (v.getId()) {
            case R.id.button1:
                //if button1 is clicked than set image1
                im.setImageResource(R.drawable.brainon);
                break;
            case R.id.button2:
                //if button2 is clicked than set image2
                im.setImageResource(R.drawable.brainoff);
                break;
        }
    }





}