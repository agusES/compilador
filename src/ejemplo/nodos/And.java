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
public class And extends OperacionBinariaBooleana {
    public And(ExpresionBooleana izquierda, ExpresionBooleana derecha) {
        super(izquierda, derecha);
    }

    @Override
    protected String getNombreOperacion() {
        return "&&";
    }
}
