package arshsingh93.funfacts;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class Display84Activity extends AppCompatActivity {

    private Button myBeforeButton;
    private Button myBattleButton;
    private Button myAfterButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display84);

        myBeforeButton = (Button) findViewById(R.id.beforeButton);
        myBeforeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Display84Activity.this, FunFactsActivity.class);
                intent.putExtra(getString(R.string.fact_type),"Before 84 Facts");
                startActivity(intent);
            }
        });

        myBattleButton = (Button) findViewById(R.id.battleButton);
        myBattleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Display84Activity.this, FunFactsActivity.class);
                intent.putExtra(getString(R.string.fact_type),"Battle of 84 Facts");
                startActivity(intent);
            }
        });

        myAfterButton = (Button) findViewById(R.id.afterButton);
        myAfterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Display84Activity.this, FunFactsActivity.class);
                intent.putExtra(getString(R.string.fact_type),"After 84 Facts");
                startActivity(intent);
            }
        });



    }




    //=======================================================================


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_display84, menu);
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
