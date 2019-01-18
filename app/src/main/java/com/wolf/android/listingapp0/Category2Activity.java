package com.wolf.android.listingapp0;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Category2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category2);

        ArrayList<Category2> music = new ArrayList<Category2>();
        music.add(new Category2(R.drawable.gunna, "Gunna"));
        music.add(new Category2(R.drawable.cardi,"Cardi B"));
        music.add(new Category2(R.drawable.drake,"Drake"));
        music.add(new Category2(R.drawable.beyonce, "Beyonce"));
        music.add(new Category2(R.drawable.travis,"Travis Scott"));
        music.add(new Category2(R.drawable.rihanna,"Rihanna"));
        music.add(new Category2(R.drawable.cudi,"KiD CuDi"));
        music.add(new Category2(R.drawable.gucci,"Gucci Mane"));
        music.add(new Category2(R.drawable.migos,"Migos"));
        music.add(new Category2(R.drawable.uzi,"Lil Uzi Vert"));

        Category2Adapter musicAdapter = new Category2Adapter(this, music);

        ListView listView = findViewById(R.id.category2_list_view);

        listView.setAdapter(musicAdapter);
    }
}
