/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.util.ArrayList;

/**
 *
 * @author Miguel A. Naranjo, Cristian C. Tuso.
 */
//Clase Iteradora concreta de contactos en el facebook, esta implementa la interfaz iterador
public class contactosFBIterador implements Iterador {

    ArrayList<String> contactos;
    private int posicion;

    //Constructor de la clase, que recibe un arraylist con datos String
    //y lo iguala al arraylist de la clase
    public contactosFBIterador(ArrayList<String> Contact) {
        this.contactos = Contact;

    }

    //Especificacion de un metodo de la interface, aqui obtiene
    //el elemento del arraylist en la posicion
    @Override
    public Object siguiente() {
        return contactos.get(posicion++);

    }

    //Especificacion de un metodo de la interface, aqui se verifica que el
    //lista todavia no se halla recorrido en su totalidad
    @Override
    public boolean tieneSiguiente() {
        if (posicion < contactos.size()) {
            return true;
        } else {
            return false;
        }
    }
}
