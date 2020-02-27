package Grafos;


import java.util.LinkedList;
import java.util.Queue;

public class main {
    public static void main(String[] args) {
        nodoGrafo E = new nodoGrafo("E");
        nodoGrafo S = new nodoGrafo("S");
        nodoGrafo T = new nodoGrafo("T");
        nodoGrafo F = new nodoGrafo("F");
        E.agregarHijo(S);
        E.agregarHijo(T);
        E.agregarHijo(F);
        nodoGrafo A = new nodoGrafo("A");
        F.agregarHijo(A);
        nodoGrafo N = new nodoGrafo("N");
        A.agregarHijo(N);
        nodoGrafo I = new nodoGrafo("I");
        S.agregarHijo(I);

        // busquedaXAnchura("A",E);
        busquedaXProfundidad("A",E);
    }
    public static boolean busquedaXAnchura (String valor, nodoGrafo raiz){
        Queue<nodoGrafo> colaAux= new LinkedList<nodoGrafo>();
        colaAux.add(raiz);
        while(colaAux.size()!=0){
            nodoGrafo getNode =colaAux.poll();
            System.out.println(getNode.valor);
            getNode.estado=true;
            if(getNode.valor.equals(valor)){
                System.out.println("nodoGrafo Encontrado: "+getNode.valor);
                return true;
            }
            else
            {
                for (nodoGrafo n: getNode.noditos) {
                    if(getNode.estado=true)
                    colaAux.add(n);
                }
            }
        }return false;
    }
    public static boolean busquedaXProfundidad(String valor, nodoGrafo raiz){
        nodoGrafo getNode = raiz;
        System.out.println(getNode.valor);
        if (getNode.valor.equals(valor)){
            System.out.println("Encontrado: "+getNode.valor);
            return true;
        }else{
            for (nodoGrafo n: getNode.noditos) {
                busquedaXProfundidad(valor,n);
            }
        }
        return false;
    }
}
