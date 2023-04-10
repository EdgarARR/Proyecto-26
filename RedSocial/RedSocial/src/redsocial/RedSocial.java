/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package redsocial;

/**
 *
 * @author Profesor
 */
public class RedSocial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Persona[] amigos= new Persona[5];
        
        amigos[0]=new Persona();
        amigos[0].setNombre("Tania");
        amigos[1]=new Persona();
        amigos[1].setNombre("Elena");
        amigos[2]=new Persona();
        amigos[2].setNombre("Roeglio");
        amigos[3]=new Persona();
        amigos[3].setNombre("Bryan");
        amigos[4]=new Persona();
        amigos[4].setNombre("Martha");
        
        
        
        
        Persona p = new Persona("Gabriel", 2000, amigos);
        
        Grupo[] grupos= new Grupo[5];
        grupos[0]=new Grupo("UAM Azcapotzalco Interactive", "UAMEMES");
        
        p.agregarGrupo(grupos[0], 0);
        

        
        System.out.println(p);
        
        
    }
    
}
