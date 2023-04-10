/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package redsocial;

import java.util.Arrays;

/**
 *
 * @author Profesor
 */
public class Persona {
    private String nombre;
    private int anioNac;
    private Grupo[] grupos= new Grupo[5];
    private Persona[] amigos= new Persona[5];

    public Persona() {
    }

    public Persona(String nombre, int anioNac, Persona[] amigos) {
        this.nombre = nombre;
        this.anioNac = anioNac;
        this.amigos= amigos;
    }
    
    public Persona(String nombre, int anioNac, Persona[] amigos, Grupo[] grupos) {
        this.nombre = nombre;
        this.anioNac = anioNac;
        this.amigos= amigos;
        this.grupos= grupos;
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnioNac() {
        return anioNac;
    }

    public void setAnioNac(int anioNac) {
        this.anioNac = anioNac;
    }

    public Grupo[] getGrupos() {
        return grupos;
    }

    public void setGrupos(Grupo[] grupos) {
        this.grupos = grupos;
    }

    public Persona[] getAmigos() {
        return amigos;
    }

    public void setAmigos(Persona[] amigos) {
        this.amigos = amigos;
    }

    //Métodos para garantizar la relación de agregación
    //Grupo
    public void agregarGrupo(Grupo g,int pos){
        if(pos>=0 && pos <5){
            this.getGrupos()[pos]=g;
        }
    }
    
        
    public void eliminarGrupo(int pos){
        if(pos>0 && pos<5){
            this.getGrupos()[pos]=null;
        }
    }
    
    //Métodos para garantizar la relación de agregación
    //Amigos
    public void agregarAmigo(Persona p,int pos){
        this.getAmigos()[pos]=p;
    }
    
        
    public void eliminarAmigo(int pos){
        this.getAmigos()[pos]=new Persona();
    }
    
    public void eliminarAmigo(String nombre){
        for(int i=0;i<5;i++){
            if(this.getAmigos()[i].getNombre().compareTo(nombre)==0){
                this.getAmigos()[i]=null;
            }
        }
    }
    
    public void eliminarAmigo(){
        this.getAmigos()[5]=null;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", anioNac=" + anioNac + ", grupos=" + Arrays.toString(grupos) + ", amigos=" + Arrays.toString(amigos) + '}';
    }
    
    
    
    
    
}
