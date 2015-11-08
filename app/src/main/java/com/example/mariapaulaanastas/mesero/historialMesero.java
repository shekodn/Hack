package com.example.mariapaulaanastas.mesero;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by mariapaulaanastas on 11/7/15.
 */
public class historialMesero extends Fragment{

    View rootview;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        rootview = inflater.inflate(R.layout.historial_mesero_layout,container,false);

        return rootview;
    }

}
