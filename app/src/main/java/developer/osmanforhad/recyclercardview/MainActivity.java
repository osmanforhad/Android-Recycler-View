package developer.osmanforhad.recyclercardview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    //define variable and assign value
    ArrayList<String> CityNames = new ArrayList<>(Arrays.asList("Dhaka", "Chittagong",
            "Rajshahi", "Rangpur", "Sylhet", "Barishal", "Cumilla", "Dinajpur", "Jessor", "Khulna",
            "Kurigram", "Thakurgaon", "Lalmonirhat", "BagerHat", "Rangamati", "CoxsBazar"));

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //find Recycler View or connect XML RecyclerView View with Main Activity
        RecyclerView RV = (RecyclerView) findViewById(R.id.recyclerViewId);
        //create LinearLayout instance for RecyclerView
        RV.setLayoutManager(new LinearLayoutManager(this));

        //create object for adapter and pass array value for Recycler View
        MyAdaptar adapt = new MyAdaptar(this, CityNames);
        //connect adapter with Recycler View
        RV.setAdapter(adapt);

    }
}