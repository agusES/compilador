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
public abstract class OperacionTernariaBooleana extends ExpresionBooleana {
    private final ExpresionBooleana valor;
    private final ExpresionBooleana inferior;
    private final ExpresionBooleana superior;


    public OperacionTernariaBooleana(ExpresionBooleana valor, ExpresionBooleana inferior, ExpresionBooleana superior) {
        this.valor = valor;
        this.inferior = inferior;
        this.superior = superior;
    }

    @Override
    protected String getEtiqueta() {
        return String.format("%s", this.getNombreOperacion());
    }

    protected abstract String getNombreOperacion();

    @Override
    protected String graficar(String idPadre) {
        final String miId = this.getId();
        return super.graficar(idPadre)
                + valor.graficar(miId)
                + inferior.graficar(miId)
                + superior.graficar(miId);
    }
}
