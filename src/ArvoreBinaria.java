public class ArvoreBinaria {

    private No raiz;

    public ArvoreBinaria() {
        this.raiz = null;
    }

    public ArvoreBinaria(int conteudo) {
        this.raiz = new No(conteudo);
    }

    public void inserir(int conteudo) {
        No novoNo = new No(conteudo);
        this.raiz = inserirRecursivoOtimizado(this.raiz, novoNo);
    }

    private No inserirRecursivoOtimizado(No aux, No novoNo) {
        if(aux == null) {
            return novoNo;
        } else if (novoNo.getConteudo() > aux.getConteudo()) {
            aux.setDireita(inserirRecursivoOtimizado(aux.getDireita(), novoNo));
        } else {
            aux.setEsquerda(inserirRecursivoOtimizado(aux.getEsquerda(), novoNo));
        }

        return aux;
    }

    public void visualizar() {
        preOrdem(this.raiz);
        //posOrdem(this.raiz);
        //emOrdem(this.raiz);
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

    public void preOrdemPaiFilho(No pai, No filho) {

        if (filho == null) {
            return;
        }
        if (pai != null) {

            if (filho.getConteudo() > pai.getConteudo()) {
                System.out.println("pai: " + pai.getConteudo()+ " filho direita: " + filho.getConteudo());
            } else {
                System.out.println("pai: " + pai.getConteudo()+ " filho esquerda: " + filho.getConteudo());
            }
        } else {
            System.out.println("pai: null filho: " + filho.getConteudo());

        }

        preOrdemPaiFilho(filho, filho.getEsquerda());
        preOrdemPaiFilho(filho, filho.getDireita());
    }

    public No removerNo (No no) {

        // se o No for folha
        if (no.getEsquerda() == null && no.getDireita() == null) {
            return null;
        }

        // se o No tiver um filho a esquerda
        if (no.getEsquerda() != null && no.getDireita() == null) {
            return no.getEsquerda();
        }

        // se o No tiver um filho a direita
        if (no.getEsquerda() == null && no.getDireita() != null) {
            return no.getDireita();
        }

        // se o No tiver dois filhos

        No aux = no.getEsquerda(); // raiz da subarvore esquerda
        // consegue o pai do maior dos menores
        while(true) {

            if (aux.getDireita() == null) {
                break;
            }

            if (aux.getDireita().getDireita() == null) {
                break;
            }

            aux = aux.getDireita();
        }

        // aux será o pai dos maior dos menores, se aux.getDireita() == null for falso, se verdadeiro aux é o maior dos menores
        if (aux.getDireita() == null) {
            aux.setDireita(no.getDireita());
            return aux;
        }

        // aux = pai dos maior dos menores
        No aux2 = aux.getDireita(); // o maior dos menores sempre fica à direita de seu pai

        aux.setDireita(aux2.getEsquerda()); // o maior dos menores só terá filhos a esquerda

        // redefine os filhos do maior dos menores
        aux2.setDireita(no.getDireita());
        aux2.setEsquerda(no.getEsquerda());

        return aux2;
    }

    public void remover(int valor) {
        removerRecursivo(null,this.raiz,valor);
    }

    public void removerRecursivo(No pai, No filho, int valor) {

        // se filho for null quer dizer que o valor não existe na árvore.
        if (filho == null) {
            return;
        }

        // se o pai for null e o filho for o valor a ser removido, significa que o elemento a ser removido é a raiz (filho == raiz).
        if (pai == null && filho.getConteudo() == valor) {
            this.raiz = removerNo(filho);
            return;
        }
        // se o filho for o elemento que desejamos remover e ele tem pai
        if (pai != null && filho.getConteudo() == valor) {

            // se o filho for maior que o seu pai, significa que ele está à direita do mesmo
            if (filho.getConteudo() > pai.getConteudo()) {
                pai.setDireita(removerNo(filho));
            } else {
                // caso contrário, ele está a esquerda do mesmo
                pai.setEsquerda(removerNo(filho));
            }

            return;
        }

        // vai para os próximos nós da árvore
        removerRecursivo(filho, filho.getEsquerda(),valor);
        removerRecursivo(filho, filho.getDireita(),valor);
    }
}
