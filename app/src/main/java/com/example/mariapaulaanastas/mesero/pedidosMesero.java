package com.example.mariapaulaanastas.mesero;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import android.content.Intent;
import com.parse.FindCallback;
import com.parse.Parse;
import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.ParseQuery;
import com.parse.ParseUser;
import com.parse.SignUpCallback;

public class pedidosMesero extends Fragment{
    View rootview;
    //
    List<Orden> ordenes= new ArrayList<Orden>();
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ParseQuery<Orden> ordenQuery=new ParseQuery<Orden>("Ordenes");
        //ordenQuery.findInBackground(new FindCallback<Orden>() {
            //@Override
            /*
            public void done(List<Orden> list, ParseException e) {
                for(Orden ord : list){
                    Orden newOrden= new Orden();
                    newOrden.setAsiento(ord.getAsiento());
                    newOrden.setProducto(ord.getProducto());
                    newOrden.setCantidad(ord.getCantidad());
                    newOrden.setTotal(ord.getTotal());
                    newOrden.setCompletado(ord.getCompletado());
                }
                //ArrayAdapter<Orden> adapter=new ArrayAdapter<Orden>(pedidosMesero.this, android.R.layout.simple_list_item_1,ordenes);
            }*/
       // });
//
        rootview = inflater.inflate(R.layout.pedidos_mesero_layout,container,false);

        return rootview;
    }
}
