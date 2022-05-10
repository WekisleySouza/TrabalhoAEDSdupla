//arquivo de teste, deve ser deletado no envio do trabalho
package entities;

public class TabelaResultado extends Tabela{
	static private int resultadoInteiroTamanho = 10;
	public TabelaResultado() {
		criarEsqueleto();
	}

	//formata float em uma string com apenas os primeiros 4 d√≠gitos
	static public String formataFloat(float numero){
		return String.format("%5.5s", numero);
	} 

	// Cria o esqueleto da tabela.
	private void criarEsqueleto(){
		int lineSize;
		
		lineSize = 11;
		adicionaLinha("ORDENACAO                                                                              VETOR");
		adicionaLinha("----------------------------- --------------------------------------------------------------------------------------------------------------------------------------------------");
		adicionaLinha("METODO      TEMPO TOTAL (ms)                      ACESSOS                         COMPARACOES                           TROCAS                              Extras");
		adicionaLinha("");
		adicionaLinha("=========  ");
		adicionaLinha("Insertion");
		adicionaLinha("Merge");
		adicionaLinha("Quick");
		normalizaTodasLinhas(lineSize);
		for(int i=0; i<5; i++){
			if(i == 0) {
				adicionaNaLinha(3, "5000  10000 30000  ");
				adicionaNaLinha(4, "===== ===== =====  ");
			}else {
				adicionaNaLinha(3, "    5000        10000       30000    ");
				adicionaNaLinha(4, "=========== =========== ===========  ");
			}
		}
	}
	
	// Retorna o index (linha) da categoria que È passada no par‚metro.
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
	
	// Insere o tempo em uma linha da tabela.
	private void inserirTempo(float[] tempoTotal, int index){
		for(int i=0; i<tempoTotal.length; i++){
			adicionaNaLinha(index, formataFloat(tempoTotal[i]));
			adicionaNaLinha(index, " ");
		}
	}
	
	// Intere um inteiro em uma linha da tabela.
	private void inserirInteiros(int[] inteiros, int index){
		adicionaNaLinha(index, " ");
		String numeroString;
		for(int i=0; i<inteiros.length; i++){
			numeroString = inteiroPelaDireita(inteiros[i], resultadoInteiroTamanho);
			adicionaNaLinha(index, numeroString);
			adicionaNaLinha(index, "  ");
		}
	}
	
	// Insere na parte da tabela em que os resultados s„o mostrados.
	public void inserirResultado(
		String categoria, float[] tempoTotal, 
		int[] acessos, int[] comparacoes, 
		int[] trocas, int[] extra, String descreveExtra) {

		int linhaIndex = indexDaCategoria(categoria);
		inserirTempo(tempoTotal, linhaIndex);
		inserirInteiros(acessos, linhaIndex);
		inserirInteiros(comparacoes, linhaIndex);
		inserirInteiros(trocas, linhaIndex);
		inserirInteiros(extra, linhaIndex);
		adicionaNaLinha(linhaIndex, descreveExtra);
		
	}
}
