
/****************************************************************************
 * En esta sección se puede incluir todo código que se copiará textualmente
 * al comienzo del archivo JAVA que contendrá la definición de la clase del 
 * analizador léxico.
 ****************************************************************************/

/* Ejemplo:


*/
package ejemplo.jflex;
import java.util.ArrayList;
import java_cup.runtime.*;
import java_cup.sym;

/****************************************************************************
 * Las siguientes directivas afectan el comportamiento del analizador léxico:
 *
 *  - %class Nombre --> Nombre de la clase generada.
 *
 *  - %type Nombre  --> Nombre de la clase usada para representar token.
 *                      Será el tipo de los objetos retornados por yylex().
 *  - %line         --> El analizador sabrá el número de línea que se está
 *                      analizando. Puede consultarse con this.yyline
 *  - %column       --> El analizador sabrá el número de columna que se está
 *                      analizando. Puede consultarse con this.yycolumn
 *  - %char         --> El analizador sabrá el número de caracter que se está
 *                      analizando. Puede consultarse con this.yychar
 *
 * Existen otras directivas adicionales descriptas en la documentación.
 ****************************************************************************/ 
%%

%public
%class MiLexico
%cup
%line
%column


%{
    /*************************************************************************
    * En esta sección se puede incluir código que se copiará textualmente
    * como parte de la definición de la clase del analizador léxico.
    * Típicamente serán variables de instancia o nuevos métodos de la clase.
    *************************************************************************/
    StringBuffer string = new StringBuffer();
    public ArrayList<MiToken> tablaDeSimbolos = new ArrayList<>();
 
    private MiToken token(String nombre) {
        return new MiToken(nombre, this.yyline, this.yycolumn);
    }

    private MiToken token(String nombre, Object valor) {
        return new MiToken(nombre, this.yyline, this.yycolumn, valor);
    }
%}
%eof{
    System.out.println(tablaDeSimbolos.toString());
%eof}


 LineTerminator = \r|\n|\r\n
    InputCharacter = [^\r\n]
    WhiteSpace     = {LineTerminator} | [ \t\f]

/* comments */
    Comment = {TraditionalComment} | {EndOfLineComment} | {DocumentationComment}

    TraditionalComment   = "/*" [^*] ~"*/" | "/*" "*"+ "/"
    // Comment can be the last line of the file, without line terminator.
    EndOfLineComment     = "//" {InputCharacter}* {LineTerminator}?
    DocumentationComment = "/**" {CommentContent} "*"+ "/"
    CommentContent       = ( [^*] | \*+ [^/*] )*

num_sin_ceros =     [1-9]

digito =            [0-9]

dec_entero =        0 |{num_sin_ceros}{digito}*

dec_id =            ([:letter:]|_)\w*

comparador =        <|>|==|<>

%state STRING
%%
   
<YYINITIAL> {
    ""                          { return token("NADA", yytext()); }
    "="                         { return token("IGUAL", yytext()); }
    "&&"                        { return token("AND", yytext()); }
    "||"                        { return token("OR", yytext()); }
    "("                         { return token("PARENABRE", yytext()); }
    ")"                         { return token("PARENCIERRA", yytext()); }
    "*"                         { return token("POR", yytext()); }
    "/"                         { return token("DIVIDIDO", yytext()); }
    "+"                         { return token("MAS", yytext()); }
    "-"                         { return token("MENOS", yytext()); }
    ";"                         { return token("PUNTO_COMA", yytext()); }
    ":"                         { return token("DOSPUNTOS", yytext()); }
    "{"                         { return token("LLAVEABRE", yytext()); }
    "}"                         { return token("LLAVECIERRA", yytext()); }
    "main"                      { return token("MAIN", yytext()); }
    "const"                     { return token("CONST", yytext()); }
    "vars"                      { return token("VARS", yytext()); }
    "function"                  { return token("FUNCTION", yytext()); }
    "is"                        { return token("IS", yytext()); }
    "result"                    { return token("RESULT", yytext()); }
    "if"                        { return token("IF", yytext()); }
    "then"                      { return token("THEN", yytext()); }
    "else"                      { return token("ELSE", yytext()); }
    "while"                     { return token("WHILE", yytext()); }
    "do"                        { return token("DO", yytext()); }
    "until"                     { return token("UNTIL", yytext()); }
    "repeat"                    { return token("REPEAT", yytext()); }
    "int"                       { return token("TIPO", yytext()); }
    "between"                   { return token("BETWEEN", yytext()); }
    ".T."                       { return token("TRUE", yytext()); }
    ".F."                       { return token("FALSE", yytext()); }
    {dec_id}                    { MiToken token = new MiToken("ID", yytext()); 
                                  tablaDeSimbolos.add(token);
                                  return token; 
                                }
    {comparador}                { return token ("COMPARADOR", yytext()); }
    {dec_entero}                { MiToken token = new MiToken("ENTERO", yytext()); 
                                  tablaDeSimbolos.add(token);
                                  return token;  
                                }
    \"                          { string.setLength(0); yybegin(STRING); }
    /* comments */
    {Comment}                   { System.out.println("Reconoci un comentario"); }
    {LineTerminator}            { /* Fin de Linea, se ignora*/ }
    {WhiteSpace}                { /* Espacio en blanco no hace nada*/ }
   
}
<STRING> {
      \"                             { yybegin(YYINITIAL);
                                       System.out.println("Soy un string");
                                       return token("STRING", 
                                       string.toString()); }
      [^\n\r\"\\]+                   { string.append( yytext() ); }
      \\t                            { string.append('\t'); }
      \\n                            { string.append('\n'); }

      \\r                            { string.append('\r'); }
      \\\"                           { string.append('\"'); }
      \\                             { string.append('\\'); }
    }

[^]                     { throw new Error("Caracter no permitido: <" + yytext() + ">"); }
