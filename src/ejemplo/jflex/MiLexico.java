/* The following code was generated by JFlex 1.7.0 */


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

public class MiLexico implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int STRING = 2;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1, 1
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\3\1\2\1\0\1\3\1\1\22\0\1\3\1\0\1\55"+
    "\3\0\1\15\1\0\1\17\1\20\1\5\1\21\1\0\1\22\1\52"+
    "\1\4\1\7\11\6\1\24\1\23\1\12\1\14\1\13\2\0\5\10"+
    "\1\54\15\10\1\53\6\10\1\0\1\56\2\0\1\10\1\0\1\30"+
    "\1\51\1\33\1\47\1\43\1\41\1\10\1\45\1\31\2\10\1\44"+
    "\1\27\1\32\1\34\1\50\1\10\1\40\1\35\1\36\1\42\1\37"+
    "\1\46\3\10\1\25\1\16\1\26\54\0\1\10\12\0\1\10\4\0"+
    "\1\10\5\0\27\10\1\0\37\10\1\0\u01ca\10\4\0\14\10\16\0"+
    "\5\10\7\0\1\10\1\0\1\10\21\0\160\11\5\10\1\0\2\10"+
    "\2\0\4\10\1\0\1\10\6\0\1\10\1\0\3\10\1\0\1\10"+
    "\1\0\24\10\1\0\123\10\1\0\213\10\1\0\7\11\246\10\1\0"+
    "\46\10\2\0\1\10\7\0\47\10\11\0\55\11\1\0\1\11\1\0"+
    "\2\11\1\0\2\11\1\0\1\11\10\0\33\10\5\0\3\10\35\0"+
    "\13\11\5\0\53\10\37\11\4\0\2\10\1\11\143\10\1\0\1\10"+
    "\7\11\2\0\6\11\2\10\2\11\1\0\4\11\2\10\12\11\3\10"+
    "\2\0\1\10\20\0\1\10\1\11\36\10\33\11\2\0\131\10\13\11"+
    "\1\10\16\0\12\11\41\10\11\11\2\10\4\0\1\10\5\0\26\10"+
    "\4\11\1\10\11\11\1\10\3\11\1\10\5\11\22\0\31\10\3\11"+
    "\104\0\25\10\1\0\10\10\26\0\16\11\1\0\41\11\66\10\3\11"+
    "\1\10\22\11\1\10\7\11\12\10\2\11\2\0\12\11\1\0\20\10"+
    "\3\11\1\0\10\10\2\0\2\10\2\0\26\10\1\0\7\10\1\0"+
    "\1\10\3\0\4\10\2\0\1\11\1\10\7\11\2\0\2\11\2\0"+
    "\3\11\1\10\10\0\1\11\4\0\2\10\1\0\3\10\2\11\2\0"+
    "\12\11\2\10\17\0\3\11\1\0\6\10\4\0\2\10\2\0\26\10"+
    "\1\0\7\10\1\0\2\10\1\0\2\10\1\0\2\10\2\0\1\11"+
    "\1\0\5\11\4\0\2\11\2\0\3\11\3\0\1\11\7\0\4\10"+
    "\1\0\1\10\7\0\14\11\3\10\1\11\13\0\3\11\1\0\11\10"+
    "\1\0\3\10\1\0\26\10\1\0\7\10\1\0\2\10\1\0\5\10"+
    "\2\0\1\11\1\10\10\11\1\0\3\11\1\0\3\11\2\0\1\10"+
    "\17\0\2\10\2\11\2\0\12\11\11\0\1\10\7\0\3\11\1\0"+
    "\10\10\2\0\2\10\2\0\26\10\1\0\7\10\1\0\2\10\1\0"+
    "\5\10\2\0\1\11\1\10\7\11\2\0\2\11\2\0\3\11\10\0"+
    "\2\11\4\0\2\10\1\0\3\10\2\11\2\0\12\11\1\0\1\10"+
    "\20\0\1\11\1\10\1\0\6\10\3\0\3\10\1\0\4\10\3\0"+
    "\2\10\1\0\1\10\1\0\2\10\3\0\2\10\3\0\3\10\3\0"+
    "\14\10\4\0\5\11\3\0\3\11\1\0\4\11\2\0\1\10\6\0"+
    "\1\11\16\0\12\11\20\0\4\11\1\0\10\10\1\0\3\10\1\0"+
    "\27\10\1\0\20\10\3\0\1\10\7\11\1\0\3\11\1\0\4\11"+
    "\7\0\2\11\1\0\3\10\5\0\2\10\2\11\2\0\12\11\20\0"+
    "\1\10\3\11\1\0\10\10\1\0\3\10\1\0\27\10\1\0\12\10"+
    "\1\0\5\10\2\0\1\11\1\10\7\11\1\0\3\11\1\0\4\11"+
    "\7\0\2\11\7\0\1\10\1\0\2\10\2\11\2\0\12\11\1\0"+
    "\2\10\16\0\3\11\1\0\10\10\1\0\3\10\1\0\51\10\2\0"+
    "\1\10\7\11\1\0\3\11\1\0\4\11\1\10\5\0\3\10\1\11"+
    "\7\0\3\10\2\11\2\0\12\11\12\0\6\10\2\0\2\11\1\0"+
    "\22\10\3\0\30\10\1\0\11\10\1\0\1\10\2\0\7\10\3\0"+
    "\1\11\4\0\6\11\1\0\1\11\1\0\10\11\6\0\12\11\2\0"+
    "\2\11\15\0\60\10\1\11\2\10\7\11\5\0\7\10\10\11\1\0"+
    "\12\11\47\0\2\10\1\0\1\10\2\0\2\10\1\0\1\10\2\0"+
    "\1\10\6\0\4\10\1\0\7\10\1\0\3\10\1\0\1\10\1\0"+
    "\1\10\2\0\2\10\1\0\4\10\1\11\2\10\6\11\1\0\2\11"+
    "\1\10\2\0\5\10\1\0\1\10\1\0\6\11\2\0\12\11\2\0"+
    "\4\10\40\0\1\10\27\0\2\11\6\0\12\11\13\0\1\11\1\0"+
    "\1\11\1\0\1\11\4\0\2\11\10\10\1\0\44\10\4\0\24\11"+
    "\1\0\2\11\5\10\13\11\1\0\44\11\11\0\1\11\71\0\53\10"+
    "\24\11\1\10\12\11\6\0\6\10\4\11\4\10\3\11\1\10\3\11"+
    "\2\10\7\11\3\10\4\11\15\10\14\11\1\10\17\11\2\0\46\10"+
    "\1\0\1\10\5\0\1\10\2\0\53\10\1\0\u014d\10\1\0\4\10"+
    "\2\0\7\10\1\0\1\10\1\0\4\10\2\0\51\10\1\0\4\10"+
    "\2\0\41\10\1\0\4\10\2\0\7\10\1\0\1\10\1\0\4\10"+
    "\2\0\17\10\1\0\71\10\1\0\4\10\2\0\103\10\2\0\3\11"+
    "\40\0\20\10\20\0\126\10\2\0\6\10\3\0\u026c\10\2\0\21\10"+
    "\1\0\32\10\5\0\113\10\3\0\3\11\10\10\7\0\15\10\1\0"+
    "\4\10\3\11\13\0\22\10\3\11\13\0\22\10\2\11\14\0\15\10"+
    "\1\0\3\10\1\0\2\11\14\0\64\10\40\11\3\0\1\10\4\0"+
    "\1\10\1\11\2\0\12\11\41\0\3\11\2\0\12\11\6\0\130\10"+
    "\10\0\5\10\2\11\42\10\1\11\1\10\5\0\106\10\12\0\37\10"+
    "\1\0\14\11\4\0\14\11\12\0\12\11\36\10\2\0\5\10\13\0"+
    "\54\10\4\0\32\10\6\0\12\11\46\0\27\10\5\11\4\0\65\10"+
    "\12\11\1\0\35\11\2\0\13\11\6\0\12\11\15\0\1\10\10\0"+
    "\17\11\101\0\5\11\57\10\21\11\7\10\4\0\12\11\21\0\11\11"+
    "\14\0\3\11\36\10\15\11\2\10\12\11\54\10\16\11\14\0\44\10"+
    "\24\11\10\0\12\11\3\0\3\10\12\11\44\10\2\0\11\10\107\0"+
    "\3\11\1\0\25\11\4\10\1\11\4\10\3\11\2\10\1\0\2\11"+
    "\6\0\300\10\66\11\5\0\5\11\u0116\10\2\0\6\10\2\0\46\10"+
    "\2\0\6\10\2\0\10\10\1\0\1\10\1\0\1\10\1\0\1\10"+
    "\1\0\37\10\2\0\65\10\1\0\7\10\1\0\1\10\3\0\3\10"+
    "\1\0\7\10\3\0\4\10\2\0\6\10\4\0\15\10\5\0\3\10"+
    "\1\0\7\10\102\0\2\11\23\0\1\11\34\0\1\10\15\0\1\10"+
    "\20\0\15\10\63\0\41\11\21\0\1\10\4\0\1\10\2\0\12\10"+
    "\1\0\1\10\3\0\5\10\6\0\1\10\1\0\1\10\1\0\1\10"+
    "\1\0\4\10\1\0\13\10\2\0\4\10\5\0\5\10\4\0\1\10"+
    "\21\0\43\11\2\10\4\11\u032d\0\64\11\u0716\0\57\10\1\0\57\10"+
    "\1\0\205\10\6\0\4\10\3\11\2\10\14\0\46\10\1\0\1\10"+
    "\5\0\1\10\2\0\70\10\7\0\1\10\17\0\1\11\27\10\11\0"+
    "\7\10\1\0\7\10\1\0\7\10\1\0\7\10\1\0\7\10\1\0"+
    "\7\10\1\0\7\10\1\0\7\10\1\0\40\11\57\0\1\10\u01d5\0"+
    "\2\10\1\11\31\0\17\11\1\0\5\10\2\0\3\11\2\10\4\0"+
    "\126\10\2\0\2\11\2\0\3\10\1\0\132\10\1\0\4\10\5\0"+
    "\51\10\3\0\136\10\21\0\33\10\65\0\20\10\u0200\0\u19b6\10\112\0"+
    "\u51d6\10\52\0\u048d\10\103\0\56\10\2\0\u010d\10\3\0\20\10\12\11"+
    "\2\10\24\0\57\10\4\11\1\0\12\11\1\0\37\10\2\11\106\10"+
    "\14\11\45\0\11\10\2\0\147\10\2\0\44\10\1\0\10\10\77\0"+
    "\13\10\1\11\3\10\1\11\4\10\1\11\27\10\5\11\30\0\64\10"+
    "\14\0\2\11\62\10\22\11\12\0\12\11\6\0\22\11\6\10\3\0"+
    "\1\10\1\0\1\10\2\0\12\11\34\10\10\11\2\0\27\10\15\11"+
    "\14\0\35\10\3\0\4\11\57\10\16\11\16\0\1\10\12\11\6\0"+
    "\5\10\1\11\12\10\12\11\5\10\1\0\51\10\16\11\11\0\3\10"+
    "\1\11\10\10\2\11\2\0\12\11\6\0\27\10\3\0\1\10\3\11"+
    "\62\10\1\11\1\10\3\11\2\10\2\11\5\10\2\11\1\10\1\11"+
    "\1\10\30\0\3\10\2\0\13\10\5\11\2\0\3\10\2\11\12\0"+
    "\6\10\2\0\6\10\2\0\6\10\11\0\7\10\1\0\7\10\1\0"+
    "\53\10\1\0\12\10\12\0\163\10\10\11\1\0\2\11\2\0\12\11"+
    "\6\0\u2ba4\10\14\0\27\10\4\0\61\10\u2104\0\u016e\10\2\0\152\10"+
    "\46\0\7\10\14\0\5\10\5\0\1\10\1\11\12\10\1\0\15\10"+
    "\1\0\5\10\1\0\1\10\1\0\2\10\1\0\2\10\1\0\154\10"+
    "\41\0\u016b\10\22\0\100\10\2\0\66\10\50\0\14\10\4\0\20\11"+
    "\20\0\20\11\3\0\2\11\30\0\3\11\40\0\5\10\1\0\207\10"+
    "\23\0\12\11\7\0\32\10\4\0\1\11\1\0\32\10\13\0\131\10"+
    "\3\0\6\10\2\0\6\10\2\0\6\10\2\0\3\10\43\0\14\10"+
    "\1\0\32\10\1\0\23\10\1\0\2\10\1\0\17\10\2\0\16\10"+
    "\42\0\173\10\105\0\65\11\210\0\1\11\202\0\35\10\3\0\61\10"+
    "\17\0\1\11\37\0\40\10\20\0\21\10\1\11\10\10\1\11\5\0"+
    "\46\10\5\11\5\0\36\10\2\0\44\10\4\0\10\10\1\0\5\11"+
    "\52\0\236\10\2\0\12\11\6\0\44\10\4\0\44\10\4\0\50\10"+
    "\10\0\64\10\234\0\u0137\10\11\0\26\10\12\0\10\10\230\0\6\10"+
    "\2\0\1\10\1\0\54\10\1\0\2\10\3\0\1\10\2\0\27\10"+
    "\12\0\27\10\11\0\37\10\101\0\23\10\1\0\2\10\12\0\26\10"+
    "\12\0\32\10\106\0\70\10\6\0\2\10\100\0\1\10\3\11\1\0"+
    "\2\11\5\0\4\11\4\10\1\0\3\10\1\0\33\10\4\0\3\11"+
    "\4\0\1\11\40\0\35\10\3\0\35\10\43\0\10\10\1\0\34\10"+
    "\2\11\31\0\66\10\12\0\26\10\12\0\23\10\15\0\22\10\156\0"+
    "\111\10\67\0\63\10\15\0\63\10\u030d\0\3\11\65\10\17\11\37\0"+
    "\12\11\17\0\4\11\55\10\13\11\25\0\31\10\7\0\12\11\6\0"+
    "\3\11\44\10\16\11\1\0\12\11\20\0\43\10\1\11\2\0\1\10"+
    "\11\0\3\11\60\10\16\11\4\10\5\0\3\11\3\0\12\11\1\10"+
    "\1\0\1\10\43\0\22\10\1\0\31\10\14\11\6\0\1\11\101\0"+
    "\7\10\1\0\1\10\1\0\4\10\1\0\17\10\1\0\12\10\7\0"+
    "\57\10\14\11\5\0\12\11\6\0\4\11\1\0\10\10\2\0\2\10"+
    "\2\0\26\10\1\0\7\10\1\0\2\10\1\0\5\10\2\0\1\11"+
    "\1\10\7\11\2\0\2\11\2\0\3\11\2\0\1\10\6\0\1\11"+
    "\5\0\5\10\2\11\2\0\7\11\3\0\5\11\213\0\65\10\22\11"+
    "\4\10\5\0\12\11\46\0\60\10\24\11\2\10\1\0\1\10\10\0"+
    "\12\11\246\0\57\10\7\11\2\0\11\11\27\0\4\10\2\11\42\0"+
    "\60\10\21\11\3\0\1\10\13\0\12\11\46\0\53\10\15\11\10\0"+
    "\12\11\66\0\32\10\3\0\17\11\4\0\12\11\u0166\0\100\10\12\11"+
    "\25\0\1\10\u01c0\0\71\10\u0107\0\11\10\1\0\45\10\10\11\1\0"+
    "\10\11\1\10\17\0\12\11\30\0\36\10\2\0\26\11\1\0\16\11"+
    "\u0349\0\u039a\10\146\0\157\11\21\0\304\10\u0abc\0\u042f\10\u0fd1\0\u0247\10"+
    "\u21b9\0\u0239\10\7\0\37\10\1\0\12\11\146\0\36\10\2\0\5\11"+
    "\13\0\60\10\7\11\11\0\4\10\14\0\12\11\11\0\25\10\5\0"+
    "\23\10\u0370\0\105\10\13\0\1\10\56\11\20\0\4\11\15\10\100\0"+
    "\1\10\37\0\u17ed\10\23\0\u02f3\10\u250d\0\2\10\u0bfe\0\153\10\5\0"+
    "\15\10\3\0\11\10\7\0\12\10\3\0\2\11\u14c6\0\5\11\3\0"+
    "\6\11\10\0\10\11\2\0\7\11\36\0\4\11\224\0\3\11\u01bb\0"+
    "\125\10\1\0\107\10\1\0\2\10\2\0\1\10\2\0\2\10\2\0"+
    "\4\10\1\0\14\10\1\0\1\10\1\0\7\10\1\0\101\10\1\0"+
    "\4\10\2\0\10\10\1\0\7\10\1\0\34\10\1\0\4\10\1\0"+
    "\5\10\1\0\1\10\3\0\7\10\1\0\u0154\10\2\0\31\10\1\0"+
    "\31\10\1\0\37\10\1\0\31\10\1\0\37\10\1\0\31\10\1\0"+
    "\37\10\1\0\31\10\1\0\37\10\1\0\31\10\1\0\10\10\2\0"+
    "\62\11\u0200\0\67\11\4\0\62\11\10\0\1\11\16\0\1\11\26\0"+
    "\5\11\1\0\17\11\u0550\0\7\11\1\0\21\11\2\0\7\11\1\0"+
    "\2\11\1\0\5\11\u07d5\0\305\10\13\0\7\11\51\0\104\10\7\11"+
    "\5\0\12\11\u04a6\0\4\10\1\0\33\10\1\0\2\10\1\0\1\10"+
    "\2\0\1\10\1\0\12\10\1\0\4\10\1\0\1\10\1\0\1\10"+
    "\6\0\1\10\4\0\1\10\1\0\1\10\1\0\1\10\1\0\3\10"+
    "\1\0\2\10\1\0\1\10\2\0\1\10\1\0\1\10\1\0\1\10"+
    "\1\0\1\10\1\0\1\10\1\0\2\10\1\0\1\10\2\0\4\10"+
    "\1\0\7\10\1\0\4\10\1\0\4\10\1\0\1\10\1\0\12\10"+
    "\1\0\21\10\5\0\3\10\1\0\5\10\1\0\21\10\u0274\0\32\11"+
    "\6\0\32\11\6\0\32\11\u0e76\0\ua6d7\10\51\0\u1035\10\13\0\336\10"+
    "\2\0\u1682\10\u295e\0\u021e\10\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\u06ed\0"+
    "\360\11\uffff\0\uffff\0\ufe12\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\1\1\0\1\2\2\3\1\4\1\5\1\6\2\7"+
    "\1\10\2\11\1\12\2\2\1\13\1\14\1\15\1\16"+
    "\1\17\1\20\1\21\1\22\14\10\1\2\1\23\1\24"+
    "\1\25\1\26\1\27\1\0\1\30\1\31\2\10\1\32"+
    "\1\33\10\10\1\34\1\10\2\0\1\35\1\36\1\37"+
    "\1\40\2\27\2\0\1\10\1\41\12\10\1\42\1\43"+
    "\1\0\1\27\1\44\1\10\1\45\1\46\4\10\1\47"+
    "\2\10\1\50\3\10\1\51\1\52\1\10\1\53\1\54"+
    "\3\10\1\55\1\56";

  private static int [] zzUnpackAction() {
    int [] result = new int[110];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\57\0\136\0\215\0\136\0\136\0\274\0\136"+
    "\0\353\0\136\0\u011a\0\u0149\0\136\0\u0178\0\u01a7\0\u01d6"+
    "\0\136\0\136\0\136\0\136\0\136\0\136\0\136\0\136"+
    "\0\u0205\0\u0234\0\u0263\0\u0292\0\u02c1\0\u02f0\0\u031f\0\u034e"+
    "\0\u037d\0\u03ac\0\u03db\0\u040a\0\u0439\0\136\0\u0468\0\136"+
    "\0\u0497\0\u04c6\0\u04f5\0\136\0\136\0\u0524\0\u0553\0\u011a"+
    "\0\u011a\0\u0582\0\u05b1\0\u05e0\0\u060f\0\u063e\0\u066d\0\u069c"+
    "\0\u06cb\0\u011a\0\u06fa\0\u0729\0\u0758\0\136\0\136\0\136"+
    "\0\136\0\u0787\0\136\0\u07b6\0\u07e5\0\u0814\0\u011a\0\u0843"+
    "\0\u0872\0\u08a1\0\u08d0\0\u08ff\0\u092e\0\u095d\0\u098c\0\u09bb"+
    "\0\u09ea\0\136\0\136\0\u0a19\0\u07b6\0\u011a\0\u0a48\0\u011a"+
    "\0\u011a\0\u0a77\0\u0aa6\0\u0ad5\0\u0b04\0\u011a\0\u0b33\0\u0b62"+
    "\0\u011a\0\u0b91\0\u0bc0\0\u0bef\0\u011a\0\u011a\0\u0c1e\0\u011a"+
    "\0\u011a\0\u0c4d\0\u0c7c\0\u0cab\0\u011a\0\u011a";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[110];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12"+
    "\1\13\1\3\1\14\1\15\1\16\1\17\1\20\1\21"+
    "\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31"+
    "\1\13\1\32\1\13\1\33\2\13\1\34\1\35\1\36"+
    "\1\37\1\40\1\41\2\13\1\42\1\43\1\13\1\44"+
    "\1\45\2\13\1\46\1\3\1\47\2\3\52\47\1\50"+
    "\1\51\61\0\1\5\60\0\1\52\1\53\57\0\2\11"+
    "\55\0\4\13\15\0\23\13\1\0\2\13\15\0\1\15"+
    "\57\0\1\15\57\0\1\54\57\0\1\55\46\0\4\13"+
    "\15\0\1\13\1\56\21\13\1\0\2\13\10\0\4\13"+
    "\15\0\3\13\1\57\2\13\1\60\3\13\1\61\10\13"+
    "\1\0\2\13\10\0\4\13\15\0\5\13\1\62\15\13"+
    "\1\0\2\13\10\0\4\13\15\0\16\13\1\63\4\13"+
    "\1\0\2\13\10\0\4\13\15\0\1\13\1\64\21\13"+
    "\1\0\2\13\10\0\4\13\15\0\14\13\1\65\6\13"+
    "\1\0\2\13\10\0\4\13\15\0\13\13\1\66\7\13"+
    "\1\0\2\13\10\0\4\13\15\0\3\13\1\67\17\13"+
    "\1\0\2\13\10\0\4\13\15\0\15\13\1\70\5\13"+
    "\1\0\2\13\10\0\4\13\15\0\16\13\1\71\4\13"+
    "\1\0\2\13\10\0\4\13\15\0\5\13\1\72\15\13"+
    "\1\0\2\13\10\0\4\13\15\0\14\13\1\73\6\13"+
    "\1\0\2\13\55\0\1\74\1\75\2\0\1\47\2\0"+
    "\52\47\34\0\1\76\3\0\1\77\1\0\1\100\14\0"+
    "\1\101\1\0\1\52\1\102\1\103\54\52\5\104\1\105"+
    "\51\104\6\0\4\13\15\0\2\13\1\106\20\13\1\0"+
    "\2\13\10\0\4\13\15\0\7\13\1\107\13\13\1\0"+
    "\2\13\10\0\4\13\15\0\3\13\1\110\17\13\1\0"+
    "\2\13\10\0\4\13\15\0\14\13\1\111\6\13\1\0"+
    "\2\13\10\0\4\13\15\0\11\13\1\112\11\13\1\0"+
    "\2\13\10\0\4\13\15\0\6\13\1\113\12\13\1\114"+
    "\1\13\1\0\2\13\10\0\4\13\15\0\3\13\1\115"+
    "\17\13\1\0\2\13\10\0\4\13\15\0\7\13\1\116"+
    "\13\13\1\0\2\13\10\0\4\13\15\0\6\13\1\117"+
    "\14\13\1\0\2\13\10\0\4\13\15\0\2\13\1\120"+
    "\20\13\1\0\2\13\10\0\4\13\15\0\7\13\1\121"+
    "\13\13\1\0\2\13\54\0\1\122\56\0\1\123\6\0"+
    "\1\103\54\0\5\104\1\124\55\104\1\125\1\124\51\104"+
    "\6\0\4\13\15\0\3\13\1\126\17\13\1\0\2\13"+
    "\10\0\4\13\15\0\6\13\1\127\14\13\1\0\2\13"+
    "\10\0\4\13\15\0\3\13\1\130\17\13\1\0\2\13"+
    "\10\0\4\13\15\0\6\13\1\131\14\13\1\0\2\13"+
    "\10\0\4\13\15\0\13\13\1\132\7\13\1\0\2\13"+
    "\10\0\4\13\15\0\14\13\1\133\6\13\1\0\2\13"+
    "\10\0\4\13\15\0\4\13\1\134\16\13\1\0\2\13"+
    "\10\0\4\13\15\0\2\13\1\135\20\13\1\0\2\13"+
    "\10\0\4\13\15\0\14\13\1\136\6\13\1\0\2\13"+
    "\10\0\4\13\15\0\15\13\1\137\5\13\1\0\2\13"+
    "\10\0\4\13\15\0\17\13\1\140\3\13\1\0\2\13"+
    "\2\0\4\104\1\103\1\124\51\104\6\0\4\13\15\0"+
    "\7\13\1\141\13\13\1\0\2\13\10\0\4\13\15\0"+
    "\15\13\1\142\5\13\1\0\2\13\10\0\4\13\15\0"+
    "\1\13\1\143\21\13\1\0\2\13\10\0\4\13\15\0"+
    "\7\13\1\144\13\13\1\0\2\13\10\0\4\13\15\0"+
    "\15\13\1\145\5\13\1\0\2\13\10\0\4\13\15\0"+
    "\14\13\1\146\6\13\1\0\2\13\10\0\4\13\15\0"+
    "\14\13\1\147\6\13\1\0\2\13\10\0\4\13\15\0"+
    "\7\13\1\150\13\13\1\0\2\13\10\0\4\13\15\0"+
    "\7\13\1\151\13\13\1\0\2\13\10\0\4\13\15\0"+
    "\2\13\1\152\20\13\1\0\2\13\10\0\4\13\15\0"+
    "\14\13\1\153\6\13\1\0\2\13\10\0\4\13\15\0"+
    "\5\13\1\154\15\13\1\0\2\13\10\0\4\13\15\0"+
    "\3\13\1\155\17\13\1\0\2\13\10\0\4\13\15\0"+
    "\3\13\1\156\17\13\1\0\2\13\2\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[3290];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\1\1\0\1\11\1\1\2\11\1\1\1\11\1\1"+
    "\1\11\2\1\1\11\3\1\10\11\15\1\1\11\1\1"+
    "\1\11\2\1\1\0\2\11\16\1\2\0\4\11\1\1"+
    "\1\11\2\0\14\1\2\11\1\0\32\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[110];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true iff the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true iff the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;
  
  /** 
   * The number of occupied positions in zzBuffer beyond zzEndRead.
   * When a lead/high surrogate has been read from the input stream
   * into the final zzBuffer position, this will have a value of 1;
   * otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /* user code: */
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


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public MiLexico(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x110000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 3280) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException("Reader returned 0 characters. See JFlex examples for workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      /* If numRead == requested, we might have requested to few chars to
         encode a full Unicode character. We assume that a Reader would
         otherwise never return half characters. */
      if (numRead == requested) {
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    zzFinalHighSurrogate = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
        System.out.println(tablaDeSimbolos.toString());
  yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':  // fall through
        case '\u000C':  // fall through
        case '\u0085':  // fall through
        case '\u2028':  // fall through
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn += zzCharCount;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
            zzDoEOF();
          { return new java_cup.runtime.Symbol(sym.EOF); }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { return token("NADA", yytext());
            } 
            // fall through
          case 47: break;
          case 2: 
            { throw new Error("Caracter no permitido: <" + yytext() + ">");
            } 
            // fall through
          case 48: break;
          case 3: 
            { /* Fin de Linea, se ignora*/
            } 
            // fall through
          case 49: break;
          case 4: 
            { /* Espacio en blanco no hace nada*/
            } 
            // fall through
          case 50: break;
          case 5: 
            { return token("DIVIDIDO", yytext());
            } 
            // fall through
          case 51: break;
          case 6: 
            { return token("POR", yytext());
            } 
            // fall through
          case 52: break;
          case 7: 
            { MiToken token = new MiToken("ENTERO", yytext()); 
                                  tablaDeSimbolos.add(token);
                                  return token;
            } 
            // fall through
          case 53: break;
          case 8: 
            { MiToken token = new MiToken("ID", yytext()); 
                                  tablaDeSimbolos.add(token);
                                  return token;
            } 
            // fall through
          case 54: break;
          case 9: 
            { return token ("COMPARADOR", yytext());
            } 
            // fall through
          case 55: break;
          case 10: 
            { return token("IGUAL", yytext());
            } 
            // fall through
          case 56: break;
          case 11: 
            { return token("PARENABRE", yytext());
            } 
            // fall through
          case 57: break;
          case 12: 
            { return token("PARENCIERRA", yytext());
            } 
            // fall through
          case 58: break;
          case 13: 
            { return token("MAS", yytext());
            } 
            // fall through
          case 59: break;
          case 14: 
            { return token("MENOS", yytext());
            } 
            // fall through
          case 60: break;
          case 15: 
            { return token("PUNTO_COMA", yytext());
            } 
            // fall through
          case 61: break;
          case 16: 
            { return token("DOSPUNTOS", yytext());
            } 
            // fall through
          case 62: break;
          case 17: 
            { return token("LLAVEABRE", yytext());
            } 
            // fall through
          case 63: break;
          case 18: 
            { return token("LLAVECIERRA", yytext());
            } 
            // fall through
          case 64: break;
          case 19: 
            { string.setLength(0); yybegin(STRING);
            } 
            // fall through
          case 65: break;
          case 20: 
            { string.append( yytext() );
            } 
            // fall through
          case 66: break;
          case 21: 
            { yybegin(YYINITIAL);
                                       System.out.println("Soy un string");
                                       return token("STRING", 
                                       string.toString());
            } 
            // fall through
          case 67: break;
          case 22: 
            { string.append('\\');
            } 
            // fall through
          case 68: break;
          case 23: 
            { System.out.println("Reconoci un comentario");
            } 
            // fall through
          case 69: break;
          case 24: 
            { return token("AND", yytext());
            } 
            // fall through
          case 70: break;
          case 25: 
            { return token("OR", yytext());
            } 
            // fall through
          case 71: break;
          case 26: 
            { return token("IS", yytext());
            } 
            // fall through
          case 72: break;
          case 27: 
            { return token("IF", yytext());
            } 
            // fall through
          case 73: break;
          case 28: 
            { return token("DO", yytext());
            } 
            // fall through
          case 74: break;
          case 29: 
            { string.append('\n');
            } 
            // fall through
          case 75: break;
          case 30: 
            { string.append('\t');
            } 
            // fall through
          case 76: break;
          case 31: 
            { string.append('\r');
            } 
            // fall through
          case 77: break;
          case 32: 
            { string.append('\"');
            } 
            // fall through
          case 78: break;
          case 33: 
            { return token("TIPO", yytext());
            } 
            // fall through
          case 79: break;
          case 34: 
            { return token("TRUE", yytext());
            } 
            // fall through
          case 80: break;
          case 35: 
            { return token("FALSE", yytext());
            } 
            // fall through
          case 81: break;
          case 36: 
            { return token("MAIN", yytext());
            } 
            // fall through
          case 82: break;
          case 37: 
            { return token("THEN", yytext());
            } 
            // fall through
          case 83: break;
          case 38: 
            { return token("VARS", yytext());
            } 
            // fall through
          case 84: break;
          case 39: 
            { return token("ELSE", yytext());
            } 
            // fall through
          case 85: break;
          case 40: 
            { return token("CONST", yytext());
            } 
            // fall through
          case 86: break;
          case 41: 
            { return token("UNTIL", yytext());
            } 
            // fall through
          case 87: break;
          case 42: 
            { return token("WHILE", yytext());
            } 
            // fall through
          case 88: break;
          case 43: 
            { return token("RESULT", yytext());
            } 
            // fall through
          case 89: break;
          case 44: 
            { return token("REPEAT", yytext());
            } 
            // fall through
          case 90: break;
          case 45: 
            { return token("BETWEEN", yytext());
            } 
            // fall through
          case 91: break;
          case 46: 
            { return token("FUNCTION", yytext());
            } 
            // fall through
          case 92: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
