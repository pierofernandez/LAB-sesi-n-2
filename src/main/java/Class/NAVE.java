/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

/**
 *
 * @author Estudiante
 */
public class NAVE extends PERSONAJES{
    
    public NAVE (){}
    
    private int puntaje;

   public NAVE (int puntaje, int vida, int nivel){
       
       super(vida, nivel);
       this.puntaje = puntaje;
       
   }
    
    public int getPuntaje() {
        return puntaje;
    }
    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }
}
