/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo.nodos;

/**
 *
 * @author Carlos
 */
public abstract class ExpresionBooleana extends Nodo {
    public ExpresionBooleana() {
    }
    
    protected abstract String graficar(String idPadre);
}
