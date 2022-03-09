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
        //Se inicializan las clases de cada tipo de estructura y red
        contactosFB contactFacebook = new contactosFB();
        contactosDrive contactDr = new contactosDrive();
        contactosCorreo contactCor = new contactosCorreo();
        //Se inicializa solo un iterador
        Iterador iterator;

        //Se agregan las urls a la estructura de datos de FB
        contactFacebook.agregar("https://www.facebook.com/miguelangel.naranjojoya");
        contactFacebook.agregar("https://www.facebook.com/cristiancamilo.tusso");
        contactFacebook.agregar("https://www.facebook.com/AndreaF.Gomez");
        contactFacebook.agregar("https://www.facebook.com/AmyC.Gomez");
        //Se iguala a la estructura de FB
        iterator = contactFacebook.iterador();

        //Se itera la estructura de FB, y se imprimen en consola
        while (iterator.tieneSiguiente()) {
            // Acceder al elemento
            String url = (String) iterator.siguiente();
            System.out.println(url);

        }
        System.out.println("");
        //Se rellena la estructura de datos de Drive con los nombres y celulares
        contactDr.agregar("Miguel Naranjo", "313465465");
        contactDr.agregar("Cristian Tuso", "314456484");
        contactDr.agregar("Camilo G", "314787945");
        contactDr.agregar("Laura R", "3154654654");
        //contactDr.agregar("Juanda", "316484654");
        contactDr.agregar("David", "311456789");
        contactDr.agregar("Daniel", "3154656789");

        //Se iguala a la estructura de Drive
        iterator = contactDr.iterador();

        //Se itera la estructura de Drive, y se imprimen en consola
        while (iterator.tieneSiguiente()) {
            String contactosDrive = (String) iterator.siguiente();
            System.out.println(contactosDrive);
            //String[][] contactosDrive = (String[][]) iterator.siguiente();
            //System.out.println(contactosDrive[0][0] + " - " + contactosDrive[0][1]);
        }

        System.out.println("");
        //Se rellena la estructura de datos del correo con direcciones de email
        contactCor.agregar("cTuso@gmail.com");
        //contactCor.agregar("andcam@hotmail.com");
        contactCor.agregar("miguelanjoya@gmail.com");
        contactCor.agregar("miguelanjoya@gmail.com");
        contactCor.agregar("ascg@hotmail.com");
        contactCor.agregar("ascg@hotmail.com");
        contactCor.agregar("lauT@outlook.com");
        contactCor.agregar("lauT@outlook.com");
        

        //Se iguala el iterador a la estructura del correo
        iterator = contactCor.Iterador();
        //Se itera la estructura del correo
        while (iterator.tieneSiguiente()) {
            String Contactoscorreo = (String) iterator.siguiente();
            System.out.println(Contactoscorreo);

        }

    }

}
