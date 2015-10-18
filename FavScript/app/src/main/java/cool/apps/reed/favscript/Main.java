package cool.apps.reed.favscript;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.support.v7.app.AppCompatActivity;

public class Main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // constant variables so that what is type in by the user doesn't change
        final EditText etBook = (EditText)findViewById(R.id.book);
        final EditText etChap = (EditText)findViewById(R.id.chapter);
        final EditText etVerse = (EditText)findViewById(R.id.verse);

        Button btnShareFav = (Button)findViewById(R.id.shareFav);

        /**
         * When the "Share" button is pressed, the book, chapter, and verse will be sent
         * to the FavScripture page for display
         * **/
        btnShareFav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // send the book
                Intent intent = new Intent(getApplicationContext(), FavScripture.class);
                intent.putExtra("keyBook", etBook.getText().toString());

                // sent the chapter
                int chapter = Integer.parseInt(etChap.getText().toString());
                intent.putExtra("keyChap", chapter);

                // send the verse
                intent.putExtra("keyVerse", etVerse.getText().toString());

                startActivity(intent);
            }
        });
    }
}
