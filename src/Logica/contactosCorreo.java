/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.util.HashSet;

/**
 *
 * @author Miguel A. Naranjo, Cristian C. Tuso.
 */
//Coleccion concreta del Correo
public class contactosCorreo {

    private HashSet<String> hsetCorreo;
    private int posicion;

    //En el constructor se inicializa el hashset
    public contactosCorreo() {
        hsetCorreo = new HashSet<String>();

    }

    //Se crea el metodo que permitira guardar los correos en el hashset
    public void agregar(String corr) {
        hsetCorreo.add(corr);
        posicion++;
    }

    //Se crea el metodo que permitira crear un objeto Iterador,
    //pasandole por parametro un hashset con la informacion
    public contactosCorreoIterador Iterador() {
        return new contactosCorreoIterador(hsetCorreo);
    }

}
