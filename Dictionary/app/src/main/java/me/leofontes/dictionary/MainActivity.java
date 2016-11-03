package me.leofontes.dictionary;

import android.content.ContentResolver;
import android.database.Cursor;
import android.provider.UserDictionary;
import android.support.v4.widget.SimpleCursorAdapter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    protected static final String TAG = "TEST";
    protected static final String[] COLUMS_TO_BE_BOUND = new String[]{
            UserDictionary.Words.WORD,
            UserDictionary.Words.FREQUENCY
    };
    protected static final int[] LAYOUT_ITEMS_TO_FILL = new int[] {
            android.R.id.text1,
            android.R.id.text2
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = (ListView) findViewById(R.id.dictionary_list_view);
        // Get the ContentResolver which will send a message to the ContentProvider
        ContentResolver resolver = getContentResolver();

        // Get a Cursor containing all of the rows in the Words table
        Cursor cursor = resolver.query(UserDictionary.Words.CONTENT_URI, null, null, null, null);

        SimpleCursorAdapter sca = new SimpleCursorAdapter(this,
                android.R.layout.two_line_list_item,
                cursor,
                COLUMS_TO_BE_BOUND,
                LAYOUT_ITEMS_TO_FILL,
                0);

        listView.setAdapter(sca);

    }
}
