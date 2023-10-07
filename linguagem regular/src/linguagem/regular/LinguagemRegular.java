
package linguagem.regular;

import java.util.Scanner;
import classes.ExpressaoRegular; 

public class LinguagemRegular {

    public static int telaOpcoes(){
        Scanner leitor = new Scanner(System.in);
        System.out.println("------------------------------------------ \n"
                + "Selecione uma opcao: \n"
                + "1.  Parametro \n"
                + "2.  Funcao \n"
                + "3.  Condicional \n"    
                + "4.  Operacao matematica\n" 
                + "5.  Exercicio 1 \n"
                + "6.  Exercicio 2 \n"
                + "7.  Exercicio 3 \n"
                + "8.  Exercicio 4 \n"
                + "9.  Exercicio 5 \n"
                + "10. Exercicio 6 \n"
                + "11. Exercicio 7 \n"
                + "12. Exercicio 8 \n"
                + "Digite 0 para sair \n"
        + "------------------------------------------");
        System.out.print("Informe o numero da opcao desejada:");
        return leitor.nextInt();
    } 
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int num = -1;
        ExpressaoRegular ex = new ExpressaoRegular();
        do{
            num = telaOpcoes();
            if(num > 13 || num < 0){
                num = 13;
            }
            System.out.print("informe a sentenca:");
            String sentenca = leitor.nextLine();
            boolean resultado = true;
            switch(num){
                case 1:
                    resultado = ex.verificaParametro(sentenca);
                case 2:
                    resultado = ex.verificaFuncao(sentenca);
                case 3:
                    resultado = ex.verificaCondiconal(sentenca);
                case 4:
                    resultado = ex.verificaOperacaoMatematica(sentenca);
                case 5:
                    resultado = ex.comprimentoMaiorIgual3(sentenca);
                case 6:
                    resultado = ex.comprimentoMenorIgual3(sentenca);
                case 7:
                    resultado = ex.comprimentoDiferente3(sentenca);
                case 8:
                    resultado = ex.comprimentoPar(sentenca);
                case 9:
                    resultado = ex.comprimentoImpar(sentenca);
                case 10:
                    resultado = ex.comprimentoMultiplo4(sentenca);
                case 11:
                    resultado = ex.comprimentoQuantidadeParDeA(sentenca);
                case 12:
                    resultado = ex.comprimentoQuantidadeImparDeB(sentenca);
                case 13:
                    System.out.println("Opcao invalida!");
            }
            if(num != 13)
                ex.printValidaçao(resultado, sentenca, num);
        }while(num !=0);
    }
}
