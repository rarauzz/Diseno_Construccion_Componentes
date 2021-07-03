package com.diseno.bl.classes.user;

import java.time.LocalDate;

public class User {

	    /**
	     * Atributos de la clase user
	     *
	     */
	    private int identificacion;
	    private String nombre;
	    private String apellidos;
	    private LocalDate fechaNacimiento;
	    private int edad;
	    private boolean estado;
	    private String correo;
	    private String direccion;

	    /**
	     * Constructor para el objeto User
	     *
	     * @param identificacion int
	     * @param nombre String
	     * @param apellidos String
	     * @param fechaNacimiento LocalDate
	     * @param edad int
	     * @param estado boolean
	     * @param correo String
	     * @param direccion String
	     */
	    public User(int identificacion, String nombre, String apellidos
	    		, LocalDate fechaNacimiento, int edad, boolean estado,
	            String correo, String direccion) {
	        this.identificacion = identificacion;
	        this.nombre = nombre;
	        this.apellidos = apellidos;
	        this.fechaNacimiento = fechaNacimiento;
	        this.edad = edad;
	        this.estado = estado;
	        this.correo = correo;
	        this.direccion = direccion;
	    }


	    /**
	     * Constructor VACIO para el objeto Usuario
	     *
	     */
	    public User() {
	        this.identificacion = 0;
	        this.nombre = "";
	        this.apellidos = "";
	        this.fechaNacimiento = LocalDate.now();
	        this.edad = 0;
	        this.estado = false;
	        this.correo = "";
	        this.direccion = "";
	    }


	    /**
	     * Metodo getIdentificacion
	     *
	     * @return int identificacion
	     */
	    public int getIdentificacion() {
	        return identificacion;
	    }

	    /**
	     * Metodo setIdentificacion
	     *
	     * @param identificacion int
	     */
	    public void setIdentificacion(int identificacion) {
	        this.identificacion = identificacion;
	    }

	    /**
	     * Metodo getNombre
	     *
	     * @return String nombre
	     */
	    public String getNombre() {
	        return nombre;
	    }

	    /**
	     * Metodo setNombre
	     *
	     * @param nombre String
	     */
	    public void setNombre(String nombre) {
	        this.nombre = nombre;
	    }

	    /**
	     * Metodo getApellidos
	     *
	     * @return String apellidos
	     */
	    public String getApellidos() {
	        return apellidos;
	    }

	    /**
	     * Metodos setApellidos
	     *
	     * @param apellidos String
	     */
	    public void setApellidos(String apellidos) {
	        this.apellidos = apellidos;
	    }

	    /**
	     * Metodo getFechaNacimiento
	     *
	     * @return LocalDate fechaNacimiento
	     */
	    public LocalDate getFechaNacimiento() {
	        return fechaNacimiento;
	    }

	    /**
	     * Metodo setFechaNacimiento
	     *
	     * @param fechaNacimiento LocalDate
	     */
	    public void setFechaNacimiento(LocalDate fechaNacimiento) {
	        this.fechaNacimiento = fechaNacimiento;
	    }

	    /**
	     * Metodo getEdad
	     *
	     * @return int edad
	     */
	    public int getEdad() {
	        return edad;
	    }

	    /**
	     * Metodo setEdad
	     *
	     * @param edad int
	     */
	    public void setEdad(int edad) {
	        this.edad = edad;
	    }

	    /**
	     * Metodo isEstado
	     *
	     * @return boolean estado
	     */
	    public boolean isEstado() {
	        return estado;
	    }

	    /**
	     * Metodo setEstado
	     *
	     * @param estado boolean
	     */
	    public void setEstado(boolean estado) {
	        this.estado = estado;
	    }

	    /**
	     * Metodo definirEstado
	     *
	     * @param estado boolean
	     * @return String estadoFinal
	     */
	    public String definirEstado(boolean estado) {
	        String estadoFinal;
	        if (estado == true) {
	            estadoFinal = "ACTIVO";
	        } else {
	            estadoFinal = "INACTIVO";
	        }

	        return estadoFinal;
	    }

	    /**
	     * Metodo getCorreo
	     *
	     * @return String correo
	     */
	    public String getCorreo() {
	        return correo;
	    }

	    /**
	     * Metodo setCorreo
	     *
	     * @param correo String
	     */
	    public void setCorreo(String correo) {
	        this.correo = correo;
	    }

	    /**
	     * Metodo getDireccion
	     *
	     * @return String direccion
	     */
	    public String getDireccion() {
	        return direccion;
	    }

	    /**
	     * Metodo setDireccion
	     *
	     * @param direccion String
	     */
	    public void setDireccion(String direccion) {
	        this.direccion = direccion;
	    }

	  

	    /**
	     * metodo toString
	     *
	     * @return String todos los datos dentro del objeto
	     */
	    @Override
	    public String toString() {
	        return identificacion + "" + nombre + "" + apellidos + ""
	                 + "" + fechaNacimiento + "" + edad + ""
	                + estado + "" + correo + "" + direccion;
	    }

	    public String toStringCSV() {
	        return identificacion + "," + nombre + "," + apellidos + "," + fechaNacimiento
	                + "," + edad + "," + estado + "," + correo + "," + direccion;
	    }

	    /**
	     * metodo equals
	     *
	     * @param obj Object
	     * @return true o false dependiendo del como se aplica el metodo
	     */
	    @Override
	    public boolean equals(Object obj) {
	        if (this == obj) {
	            return true;
	        }
	        User usuario = (User) obj;

	        if (this.getIdentificacion() == usuario.getIdentificacion()) {
	            return true;
	        }
	        return false;
	    }


}


