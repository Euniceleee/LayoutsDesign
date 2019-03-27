package com.example.layoutsdesign;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

public class MainActivityConstraint extends AppCompatActivity {


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){

        getMenuInflater().inflate(R.menu.menu_layouts,menu);
        return  super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){

        int idMenu = item.getItemId();
        Intent inn = null;
        if (idMenu == R.id.linear)
        {
            inn = new Intent(this,MainActivityLinear.class);

        }
        else if (idMenu == R.id.relative)
        {
            return  true;
        }
        else if (idMenu == R.id.constraint)
        {
            inn = new Intent(this,MainActivityConstraint.class);
        }
        else if (idMenu == R.id.table)
        {
            inn = new Intent(this,TableLayout.class);
        }
        else if (idMenu == R.id.frame)
        {
            inn = new Intent(this,FrameLayout.class);
        }
        else if (idMenu == R.id.absolute)
        {
            inn = new Intent(this,AbsoluteLayout.class);
        }
        startActivity(inn);
        return true;
    }
}
