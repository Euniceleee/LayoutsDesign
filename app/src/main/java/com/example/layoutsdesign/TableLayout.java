package com.example.layoutsdesign;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

public class TableLayout extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table);

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){

        getMenuInflater().inflate(R.menu.menu_layouts,menu);
        return  super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){

        int idMenu = item.getItemId();
        Intent a = null;
        if (idMenu == R.id.linear)
        {
            a = new Intent(this,MainActivityLinear.class);

        }
        else if (idMenu == R.id.relative)
        {
            return  true;
        }
        else if (idMenu == R.id.constraint)
        {
            a = new Intent(this,MainActivityConstraint.class);
        }
        else if (idMenu == R.id.table)
        {
            a = new Intent(this,TableLayout.class);
        }
        else if (idMenu == R.id.frame)
        {
            a = new Intent(this,FrameLayout.class);
        }
        else if (idMenu == R.id.absolute)
        {
            a = new Intent(this,AbsoluteLayout.class);
        }
        startActivity(a);
        return true;
    }

}
