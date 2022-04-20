package developer.osmanforhad.recyclercardview;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewHolder extends RecyclerView.ViewHolder {

    //Define variable
    TextView nameText;

    public MyViewHolder(@NonNull View itemView) {
        super(itemView);

        //Initial the variable and connect with xml ui id
        nameText = (TextView) itemView.findViewById(R.id.CityId);
    }
}
