package kk.techbytecare.testfloatingtoolbar;

import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.github.rubensousa.floatingtoolbar.FloatingToolbar;

public class MainActivity extends AppCompatActivity  {

    FloatingActionButton fab;
    FloatingToolbar floatingToolbar;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fab = findViewById(R.id.fab);
        floatingToolbar = findViewById(R.id.floatingToolbar);
        toolbar = findViewById(R.id.toolbar);

        toolbar.setTitle(R.string.app_name);

        floatingToolbar.attachFab(fab);

        floatingToolbar.setClickListener(new FloatingToolbar.ItemClickListener() {
            @Override
            public void onItemClick(MenuItem item) {
                if (item.getItemId() == R.id.action_unread) {
                    Toast.makeText(MainActivity.this, "Action Unread Clicked", Toast.LENGTH_SHORT).show();
                }
                else if (item.getItemId() == R.id.action_copy) {
                    Toast.makeText(MainActivity.this, "Action Copy Clicked", Toast.LENGTH_SHORT).show();
                }
                else if (item.getItemId() == R.id.action_google) {
                    Toast.makeText(MainActivity.this, "Action Google Clicked", Toast.LENGTH_SHORT).show();
                }
                else if (item.getItemId() == R.id.action_facebook) {
                    Toast.makeText(MainActivity.this, "Action Facebook Clicked", Toast.LENGTH_SHORT).show();
                }
                else if (item.getItemId() == R.id.action_twitter) {
                    Toast.makeText(MainActivity.this, "Action Twitter Clicked", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onItemLongClick(MenuItem item) {
                if (item.getItemId() == R.id.action_unread) {
                    Snackbar snackbar = Snackbar.make(toolbar, "Action Unread Clicked",
                            Snackbar.LENGTH_INDEFINITE);
                    floatingToolbar.showSnackBar(snackbar);
                }
                else if (item.getItemId() == R.id.action_copy) {
                    Snackbar snackbar = Snackbar.make(toolbar, "Action Copy Clicked",
                            Snackbar.LENGTH_INDEFINITE);
                    floatingToolbar.showSnackBar(snackbar);
                }
                else if (item.getItemId() == R.id.action_google) {
                    Snackbar snackbar = Snackbar.make(toolbar, "Action Google Clicked",
                            Snackbar.LENGTH_INDEFINITE);
                    floatingToolbar.showSnackBar(snackbar);
                }
                else if (item.getItemId() == R.id.action_facebook) {
                    Snackbar snackbar = Snackbar.make(toolbar, "Action Facebook Clicked",
                            Snackbar.LENGTH_INDEFINITE);
                    floatingToolbar.showSnackBar(snackbar);
                }
                else if (item.getItemId() == R.id.action_twitter) {
                    Snackbar snackbar = Snackbar.make(toolbar, "Action Twitter Clicked",
                            Snackbar.LENGTH_INDEFINITE);
                    floatingToolbar.showSnackBar(snackbar);
                }
            }
        });
    }


}
