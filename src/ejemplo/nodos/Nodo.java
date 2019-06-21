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
public class Nodo {

    private String nombre;

    public Nodo() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    protected String getId() {
        return "nodo_" + this.hashCode();
    }

    protected String getEtiqueta() {
        if (this.nombre != null) {
            return this.nombre;
        }
        final String name = this.getClass().getName();
        final int pos = name.lastIndexOf('.') + 1;
        return name.substring(pos);
    }

    protected String graficar(String idPadre) {
        if (idPadre == null) {
            return String.format("%1$s [label=\"%2$s\"]\n", getId(), getEtiqueta());
        }
        return String.format("%1$s [label=\"%2$s\"]\n%3$s -- %1$s\n", getId(), getEtiqueta(), idPadre);
    }
}
