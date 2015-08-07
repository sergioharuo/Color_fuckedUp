package teamtreehouse.com.color;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import ColorBank.colorBank;


public class mainActivity extends Activity {



    private Button mAzulButton;
    private Button mLaranjaButton;
    private Button mVerdeButton;
    private Button mEnviaCorButton;
    private EditText mSuaCorEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      mAzulButton = (Button)findViewById(R.id.azulButton);
      mLaranjaButton =(Button)findViewById(R.id.laranjaButton);
      mVerdeButton = (Button)findViewById(R.id.verdeButton);

      mEnviaCorButton = (Button)findViewById(R.id.SelecionaCorButton);
      mSuaCorEditText = (EditText)findViewById(R.id.suaCorEditText);

      mEnviaCorButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String color = mSuaCorEditText.getText().toString();
                hexSelected(color);
            }
        });

        mAzulButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                colorBank setBlue = new colorBank();
                String finallyBlue = setBlue.setSelectedColor();
                blueSelected(finallyBlue);

            }

        });

    }

    private void hexSelected(String color) {
        Intent intent = new Intent(this, colorSelectedActivity.class);
        intent.putExtra("colorSelected", color);
        startActivity(intent);
    }

    private void blueSelected(String colorBlue) {

       // color = "#3f3f3f";
        Intent intent = new Intent(this, blueColorActivity.class);
        intent.putExtra("BlueColorSelected", colorBlue);
        startActivity(intent);


    }

}
