public class Main {
    public static void main(String[] args) {
        ArvoreDel arvore = new ArvoreDel();

        arvore.inserirRecursivo(50);
        arvore.inserirRecursivo(30);
        arvore.inserirRecursivo(70);
        arvore.inserirRecursivo(20);
        arvore.inserirRecursivo(40);
        arvore.inserirRecursivo(60);
        arvore.inserirRecursivo(80);
        arvore.inserirRecursivo(65);
        arvore.inserirRecursivo(68);
        arvore.inserirRecursivo(67);
        arvore.inserirRecursivo(59);
        arvore.visualizar();
        
        arvore.remover(50);
        System.out.println("==================");
        arvore.visualizar();


    }
}
