/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo.nodos;

/**
 *
 * @author Agustin
 */
public abstract class Expresion extends Nodo {
    public Expresion() {
    }
    
    protected abstract String graficar(String idPadre);
}
