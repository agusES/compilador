/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo.jflex;

/**
 *
 * @author Carlos
 */
public class Simbolo {
    private String nombre;
    private String valor;
    private String tipo;
    private boolean esConstante;
    
    public Simbolo() {
    }
    public Simbolo(String nombre, String valor) {
        this.nombre = nombre;
        this.valor = valor;
    }
    public Simbolo(String nombre, String valor, String tipo) {
        this(nombre, valor, tipo, false);
    }
    public Simbolo(String nombre, String valor, String tipo, boolean  esConst) {
        this.nombre = nombre;
        this.valor = valor;
        this.tipo = tipo;
        this.esConstante = esConst;
    }
    
    @Override
    public String toString() {
         return this.nombre + " " + this.tipo + " " + this.valor;
    }
}
