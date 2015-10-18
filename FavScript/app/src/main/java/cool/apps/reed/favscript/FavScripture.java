package cool.apps.reed.favscript;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class FavScripture extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fav_scripture);

        TextView favScriptReceived = (TextView)findViewById(R.id.favScriptReceived);

        // catch the bundle of scriptures
        Bundle bundle = getIntent().getExtras();

        // ensure that we receive the bundle
        if (bundle != null) {

            // separate each part of the bundle for displaying
            String book = bundle.getString("keyBook");
            int chapter = bundle.getInt("keyChap");
            String verse   = bundle.getString("keyVerse");

            favScriptReceived.setText("Your favorite scripture is:\n" + book + " " + chapter + ":" + verse);
        }
    }
}
