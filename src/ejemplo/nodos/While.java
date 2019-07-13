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
public class While extends Main{
    
    protected Nodo condicion;
    protected Nodo bloque;
    
    public While() {}
    
    public While(Nodo condicion, Nodo bloque) {
        this.condicion = condicion;
        this.bloque = bloque;
    }
   
    
    protected String getNombreOperacion() {
        return "While";
    }
    
    @Override
    protected String graficar(String idPadre) {
        final String miId = this.getId();
        return super.graficar(idPadre)
                + condicion.graficar(miId)
                + bloque.graficar(miId);
    }
    
}
