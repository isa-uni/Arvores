import com.sun.source.tree.WhileLoopTree;

public class ArvoreDel {
    private No raiz;

    public ArvoreDel(){
        this.raiz = null;
    }

    public void inserirRecursivo(int conteudo) {
        No novoNo = new No(conteudo);
        this.raiz = inserirRecursivo(this.raiz, novoNo);
    }

    private No inserirRecursivo(No atual, No elemento) {
        if(atual == null) {
            return elemento;
        } else if (elemento.getConteudo() > atual.getConteudo()) {
            atual.setDireita(inserirRecursivo(atual.getDireita(), elemento));
        } else {
            atual.setEsquerda(inserirRecursivo(atual.getEsquerda(), elemento));
        }

        return atual;
    }

    //fazer o remover, quando tem dois filhos, sempre pega o maior valor da sub arvore esquerda
    public void remover(int conteudo){
        No novoNo = new No(conteudo);
        this.raiz = deletarRecursivo(this.raiz, novoNo);
    }



    private No deletarRecursivo(No atual, No elemento) {
        if (atual == null) {
            System.out.println("Elemento vazio");
            return null;
        }

        //Vai para a ESQUERDA
        if (elemento.getConteudo() < atual.getConteudo()) {
            atual.setEsquerda(deletarRecursivo(atual.getEsquerda(), elemento));

            //Vai para a DIREITA
        } else if (elemento.getConteudo() > atual.getConteudo()) {
            atual.setDireita(deletarRecursivo(atual.getDireita(), elemento));
        } else { // Encontrou o nó a ser removido
            if (semFilho(atual)) {
                return null;
            }

            if (umFilho(atual)) {
//                então verifica em que lado o filho está
                    if(atual.getDireita() != null){//Se tiver o filho a direita
                        this.raiz = atual.getDireita();
                    }else {//Se o filho for a esquerda
                        this.raiz = atual.getEsquerda();
                    }
                return atual;
            }

            // Dois filhos, remover pela subArvore esquerda
            No filho = atual.getEsquerda();
            No pai = atual;

            //Enquanto existir um filho a direita
            while (filho.getDireita() != null) {
                //O pai vai se tornar o novo filho
                pai = filho;
                //E o filho vai se torna o filho da direita
                filho = filho.getDireita();
            }

            // O No que queremos eliminar vai receber o ultima folha da direita na subArvore Esquerda
            atual.setConteudo(filho.getConteudo());

            //Se a subArv da Esquerda não tiver Nos a direita
            if (pai == atual) {
                //Então o novo pai vai receber o apontamento do filho a esquerda
                pai.setEsquerda(filho.getEsquerda());
            } else {
                // Se não, se a subArv da Esquerda tiver filhos a direita
                //o pai recebe o apontamento da esquerda do seu filho que foi substituido
                pai.setDireita(filho.getEsquerda());
            }
        }

        return atual;
    }


    public boolean umFilho(No atual){
            if ((atual.getEsquerda() != null && atual.getDireita() == null) || (atual.getDireita() != null && atual.getEsquerda() == null)) {
                return true;
            }
            return false;
        }

        public boolean semFilho(No atual){
            if (atual.getEsquerda() == null && atual.getDireita() == null) {
                return true;
            }
            return false;
        }

    public void visualizar() {
        preOrdem(this.raiz);
//        posOrdem(this.raiz);
//        emOrdem(this.raiz);
    }

    public void preOrdem(No no) {
        if(no == null) {
            return;
        }
        System.out.println(no.getConteudo());
        preOrdem(no.getEsquerda());
        preOrdem(no.getDireita());
    }

    public void emOrdem(No no) {
        if(no == null) {
            return;
        }
        emOrdem(no.getEsquerda());
        System.out.println(no.getConteudo());
        emOrdem(no.getDireita());
    }

    public void posOrdem(No no) {
        if(no == null) {
            return;
        }
        posOrdem(no.getEsquerda());
        posOrdem(no.getDireita());
        System.out.println(no.getConteudo());
    }
    }

