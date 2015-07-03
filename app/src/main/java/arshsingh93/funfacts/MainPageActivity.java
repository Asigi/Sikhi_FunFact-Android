package arshsingh93.funfacts;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainPageActivity extends AppCompatActivity {

    private Button myGuruButton;
    private Button myEventsButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myGuruButton = (Button) findViewById(R.id.guruButton);
        myGuruButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startFacts("Guru Facts");
            }
        });

        myEventsButton = (Button) findViewById(R.id.eventsButton);
        myEventsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startFacts("Events");
            }
        });
    }

    /**
     * This method starts showing facts if the user wants facts on the Gurus.
     * It shows another screen page (activity) if the user wants facts on the events of 84.
     * @param theFactType is a string for the type of facts the user wants.
     */
    private void startFacts(String theFactType) {
        if (theFactType.equals("Guru Facts")) {
            Intent intent = new Intent(MainPageActivity.this, FunFactsActivity.class);
            intent.putExtra(getString(R.string.fact_type), theFactType);
            startActivity(intent);
        }
        if (theFactType.equals("Events")) {
            Intent intent = new Intent(MainPageActivity.this, Display84Activity.class);
            startActivity(intent);
        }
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
}
