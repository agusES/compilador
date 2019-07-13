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
public class ConstanteString extends Nodo{
    
    private final String valor;

    public ConstanteString(String valor) {
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }

    @Override
    protected String getEtiqueta() {
        return String.format(String.format("String Const %s", getValor()));
    }
    
}
