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
public class contactosCorreo implements ColeccionIterable {

    private HashSet<String> hsetCorreo;

    //En el constructor se inicializa el hashset
    public contactosCorreo() {
        hsetCorreo = new HashSet<String>();
        hsetCorreo.add("cTuso@gmail.com");
        hsetCorreo.add("miguelanjoya@gmail.com");
        hsetCorreo.add("andcam@hotmail.com");
        hsetCorreo.add("miguelanjoya@gmail.com");
        hsetCorreo.add("lauT@outlook.com");
        hsetCorreo.add("ascg@hotmail.com");
        hsetCorreo.add("ascg@hotmail.com");

    }

    //Se crea el metodo que permitira crear un objeto Iterador,
    //pasandole por parametro un hashset con la informacion
    public Iterador crearIterador() {
        return new contactosCorreoIterador(hsetCorreo);
    }

}
