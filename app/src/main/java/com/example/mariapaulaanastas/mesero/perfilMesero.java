package com.example.mariapaulaanastas.mesero;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by mariapaulaanastas on 11/7/15.
 */
public class perfilMesero extends Fragment{

    View rootview;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
    // Comment
        rootview = inflater.inflate(R.layout.perfil_mesero_layout,container,false);

        return rootview;
    }

}
