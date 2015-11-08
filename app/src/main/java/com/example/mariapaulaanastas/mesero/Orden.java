package com.example.mariapaulaanastas.mesero;

import com.parse.ParseClassName;
import com.parse.ParseObject;
@ParseClassName("Ordenes")
public class Orden extends ParseObject {

    public String getAsiento() {
        return getString("asiento");
    }
    public void setAsiento(String asiento){
        put("asiento",asiento);
    }
    public String getProducto() {
        return getString("prodcto");
    }
    public void setProducto(String prod){
        put("producto",prod);
    }

    public Number getCantidad() {
        return getNumber("cantidad");
    }

    public void setCantidad(Number cant){
        put("cantidad",cant);
    }

    public Number getTotal() {
        return getNumber("total");
    }
    public void setTotal(Number tot) {
        put("total", tot);
    }
    public boolean getCompletado(){
        return getBoolean("completado");
    }
    public void setCompletado(boolean comp){
         put("completado",comp);
    }
    public String toString(){
        return getProducto() +"  "+ getCantidad()+"  "+getTotal() +"\n" +getAsiento();
    }
}
