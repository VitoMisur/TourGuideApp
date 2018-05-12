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
public class SightseeingFragment extends Fragment {

    public SightseeingFragment() {
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.info_list, container, false);

        final ArrayList<Places> places = new ArrayList<>();

        places.add(new  Places(R.string.phrad,R.string.year_phrad,R.drawable.prazskyhrad,R.string.web_phrad,R.string.location_phrad));
        places.add(new  Places(R.string.dhouse,R.string.year_dhouse,R.drawable.dancehouse,R.string.web_dhouse,R.string.location_dhouse));
        places.add(new  Places(R.string.ngalerie,R.string.year_ngalerie,R.drawable.galerie,R.string.web_ngalerie,R.string.location_ngalerie));
        places.add(new  Places(R.string.svita,R.string.year_svita,R.drawable.katedralasvv,R.string.web_svita,R.string.location_svita));
        places.add(new  Places(R.string.strahov,R.string.year_strahov,R.drawable.strahovsky,R.string.web_strahov,R.string.location_strahov));
        places.add(new  Places(R.string.kmost,R.string.year_kmost,R.drawable.karluvmost,R.string.web_kmost,R.string.location_kmost));
        places.add(new  Places(R.string.vaclavak,R.string.year_vaclavak,R.drawable.vaclavak,R.string.web_vaclavak,R.string.location_vaclavak));
        places.add(new  Places(R.string.ndivadlo,R.string.year_ndivadlo,R.drawable.divadlo,R.string.web_ndivadlo,R.string.location_ndivadlo));
        places.add(new  Places(R.string.staromak,R.string.year_staromak,R.drawable.staromak,R.string.web_staromak,R.string.location_staromak));
        places.add(new  Places(R.string.sludmily,R.string.year_sludmily,R.drawable.kostelsvludmily,R.string.web_sludmily,R.string.location_sludmily));

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
