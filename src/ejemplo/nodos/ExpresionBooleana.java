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
public abstract class ExpresionBooleana extends Nodo {
    public ExpresionBooleana() {
    }
    
    public String graficar() {
        // Acá se dispara la invocación a los métodos graficar() de los nodos.
        // Como la Expresion no tiene padre, se inicia pasando null.  
        StringBuilder resultado = new StringBuilder();
        resultado.append("graph G {");
        resultado.append(this.graficar(null));
        resultado.append("}");
        return resultado.toString();
    }
}
