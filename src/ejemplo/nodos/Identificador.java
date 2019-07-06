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
public class Identificador extends Nodo {
    private String valor;
    public Identificador(String id) {
        this.valor = id;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
    
    
    
    
    @Override
    protected String getEtiqueta() {
        return String.format(String.format("ID %s", getValor()));
    }
}
