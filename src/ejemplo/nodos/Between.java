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
public class Between extends OperacionTernariaBooleana {
    public Between(ExpresionBooleana valor, ExpresionBooleana inferior, ExpresionBooleana superior) {
        super(valor, inferior, superior);
    }

    @Override
    protected String getNombreOperacion() {
        return "between";
    }
}
