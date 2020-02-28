package Grafos;
import java.util.LinkedList;
import java.util.Queue;

import javax.swing.JOptionPane;
public class main {
    public static void main(String[] args) {

        nodoGrafo S = new nodoGrafo("S");
        nodoGrafo C = new nodoGrafo("C");
        nodoGrafo E = new nodoGrafo("E");
        nodoGrafo F = new nodoGrafo("F");
        nodoGrafo B = new nodoGrafo("B");
        nodoGrafo D = new nodoGrafo("D");
        nodoGrafo A = new nodoGrafo("A");
        nodoGrafo Z = new nodoGrafo("Z");
        nodoGrafo G = new nodoGrafo("G");

        S.agregarHijo(C);
        S.agregarHijo(E);
        S.agregarHijo(F);

        C.agregarHijo(B);
        C.agregarHijo(E);
        C.agregarHijo(S);
        C.agregarHijo(A);

        E.agregarHijo(C);
        E.agregarHijo(S);

        F.agregarHijo(B);
        F.agregarHijo(D);
        F.agregarHijo(S);

        B.agregarHijo(C);
        B.agregarHijo(F);
        B.agregarHijo(D);
        B.agregarHijo(Z);
        B.agregarHijo(A);

        D.agregarHijo(Z);
        D.agregarHijo(F);
        D.agregarHijo(B);

        A.agregarHijo(C);
        A.agregarHijo(B);
        A.agregarHijo(G);

        Z.agregarHijo(B);
        Z.agregarHijo(D);
        Z.agregarHijo(G);

        G.agregarHijo(A);
        G.agregarHijo(Z);

        //busquedaXAnchura("G",S);
        busquedaXProfundidad("G",S);
    }



    public static boolean busquedaXAnchura (String valor, nodoGrafo raiz){
        Queue<nodoGrafo> colaAux= new LinkedList<nodoGrafo>();
        colaAux.add(raiz);
        raiz.estado=true;
        while(colaAux.size()!=0){
            nodoGrafo getNode =colaAux.poll();
            System.out.println(getNode.valor);
            if(getNode.valor.equals(valor)){
                System.out.println("nodoGrafo Encontrado: "+getNode.valor);
                return true;
            }
            else
            {
                for (nodoGrafo n: getNode.noditos) {
                    if(n.estado==false) {
                        colaAux.add(n);
                        n.estado= true;
                    }
                }
            }
        }return false;
    }

    public static boolean busquedaXProfundidad(String valor, nodoGrafo raiz){
        nodoGrafo getNode = raiz;
        getNode.estado=true;
        System.out.println(getNode.valor);
        if (getNode.valor.equals(valor)){
            System.out.println("Encontrado: "+getNode.valor);
            return true;
        }else{
            for (nodoGrafo n: getNode.noditos) {
                if(n.estado==false)
                busquedaXProfundidad(valor,n);
            }
        }
        return false;
    }

}
