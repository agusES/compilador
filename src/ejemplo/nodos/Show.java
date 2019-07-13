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
public class Show extends Main {
    
    protected Nodo cadena;
    
    public Show() {}
    
    public Show(Nodo cadena) {
        this.cadena = cadena;
    }
    
    protected String getNombreOperacion() {
        return "Show";
    }
    
    @Override
    protected String graficar(String idPadre) {
        final String miId = this.getId();
        return super.graficar(idPadre)
                + cadena.graficar(miId);
    }
}
