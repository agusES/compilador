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
public class ConstanteFlotante extends Nodo {
    
    private final float valor;

    public ConstanteFlotante(float valor) {
        this.valor = valor;
    }

    public float getValor() {
        return valor;
    }

    @Override
    protected String getEtiqueta() {
        return String.format(String.format("Float Const %s", getValor()));
    }
    
}
