package developer.osmanforhad.recyclercardview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //find Recycler View or connect XML RecyclerView View with Main Activity
        RecyclerView RV = (RecyclerView) findViewById(R.id.recyclerViewId);
        //create LinearLayout instance for RecyclerView
        RV.setLayoutManager(new LinearLayoutManager(this));

    }
}