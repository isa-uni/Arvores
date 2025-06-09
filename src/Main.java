import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static boolean continuar() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("deseja contiunar? (s/n)");
            try {
                String input =  scanner.next();

                if (Objects.equals(input, "s")) {
                    return true;
                } else if (Objects.equals(input, "n")) {
                    return false;
                }
            } catch (Exception e) {
                System.out.println("valor inválido, tente novamente");
            }
        }
    }

    public static void main(String[] args) {
//        tranqueira da isa
//        ArvoreDel arvore = new ArvoreDel();
//
//        arvore.inserirRecursivo(50);
//        arvore.inserirRecursivo(30);
//        arvore.inserirRecursivo(70);
//        arvore.inserirRecursivo(20);
//        arvore.inserirRecursivo(40);
//        arvore.inserirRecursivo(60);
//        arvore.inserirRecursivo(80);
//        arvore.inserirRecursivo(65);
//        arvore.inserirRecursivo(67);
//        arvore.inserirRecursivo(69);
//        arvore.inserirRecursivo(68);
//        arvore.inserirRecursivo(59);
//        arvore.visualizar();
//
//        arvore.remover(67);
//
//        System.out.println("==================");
//        arvore.visualizar();
//

        ArvoreBinaria arvore = new ArvoreBinaria();

        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.println("Digite um valor para inserir na árvore binária: ");
            arvore.inserir(scanner.nextInt());

            if (!continuar()) {
                break;
            }
        }

        System.out.println("Elmentos da árvore em pré-ordem");
        arvore.visualizar();

        while (true) {
            System.out.println("Digite um valor para remover na árvore binária: ");
            arvore.remover(scanner.nextInt());

            if (!continuar()) {
                break;
            }
        }
        System.out.println("Elmentos da árvore em pré-ordem");
        arvore.visualizar();
    }
}
