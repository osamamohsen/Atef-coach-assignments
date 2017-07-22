package osama.crudapp.RecycleViewer;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import osama.crudapp.R;

public class CountryAdapter extends
        RecyclerView.Adapter<CountryAdapter.MyViewHolder> {

    private List<Country> countryList;

    /**
     * View holder class
     * */
    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView countryText;
        public TextView popText;

        public MyViewHolder(View view) {
            super(view);
            countryText = (TextView) view.findViewById(R.id.countryName);
            popText = (TextView) view.findViewById(R.id.pop);
        }
    }

    public CountryAdapter(List<Country> countryList) {
        this.countryList = countryList;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Country c = countryList.get(position);
        holder.countryText.setText(c.name);
        holder.popText.setText(String.valueOf(c.population));
    }

    @Override
    public int getItemCount() {
        return countryList.size();
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_recycle,parent, false);
        return new MyViewHolder(v);
    }
}