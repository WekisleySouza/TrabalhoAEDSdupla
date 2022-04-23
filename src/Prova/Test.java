package Prova;
import java.util.Arrays;
import entities.*;

public class Test {
    private static int failures = 0; 
    private static int[] vetor =         { 1, 3, 5, -3, 2, 10, 4, 20, 100, 2,  30};
    private static int[] vetorOrdenado = {-3, 1, 2,  2, 3, 4,  5, 10, 20,  30, 100};

    // Compara dois vetores e, caso não sejam iguais, exibe uma mensagem de erro com detalhes
    public static void compararVetores(int[] recebido, int[] correto, String mensagemErro){
        if(Arrays.equals(recebido, correto)){return;}
        System.out.println(mensagemErro);
        System.out.println("Você recebeu:");
        OperacoesVetores.imprimeVetor(recebido, recebido.length);
        System.out.println("Mas o certo era:");
        OperacoesVetores.imprimeVetor(correto, correto.length);
        System.out.println("-------------");
        failures += 1;
    }

    public static void testInsertion(){
        Ordenacao insertion = new InsertionSort(vetor, 11);
        compararVetores(
            insertion.getOrdenado(),
            vetorOrdenado,
            "Erro no Insertion Sort"
        );
    }

    public static void testMerge(){
        Ordenacao merge = new MergeSort(vetor, 11);
        compararVetores(
            merge.getOrdenado(),
            vetorOrdenado,
            "Erro no Merge Sort"
        );
    }

    public static void testQuick(){
        Ordenacao quick = new QuickSort(vetor, 11);
        compararVetores(
            quick.getOrdenado(),
            vetorOrdenado,
            "Erro no Quick Sort"
        );
    }

    // Faz testes unitários para cada tipo de ordenação
    public static void main(String[] args) {
		testInsertion();
        testMerge();
        testQuick();

        System.out.println(String.format("Teste completo com um total de %x falhas", failures)); 
	}
}
