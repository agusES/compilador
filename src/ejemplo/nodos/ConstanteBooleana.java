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
public class ConstanteBooleana extends ExpresionBooleana {
    private final boolean valor;

    public ConstanteBooleana(boolean valor) {
        this.valor = valor;
    }

    public boolean getValor() {
        return valor;
    }

    @Override
    protected String getEtiqueta() {
        return String.format(String.format("Bool Const %s", getValor()));
    }
}
