package com.example.layoutsdesign;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivityRelative extends AppCompatActivity {
    ImageView imageViewRelative;
    TextView textViewRelative;

    protected void OnCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative);
        imageViewRelative = findViewById(R.id.imgVwRel);
        textViewRelative = findViewById(R.id.txtVwRel);
    }

    public void fnChangeRelative(View view) {

        RelativeLayout.LayoutParams params = (RelativeLayout.LayoutParams) imageViewRelative.getLayoutParams();
        params.addRule(RelativeLayout.BELOW, R.id.txtVwRel);
        imageViewRelative.setLayoutParams(params);

        RelativeLayout.LayoutParams paramTxtVw = (RelativeLayout.LayoutParams) textViewRelative.getLayoutParams();
        paramTxtVw.addRule(RelativeLayout.BELOW, R.id.btnRel);
        textViewRelative.setLayoutParams(paramTxtVw);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){

        getMenuInflater().inflate(R.menu.menu_layouts,menu);
        return  super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){

        int idMenu = item.getItemId();
        Intent intent = null;
        if (idMenu == R.id.linear)
        {
            intent = new Intent(this,MainActivityLinear.class);

        }
        else if (idMenu == R.id.relative)
        {
            return  true;
        }
        else if (idMenu == R.id.constraint)
        {
            intent = new Intent(this,MainActivityConstraint.class);
        }
        else if (idMenu == R.id.table)
        {
            intent = new Intent(this,TableLayout.class);
        }
        else if (idMenu == R.id.frame)
        {
            intent = new Intent(this,FrameLayout.class);
        }
        else if (idMenu == R.id.absolute)
        {
            intent = new Intent(this,AbsoluteLayout.class);
        }
        startActivity(intent);
        return true;
    }
}
