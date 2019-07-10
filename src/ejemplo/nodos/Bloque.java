/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo.nodos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Carlos
 */
public class Bloque extends Nodo{
    
    List<Nodo> sentencias;
    
    public Bloque(List<Nodo> sentencias) {
        this.sentencias = sentencias;
    }
    
    
    protected String getNombreOperacion() {
        return "Bloque";
    }
    @Override
    protected String graficar(String idPadre) {
        final String miId = this.getId();
        String grafico = "";
        for (Nodo s: sentencias) {
            grafico += s.graficar(miId);
        }
        return super.graficar(idPadre) + grafico;
    }
    
}
