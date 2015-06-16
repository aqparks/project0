package com.example.ashley.appportfolio;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    private Button mSpotifyStreamerButton;
    private Button mScoresButton;
    private Button mLibraryButton;
    private Button mBuiltItBiggerButton;
    private Button mXyzBuilderButton;
    private Button mCapstoneButton;

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_main, container, false);

        // attach button widgets
        mSpotifyStreamerButton = (Button) v.findViewById(R.id.spotify_streamer_button);
        mScoresButton = (Button) v.findViewById(R.id.scores_button);
        mLibraryButton = (Button) v.findViewById(R.id.library_button);
        mBuiltItBiggerButton = (Button) v.findViewById(R.id.build_it_button);
        mXyzBuilderButton = (Button) v.findViewById(R.id.xyz_reader_button);
        mCapstoneButton = (Button) v.findViewById(R.id.capstone_button);

        // attach+create button listeners and launch toasts


        mSpotifyStreamerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), R.string.spotify_streamer_toast, Toast.LENGTH_SHORT).show();
            }
        });
        mScoresButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), R.string.scores_toast, Toast.LENGTH_SHORT).show();
            }
        });
        mLibraryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), R.string.library_toast, Toast.LENGTH_SHORT).show();
            }
        });
        mBuiltItBiggerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), R.string.build_it_toast, Toast.LENGTH_SHORT).show();
            }
        });
        mXyzBuilderButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), R.string.xyz_reader_toast, Toast.LENGTH_SHORT).show();
            }
        });
        mCapstoneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), R.string.capstone_toast, Toast.LENGTH_SHORT).show();
            }
        });



        return v;
    }
}
