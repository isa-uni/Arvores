//public class Arvore {
//
//    private No raiz;
//
//    public Arvore(){
//        this.raiz = null;
//    }
//    private No deletarRecursivo(No atual, No elemento) {
//        //Se o elemento for nulo
//        if (atual == null) {
//            System.out.println("Elemento vazio");
//            return null;
//        }else {
//            if (atual.getConteudo() == elemento.getConteudo()){
//                //Se não tiver filhos então torna o conteudo nulo
//                if (semFilho(atual)) {
//                    this.raiz = null;
//                    return atual;
//
//                } else if (umFilho(atual)) {//Se ele tiver um filho
//                    //então verifica em que lado o filho está
//                    if(atual.getDireita() != null){//Se tiver o filho a direita
//                        this.raiz = atual.getDireita();
//                    }else {//Se o filho for a esquerda
//                        this.raiz = atual.getEsquerda();
//                    }
//                    return atual;
//
//                }else {//Se ele tiver dois filhos
//
//                    // Começa na subárvore esquerda
//                    No neto = atual.getEsquerda();
//                    //Variavel auxiliar, para guardar um no anterior
//                    anterior = atual;
//
//                    // Vai até o maior valor da subárvore esquerda (mais à direita)
//                    //Se os netos a direita tiver conteudo
//                    while (neto.getDireita() != null){
//                        anterior = neto;
//                        neto = neto.getDireita();
//                    }
//                    //O elemento que queremos deletar vai receber a ultima folha da direita, na subarvore esquerda
//                    atual.setConteudo(neto.getConteudo());
//                    //eliminando o neto
//                    if (anterior == atual) {
//                        atual.setEsquerda(neto.getEsquerda());
//                    } else {
//                        // O anterior aponta para o filho esquerdo do neto
//                        anterior.setDireita(neto.getEsquerda());
//                    }
//                    return atual;
//                }
//            }
//            //Vai para a DIREITA
//            if (elemento.getConteudo() > atual.getConteudo()) {
//                filho = atual.getDireita();
//
//                //Verifica se o conteudo a direita é igual a elemento
//                if (filho.getConteudo() == elemento.getConteudo()) {
//
//                    //Se não tiver filhos então torna o conteudo nulo
//                    if (semFilho(filho)) {
//                        atual.setDireita(null);
//                        return atual;
//
//                    } else if (umFilho(filho)) {//Se ele tiver um filho
//                        //então verifica em que lado o filho está
//                        if(filho.getDireita() != null){//Se tiver o filho a direita
//                            atual.setDireita(filho.getDireita());
//                        }else {//Se o filho for a esquerda
//                            atual.setDireita(filho.getEsquerda());
//                        }
//                        return atual;
//
//                    }else {
//                        doisFilhos(atual);
//                        return atual;
//                    }
//                } else { //Se o elemento for nulo ou diferente do procurado
//                    //chamada recursiva
//                    atual.setDireita(deletarRecursivo(atual.getDireita(), elemento));
//                }
//            } else {//ESQUERDA
//                filho = atual.getEsquerda();
//                //Verifica se o conteudo a direita é igual a elemento
//                if (filho.getConteudo() == elemento.getConteudo()) {
//
//                    //Se não tiver filhos então torna o conteudo nulo
//                    if (semFilho(filho)) {
//                        atual.setEsquerda(null);
//                        return atual;
//                    } else if (umFilho(filho)) {//Se ele tiver um filho
//                        //então verifica em que lado o filho está
//                        if(filho.getDireita() != null){//Se tiver o filho a direita
//                            //O pai vai receber na esquerda o neto a direita
//                            atual.setEsquerda(filho.getDireita());
//                        }else {//Se o filho for a esquerda
//                            //O pai vai receber na esquerda o neto a esquerda
//                            atual.setEsquerda(filho.getEsquerda());
//                        }
//                        return atual;
//                    }else {
//                        doisFilhos(atual);
//                        return atual;
//                    }
//                } else { //Se o elemento for nulo ou diferente do procurado
//                    //chamada recursiva
//                    atual.setEsquerda(deletarRecursivo(atual.getEsquerda(), elemento));
//                }
//
//            }
//            return atual;
//        }
//    }

// public boolean doisFilhos(No atual){
//            if (atual.getEsquerda() != null && atual.getDireita() != null) {
//                //Se ele tiver dois filhos
//                // Começa na subárvore esquerda
//                No neto = filho.getEsquerda();
//                //Variavel auxiliar, para guardar um no anterior
//                anterior = filho;
//
//                // Vai até o maior valor da subárvore esquerda (mais à direita)
//                //Se os netos a direita tiver conteudo
//                while (neto.getDireita() != null){
//                    anterior = neto;
//                    neto = neto.getDireita();
//                }
//                //O elemento que queremos deletar vai receber a ultima folha da direita, na subarvore esquerda
//                filho.setConteudo(neto.getConteudo());
//
//                if (anterior == filho) {
//                    filho.setEsquerda(neto.getEsquerda());
//                } else {
//                    // O anterior aponta para o filho esquerdo do neto
//                    anterior.setDireita(neto.getEsquerda());
//                }
//                return true;
//            }
//
//            return false;
//        }

//  //Utilizando somente o regra do predecessor (subarvore a esquerda)
//    private No deletarRecursivo(No atual, No elemento) {
//        //Se o elemento for nulo
//        if (atual == null) {
//            System.out.println("Elemento vazio");
//            return null;
//        }else {
//            //Se o elemeneto for igual a raiz
//            if (elemento.getConteudo() == atual.getConteudo()){
//                if (semFilho(atual)){
//                    atual = null;
//                }else{
//                    do {
//                        for (int i = 0; i < ; i++) {
//
//                        }
//                    }while(atual.getEsquerda() == null);
//                }
//
//            }
//            return atual;
//        }
//    }

//    public boolean vazio() {
//        if(this.raiz == null){
//            return true;
//        }else {
//            return false;
//        }
//    }
//
//
//    //feito para o usuario não precisar passar o no
//    public void inserirElemento(int elemento) {
//        this.raiz = inserirRecursivo(this.raiz, elemento);
//    }
//
//    //navega pela arvore, para verificar aonde inserir
//    private No inserirRecursivo(No atual, int elemento) {
//        //verifica uma posição vaga
//        if (atual == null) {
//            //cria um novo NO com o valor passado
//            return new No(elemento); // e sai (volta para o inserirElemento se tiver outra entrada)
//        }
//
//        //Se o valor passado for menor do que o NO atual, então...
//        if (elemento < atual.getConteudo()) {
//            //Se for menor, então vai(adiciona) para a esquerda
//            atual.setEsquerda(inserirRecursivo(atual.getEsquerda(), elemento));
//        } else if (elemento > atual.getConteudo()) { //Se o valor passado for maior do que o NO atual, então
//            //Vai para a direita
//            atual.setDireita(inserirRecursivo(atual.getDireita(), elemento));
//        }
//
//        return atual; // se for igual, não insere (evita duplicatas)
//    }
//
//
//    private No buscaRecursiva(No atual, int elemento) {
//        //verifica uma posição vaga
//        if (atual == null) {
//            System.out.println("Elemento não encontrado");
//            return null;
//
//        }
//            //Se o valor passado for menor do que o NO atual, então...
//            if (elemento < atual.getConteudo()) {
//                //Se for menor, então vai(adiciona) para a esquerda
//                atual.setEsquerda(buscaRecursiva(atual.getEsquerda(), elemento));
//            } else if (elemento > atual.getConteudo()) { //Se o valor passado for maior do que o NO atual, então
//                //Vai para a direita
//                atual.setDireita(buscaRecursiva(atual.getDireita(), elemento));
//            }
//            System.out.println("Elemento encontrado"+ atual.getConteudo());
//            return atual;
//    }
//
//    //fazer o remover, quando tem dois filhos, sempre pega o menor valor da sub arvore direita
//    public void remover(int conteudo){
//        No elemento = new No(conteudo);
//        deletarRecursivo(this.raiz, elemento);
//    //        this.raiz = buscaRecursiva(this.raiz,  elemento);
//    }
//
//    private No deletarRecursivo(No atual, No elemento) {
//        if(atual == null) {
//
//            return elemento;
//            //DIREITA
//        } else if (elemento.getConteudo() > atual.getConteudo()) {
//            //Verifica se o conteudo a direita é igual a elemento
//            if(atual.getDireita().getConteudo() == elemento.getConteudo()) {
//                if (semFilho(atual.getDireita())) {
//                    atual.setDireita(null);
//                } else if (umFilho(atual.getDireita())) {
//                    No novoNo = atual.getDireita();
//                    if (novoNo.getEsquerda()){}
//                }
//                atual.setDireita(atual.getDireita().getDireita());
//
//                return;
//            } else {
//                atual = atual.getDireita();
//            }
//            atual.setDireita(deletarRecursivo(atual.getDireita(), elemento));
//        } else {
//            atual.setEsquerda(deletarRecursivo(atual.getEsquerda(), elemento));
//        }
//
//        return atual;
//    }
////    public void deletarRecursivo(No atual, No elemento){
////        //verificando se existe uma arvore
////        if(vazio()) {
////            System.out.println("Elemento não encontrado");
////            return;
////        }
////        //verificando
////        if(atual == null) {
////            System.out.println("Elemento não encontrado");
////            return;
////        }
//
//        //DIREITA
//        //Se o conteudo procurado for maior que o no Atual, então
////        if(elemento.getConteudo() > atual.getConteudo()) {
////            //Verifica se o conteudo a direita é igual a
////            if(atual.getDireita().getConteudo() == elemento.getConteudo()) {
////                if (semFilho(atual.getDireita())) {
////                    atual.setDireita(null);
////                } else if (umFilho(atual.getDireita())) {
////                    No novoNo = atual.getDireita();
////                    if (novoNo.getEsquerda()){}
////                }
////                atual.setDireita(atual.getDireita().getDireita());
////
////                return;
////            } else {
////                atual = atual.getDireita();
////            }
////        } else {
////            if(atual.getEsquerda().getConteudo() == elemento.getConteudo()) {
////                atual.setEsquerda(elemento);
////                return;
////            } else {
////                atual = atual.getEsquerda();
////            }
////        }
////        deletarRecursivo(atual, elemento);
////    }
//
//    public boolean doisFilhos(No atual){
//        if (atual.getEsquerda() != null && atual.getDireita() != null){
//            return true;
//        }
//
//        return false;
//    }
//
//    public  boolean umFilho(No atual){
//        if((atual.getEsquerda() != null && atual.getDireita() == null) || (atual.getDireita() != null && atual.getEsquerda() == null)){
//            return true;
//        }
//        return false;
//    }
//
//    public boolean semFilho(No atual){
//        if (atual.getEsquerda() == null && atual.getDireita() == null){
//            return true;
//        }
//        return false;
//    }
//
//
//    // Percurso em pré-ordem: raiz -> esquerda -> direita
//    public void preOrdem(No no) {
//        if (no != null) {
//            System.out.println(no.getConteudo());
//            preOrdem(no.getEsquerda());
//            preOrdem(no.getDireita());
//        }
//    }
//
//    // Percurso em ordem: esquerda -> raiz -> direita
//    public void emOrdem(No no) {
//        if (no != null) {
//            emOrdem(no.getEsquerda());
//            System.out.println(no.getConteudo());
//            emOrdem(no.getDireita());
//        }
//    }
//
//    // Percurso em pós-ordem: esquerda -> direita -> raiz
//    public void posOrdem(No no) {
//        if (no != null) {
//            posOrdem(no.getEsquerda());
//            posOrdem(no.getDireita());
//            System.out.println(no.getConteudo());
//        }
//    }
//
//    public No getRaiz() {
//        return this.raiz;
//    }
//}
