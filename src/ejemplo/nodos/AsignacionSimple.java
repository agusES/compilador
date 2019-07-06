/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo.nodos;

/**
 *
 * @author Flynn
 */
public class AsignacionSimple extends Asignacion{
    
    private Nodo id;
    private Nodo exp;
    
    public AsignacionSimple(Nodo id, Nodo exp) {
        this.setNombre("=");
        this.id = id;
        this.exp = exp;
    }
    
    @Override
    protected String graficar(String idPadre) {
        final String miId = this.getId();
        return super.graficar(idPadre)
                + id.graficar(miId)
                + exp.graficar(miId);
    }
}
