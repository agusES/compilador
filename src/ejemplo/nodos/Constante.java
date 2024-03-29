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
public class Constante extends Nodo {
    private final Integer valor;

    public Constante(Integer valor) {
        this.valor = valor;
    }

    public Integer getValor() {
        return valor;
    }

    @Override
    protected String getEtiqueta() {
        return String.format(String.format("Number Const %s", getValor()));
    }
}
