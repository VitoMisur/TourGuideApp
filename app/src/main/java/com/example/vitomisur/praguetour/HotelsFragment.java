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
public class HotelsFragment extends Fragment {

    public HotelsFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.info_list, container, false);

        final ArrayList<Places> places = new ArrayList<>();

        places.add(new  Places(R.string.radison,R.string.info_radison,R.drawable.radissonbluealcron,R.string.web_radison,R.string.location_radison));
        places.add(new  Places(R.string.boskolo,R.string.info_boscolo,R.drawable.boscolo,R.string.web_boskolo,R.string.location_boscolo));
        places.add(new  Places(R.string.jalta,R.string.info_jalta,R.drawable.jalta,R.string.web_jalta,R.string.location_jalta));
        places.add(new  Places(R.string.hilton,R.string.info_hilton,R.drawable.hilton,R.string.web_hilton,R.string.location_hilton));
        places.add(new  Places(R.string.mosaic,R.string.info_mosaic,R.drawable.mosaichouse,R.string.web_mosaic,R.string.location_mosaic));
        places.add(new  Places(R.string.parkin,R.string.info_parkin,R.drawable.parkinn,R.string.web_parkin,R.string.location_parkin));
        places.add(new  Places(R.string.union,R.string.info_union,R.drawable.union,R.string.web_union,R.string.location_union));
        places.add(new  Places(R.string.matylda,R.string.info_matylda,R.drawable.matylda,R.string.web_matylda,R.string.location_matylda));
        places.add(new  Places(R.string.claris,R.string.info_claris,R.drawable.claris,R.string.web_claris,R.string.location_claris));
        places.add(new  Places(R.string.andel,R.string.info_andel,R.drawable.hotelandel,R.string.web_andel,R.string.location_andel));

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
