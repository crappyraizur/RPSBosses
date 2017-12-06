package com.pew.crappyraizur.rpsbosses;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MainMenu extends AppCompatActivity {

    Button singleplayer;
    Button multiplayer;
    Button about;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        singleplayer = (Button) findViewById(R.id.singleplayer);
        multiplayer = (Button) findViewById(R.id.multiplayer);
        about = (Button) findViewById(R.id.button7);

        singleplayer.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent menuToLevel = new Intent(MainMenu.this, LevelScreen.class);
                startActivity(menuToLevel);
            }
        });




    }

    public void storePreference(HashMap<String, String> parameters) {
        // Context context = this.SignUpPage;

        SharedPreferences.Editor editor =  getApplicationContext().getSharedPreferences("User", MODE_PRIVATE)
                .edit();
        Iterator<Map.Entry<String, String>> it = parameters.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> pairs = it.next();
            editor.putString((String) pairs.getKey(), (String) pairs.getValue());
        }
        editor.commit();
    }

    public  HashMap<String, String> getPreference(String[] keys) {
        SharedPreferences sharedPref = getSharedPreferences("User", MODE_PRIVATE);
        HashMap<String, String> parameters = new HashMap<String, String>();
        for (String key : keys) {
            parameters.put(key, sharedPref.getString(key, null));
        }
        return parameters;
    }
}
