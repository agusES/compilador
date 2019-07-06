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
public abstract class SentenciaIf extends Sentencia {
    protected Nodo condicion;
    protected Nodo bloqueThen;
    protected Nodo bloqueElse;
    public SentenciaIf(){
    }
    public SentenciaIf(Nodo cond, Nodo then ){
       this.condicion = cond;
       this.bloqueThen = then;
    }
    
    public SentenciaIf(Nodo cond, Nodo bloqueThen, Nodo bloqueElse ){
        this.condicion = cond;
        this.bloqueThen = bloqueThen;
        this.bloqueElse = bloqueElse;
    }
    @Override
    protected String getEtiqueta() {
        return String.format("%s", this.getNombreOperacion());
    }
    protected abstract String getNombreOperacion();



    
}
