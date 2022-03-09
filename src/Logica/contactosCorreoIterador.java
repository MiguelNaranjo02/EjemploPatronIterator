/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 *
 * @author Miguel A. Naranjo, Cristian C. Tuso.
 */
//Clase Iteradora concreta de contactos en el correo, esta implementa la interfaz iterador
public class contactosCorreoIterador implements Iterador {

    List<String> list;
    private int posicion;

    //Constructor de la clase, que recibe un hashset con datos String
    //y lo convierte en un arraylist
    public contactosCorreoIterador(HashSet<String> hset) {
        list = new ArrayList<String>(hset);

    }
    //Especificacion de un metodo de la interface, aqui obtiene
    //el elemento de la lista en la posicion
    @Override
    public Object siguiente() {
        return (list.get(posicion++));

    }
    //Especificacion de un metodo de la interface, aqui se verifica que el
    //lista todavia no se halla recorrido en su totalidad
    @Override
    public boolean tieneSiguiente() {
        //  System.out.println(list.size());
        if (posicion < list.size()) {
            return true;
        } else {
            return false;
        }
    }

}
