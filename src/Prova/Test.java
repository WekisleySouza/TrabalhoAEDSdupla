package Prova;
import java.util.Arrays;
import entities.*;

public class Test {
    private static int failures = 0; 

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

    public static void main(String[] args) {
		int[] vetor =         {1,  3, 5, -3, 2, 10, 4, 20, 100, 2,  30};
        int[] vetorOrdenado = {-3, 1, 2,  2, 3, 4,  5, 10, 20,  30, 100};

		Ordenacao insertion = new IsertionSort(vetor, 11);
        Ordenacao merge = new MergeSort(vetor, 11);
        Ordenacao quick = new QuickSort(vetor, 11);

        compararVetores(
            insertion.getOrdenado(),
            vetorOrdenado,
            "Erro no Insertion Sort"
        );

        compararVetores(
            merge.getOrdenado(),
            vetorOrdenado,
            "Erro no Merge Sort"
        );

        compararVetores(
            quick.getOrdenado(),
            vetorOrdenado,
            "Erro no Quick Sort"
        );

        System.out.println(String.format("Teste completo com um total de %x falhas", failures)); 
	}
}
