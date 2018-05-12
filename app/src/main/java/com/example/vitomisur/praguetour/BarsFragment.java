package com.example.vitomisur.praguetour;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class BarsFragment extends Fragment {

    public BarsFragment() {
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.info_list, container, false);
        // creating an arraylist of places "bars"
        final ArrayList<Places> places = new ArrayList<>();
        // fill in the arraylist with data
        places.add(new  Places(R.string.nhb,R.string.info_nhb,R.drawable.nightmarehorrorbar,R.string.web_nhb,R.string.location_nhb));
        places.add(new  Places(R.string.balcony,R.string.info_balcony,R.drawable.balconybar,R.string.web_balcony,R.string.location_balcony));
        places.add(new  Places(R.string.pbmus,R.string.info_pbmus,R.drawable.beermuseum,R.string.web_pbmus,R.string.location_pbmus));
        places.add(new  Places(R.string.cdaisy,R.string.info_cdaisy,R.drawable.crazydaisy,R.string.web_cdaisy,R.string.location_cdaisy));
        places.add(new  Places(R.string.vinyl,R.string.info_vinyl,R.drawable.vinyl,R.string.web_vinyl,R.string.location_vinyl));
        places.add(new  Places(R.string.jazzrep,R.string.info_jazzrep,R.drawable.jazzrepublic,R.string.web_jazzrep,R.string.location_jazzrep));
        places.add(new  Places(R.string.dmonkey,R.string.info_dmonkey,R.drawable.drunkenmonkey,R.string.web_dmonkey,R.string.location_dmonkey));
        places.add(new  Places(R.string.bourbon,R.string.info_bourbon,R.drawable.bourbonbar,R.string.web_bourbon,R.string.location_bourbon));
        places.add(new  Places(R.string.hangar,R.string.info_hangar,R.drawable.hangarbar,R.string.web_hangar,R.string.location_hangar));
        places.add(new  Places(R.string.dejavu,R.string.info_dejavu,R.drawable.dejavu,R.string.web_dejavu,R.string.location_dejavu));

        //setting the adapter to the this fragment
        PlacesAdapter adapter = new PlacesAdapter(getActivity(), places, R.color.colorLists);

        //get&set listview
        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);
        // set intent for web on click
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                String place = getString(places.get(position).getWeb());
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(place));
                startActivity(i);
            }
        });
        return rootView;
    }
}
