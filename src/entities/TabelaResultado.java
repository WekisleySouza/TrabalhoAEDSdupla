//arquivo de teste, deve ser deletado no envio do trabalho
package entities;

public class TabelaResultado extends Tabela{
	public TabelaResultado() {
		criarEsqueleto();
	}

	//formata float em uma string com apenas os primeiros 4 dígitos
	static public String formataFloat(float numero){
		return String.format("%5.5s", numero);
	} 

	private void criarEsqueleto(){
		int lineSize;

		lineSize = 11;
		adicionaLinha("ORDENACAO                                           VETOR");
		adicionaLinha("----------------------------  -------------------------------------------------------");
		adicionaLinha("METODO      TEMPO TOTAL (ms)      ACESSOS           COMPARACOES          TROCAS");
		adicionaLinha("");
		adicionaLinha("=========  ");
		adicionaLinha("Insertion");
		adicionaLinha("Merge");
		adicionaLinha("Quick");
		normalizaTodasLinhas(lineSize);
		for(int i=0; i<4; i++){
			adicionaNaLinha(3, " 5000 10000 30000  ");
			adicionaNaLinha(4, "===== ===== =====  ");
		}
	}

	private int indexDaCategoria(String categoria) {
		int linhaIndex = -1;

		switch(categoria) {
			case "Insertion":
			  linhaIndex = 5;
			  break;
			case "Merge":
			  linhaIndex = 6;
			  break;
			case "Quick":
			  linhaIndex = 7;
			  break;
		  }

		return linhaIndex;
	}

	private void inserirTempo(float[] tempoTotal, int index){
		for(int i=0; i<tempoTotal.length; i++){
			adicionaNaLinha(index, formataFloat(tempoTotal[i]));
			adicionaNaLinha(index, " ");
		}
	}

	private void inserirInteiros(int[] inteiros, int index){
		adicionaNaLinha(index, " ");
		String numeroString;
		for(int i=0; i<inteiros.length; i++){
			numeroString = inteiroPelaDireita(inteiros[i], 5);
			adicionaNaLinha(index, numeroString);
			adicionaNaLinha(index, " ");
		}
	}

	public void inserirResultado(
		String categoria, float[] tempoTotal, 
		int[] acessos, int[] comparacoes, 
		int[] trocas, String extra) {

		int linhaIndex = indexDaCategoria(categoria);
		inserirTempo(tempoTotal, linhaIndex);
		inserirInteiros(acessos, linhaIndex);
		inserirInteiros(comparacoes, linhaIndex);
		inserirInteiros(trocas, linhaIndex);
		adicionaNaLinha(linhaIndex, extra);
		
	}
}
