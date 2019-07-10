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
public class Show extends Nodo {
    
    protected String cadena;
    
    public Show() {}
    
    public Show(String cadena) {
        this.cadena = cadena;
    }
    
    @Override
    protected String getEtiqueta() {
        return String.format("%s", this.getNombreOperacion());
    }
    
    protected String getNombreOperacion() {
        return "Show";
    }
    
    @Override
    protected String graficar(String idPadre) {
        final String miId = this.getId();
        return super.graficar(idPadre)
                + cadena;
    }
}
