package khaliliyoussef.musicalstructure.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

import khaliliyoussef.musicalstructure.R;
import khaliliyoussef.musicalstructure.adapter.SongAdapter;
import khaliliyoussef.musicalstructure.model.Song;

public class LibraryActivity extends AppCompatActivity {

        @Override
        protected void onCreate (Bundle savedInstanceState){
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_library);

            ArrayList<Song> songs = new ArrayList<Song>();
            songs.add(new Song("Song 1", "Artist 1", "Album 1"));
            songs.add(new Song("Song 2", "Artist 2", "Album 2"));
            songs.add(new Song("Song 3", "Artist 3", "Album 3"));
            songs.add(new Song("Song 4", "Artist 4", "Album 4"));

            SongAdapter adapter = new SongAdapter(this, songs);
            RecyclerView songList = (RecyclerView) findViewById(R.id.songList);
            songList.setAdapter(adapter);
        }

        @Override
        public boolean onCreateOptionsMenu (Menu menu){
            getMenuInflater().inflate(R.menu.menu_library_item, menu);
            return true;
        }

        @Override
        public boolean onOptionsItemSelected (MenuItem item)
        {
            switch (item.getItemId()) {
                case R.id.action_nav_song:
                    Intent intentSong = new Intent(LibraryActivity.this, SongActivity.class);
                    startActivity(intentSong);
                    return true;
                case R.id.action_nav_payment:
                    Intent intentPayment = new Intent(LibraryActivity.this, PaymentActivity.class);
                    startActivity(intentPayment);
                    return true;
            }
            return super.onOptionsItemSelected(item);
        }
    }
