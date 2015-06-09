package udacitylauncher.standardandroid.com.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button spotifyButton = (Button)findViewById(R.id.buttonSpotify);
        Button scoresButton = (Button)findViewById(R.id.buttonScores);
        Button libraryButton = (Button)findViewById(R.id.buttonLibrary);
        Button biggerButton = (Button)findViewById(R.id.buttonBigger);
        Button xyzreaderButton = (Button)findViewById(R.id.buttonXYZReader);
        Button capstoneButton = (Button)findViewById(R.id.buttonCapstone);

        spotifyButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(MainActivity.this, getString(R.string.title_spotify), Toast.LENGTH_SHORT).show();
            }
        });

        scoresButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(MainActivity.this, getString(R.string.title_scores), Toast.LENGTH_SHORT).show();
            }
        });


        libraryButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(MainActivity.this, getString(R.string.title_library), Toast.LENGTH_SHORT).show();
            }
        });


        biggerButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(MainActivity.this, getString(R.string.title_bigger), Toast.LENGTH_SHORT).show();
            }
        });

        xyzreaderButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(MainActivity.this, getString(R.string.title_xyzreader), Toast.LENGTH_SHORT).show();
            }
        });

        capstoneButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(MainActivity.this, getString(R.string.title_capstone), Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings)
        {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
