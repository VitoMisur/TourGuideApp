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
public class RestaurantsFragment extends Fragment {

    public RestaurantsFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.info_list, container, false);

        final ArrayList<Places> places = new ArrayList<>();

        places.add(new  Places(R.string.grosso,R.string.info_grosso,R.drawable.gamberorosso,R.string.web_grosso,R.string.location_grosso));
        places.add(new  Places(R.string.vegans,R.string.info_vegans,R.drawable.vegansprague,R.string.web_vegans,R.string.location_vegans));
        places.add(new  Places(R.string.lqila,R.string.info_lqila,R.drawable.lalqila,R.string.web_lqila,R.string.location_lqila));
        places.add(new  Places(R.string.jdean,R.string.info_jdean,R.drawable.jamesdean,R.string.web_jdean,R.string.location_jdean));
        places.add(new  Places(R.string.hrc,R.string.info_hrc,R.drawable.hardrock,R.string.web_hrc,R.string.location_hrc));
        places.add(new  Places(R.string.sapori,R.string.info_sapori,R.drawable.sapori,R.string.web_sapori,R.string.location_sapori));
        places.add(new  Places(R.string.nuance,R.string.info_nuance,R.drawable.nuance,R.string.web_nuance,R.string.location_nuance));
        places.add(new  Places(R.string.smaru,R.string.info_smaru,R.drawable.sushimaru,R.string.web_smaru,R.string.location_smaru));
        places.add(new  Places(R.string.oprague,R.string.info_oprague,R.drawable.oldprague,R.string.web_oprague,R.string.location_oprague));
        places.add(new  Places(R.string.umk,R.string.info_umk,R.drawable.umodrekachnicky,R.string.web_umk,R.string.location_umk));
        places.add(new  Places(R.string.fosil,R.string.info_fosil,R.drawable.fosil,R.string.web_fosil,R.string.location_fosil));

        PlacesAdapter adapter = new PlacesAdapter(getActivity(), places, R.color.colorLists);

        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

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
