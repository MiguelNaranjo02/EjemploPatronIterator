/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

/**
 *
 * @author Miguel A. Naranjo, Cristian C. Tuso.
 */
//Clase demostracion del patron Iterator
public class DemoIterator {

    public static void main(String... args) {

        ColeccionIterable contact;
        
        //Se inicializa solo un iterador
        Iterador iterator;
        String contactoActual;

        contact = new contactosFB();
        iterator = contact.crearIterador();
        while (iterator.tieneSiguiente()) {
            // Acceder al elemento
            contactoActual = (String) iterator.siguiente();
            System.out.println(contactoActual);

        }
        System.out.println("");

        contact = new contactosDrive();
        iterator = contact.crearIterador();
        while (iterator.tieneSiguiente()) {
            // Acceder al elemento
            contactoActual = (String) iterator.siguiente();
            System.out.println(contactoActual);

        }

        System.out.println("");

        contact = new contactosCorreo();
        iterator = contact.crearIterador();
        while (iterator.tieneSiguiente()) {
            // Acceder al elemento
            contactoActual = (String) iterator.siguiente();
            System.out.println(contactoActual);

        }

    }

}
