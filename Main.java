import java.util.Random;

public class Main {

    public static void main(String[] args) {
        respostaQuestao1();
        respostaQuestao2();
        respostaQuestao3();
        respostaQuestao4();
        respostaQuestao5();
    }


    public static void respostaQuestao1(){

        Random rd = new Random();
        int numero = rd.nextInt(100);
        System.out.printf("%nQuestão 1 - Número gerado aleatoriamente: %d %n", numero);

        int inicio = 0;
        int atual = 1;
        int proximo;

        String mensagem = String.format("Número %d NÃO pertence a sequência Fibonacci", numero);

        for (int i=0; i <= numero; i++) {
            proximo = inicio + atual;
            inicio = atual;
            atual = proximo;

            if (atual == numero) {
                mensagem = String.format("Número: %d pertence a sequência Fibonacci", numero);
                break;
            }
        }
        System.out.printf("Questão 1 - Resposta: %s %n%n", mensagem);
    }


    public static void respostaQuestao2() {
        String string = "banana";

        boolean seContemA = string.toLowerCase().contains("a");
        String mensagem = "";

        if (seContemA == false) {

            mensagem = String.format("Não contém letra A");

        } else {

            int count = 0;
            for(int i = 0; i < string.length(); i++) {
                if (string.charAt(i) == 'a') {
                    count++;
                }
            }
            mensagem = String.format("Contém %d letra(s) A", count);
        }

        System.out.printf("Questão 2 - Resposta: %s %n%n", mensagem);
    }


    public static void respostaQuestao3() {
        System.out.printf("Questão 3 - Resposta: %d %n%n", 77);
    }


    public static void respostaQuestao4() {
        System.out.println("Questão 4 - Resposta: \n a)9 \n b)128 \n c)49 \n d)100 \n e)13 \n f)200 \n");
    }


    public static void respostaQuestao5() {
        System.out.println("Questão 5 - Resposta:\n Eu ligaria o um interruptor e o deixaria ligado por alguns minutos. \n"
        + "Depois, eu o desligaria e ligaria o outro interruptor deixando o terceiro desligado. \n"
        + "Assim veria uma lâmpada ligada. \n"
        + "Uma lâmpada que está apagada, mas quente. \n"
        + "E outra que está apagada e fria seria do ultimo interruptor. \n");
    }

}