package teamtreehouse.com.color;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RelativeLayout;
import android.widget.Toast;

import teamtreehouse.com.color.R;

public class blueColorActivity extends Activity {

   // public static final String TAG = blueColorActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blue_color);

        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.blueColorRelativeLayout);

         Intent intent = getIntent();
         String blueColorSelected = "#" +  intent.getStringExtra("BlueColorSelected");
         relativeLayout.setBackgroundColor(Color.parseColor(blueColorSelected));

       String avisoOff= blueColorSelected;
       Toast.makeText(blueColorActivity.this, avisoOff, Toast.LENGTH_LONG).show();
   //     Log.d(TAG, blueColorSelected);

    }


}




