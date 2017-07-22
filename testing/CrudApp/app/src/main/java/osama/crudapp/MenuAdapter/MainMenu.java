package osama.crudapp.MenuAdapter;

import android.app.Activity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

import osama.crudapp.R;
import osama.crudapp.RecycleViewer.Country;

public class MainMenu{

    private LinearLayout rootLayout;
    private TextView txtPage;
    private ScrollerLinearLayout sideSlideLayout;
    private final String[] menuTitles = {"osama-1","osama-2","osama-3","osama-4","osama-5","osama-6"};
    private ListView listView;
    ArrayList<Country> items;


    public Activity activity;
//.... other attributes

    public MainMenu( Activity _activity){

        this.activity = _activity;
        init();
        setMenuButton();
        setListView();
        setContent(0);
    }


    public void method(){
    }

    private void init(){
        sideSlideLayout = (ScrollerLinearLayout) this.activity.findViewById(R.id.menu_content_side_slide_layout);
        rootLayout = (LinearLayout) this.activity.findViewById(R.id.menu_content_root);
        txtPage = (TextView) this.activity.findViewById(R.id.txt_page);
    }

    private void setMenuButton(){
        Button menuButton = (Button) this.activity.findViewById(R.id.main_tmp_button);
        menuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sideSlideLayout.scroll();
            }
        });
    }


    private void setListView() {

//        ArrayList<String> items = new ArrayList<String>();
        items = new ArrayList<>();

//        ArrayList<String> Menuitems = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
//            items.add(menuTitles[i]);
            items.add(new Country("osama" + i, i+100));
        }

        listView = (ListView) this.activity.findViewById(R.id.menu_content_menulist);
        listView.setFadingEdgeLength(0);

        MenuAdapter menuAdapter = new MenuAdapter(this.activity, items, this.activity);
        listView.setAdapter(menuAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
                                    long arg3) {
                // TODO Auto-generated method stub
                setContent(arg2);
                sideSlideLayout.scroll();
            }
        });
    }

    private void setContent(int position){
//        if(rootLayout.getChildCount() > 0)
//            rootLayout.removeAllViews();
        TextView tmpText = new TextView(this.activity);
        Country c = (Country) items.get(position);
        txtPage.setText(c.name);
//        tmpText.setText(c.name);
//        rootLayout.addView(tmpText);
    }
}
