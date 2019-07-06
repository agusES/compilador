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
public class IfThen extends SentenciaIf {
    public IfThen(Nodo condicion, Nodo bthen){
        super(condicion, bthen);
        this.setNombre("If then");
        
    }
    @Override
    protected String getNombreOperacion() {
        return "If Then";
    }
    @Override
    protected String graficar(String idPadre) {
        final String miId = this.getId();
        return super.graficar(idPadre)
                + condicion.graficar(miId)
                + bloqueThen.graficar(miId);
    }
}
