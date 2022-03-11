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
public class contactosFB implements ColeccionIterable {

    //Se inicializa el arraylist de contactos, y un int de posicion
    private ArrayList<String> contactos;
    

    //Constructor de la clase, en el cual se instancia el arraylist
    public contactosFB() {
        contactos = new ArrayList<String>();
        contactos.add("https://www.facebook.com/miguelangel.naranjojoya");
        contactos.add("https://www.facebook.com/cristiancamilo.tusso");
        contactos.add("https://www.facebook.com/AndreaF.Gomez");
        contactos.add("https://www.facebook.com/AmyC.Gomez");

    }

    //Metodo al cual le llega un string por parametro, el cual es agregado al 
    //arraylist de contactos
    //Se crea el metodo que permitira crear un objeto Iterador,
    //pasandole por parametro un arraylist con la informacion
    public Iterador crearIterador() {
        return new contactosFBIterador(contactos);
    }

}
