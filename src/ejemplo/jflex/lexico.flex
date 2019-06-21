
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
import java.nio.file.*;
import java.io.File;
import java.io.FileOutputStream; 
import java.io.OutputStream; 

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
    public byte[] entrada;
    public static String FILEPATH = "C:\\Users\\Carlos\\ts.txt"; 
    public static File file = new File(FILEPATH);     
    public StringBuffer string = new StringBuffer();
    public ArrayList<MiToken> tablaDeSimbolos = new ArrayList<>();
 
    private MiToken token(String nombre) {
        return new MiToken(nombre, this.yyline, this.yycolumn);
    }

    private MiToken token(String nombre, Object valor) {
        return new MiToken(nombre, this.yyline, this.yycolumn, valor);
    }
   
%}

%init{
    try {
        if (file.createNewFile()) {
            System.out.println("Archivo creado");
        }
    } catch(Exception e) {
            e.printStackTrace();
            System.out.println("Error al crear el archivo");
    }

%init}
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

flotante =  [+-]?([1-9][0-9]*[.])?[0-9]+

dec_id =            ([:letter:]|_)\w*


%state STRING
%%
   
<YYINITIAL> {
    "="                         { return token("IGUAL", yytext()); }
    "&&"                        { return token("AND", yytext()); }
    "||"                        { return token("OR", yytext()); }
    "=="                        { return token("EQUAL", yytext()); }
    "!="                        { return token("DIFF", yytext()); }
    "<="                        { return token("MENOREQUAL", yytext()); }
    ">="                        { return token("MAYOREQUAL", yytext()); }
    "<"                         { return token("MENOR", yytext()); }
    ">"                         { return token("MAYOR", yytext()); }
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
    "is"                        { return token("IS", yytext()); }
    "if"                        { return token("IF", yytext()); }
    "then"                      { return token("THEN", yytext()); }
    "else"                      { return token("ELSE", yytext()); }
    "while"                     { return token("WHILE", yytext()); }
    "do"                        { return token("DO", yytext()); }
    "until"                     { return token("UNTIL", yytext()); }
    "repeat"                    { return token("REPEAT", yytext()); }
    "int"                       { return token("INT", yytext()); }
    "float"                     { return token("FLOAT", yytext()); }
    "boolean"                   { return token("BOOLEAN", yytext()); }
    "between"                   { return token("BETWEEN", yytext()); }
    "show"                      { return token("SHOW", yytext()); }
    ".T."                       { return token("TRUE", yytext()); }
    ".F."                       { return token("FALSE", yytext()); }
    {dec_id}                    { MiToken token = new MiToken("ID", yytext());
                                  try {
                                    entrada = "ID ".getBytes();
                                    Files.write(Paths.get(FILEPATH), entrada, StandardOpenOption.APPEND);
                                    entrada = (yytext() + "\n").getBytes();
                                    Files.write(Paths.get(FILEPATH), entrada, StandardOpenOption.APPEND);
                                    tablaDeSimbolos.add(token);

                                  } catch(Exception e) {
                                        e.printStackTrace();
                                        System.out.println("Error en grabando en el archivo token ID");
                                  }
                                  
                                  return token; 
                                }
    {dec_entero}                { MiToken token = new MiToken("ENTERO", yytext());
                                  try {
                                    entrada = "ENTERO ".getBytes();
                                    Files.write(Paths.get(FILEPATH), entrada, StandardOpenOption.APPEND);
                                    entrada = (yytext() + "\n").getBytes();
                                    Files.write(Paths.get(FILEPATH), entrada, StandardOpenOption.APPEND);
                                    tablaDeSimbolos.add(token);

                                  } catch(Exception e) {
                                        e.printStackTrace();
                                        System.out.println("Error en grabando en el archivo token ENTERO");
                                  }

                                  return token;  
                                }
    {flotante}                  { MiToken token = new MiToken("FLOTANTE", yytext());
                                  try {
                                    entrada = "FLOTANTE ".getBytes();
                                    Files.write(Paths.get(FILEPATH), entrada, StandardOpenOption.APPEND);
                                    entrada = (yytext() + "\n").getBytes();
                                    Files.write(Paths.get(FILEPATH), entrada, StandardOpenOption.APPEND);
                                    tablaDeSimbolos.add(token);

                                  } catch(Exception e) {
                                        e.printStackTrace();
                                        System.out.println("Error en grabando en el archivo token FLOTANTE");
                                  }

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
                                       MiToken token = new MiToken("STRING", 
                                       string.toString());
                                  try {
                                    entrada = "STRING ".getBytes();
                                    Files.write(Paths.get(FILEPATH), entrada, StandardOpenOption.APPEND);
                                    entrada = (string.toString() + "\n").getBytes();
                                    Files.write(Paths.get(FILEPATH), entrada, StandardOpenOption.APPEND);
                                    tablaDeSimbolos.add(token);

                                  } catch(Exception e) {
                                        e.printStackTrace();
                                        System.out.println("Error grabando en el archivo token ENTERO");
                                  }

                                  return token;
                                }
      [^\n\r\"\\]+                   { string.append( yytext() ); }
      \\t                            { string.append('\t'); }
      \\n                            { string.append('\n'); }

      \\r                            { string.append('\r'); }
      \\\"                           { string.append('\"'); }
      \\                             { string.append('\\'); }
    }

[^]                     { throw new Error("Caracter no permitido: <" + yytext() + ">"); }
