package me.mikewilliamson.portfolio;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {
    private Toast projectToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }


    public void handleProjectButtonClick(View view) {
        // When user clicks on a project display a toast
        Button b = (Button)view;
        String buttonText = b.getText().toString();

        Context context = getApplicationContext();
        CharSequence text = "This button will launch " + buttonText;
        int duration = Toast.LENGTH_SHORT;

        if (projectToast != null) projectToast.cancel();
        projectToast = Toast.makeText(context, text, duration);
        projectToast.show();
    }
}
