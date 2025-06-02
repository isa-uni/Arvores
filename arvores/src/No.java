public class No{
    private No direita;
    private No esquerda;
    private int conteudo;

    public No (int conteudo){
        this.conteudo = conteudo;
        this.direita = null;
        this.esquerda = null; // Inicialmente não há nó anterior, pq o nó anterior aponte para o novo nó como próximo.(Novo no NULL)
    }


    public No getDireita() {return direita;}

    public void setDireita(No direita) {this.direita = direita;}

    public int getConteudo() {return conteudo;}

    public void setConteudo(int conteudo) {
        this.conteudo = conteudo;
    }

    public No getEsquerda() {
        return esquerda;
    }

    public void setEsquerda(No esquerda) {
        this.esquerda = esquerda;
    }
}
