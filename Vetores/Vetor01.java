public class Vetor01 {
    public static void main(String[] args) {
        
        final int tam = 5;
        char [] alternativas = {'a','a','d','b','b','c'};
        char [] respostas = new char[tam];

        int nota = 0;

        respostas[0]='d';
        respostas[1]='b';
        respostas[2]='c';
        respostas[3]='a';
        respostas[4]='a';
        respostas[5]='c';

        for(int i=0; i<tam;i++){
            if (respostas[i]==alternativas) {
                nota++;
            }
        }
        System.out.println("Nota final: " + nota);
    }
}
