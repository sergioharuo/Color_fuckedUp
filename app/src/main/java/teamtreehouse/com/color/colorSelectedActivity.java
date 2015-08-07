package teamtreehouse.com.color;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RelativeLayout;

import ColorBank.colorBank;
import teamtreehouse.com.color.R;

public class colorSelectedActivity extends Activity {

    public static final String TAG = colorSelectedActivity.class.getSimpleName();
    private String colorSelected;
    private String colorHex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color_selected);

        //view variables
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);

        Intent intent = getIntent();
        colorSelected = intent.getStringExtra("colorSelected");

        colorHex = "#" + colorSelected;
        int colorAsInt = Color.parseColor(colorHex);

        relativeLayout.setBackgroundColor(Color.parseColor(colorHex));

       // String temp = colorAsInt + "";

        Log.d(TAG,colorSelected);


    }



}
