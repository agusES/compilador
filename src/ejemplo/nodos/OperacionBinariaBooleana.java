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
public abstract class OperacionBinariaBooleana extends ExpresionBooleana {
    
    private final ExpresionBooleana izquierda;
    private final ExpresionBooleana derecha;

    public OperacionBinariaBooleana(ExpresionBooleana izquierda, ExpresionBooleana derecha) {
        this.izquierda = izquierda;
        this.derecha = derecha;
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
                + izquierda.graficar(miId)
                + derecha.graficar(miId);
    }
}
