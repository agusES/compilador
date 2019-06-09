
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

package ejemplo.jflex;

import java_cup.runtime.*;
import java.util.ArrayList;
import java.util.List;
import java.io.FileReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class MiParser extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return MiParserSym.class;
}

  /** Default constructor. */
  @Deprecated
  public MiParser() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public MiParser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public MiParser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\063\000\002\002\004\000\002\002\007\000\002\017" +
    "\005\000\002\010\005\000\002\010\004\000\002\007\020" +
    "\000\002\024\005\000\002\003\006\000\002\003\003\000" +
    "\002\004\003\000\002\004\004\000\002\005\007\000\002" +
    "\006\006\000\002\006\003\000\002\011\003\000\002\011" +
    "\004\000\002\012\005\000\002\020\003\000\002\020\004" +
    "\000\002\021\003\000\002\021\004\000\002\022\005\000" +
    "\002\023\003\000\002\023\003\000\002\023\003\000\002" +
    "\023\003\000\002\023\003\000\002\025\005\000\002\025" +
    "\005\000\002\026\005\000\002\026\005\000\002\027\006" +
    "\000\002\027\010\000\002\030\006\000\002\031\006\000" +
    "\002\016\007\000\002\032\007\000\002\032\005\000\002" +
    "\033\005\000\002\033\005\000\002\033\003\000\002\033" +
    "\003\000\002\015\003\000\002\015\003\000\002\015\003" +
    "\000\002\013\005\000\002\013\005\000\002\013\003\000" +
    "\002\014\003\000\002\014\003\000\002\014\005" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\165\000\004\004\005\001\002\000\004\002\167\001" +
    "\002\000\006\005\007\046\010\001\002\000\006\011\043" +
    "\046\044\001\002\000\004\006\011\001\002\000\006\011" +
    "\ufff9\046\ufff9\001\002\000\004\010\012\001\002\000\004" +
    "\042\017\001\002\000\006\007\015\010\012\001\002\000" +
    "\006\007\ufff8\010\ufff8\001\002\000\006\011\ufffa\046\ufffa" +
    "\001\002\000\006\007\ufff7\010\ufff7\001\002\000\004\012" +
    "\020\001\002\000\004\041\021\001\002\000\012\010\022" +
    "\036\024\037\023\045\027\001\002\000\026\007\uffd0\010" +
    "\uffd0\024\uffd0\025\uffd0\026\uffd0\027\uffd0\030\uffd0\033\uffd0" +
    "\040\uffd0\044\uffd0\001\002\000\012\010\022\036\024\037" +
    "\023\045\027\001\002\000\020\007\uffd8\010\uffd8\024\uffd8" +
    "\025\uffd8\030\uffd8\040\uffd8\044\uffd8\001\002\000\024\007" +
    "\uffd2\010\uffd2\024\uffd2\025\uffd2\026\uffd2\027\uffd2\030\uffd2" +
    "\040\uffd2\044\uffd2\001\002\000\012\007\ufff6\010\ufff6\024" +
    "\035\025\036\001\002\000\030\007\uffd1\010\uffd1\024\uffd1" +
    "\025\uffd1\026\uffd1\027\uffd1\030\uffd1\033\uffd1\035\uffd1\040" +
    "\uffd1\044\uffd1\001\002\000\024\007\uffd9\010\uffd9\024\uffd9" +
    "\025\uffd9\026\032\027\031\030\uffd9\040\uffd9\044\uffd9\001" +
    "\002\000\010\010\022\037\023\045\027\001\002\000\010" +
    "\010\022\037\023\045\027\001\002\000\024\007\uffd4\010" +
    "\uffd4\024\uffd4\025\uffd4\026\uffd4\027\uffd4\030\uffd4\040\uffd4" +
    "\044\uffd4\001\002\000\024\007\uffd3\010\uffd3\024\uffd3\025" +
    "\uffd3\026\uffd3\027\uffd3\030\uffd3\040\uffd3\044\uffd3\001\002" +
    "\000\010\010\022\037\023\045\027\001\002\000\010\010" +
    "\022\037\023\045\027\001\002\000\024\007\uffda\010\uffda" +
    "\024\uffda\025\uffda\026\032\027\031\030\uffda\040\uffda\044" +
    "\uffda\001\002\000\024\007\uffdb\010\uffdb\024\uffdb\025\uffdb" +
    "\026\032\027\031\030\uffdb\040\uffdb\044\uffdb\001\002\000" +
    "\010\024\035\025\036\040\042\001\002\000\030\007\uffcf" +
    "\010\uffcf\024\uffcf\025\uffcf\026\uffcf\027\uffcf\030\uffcf\033" +
    "\uffcf\035\uffcf\040\uffcf\044\uffcf\001\002\000\004\006\155" +
    "\001\002\000\014\010\ufff4\013\ufff4\015\ufff4\020\ufff4\022" +
    "\ufff4\001\002\000\004\013\047\001\002\000\012\010\074" +
    "\015\073\020\066\022\076\001\002\000\004\010\050\001" +
    "\002\000\004\037\051\001\002\000\004\010\052\001\002" +
    "\000\004\042\152\001\002\000\006\010\052\040\056\001" +
    "\002\000\006\010\uffee\040\uffee\001\002\000\006\010\uffed" +
    "\040\uffed\001\002\000\004\042\057\001\002\000\004\012" +
    "\060\001\002\000\004\043\061\001\002\000\004\006\062" +
    "\001\002\000\006\005\007\046\010\001\002\000\006\011" +
    "\043\046\044\001\002\000\012\010\074\015\073\020\066" +
    "\022\076\001\002\000\004\030\uffe9\001\002\000\004\037" +
    "\107\001\002\000\004\030\uffe7\001\002\000\004\030\146" +
    "\001\002\000\004\030\uffe8\001\002\000\004\030\uffea\001" +
    "\002\000\004\037\107\001\002\000\004\041\123\001\002" +
    "\000\004\030\uffeb\001\002\000\004\037\107\001\002\000" +
    "\014\010\074\014\102\015\073\020\066\022\076\001\002" +
    "\000\004\030\106\001\002\000\004\007\105\001\002\000" +
    "\004\041\103\001\002\000\012\010\022\036\024\037\023" +
    "\045\027\001\002\000\010\007\ufffb\024\035\025\036\001" +
    "\002\000\012\010\ufffc\015\ufffc\020\ufffc\022\ufffc\001\002" +
    "\000\020\002\ufffe\007\ufffe\010\ufffe\014\ufffe\015\ufffe\020" +
    "\ufffe\022\ufffe\001\002\000\012\010\022\036\024\037\023" +
    "\045\027\001\002\000\004\023\111\001\002\000\004\006" +
    "\112\001\002\000\012\010\074\015\073\020\066\022\076" +
    "\001\002\000\004\030\uffdf\001\002\000\014\007\115\010" +
    "\074\015\073\020\066\022\076\001\002\000\006\017\uffff" +
    "\030\uffff\001\002\000\012\024\035\025\036\040\120\044" +
    "\117\001\002\000\012\010\022\036\024\037\023\045\027" +
    "\001\002\000\010\016\uffdc\021\uffdc\023\uffdc\001\002\000" +
    "\010\024\035\025\036\040\122\001\002\000\010\016\uffdd" +
    "\021\uffdd\023\uffdd\001\002\000\016\010\131\031\125\032" +
    "\130\036\024\037\023\045\027\001\002\000\004\030\uffe5" +
    "\001\002\000\004\030\uffd7\001\002\000\010\024\035\025" +
    "\036\030\uffe6\001\002\000\004\030\uffe3\001\002\000\004" +
    "\030\uffd6\001\002\000\020\024\uffd0\025\uffd0\026\uffd0\027" +
    "\uffd0\030\uffd0\035\uffd0\041\123\001\002\000\004\030\uffe4" +
    "\001\002\000\016\024\uffd2\025\uffd2\026\uffd2\027\uffd2\030" +
    "\uffd2\035\135\001\002\000\004\030\uffd5\001\002\000\010" +
    "\010\022\037\023\045\027\001\002\000\004\033\137\001" +
    "\002\000\010\010\022\037\023\045\027\001\002\000\004" +
    "\030\uffde\001\002\000\004\016\142\001\002\000\004\006" +
    "\112\001\002\000\006\017\144\030\uffe2\001\002\000\004" +
    "\006\112\001\002\000\004\030\uffe1\001\002\000\020\002" +
    "\ufffd\007\ufffd\010\ufffd\014\ufffd\015\ufffd\020\ufffd\022\ufffd" +
    "\001\002\000\004\021\150\001\002\000\004\006\112\001" +
    "\002\000\004\030\uffe0\001\002\000\004\012\153\001\002" +
    "\000\006\010\uffec\040\uffec\001\002\000\014\002\000\010" +
    "\074\015\073\020\066\022\076\001\002\000\004\010\156" +
    "\001\002\000\006\010\ufff0\042\ufff0\001\002\000\006\007" +
    "\ufff3\010\ufff3\001\002\000\006\010\164\042\165\001\002" +
    "\000\006\007\163\010\156\001\002\000\006\007\ufff2\010" +
    "\ufff2\001\002\000\014\010\ufff5\013\ufff5\015\ufff5\020\ufff5" +
    "\022\ufff5\001\002\000\006\010\uffef\042\uffef\001\002\000" +
    "\004\012\166\001\002\000\006\007\ufff1\010\ufff1\001\002" +
    "\000\004\002\001\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\165\000\004\002\003\001\001\000\002\001\001\000" +
    "\004\003\005\001\001\000\004\006\044\001\001\000\002" +
    "\001\001\000\002\001\001\000\006\004\012\005\013\001" +
    "\001\000\002\001\001\000\004\005\015\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\010\013\027\014\024\033\025" +
    "\001\001\000\002\001\001\000\010\013\027\014\024\033" +
    "\040\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\004\014" +
    "\033\001\001\000\004\014\032\001\001\000\002\001\001" +
    "\000\002\001\001\000\006\013\037\014\024\001\001\000" +
    "\006\013\036\014\024\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\004\007\045\001\001\000\020" +
    "\010\153\023\067\025\074\026\071\027\064\030\070\031" +
    "\066\001\001\000\002\001\001\000\002\001\001\000\006" +
    "\021\052\022\053\001\001\000\002\001\001\000\004\022" +
    "\054\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\004\003\062\001\001\000\004\006\063\001\001" +
    "\000\020\010\076\023\067\025\074\026\071\027\064\030" +
    "\070\031\066\001\001\000\002\001\001\000\004\032\146" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\004\032\140\001\001\000\002" +
    "\001\001\000\002\001\001\000\004\032\107\001\001\000" +
    "\020\023\077\024\100\025\074\026\071\027\064\030\070" +
    "\031\066\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\010\013\027\014\024\033\103\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\010\013\027\014\024\033\115\001\001\000\002\001\001" +
    "\000\004\017\112\001\001\000\020\010\113\023\067\025" +
    "\074\026\071\027\064\030\070\031\066\001\001\000\002" +
    "\001\001\000\016\023\077\025\074\026\071\027\064\030" +
    "\070\031\066\001\001\000\002\001\001\000\002\001\001" +
    "\000\010\013\027\014\024\033\120\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\020\013\027" +
    "\014\132\015\123\016\133\025\131\026\126\033\125\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\004" +
    "\014\135\001\001\000\002\001\001\000\004\014\137\001" +
    "\001\000\002\001\001\000\002\001\001\000\004\017\142" +
    "\001\001\000\002\001\001\000\004\017\144\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\004" +
    "\017\150\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\016\023\077\025\074\026\071\027\064" +
    "\030\070\031\066\001\001\000\010\011\160\012\156\020" +
    "\157\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\006\012\161\020\157\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$MiParser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$MiParser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$MiParser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



    public void syntax_error(Symbol s){
        System.out.println("Error en la linea "+ (s.left+1)+ " Columna "+ s.right+ ". Valor simbolo '"
        +s.value+"' . Simbolo n° "+s.sym+ " no reconocido." );
    }

    public void unrecovered_syntax_error(Symbol s) throws java.lang.Exception{
        System.out.println("Error en la linea "+ (s.left+1)+ " Columna "+ s.right+ ". Valor simbolo '"
        +s.value+"' . Simbolo n° "+s.sym+ " no reconocido." );
    }



/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$MiParser$actions {
  private final MiParser parser;

  /** Constructor */
  CUP$MiParser$actions(MiParser parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$MiParser$do_action_part00000000(
    int                        CUP$MiParser$act_num,
    java_cup.runtime.lr_parser CUP$MiParser$parser,
    java.util.Stack            CUP$MiParser$stack,
    int                        CUP$MiParser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$MiParser$result;

      /* select the action based on the action number */
      switch (CUP$MiParser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= programa EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$MiParser$stack.elementAt(CUP$MiParser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$MiParser$stack.elementAt(CUP$MiParser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$MiParser$stack.elementAt(CUP$MiParser$top-1)).value;
		RESULT = start_val;
              CUP$MiParser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$MiParser$stack.elementAt(CUP$MiParser$top-1)), ((java_cup.runtime.Symbol)CUP$MiParser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$MiParser$parser.done_parsing();
          return CUP$MiParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // programa ::= MAIN const vars func sentencias 
            {
              Object RESULT =null;
		  
                System.out.println("Soy un Programa");
            
              CUP$MiParser$result = parser.getSymbolFactory().newSymbol("programa",0, ((java_cup.runtime.Symbol)CUP$MiParser$stack.elementAt(CUP$MiParser$top-4)), ((java_cup.runtime.Symbol)CUP$MiParser$stack.peek()), RESULT);
            }
          return CUP$MiParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // bloque ::= LLAVEABRE sentencias LLAVECIERRA 
            {
              Object RESULT =null;
		 System.out.println("Soy un bloque");
              CUP$MiParser$result = parser.getSymbolFactory().newSymbol("bloque",13, ((java_cup.runtime.Symbol)CUP$MiParser$stack.elementAt(CUP$MiParser$top-2)), ((java_cup.runtime.Symbol)CUP$MiParser$stack.peek()), RESULT);
            }
          return CUP$MiParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // sentencias ::= sentencias sentencia PUNTO_COMA 
            {
              Object RESULT =null;
		
              CUP$MiParser$result = parser.getSymbolFactory().newSymbol("sentencias",6, ((java_cup.runtime.Symbol)CUP$MiParser$stack.elementAt(CUP$MiParser$top-2)), ((java_cup.runtime.Symbol)CUP$MiParser$stack.peek()), RESULT);
            }
          return CUP$MiParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // sentencias ::= sentencia PUNTO_COMA 
            {
              Object RESULT =null;
		
              CUP$MiParser$result = parser.getSymbolFactory().newSymbol("sentencias",6, ((java_cup.runtime.Symbol)CUP$MiParser$stack.elementAt(CUP$MiParser$top-1)), ((java_cup.runtime.Symbol)CUP$MiParser$stack.peek()), RESULT);
            }
          return CUP$MiParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // func ::= FUNCTION ID PARENABRE parametros PARENCIERRA DOSPUNTOS TIPO IS LLAVEABRE const vars sentencias return LLAVECIERRA 
            {
              Object RESULT =null;
		
                System.out.println("SOY UNA FUNCION");


              CUP$MiParser$result = parser.getSymbolFactory().newSymbol("func",5, ((java_cup.runtime.Symbol)CUP$MiParser$stack.elementAt(CUP$MiParser$top-13)), ((java_cup.runtime.Symbol)CUP$MiParser$stack.peek()), RESULT);
            }
          return CUP$MiParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // return ::= RESULT IGUAL exp 
            {
              Object RESULT =null;
		
                System.out.println("SOY EL RETURN");


              CUP$MiParser$result = parser.getSymbolFactory().newSymbol("return",18, ((java_cup.runtime.Symbol)CUP$MiParser$stack.elementAt(CUP$MiParser$top-2)), ((java_cup.runtime.Symbol)CUP$MiParser$stack.peek()), RESULT);
            }
          return CUP$MiParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // const ::= CONST LLAVEABRE constantes LLAVECIERRA 
            {
              Object RESULT =null;
		  
                System.out.println("SECTOR CONSTANTES");
            
              CUP$MiParser$result = parser.getSymbolFactory().newSymbol("const",1, ((java_cup.runtime.Symbol)CUP$MiParser$stack.elementAt(CUP$MiParser$top-3)), ((java_cup.runtime.Symbol)CUP$MiParser$stack.peek()), RESULT);
            }
          return CUP$MiParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // const ::= NADA 
            {
              Object RESULT =null;
		
                System.out.println("NO HAY CONSTANTES");

              CUP$MiParser$result = parser.getSymbolFactory().newSymbol("const",1, ((java_cup.runtime.Symbol)CUP$MiParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$MiParser$stack.peek()), RESULT);
            }
          return CUP$MiParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // constantes ::= constante 
            {
              Object RESULT =null;
		
                System.out.println("UNA CONSTANTE");

            
              CUP$MiParser$result = parser.getSymbolFactory().newSymbol("constantes",2, ((java_cup.runtime.Symbol)CUP$MiParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$MiParser$stack.peek()), RESULT);
            }
          return CUP$MiParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // constantes ::= constantes constante 
            {
              Object RESULT =null;
		
                System.out.println("VARIAS CONSTANTES");

              CUP$MiParser$result = parser.getSymbolFactory().newSymbol("constantes",2, ((java_cup.runtime.Symbol)CUP$MiParser$stack.elementAt(CUP$MiParser$top-1)), ((java_cup.runtime.Symbol)CUP$MiParser$stack.peek()), RESULT);
            }
          return CUP$MiParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // constante ::= ID DOSPUNTOS TIPO IGUAL exp 
            {
              Object RESULT =null;
		
                System.out.println("CONSTANTE");


              CUP$MiParser$result = parser.getSymbolFactory().newSymbol("constante",3, ((java_cup.runtime.Symbol)CUP$MiParser$stack.elementAt(CUP$MiParser$top-4)), ((java_cup.runtime.Symbol)CUP$MiParser$stack.peek()), RESULT);
            }
          return CUP$MiParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // vars ::= VARS LLAVEABRE variables LLAVECIERRA 
            {
              Object RESULT =null;
		  
                System.out.println("SECTOR VARIABLES");
            
              CUP$MiParser$result = parser.getSymbolFactory().newSymbol("vars",4, ((java_cup.runtime.Symbol)CUP$MiParser$stack.elementAt(CUP$MiParser$top-3)), ((java_cup.runtime.Symbol)CUP$MiParser$stack.peek()), RESULT);
            }
          return CUP$MiParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // vars ::= NADA 
            {
              Object RESULT =null;
		
                System.out.println("NO HAY VARIABLES");

              CUP$MiParser$result = parser.getSymbolFactory().newSymbol("vars",4, ((java_cup.runtime.Symbol)CUP$MiParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$MiParser$stack.peek()), RESULT);
            }
          return CUP$MiParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // variables ::= variable 
            {
              Object RESULT =null;
		
                System.out.println("UNA VARIABLE");


              CUP$MiParser$result = parser.getSymbolFactory().newSymbol("variables",7, ((java_cup.runtime.Symbol)CUP$MiParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$MiParser$stack.peek()), RESULT);
            }
          return CUP$MiParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // variables ::= variables variable 
            {
              Object RESULT =null;
		
                System.out.println("VARIAS VARIABLES");


              CUP$MiParser$result = parser.getSymbolFactory().newSymbol("variables",7, ((java_cup.runtime.Symbol)CUP$MiParser$stack.elementAt(CUP$MiParser$top-1)), ((java_cup.runtime.Symbol)CUP$MiParser$stack.peek()), RESULT);
            }
          return CUP$MiParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // variable ::= ids DOSPUNTOS TIPO 
            {
              Object RESULT =null;
		
                System.out.println("VARIABLE");


              CUP$MiParser$result = parser.getSymbolFactory().newSymbol("variable",8, ((java_cup.runtime.Symbol)CUP$MiParser$stack.elementAt(CUP$MiParser$top-2)), ((java_cup.runtime.Symbol)CUP$MiParser$stack.peek()), RESULT);
            }
          return CUP$MiParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // ids ::= ID 
            {
              Object RESULT =null;
		
        System.out.println("UN ID");


              CUP$MiParser$result = parser.getSymbolFactory().newSymbol("ids",14, ((java_cup.runtime.Symbol)CUP$MiParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$MiParser$stack.peek()), RESULT);
            }
          return CUP$MiParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // ids ::= ids ID 
            {
              Object RESULT =null;
		
        System.out.println("VARIOS IDS");


              CUP$MiParser$result = parser.getSymbolFactory().newSymbol("ids",14, ((java_cup.runtime.Symbol)CUP$MiParser$stack.elementAt(CUP$MiParser$top-1)), ((java_cup.runtime.Symbol)CUP$MiParser$stack.peek()), RESULT);
            }
          return CUP$MiParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // parametros ::= parametro 
            {
              Object RESULT =null;
		
        System.out.println("UN PARAMETRO");


              CUP$MiParser$result = parser.getSymbolFactory().newSymbol("parametros",15, ((java_cup.runtime.Symbol)CUP$MiParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$MiParser$stack.peek()), RESULT);
            }
          return CUP$MiParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // parametros ::= parametros parametro 
            {
              Object RESULT =null;
		
        System.out.println("VARIOS PARAMETROs");


              CUP$MiParser$result = parser.getSymbolFactory().newSymbol("parametros",15, ((java_cup.runtime.Symbol)CUP$MiParser$stack.elementAt(CUP$MiParser$top-1)), ((java_cup.runtime.Symbol)CUP$MiParser$stack.peek()), RESULT);
            }
          return CUP$MiParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // parametro ::= ID DOSPUNTOS TIPO 
            {
              Object RESULT =null;

              CUP$MiParser$result = parser.getSymbolFactory().newSymbol("parametro",16, ((java_cup.runtime.Symbol)CUP$MiParser$stack.elementAt(CUP$MiParser$top-2)), ((java_cup.runtime.Symbol)CUP$MiParser$stack.peek()), RESULT);
            }
          return CUP$MiParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // sentencia ::= asig 
            {
              Object RESULT =null;

              CUP$MiParser$result = parser.getSymbolFactory().newSymbol("sentencia",17, ((java_cup.runtime.Symbol)CUP$MiParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$MiParser$stack.peek()), RESULT);
            }
          return CUP$MiParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // sentencia ::= asigs 
            {
              Object RESULT =null;

              CUP$MiParser$result = parser.getSymbolFactory().newSymbol("sentencia",17, ((java_cup.runtime.Symbol)CUP$MiParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$MiParser$stack.peek()), RESULT);
            }
          return CUP$MiParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // sentencia ::= if 
            {
              Object RESULT =null;

              CUP$MiParser$result = parser.getSymbolFactory().newSymbol("sentencia",17, ((java_cup.runtime.Symbol)CUP$MiParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$MiParser$stack.peek()), RESULT);
            }
          return CUP$MiParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // sentencia ::= while 
            {
              Object RESULT =null;

              CUP$MiParser$result = parser.getSymbolFactory().newSymbol("sentencia",17, ((java_cup.runtime.Symbol)CUP$MiParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$MiParser$stack.peek()), RESULT);
            }
          return CUP$MiParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // sentencia ::= until 
            {
              Object RESULT =null;

              CUP$MiParser$result = parser.getSymbolFactory().newSymbol("sentencia",17, ((java_cup.runtime.Symbol)CUP$MiParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$MiParser$stack.peek()), RESULT);
            }
          return CUP$MiParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // asig ::= ID IGUAL exp 
            {
              Object RESULT =null;
		
    System.out.println("soy una asignacion comun");

              CUP$MiParser$result = parser.getSymbolFactory().newSymbol("asig",19, ((java_cup.runtime.Symbol)CUP$MiParser$stack.elementAt(CUP$MiParser$top-2)), ((java_cup.runtime.Symbol)CUP$MiParser$stack.peek()), RESULT);
            }
          return CUP$MiParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 28: // asig ::= ID IGUAL expbool 
            {
              Object RESULT =null;
		System.out.println("soy una asignacion booleana"); 
              CUP$MiParser$result = parser.getSymbolFactory().newSymbol("asig",19, ((java_cup.runtime.Symbol)CUP$MiParser$stack.elementAt(CUP$MiParser$top-2)), ((java_cup.runtime.Symbol)CUP$MiParser$stack.peek()), RESULT);
            }
          return CUP$MiParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 29: // asigs ::= ID IGUAL asig 
            {
              Object RESULT =null;
		


              CUP$MiParser$result = parser.getSymbolFactory().newSymbol("asigs",20, ((java_cup.runtime.Symbol)CUP$MiParser$stack.elementAt(CUP$MiParser$top-2)), ((java_cup.runtime.Symbol)CUP$MiParser$stack.peek()), RESULT);
            }
          return CUP$MiParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 30: // asigs ::= ID IGUAL asigs 
            {
              Object RESULT =null;
		


              CUP$MiParser$result = parser.getSymbolFactory().newSymbol("asigs",20, ((java_cup.runtime.Symbol)CUP$MiParser$stack.elementAt(CUP$MiParser$top-2)), ((java_cup.runtime.Symbol)CUP$MiParser$stack.peek()), RESULT);
            }
          return CUP$MiParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 31: // if ::= IF condicion THEN bloque 
            {
              Object RESULT =null;
		 
                System.out.println("Soy un if");
       
              CUP$MiParser$result = parser.getSymbolFactory().newSymbol("if",21, ((java_cup.runtime.Symbol)CUP$MiParser$stack.elementAt(CUP$MiParser$top-3)), ((java_cup.runtime.Symbol)CUP$MiParser$stack.peek()), RESULT);
            }
          return CUP$MiParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 32: // if ::= IF condicion THEN bloque ELSE bloque 
            {
              Object RESULT =null;
		
                System.out.println("Soy un if con else");
       
              CUP$MiParser$result = parser.getSymbolFactory().newSymbol("if",21, ((java_cup.runtime.Symbol)CUP$MiParser$stack.elementAt(CUP$MiParser$top-5)), ((java_cup.runtime.Symbol)CUP$MiParser$stack.peek()), RESULT);
            }
          return CUP$MiParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 33: // while ::= WHILE condicion DO bloque 
            {
              Object RESULT =null;
		System.out.println("Soy un while");
              CUP$MiParser$result = parser.getSymbolFactory().newSymbol("while",22, ((java_cup.runtime.Symbol)CUP$MiParser$stack.elementAt(CUP$MiParser$top-3)), ((java_cup.runtime.Symbol)CUP$MiParser$stack.peek()), RESULT);
            }
          return CUP$MiParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 34: // until ::= UNTIL condicion REPEAT bloque 
            {
              Object RESULT =null;
		System.out.println("Soy un until");
              CUP$MiParser$result = parser.getSymbolFactory().newSymbol("until",23, ((java_cup.runtime.Symbol)CUP$MiParser$stack.elementAt(CUP$MiParser$top-3)), ((java_cup.runtime.Symbol)CUP$MiParser$stack.peek()), RESULT);
            }
          return CUP$MiParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 35: // between ::= factor BETWEEN factor AND factor 
            {
              Object RESULT =null;
		System.out.println("Soy un between");
              CUP$MiParser$result = parser.getSymbolFactory().newSymbol("between",12, ((java_cup.runtime.Symbol)CUP$MiParser$stack.elementAt(CUP$MiParser$top-4)), ((java_cup.runtime.Symbol)CUP$MiParser$stack.peek()), RESULT);
            }
          return CUP$MiParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 36: // condicion ::= PARENABRE exp COMPARADOR exp PARENCIERRA 
            {
              Object RESULT =null;

              CUP$MiParser$result = parser.getSymbolFactory().newSymbol("condicion",24, ((java_cup.runtime.Symbol)CUP$MiParser$stack.elementAt(CUP$MiParser$top-4)), ((java_cup.runtime.Symbol)CUP$MiParser$stack.peek()), RESULT);
            }
          return CUP$MiParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 37: // condicion ::= PARENABRE exp PARENCIERRA 
            {
              Object RESULT =null;

              CUP$MiParser$result = parser.getSymbolFactory().newSymbol("condicion",24, ((java_cup.runtime.Symbol)CUP$MiParser$stack.elementAt(CUP$MiParser$top-2)), ((java_cup.runtime.Symbol)CUP$MiParser$stack.peek()), RESULT);
            }
          return CUP$MiParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 38: // exp ::= exp MAS termino 
            {
              Object RESULT =null;
		
                System.out.println("expresion::=expresion+factor;");
            
              CUP$MiParser$result = parser.getSymbolFactory().newSymbol("exp",25, ((java_cup.runtime.Symbol)CUP$MiParser$stack.elementAt(CUP$MiParser$top-2)), ((java_cup.runtime.Symbol)CUP$MiParser$stack.peek()), RESULT);
            }
          return CUP$MiParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 39: // exp ::= exp MENOS termino 
            {
              Object RESULT =null;
		
                System.out.println("expresion::=expresion-factor;");
            
              CUP$MiParser$result = parser.getSymbolFactory().newSymbol("exp",25, ((java_cup.runtime.Symbol)CUP$MiParser$stack.elementAt(CUP$MiParser$top-2)), ((java_cup.runtime.Symbol)CUP$MiParser$stack.peek()), RESULT);
            }
          return CUP$MiParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 40: // exp ::= termino 
            {
              Object RESULT =null;
		
                System.out.println("expresion::=termino;");
            
              CUP$MiParser$result = parser.getSymbolFactory().newSymbol("exp",25, ((java_cup.runtime.Symbol)CUP$MiParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$MiParser$stack.peek()), RESULT);
            }
          return CUP$MiParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 41: // exp ::= STRING 
            {
              Object RESULT =null;
		int sleft = ((java_cup.runtime.Symbol)CUP$MiParser$stack.peek()).left;
		int sright = ((java_cup.runtime.Symbol)CUP$MiParser$stack.peek()).right;
		Object s = (Object)((java_cup.runtime.Symbol) CUP$MiParser$stack.peek()).value;
		System.out.println("expresion::=string: " + s + ";");
              CUP$MiParser$result = parser.getSymbolFactory().newSymbol("exp",25, ((java_cup.runtime.Symbol)CUP$MiParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$MiParser$stack.peek()), RESULT);
            }
          return CUP$MiParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 42: // expbool ::= TRUE 
            {
              Object RESULT =null;
		
                System.out.println("expresion::=between;");
            
              CUP$MiParser$result = parser.getSymbolFactory().newSymbol("expbool",11, ((java_cup.runtime.Symbol)CUP$MiParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$MiParser$stack.peek()), RESULT);
            }
          return CUP$MiParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 43: // expbool ::= FALSE 
            {
              Object RESULT =null;
		 System.out.println("expresion::=between;");
            
              CUP$MiParser$result = parser.getSymbolFactory().newSymbol("expbool",11, ((java_cup.runtime.Symbol)CUP$MiParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$MiParser$stack.peek()), RESULT);
            }
          return CUP$MiParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 44: // expbool ::= between 
            {
              Object RESULT =null;
		
                System.out.println("expresion::=between;");
            
              CUP$MiParser$result = parser.getSymbolFactory().newSymbol("expbool",11, ((java_cup.runtime.Symbol)CUP$MiParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$MiParser$stack.peek()), RESULT);
            }
          return CUP$MiParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 45: // termino ::= termino POR factor 
            {
              Object RESULT =null;
		
                System.out.println("termino::=factor*termino;");
            
              CUP$MiParser$result = parser.getSymbolFactory().newSymbol("termino",9, ((java_cup.runtime.Symbol)CUP$MiParser$stack.elementAt(CUP$MiParser$top-2)), ((java_cup.runtime.Symbol)CUP$MiParser$stack.peek()), RESULT);
            }
          return CUP$MiParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 46: // termino ::= termino DIVIDIDO factor 
            {
              Object RESULT =null;
		
                System.out.println("termino::=factor/termino;");
            
              CUP$MiParser$result = parser.getSymbolFactory().newSymbol("termino",9, ((java_cup.runtime.Symbol)CUP$MiParser$stack.elementAt(CUP$MiParser$top-2)), ((java_cup.runtime.Symbol)CUP$MiParser$stack.peek()), RESULT);
            }
          return CUP$MiParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 47: // termino ::= factor 
            {
              Object RESULT =null;
		
                System.out.println("termino::=factor;");
            
              CUP$MiParser$result = parser.getSymbolFactory().newSymbol("termino",9, ((java_cup.runtime.Symbol)CUP$MiParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$MiParser$stack.peek()), RESULT);
            }
          return CUP$MiParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 48: // factor ::= ENTERO 
            {
              Object RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$MiParser$stack.peek()).left;
		int eright = ((java_cup.runtime.Symbol)CUP$MiParser$stack.peek()).right;
		Object e = (Object)((java_cup.runtime.Symbol) CUP$MiParser$stack.peek()).value;
		
                System.out.println("factor::="+e+";");
             
              CUP$MiParser$result = parser.getSymbolFactory().newSymbol("factor",10, ((java_cup.runtime.Symbol)CUP$MiParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$MiParser$stack.peek()), RESULT);
            }
          return CUP$MiParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 49: // factor ::= ID 
            {
              Object RESULT =null;
		int identificadorleft = ((java_cup.runtime.Symbol)CUP$MiParser$stack.peek()).left;
		int identificadorright = ((java_cup.runtime.Symbol)CUP$MiParser$stack.peek()).right;
		Object identificador = (Object)((java_cup.runtime.Symbol) CUP$MiParser$stack.peek()).value;
		
                System.out.println("factor::=" + identificador +";");
             
              CUP$MiParser$result = parser.getSymbolFactory().newSymbol("factor",10, ((java_cup.runtime.Symbol)CUP$MiParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$MiParser$stack.peek()), RESULT);
            }
          return CUP$MiParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 50: // factor ::= PARENABRE exp PARENCIERRA 
            {
              Object RESULT =null;
		
                System.out.println("factor::=(expresion);");
            
              CUP$MiParser$result = parser.getSymbolFactory().newSymbol("factor",10, ((java_cup.runtime.Symbol)CUP$MiParser$stack.elementAt(CUP$MiParser$top-2)), ((java_cup.runtime.Symbol)CUP$MiParser$stack.peek()), RESULT);
            }
          return CUP$MiParser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$MiParser$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$MiParser$do_action(
    int                        CUP$MiParser$act_num,
    java_cup.runtime.lr_parser CUP$MiParser$parser,
    java.util.Stack            CUP$MiParser$stack,
    int                        CUP$MiParser$top)
    throws java.lang.Exception
    {
              return CUP$MiParser$do_action_part00000000(
                               CUP$MiParser$act_num,
                               CUP$MiParser$parser,
                               CUP$MiParser$stack,
                               CUP$MiParser$top);
    }
}

}
