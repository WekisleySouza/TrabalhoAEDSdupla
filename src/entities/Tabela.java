package entities;
import java.util.ArrayList;
import java.util.List;

public class Tabela {
    private List<String> linhas;
    
    // Construtor.
    public Tabela(){
        linhas = new ArrayList<>();
    }
   
    // Adiciona linha na tabela.
    public void adicionaLinha(String linha) {
        linhas.add(linha);
    }  

    // Adiciona na linha da tabela.
    public void adicionaNaLinha(int index, String extra) {
        String linha = linhas.get(index) + extra;
        linhas.set(index, linha);
    }

    // Adiciona espaço.
    public void adicionarEspacos(int index, int quantidade) {
        String extra = "";
        for(int i = 0; i < quantidade; i++) {
            extra += " ";
        } 
        adicionaNaLinha(index, extra);
    }

    // Auxilia no ajuste das colunas da tabela.
    public void normalizaLinha(int index, int tamanhoEsperado){
        int tamanhoLinha = tamanhoLinha(index);
        int espacosFaltando = tamanhoEsperado - tamanhoLinha;
        adicionarEspacos(index, espacosFaltando);
    }

    // Retorna tamanho de uma linha.
    public int tamanhoLinha(int index){
        return linhas.get(index).length();
    }
    
    // Auxilia no ajuste de todas as linhas para que as colunas fiquem certas.
    public void normalizaTodasLinhas(int tamanhoEsperado){
        for(int i = 0; i < linhas.size(); i++) {
            normalizaLinha(i, tamanhoEsperado);
        }   
    }

    // Ajusta para que os dados ocupem o mesmo espaço.
    public static String inteiroPelaDireita(int inteiro, int tamanhoString){
        String inteiroString = String.valueOf(inteiro);
        int espacosFaltando = tamanhoString - inteiroString.length();
        for(int i = 0; i < espacosFaltando; i++) {
            inteiroString = " " + inteiroString;
        } 
        return inteiroString;
    }

    // Imprime tabela.
    public void imprimir(){
        for(int i = 0; i < this.linhas.size(); i++) {
            System.out.println(this.linhas.get(i));
        }
    }
}
