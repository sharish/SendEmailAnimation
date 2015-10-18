package com.cooltechworks.envelopeanimation;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.RelativeLayout;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private static final int EMAIL_ACTIVITY_REQUEST = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_main);


        findViewById(R.id.show_dialog_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent =new Intent(MainActivity.this, EnvelopeActivity.class);
                startActivityForResult(intent, EMAIL_ACTIVITY_REQUEST);
            }
        });


    }

    public void onActivityResult(int requestCode, int resultCode, Intent data) {

        if(requestCode == EMAIL_ACTIVITY_REQUEST && resultCode == RESULT_OK) {

            String[] to = data.getStringArrayExtra(Intent.EXTRA_EMAIL);
            String subject = data.getStringExtra(Intent.EXTRA_SUBJECT);
            String msg = data.getStringExtra(Intent.EXTRA_TEXT);

            Log.d(MainActivity.class.getSimpleName(),"To:"+to[0]);
            Log.d(MainActivity.class.getSimpleName(),"Subject:"+subject);
            Log.d(MainActivity.class.getSimpleName(),"Msg:"+msg);

            //TODO: Use your own api to send out email for the above params.

        }

    }

}
