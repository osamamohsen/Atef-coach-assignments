package osama.crudapp;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;

import osama.crudapp.Fragment.FirstFragment;
import osama.crudapp.MenuAdapter.MainMenu;
import osama.crudapp.RecycleViewer.Country;
import osama.crudapp.RecycleViewer.CountryAdapter;

public class MainActivity extends AppCompatActivity {

    ArrayList<Country> countryList;
    FragmentPagerAdapter adapterViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new MainMenu(this); //MENU


        RecyclerView rv = (RecyclerView) findViewById(R.id.recycler_view);
        rv.setSystemUiVisibility(View.GONE);
        build_country();
        CountryAdapter ca = new CountryAdapter(countryList);
        rv.setAdapter(ca);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        rv.setLayoutManager(llm);
        final ViewPager vpPager = (ViewPager) findViewById(R.id.vpPager);
        adapterViewPager = new MyPagerAdapter(getSupportFragmentManager());
        vpPager.setAdapter(adapterViewPager);//wait kda 3lshan ana shamem re7et 8lt :D
       // vpPager.setOffscreenPageLimit(2); hwa bykrash amta ?
        vpPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {

            // This method will be invoked when a new page becomes selected.
            @Override
            public void onPageSelected(int position) {

            }
//tb astna hbos 3la alcode kwyes
            // This method will be invoked when the current page is scrolled
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
//mmken n3ml run 3la emilator aw bos ab3tle alapk fh prnamg asmo apk extractor ab3t b2a abos 3leha n3m ?tmam
                //tmam
                //al apk mesh hyst8al 3ndy ghazy mesh rady ysh8lo 3lshan mesh secure ///mt3rfsh tsh8al al emilator

                //l2 ya 3m ana 3aref hwa ana hway :D//ana 3ayz abos 3la kam 7aga kda

            }

            // Called when the scroll state changes:
            // SCROLL_STATE_IDLE, SCROLL_STATE_DRAGGING, SCROLL_STATE_SETTLING
            @Override
            public void onPageScrollStateChanged(int state) {
                // Code goes here
                //lesa byrash ?
//                vpPager.setCurrentItem(state);
            }
        });

        //5odle scree s aha ab3t 3la qaalface fe al8aleb anta mkmltesh alcode

    }



    public void build_country(){
        countryList = new ArrayList<>();
        for(int i = 0; i < 50 ; i++){
            countryList.add(new Country("Countery "+i,i+1000));
        }//os>  m3aya ? alsot bywshwesh rg3 albta3a aly fo2 aly anta l3bt feha fe al ubonto
        //kda tmam gedn

    }

    public static class MyPagerAdapter extends FragmentPagerAdapter {
        private static int NUM_ITEMS = 3;

        public MyPagerAdapter(FragmentManager fragmentManager) {
            super(fragmentManager);
        }


        // Returns total number of pages
        @Override
        public int getCount() {
            return NUM_ITEMS;
        }

        // Returns the fragment to display for that page
        @Override
        public android.support.v4.app.Fragment getItem(int position) {

            switch (position) {
                //anta b al f3l bt3ml kda hena
                //sorry anta hena gwa al adapter
                case 0: // Fragment # 0 - This will show FirstFragment
                    return FirstFragment.newInstance(0, "Page # 1");
                case 1: // Fragment # 0 - This will show FirstFragment different title
                    return FirstFragment.newInstance(1, "Page # 2");
               case 2:
                  return FirstFragment.newInstance(1, "Page # 3");
                default:
                    return null;
            }
        }

        // Returns the page title for the top indicator
        @Override
        public CharSequence getPageTitle(int position) {
            return "Page " + position;
        }

    }

}