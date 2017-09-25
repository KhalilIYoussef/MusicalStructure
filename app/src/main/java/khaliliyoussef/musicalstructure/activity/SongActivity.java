package khaliliyoussef.musicalstructure.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import khaliliyoussef.musicalstructure.R;

public class SongActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song);

        ImageButton buttonPrevious = (ImageButton) findViewById(R.id.songLast);

        buttonPrevious.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), "Play last song", Toast.LENGTH_SHORT).show();
            }
        });

        ImageButton buttonPlay = (ImageButton) findViewById(R.id.songPlay);

        buttonPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(v.getContext(), "Play or pause song", Toast.LENGTH_SHORT).show();
            }
        });
        ImageButton buttonNext = (ImageButton) findViewById(R.id.songNext);

        buttonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(v.getContext(), "Play the next song", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_song_item, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.action_nav_library :
                Intent intentLibrary = new Intent(SongActivity.this, LibraryActivity.class);
                startActivity(intentLibrary);
                return true;
            case R.id.action_nav_payment:
                Intent intentPayment = new Intent(SongActivity.this, PaymentActivity.class);
                startActivity(intentPayment);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
