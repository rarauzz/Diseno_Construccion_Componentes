package com.diseno.bl.classes.registered;

import com.diseno.bl.classes.user.User;
import java.time.LocalDate;

public class Registered extends User {

    private String contrasena;

    /**
     * Constructor de la clase Registrado
     *
     * @param identificacion int
     * @param nombre String
     * @param apellidos String
     * @param fechaNacimiento LocalDate
     * @param edad int
     * @param estado boolean
     * @param correo String
     * @param direccion String
     * @param contrasena String
     */
    public Registered(int identificacion, String nombre, String apellidos
    		, LocalDate fechaNacimiento, int edad, boolean estado, String correo,
            String direccion, String contrasena) {
        super(identificacion, nombre, apellidos
        		, fechaNacimiento, edad, estado, correo, direccion);
        this.contrasena = contrasena;

    }


    /**
     * Costructor de la clase registrado
     */
    public Registered(){
        super();
        this.contrasena = null;
    }

    /**
     * Metodo getContrasena
     *
     * @return String contrasena
     */
    public String getContrasena() {
        return contrasena;
    }

    /**
     * Metodo setContrasena
     *
     * @param contrasena String
     */
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    /**
     * metodo toString
     *
     * @return String todos los datos dentro del objeto
     */
    @Override
    public String toString() {
        return super.toString() + "\ncontrasena=" + contrasena;
    }

    /**
     * Metodo toStingCSV
     * @return String toStingCSV
     */
    public String toStingCSV() {
        return super.toStringCSV() + "," + contrasena;
    }

}
