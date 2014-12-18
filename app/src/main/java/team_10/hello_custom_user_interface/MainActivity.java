package team_10.hello_custom_user_interface;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView phone = (ImageView) findViewById(R.id.phone);
        phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = new Toast(getBaseContext());
                toast = Toast.makeText(getApplicationContext(),"PHONE", Toast.LENGTH_SHORT);
                 toast.show();
            }
        });
        
        ImageView lock = (ImageView) findViewById(R.id.lock);
        lock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = new Toast(getBaseContext());
                toast = Toast.makeText(getApplicationContext(), "LOCKER", Toast.LENGTH_SHORT);
                toast.show();
            }
        });
        
        ImageView timer = (ImageView) findViewById(R.id.time);
        timer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = new Toast(getBaseContext());
                toast = Toast.makeText(getApplicationContext(),"TIMER", Toast.LENGTH_SHORT);
                toast.show();
            }
        });
        
        ImageView message = (ImageView) findViewById(R.id.message);
        message.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = new Toast(getBaseContext());
                toast = Toast.makeText(getApplicationContext(),"MESSAGE", Toast.LENGTH_SHORT);
                toast.show();
            }
        });
        
        ImageView camera = (ImageView) findViewById(R.id.camera);
        camera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = new Toast(getBaseContext());
                toast = Toast.makeText(getApplicationContext(),"CAMERA", Toast.LENGTH_SHORT);
                toast.show();
            }
        });
        
        ImageView browser = (ImageView) findViewById(R.id.browser);
        browser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = new Toast(getBaseContext());
                toast = Toast.makeText(getApplicationContext(),"BROWSER", Toast.LENGTH_SHORT);
                toast.show();
            }
        });
        
        ImageView music = (ImageView) findViewById(R.id.music);
        music.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = new Toast(getBaseContext());
                toast = Toast.makeText(getApplicationContext(),"MUSIC", Toast.LENGTH_SHORT);
                toast.show();
            }
        });
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
