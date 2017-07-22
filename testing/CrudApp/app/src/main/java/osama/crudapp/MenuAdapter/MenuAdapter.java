package osama.crudapp.MenuAdapter;
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import osama.crudapp.R;
import osama.crudapp.RecycleViewer.Country;

public class MenuAdapter extends BaseAdapter {
    private Context context;
    private ArrayList<Country> items;
    private LayoutInflater inflater;


    public MenuAdapter(Context context, ArrayList<Country> items, Activity act) {
        this.context = context;
        this.items = items;
        this.inflater = LayoutInflater.from(context);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = inflater.inflate(R.layout.item_menu, null);
        TextView title = (TextView) convertView.findViewById(R.id.menu_title);
        title.setText(getItem(position));
        return convertView;
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public String getItem(int position) {
        Country c = (Country) items.get(position);
        return c.name;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

}