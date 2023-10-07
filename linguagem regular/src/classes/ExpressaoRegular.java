
package classes;

public class ExpressaoRegular {
    //---------------- GERAIS ------------
    private String LETRA = "[A-Za-z]"; 
    private String LETRAS = LETRA + "*";
    private String NUMERO = "[0-9]";
    private String NUMEROS = NUMERO + "*";
    private String CARACTERE = "(" + LETRAS + "|" + NUMERO + ")*" + "(\\.)*";
    private String TYPE = "(void|int|double|float|char|String|boolean)";
    
    //------------------ PARAMETROS --------------------------
    private String PARAMETRO = "\\(" + "(" + TYPE + "\b" + CARACTERE + "(" + "," + TYPE + "\b" + CARACTERE + ")*" + ")" + "\\)";
    
    //----------------- FUNCAO --------------------
    private String STATIC = "(static)?";
    private String ACCESS = "public|private" + "(" + "\b" + "abstract)?";
    private String FUNCAO = ACCESS + "|" + STATIC + "|" + TYPE + "|" + LETRAS + "|" + "(" + PARAMETRO + ")" + "{" + "(.)*" + "}" ;
    
    //----------------- CONDICIONAL ---------------------------
    private String CONDICAO = "if|else";
    private String IGUALDADE = "<|>|=|<=|=>";
    private String CONDICIONAL = CONDICAO + "\\(" + "(" + CARACTERE + "(" + IGUALDADE + CARACTERE + ")?" + ")*" + "\\)";
    
    //------------------ OPERACAO ------------------------
    private String SINAL = "\\-" + "|" + "\\+" + "|" + "\\*" + "|" + "\\/" + "|" + "\\%";
    private String OPERACAO = "\\-?" + CARACTERE + "(" + "(" + SINAL + CARACTERE + ")" + "|" + "(" + SINAL + SINAL + ")" + ")+" ;
    
    //---------------- EXERCICIOS --------------------
    private String COMPRIMENTOIGUALOUMAIOR3 = "(a|b){3,}";
    private String COMPRIMENTOIGUALOUMENOR3 = "(a|b){,3}";
    private String COMPRIMENTODIFERENTE3 = "((a|b){,2}" + "|" + "(a|b){4,})*";
    private String COMPRIMENTOPAR = "((a|b)" + "|" + "(a|b))*";
    private String COMPRIMENTOIMPAR = "(a|b)" + "((a|b)" + "|" + "(a|b))*";
    private String COMPRIMENTOMULTIPLO4 = "((a|b){4})*";
    private String COMPRIMENTOQUANTIDADEPARDEA = "(b*ab*ab*)*";
    private String COMPRIMENTOQUANTIDADEIMPARDEB = "(ba*ba*b)*";
    
    public boolean verificaParametro(String sentenca){
        boolean resultado = sentenca.matches(PARAMETRO);
        return resultado;
    }
    
    public boolean verificaFuncao(String sentenca){
        boolean resultado = sentenca.matches(FUNCAO);
        return resultado;
    }
    
    public boolean verificaCondiconal(String sentenca){
        boolean resultado = sentenca.matches(CONDICIONAL);
        return resultado;
    }
    public boolean verificaOperacaoMatematica(String sentenca){
        boolean resultado = sentenca.matches(OPERACAO);
        return resultado;
    } 
     
    
    public boolean comprimentoMaiorIgual3(String sentenca){
        boolean resultado = sentenca.matches(COMPRIMENTOIGUALOUMAIOR3);
        return resultado;
    }
    
    public boolean comprimentoMenorIgual3(String sentenca){
        boolean resultado = sentenca.matches(COMPRIMENTOIGUALOUMENOR3);
        return resultado;
    }
    
    public boolean comprimentoDiferente3(String sentenca){
        boolean resultado = sentenca.matches(COMPRIMENTODIFERENTE3);
        return resultado;
    }
    public boolean comprimentoPar(String sentenca){
        boolean resultado = sentenca.matches(COMPRIMENTOPAR);
        return resultado;
    }
    public boolean comprimentoImpar(String sentenca){
        boolean resultado = sentenca.matches(COMPRIMENTOIMPAR);
        return resultado;
    }
    public boolean comprimentoMultiplo4(String sentenca){
        boolean resultado = sentenca.matches(COMPRIMENTOMULTIPLO4);
        return resultado;
    }
    public boolean comprimentoQuantidadeParDeA(String sentenca){
        boolean resultado = sentenca.matches(COMPRIMENTOQUANTIDADEPARDEA);
        return resultado;
    }
    public boolean comprimentoQuantidadeImparDeB(String sentenca){
        boolean resultado = sentenca.matches(COMPRIMENTOQUANTIDADEIMPARDEB);
        return resultado;
    }
    public void printValidaçao(boolean resultado, String sentenca,int num){
        System.out.println(num + ")");
        if(resultado)
            System.out.println("W: " + sentenca + " ACEITA!");
        else
            System.out.println("W: " + sentenca + " REJEITADA!");
    }
} 
