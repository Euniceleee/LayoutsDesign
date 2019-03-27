package com.example.layoutsdesign;

import android.app.AppComponentFactory;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;


public class MainActivityLinear extends AppCompatActivity {
    LinearLayout linearLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear);

        linearLayout = findViewById(R.id.layoutLinear);
    }
    public void fnChangeOrientation(View view){

        linearLayout.setOrientation(LinearLayout.VERTICAL);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){

        getMenuInflater().inflate(R.menu.menu_layouts,menu);
        return  super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){

        int idMenu = item.getItemId();
        Intent in = null;
        if (idMenu == R.id.linear)
        {
            in = new Intent(this,MainActivityLinear.class);

        }
        else if (idMenu == R.id.relative)
        {
            return  true;
        }
        else if (idMenu == R.id.constraint)
        {
            in = new Intent(this,MainActivityConstraint.class);
        }
        else if (idMenu == R.id.table)
        {
            in = new Intent(this,TableLayout.class);
        }
        else if (idMenu == R.id.frame)
        {
            in = new Intent(this,FrameLayout.class);
        }
        else if (idMenu == R.id.absolute)
        {
            in = new Intent(this,AbsoluteLayout.class);
        }
        startActivity(in);
        return true;
    }
}
