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
public class contactosDrive {
    //Se inicializan el arreglo bidimensional que almacenara el nombre y el celular
    //del contacto, asi como las posiciones dentro de ese arreglo para poderlo recorrer
    private String[][] contactos;
    private int posicionX;
    private int posicionY;

    //Se instancia el arreglo definiendo su tamaño
    public contactosDrive() {
        contactos = new String[30][2];
        posicionX = 0;
        posicionY = 0;
    }

    //Se crea un metodo que permitira agregar el nombre y el celular del contacto en cuestion
    //y se guardara en un arreglo
    public void agregar(String nombre, String celular) {

        contactos[posicionX][posicionY] = nombre;
        contactos[posicionX][posicionY + 1] = celular;
        posicionX++;
    }

    //Se crea el metodo que permitira crear un objeto Iterador,
    //pasandole por parametro un arreglo bidimensional
    public contactosDriveIterador iterador() {

        return new contactosDriveIterador(contactos);
    }

}
