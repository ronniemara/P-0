package net.africahomepage.ron.myappportfolio;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.ActionBar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private Button spotifyStreamer;
    private Button scoresApp;
    private Button libraryApp;
    private Button buildItBigger;
    private Button xyzReader;
    private Button myApp;

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



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void toastMessage(String message) {
        Toast.makeText(this, message , Toast.LENGTH_SHORT).show();
    }

    public void showMessage(View view) {

        switch (view.getId()) {
            case  R.id.spotify_streamer:
                toastMessage("This button will launch my Spotify Streamer app");
                break;
            case R.id.scores_app:
                toastMessage("This button will launch my Scores app");
                break;
            case R.id.library_app:
                toastMessage("This button will launch my Library app");
                break;
            case R.id.build_it_bigger:
                toastMessage("This button will launch my Build it bigger app");
                break;
            case R.id.xyz_reader:
                toastMessage("This button will launch my XYZ reader app");
                break;
            case R.id.my_app:
                toastMessage("This button will launch my capstone app");
                break;
        }

    }
}
