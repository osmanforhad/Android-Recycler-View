package developer.osmanforhad.recyclercardview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdaptar extends RecyclerView.Adapter<MyViewHolder> {

    //Define variable
    ArrayList<String> CityNames;
    Context c;

    public MyAdaptar(Context c, ArrayList<String> CityNames) {
        this.c = c;
        this.CityNames = CityNames;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //inflate the child view and pass into view holder
        View v = LayoutInflater.from(c).inflate(R.layout.rowlayout, parent, false);
        MyViewHolder VH = new MyViewHolder(v);
        return VH;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        //bind array inside the ViewHolder by array position
        holder.nameText.setText(CityNames.get(position));

        //setup click event in every item
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(c, CityNames.get(position), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return CityNames.size();
    }

}
