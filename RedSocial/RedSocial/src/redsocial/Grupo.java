/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package redsocial;

/**
 *
 * @author Profesor
 */
public class Grupo {
    private String nombre;
    private String categoria;
    private Persona[] personas= new Persona[5];

    public Grupo() {
    }

    public Grupo(String nombre, String categoria) {
        this.nombre = nombre;
        this.categoria = categoria;
    }
    
    public Grupo(String nombre, String categoria, Persona[] personas) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.personas= personas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Persona[] getPersonas() {
        return personas;
    }

    public void setPersonas(Persona[] personas) {
        this.personas = personas;
    }

    public void agregarPersona(Persona p,int pos){
        this.getPersonas()[pos]= p;
    }
    
    public void eliminarPersona(int pos){
        this.getPersonas()[pos]= new Persona();
    }
    
    @Override
    public String toString() {
        return "Grupo{" + "nombre=" + nombre + ", categoria=" + categoria + ", personas=" + personas + '}';
    }
    
    
}
