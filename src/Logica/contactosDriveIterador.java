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
//Clase Iteradora concreta de contactos en drive, esta implementa la interfaz iterador
public class contactosDriveIterador implements Iterador {

    //Se inicializan el arreglo que almacenara la info, las dos variables
    //que tendran la posicion del arreglo, un arreglo auxiliar que facilitara
    //la obtencion de los datos y un string auxiliar
    private String[][] contactos;
    private int posicionX;
    private int posicionY;
    String[][] aux = new String[1][2];
    String auxi;

    //Constructor de la clase, que tendra por parametro un arreglo bidimensional
    public contactosDriveIterador(String[][] conta) {
        contactos = conta;
        aux[0][0] = "";

    }

    //Especificacion de un metodo de la interface, aqui se obtiene
    //el string donde se concatena el nombre con el numero de celular
    @Override
    public Object siguiente() {

        aux[0][0] = contactos[posicionX][posicionY];
        aux[0][1] = contactos[posicionX][posicionY + 1];
        posicionX = posicionX + 1;
        auxi = aux[0][0] + " - " + aux[0][1];
        //return (aux);
        return (auxi);

    }
    //Especificacion de un metodo de la interface, aqui se verifica que el
    //arreglo todavia no se halla recorrido en su totalidad, y que
    //el string en alguna de sus posiciones no sea null

    @Override
    public boolean tieneSiguiente() {

        if (posicionX < contactos.length && contactos[posicionX][0] != null) {
            return true;
        } else {
            return false;
        }
    }

}
