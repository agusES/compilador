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
public class While extends Nodo{
    
    protected Nodo condicion;
    protected Nodo bloque;
    
    public While() {}
    
    public While(Nodo condicion, Nodo bloque) {
        this.condicion = condicion;
        this.bloque = bloque;
    }
    
    @Override
    protected String getEtiqueta() {
        return String.format("%s", this.getNombreOperacion());
    }
    
    protected String getNombreOperacion() {
        return "while";
    }
    
    @Override
    protected String graficar(String idPadre) {
        final String miId = this.getId();
        return super.graficar(idPadre)
                + condicion.graficar(miId)
                + bloque.graficar(miId);
    }
    
}
