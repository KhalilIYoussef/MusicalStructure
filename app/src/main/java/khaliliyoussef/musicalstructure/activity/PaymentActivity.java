package khaliliyoussef.musicalstructure.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

import khaliliyoussef.musicalstructure.R;

public class PaymentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.action_nav_song:
                Intent intentSong = new Intent(PaymentActivity.this, SongActivity.class);
                startActivity(intentSong);
                return true;
            case R.id.action_nav_library:
                Intent intentLibrary = new Intent(PaymentActivity.this, LibraryActivity.class);
                startActivity(intentLibrary);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_payment_item, menu);
        return true;
    }
}
