/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;


public class PERSONAJES extends ELEMENTO {
   
    
    public PERSONAJES(){}
     
    private int vidas;
    
    public PERSONAJES (int vidas, int nivel)
    {
     super(nivel);
     this.vidas = vidas;
    }
    
    public int getVidas() {
        return vidas;
    }
    public void setVidas(int vidas) {
        this.vidas = vidas;
    }
}
    
