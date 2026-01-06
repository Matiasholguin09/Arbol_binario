public class Arbolbinario {

    // --- MÉTODO PARA IMPRIMIR VISUALMENTE ---
    static void imprimirArbol(nodo Nodo, int nivel) {
        if (Nodo != null) {
            imprimirArbol(Nodo.derecha, nivel + 1);
            for (int i = 0; i < nivel; i++) {
                System.out.print("    "); // Cambié println por print para que funcione la sangría
            }
            System.out.println(Nodo.dato);
            imprimirArbol(Nodo.izquierdo, nivel + 1);
        }
    }

    // --- RECORRIDOS  ---
    static void inorden(nodo Nodo) {
        if (Nodo != null) {
            inorden(Nodo.izquierdo);
            System.out.print(Nodo.dato + " ");
            inorden(Nodo.derecha);
        }
    }

    static void preorden(nodo Nodo) {
        if (Nodo != null) {
            System.out.print(Nodo.dato + " ");
            preorden(Nodo.izquierdo);
            preorden(Nodo.derecha);
        }
    }

    static void postorden(nodo Nodo) {
        if (Nodo != null) {
            postorden(Nodo.izquierdo);
            postorden(Nodo.derecha);
            System.out.print(Nodo.dato + " ");
        }
    }

    public static void main(String[] args) {
        // NIVEL 1: Raíz
        nodo raiz = new nodo("R");


        raiz.izquierdo = new nodo("T1");
        raiz.derecha = new nodo("T2");


        raiz.izquierdo.izquierdo = new nodo("T1.1");
        raiz.izquierdo.derecha = new nodo("T1.2");
        raiz.derecha.izquierdo = new nodo("T2.1");
        raiz.derecha.derecha = new nodo("T2.2");


        raiz.izquierdo.izquierdo.izquierdo = new nodo("T4.1");
        raiz.izquierdo.izquierdo.derecha = new nodo("T4.2");


        raiz.izquierdo.izquierdo.izquierdo.izquierdo = new nodo("T5.1");


        raiz.izquierdo.izquierdo.izquierdo.izquierdo.izquierdo = new nodo("T6.1");

       
        System.out.println("Estructura:");
        imprimirArbol(raiz, 0);

        System.out.println("      ");
        System.out.print("Inorden:   "); inorden(raiz);
        System.out.println("      ");
        System.out.print("Preorden:  "); preorden(raiz);
        System.out.println("      ");
        System.out.print("Postorden: "); postorden(raiz);
        System.out.println("      ");
        System.out.println("      ");
    }
}