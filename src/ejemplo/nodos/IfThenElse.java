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
public class IfThenElse extends SentenciaIf{
    
    public IfThenElse(Nodo condicion, Nodo bthen, Nodo bloqueElse){
        super(condicion, bthen, bloqueElse);
        this.setNombre("If then else");
        
    }
    @Override
    protected String getNombreOperacion() {
        return "If Then Else";
    }
    @Override
    protected String graficar(String idPadre) {
        final String miId = this.getId();
        return super.graficar(idPadre)
                + condicion.graficar(miId)
                + bloqueThen.graficar(miId)
                + bloqueElse.graficar(miId);
    }
    
}
