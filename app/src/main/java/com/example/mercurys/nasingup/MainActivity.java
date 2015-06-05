package com.example.mercurys.nasingup;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;


public class MainActivity extends ActionBarActivity {
    ImageView nJAutoI;
    Bitmap nJPngtoBmp;
    Bitmap nJAutoNumber;
    int nJImageNumber;
    int nJChekckbox = 0;
    int[] nJAutoText = {9182, 7613, 8275, 5946, 7486, 1863, 6514, 2573, 7192, 5294, 8942, 3918, 4376, 1623, 6397, 5764, 3896, 8792, 1453, 3149, 3421, 8375, 8391, 1384, 1584};
    Random nRandom = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("회원가입 약관 ( 1 / 3 )");



        findViewById(R.id.nYakC).setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                if (nJChekckbox == 0)
                    nJChekckbox = 1;
                else
                    nJChekckbox = 0;
            }
        });

        nRandomImage();
    }

    public void nRandomImage() {
        nJImageNumber = nRandom.nextInt(25);
        nJAutoI = (ImageView) findViewById(R.id.nAutoI);

        Resources nRes = getResources();
        BitmapDrawable nBitmap = (BitmapDrawable) nRes.getDrawable(R.drawable.nautoimage_00 + nJImageNumber);
        nJAutoI.setImageDrawable(nBitmap);

        Toast.makeText(getApplicationContext(), Integer.toString(nJAutoText[R.drawable.nautoimage_00 - 2130837563 + nJImageNumber]), Toast.LENGTH_LONG).show();
        // Toast.makeText(getApplicationContext(), Integer.toString(R.drawable.nautoimage_00), Toast.LENGTH_LONG).show();
    }

    public void nRenewButton(View v)
    {
        nRandomImage();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            Intent nIntent = new Intent(this, layout2.class);
            startActivity(nIntent);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
