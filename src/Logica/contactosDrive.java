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
public class contactosDrive implements ColeccionIterable {

    //Se inicializan el arreglo bidimensional que almacenara el nombre y el celular
    //del contacto, asi como las posiciones dentro de ese arreglo para poderlo recorrer
    private String[][] contactos;
    

    //Se instancia el arreglo definiendo su tamaño
    public contactosDrive() {
        contactos = new String[30][2];
        
        contactos[0][0] = "Miguel Naranjo";
        contactos[0][1] = "313465465";
        contactos[1][0] = "Cristian Tuso";
        contactos[1][1] = "314456484";
        contactos[2][0] = "Camilo G";
        contactos[2][1] = "314787945";
        contactos[3][0] = "Laura R";
        contactos[3][1] = "3154654654";

        //contactDr.agregar("Juanda", "316484654");
    }

    //Se crea un metodo que permitira agregar el nombre y el celular del contacto en cuestion
    //y se guardara en un arreglo
    //Se crea el metodo que permitira crear un objeto Iterador,
    //pasandole por parametro un arreglo bidimensional
    public Iterador crearIterador() {

        return new contactosDriveIterador(contactos);
    }

}
