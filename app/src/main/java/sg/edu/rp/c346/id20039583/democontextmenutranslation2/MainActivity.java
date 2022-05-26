package sg.edu.rp.c346.id20039583.democontextmenutranslation2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvTranslatedText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvTranslatedText = findViewById(R.id.tvTranslatedText);

        registerForContextMenu(tvTranslatedText);
    }


    String wordClicked ="";
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v,
                                    ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        menu.add(0,0,0,"English");
        menu.add(0,1,1,"Italian");

        if(v == tvTranslatedText){
            wordClicked = "hello";
        } else if(v == tvTranslatedText){
            wordClicked = "bye";

        }
    }
    @Override
    public boolean onContextItemSelected(MenuItem item) {
        if(item.getItemId()==0) { //check whether the selected menu item ID is 0
            //code for action
            tvTranslatedText.setText("Hello");


            return true; //menu item successfully handled
        }
        else if(item.getItemId()==1) { //check if the selected menu item ID is 1
            //code for action
            tvTranslatedText.setText("Addio");

            return true;  //menu item successfully handled
        }

        return super.onContextItemSelected(item); //pass menu item to the superclass implementation
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.

        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;

    }


    }

