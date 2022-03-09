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
//Coleccion concreta de FB
public class contactosFB {

    //Se inicializa el arraylist de contactos, y un int de posicion
    private ArrayList<String> contactos;
    private int posicion;

    //Constructor de la clase, en el cual se instancia el arraylist
    public contactosFB() {
        contactos = new ArrayList<String>();

    }

    //Metodo al cual le llega un string por parametro, el cual es agregado al 
    //arraylist de contactos
    public void agregar(String url) {
        contactos.add(url);
        posicion++;
    }
    //Se crea el metodo que permitira crear un objeto Iterador,
    //pasandole por parametro un arraylist con la informacion
    public contactosFBIterador iterador() {
        return new contactosFBIterador(contactos);
    }

}
