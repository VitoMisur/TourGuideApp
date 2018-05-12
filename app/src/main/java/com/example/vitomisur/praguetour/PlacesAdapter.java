package com.example.vitomisur.praguetour;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

public class PlacesAdapter extends ArrayAdapter<Places> {
    // color placeholder for fragments
    private int mColorResourceId;
    private Context context;
    public PlacesAdapter(Activity context, ArrayList<Places> places, int colorResourceId) {

        super(context, 0, places);
        // get the color of the tab(fragment)
        mColorResourceId = colorResourceId;
        this.context = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemview = convertView;

        // setting the listview for the tab
        if (listItemview == null) {
            listItemview = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_places, parent, false);
        }
        // get the position of the "place" in the Places class
        final Places currentPlace = getItem(position);

        // setting the data about the place
        TextView nameTextView = listItemview.findViewById(R.id.name_text_view);
        nameTextView.setText(currentPlace.getName());

        TextView infoTextView = listItemview.findViewById(R.id.info_text_view);
        infoTextView.setText(currentPlace.getInfo());

        ImageView mapImageView = listItemview.findViewById(R.id.map_icon);
        // open the map of the place after user clicks on the map icon
        mapImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String place = context.getString(currentPlace.getMap());
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(place));
                context.startActivity(i);
            }
        });

        // logo = image of the place
        ImageView logoImageView = listItemview.findViewById(R.id.logo_image_view);
        logoImageView.findViewById(R.id.logo_image_view);
        logoImageView.setImageResource(currentPlace.getLogoImage());

        // set up the background color for the places in the listview
        View textContainer = listItemview.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        textContainer.setBackgroundColor(color);

        return listItemview;
    }
}
