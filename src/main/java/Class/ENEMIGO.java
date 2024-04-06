/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

/**
 *
 * @author Estudiante
 */
public class ENEMIGO extends PERSONAJES{

    
    public ENEMIGO(){}
    
     private int tipo;
    
    public ENEMIGO (int vidas, int tipo,int nivel)
    {
     super(nivel, vidas);
     this.tipo = tipo;
    }
    
    
    public int getTipo() {
        return tipo;
    }
    
    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
}

