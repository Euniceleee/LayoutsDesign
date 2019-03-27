package com.example.layoutsdesign;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

public class AbsoluteLayout extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_absolute);

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){

        getMenuInflater().inflate(R.menu.menu_layouts,menu);
        return  super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){

        int idMenu = item.getItemId();
        Intent innn = null;
        if (idMenu == R.id.linear)
        {
            innn = new Intent(this,MainActivityLinear.class);

        }
        else if (idMenu == R.id.relative)
        {
            return  true;
        }
        else if (idMenu == R.id.constraint)
        {
            innn = new Intent(this,MainActivityConstraint.class);
        }
        else if (idMenu == R.id.table)
        {
            innn = new Intent(this,TableLayout.class);
        }
        else if (idMenu == R.id.frame)
        {
            innn = new Intent(this,FrameLayout.class);
        }
        else if (idMenu == R.id.absolute)
        {
            innn = new Intent(this,AbsoluteLayout.class);
        }
        startActivity(innn);
        return true;
    }
}
