import java.util.LinkedList;
import java.util.Queue;

public class main {
    public static void main(String[] args) {
        Nodo E = new Nodo("E");
        Nodo S = new Nodo("S");
        Nodo T = new Nodo("T");
        Nodo F = new Nodo("F");
        E.agregarHijo(S);
        E.agregarHijo(T);
        E.agregarHijo(F);
        Nodo A = new Nodo("A");
        F.agregarHijo(A);
        Nodo N = new Nodo("N");
        A.agregarHijo(N);
        Nodo I = new Nodo("I");
        S.agregarHijo(I);

       // busquedaXAnchura("A",E);
        busquedaXProfundidad("A",E);
    }
        public static boolean busquedaXAnchura (String valor, Nodo raiz){
            Queue<Nodo> colaAux= new LinkedList<Nodo>();
            colaAux.add(raiz);
            while(colaAux.size()!=0){
            Nodo getNode =colaAux.poll();
                System.out.println(getNode.valor);
            if(getNode.valor.equals(valor)){
                System.out.println("Nodo Encontrado: "+getNode.valor);
                return true;
            }
            else
            {
                for (Nodo n: getNode.noditos) {
                    colaAux.add(n);
                }
            }
            }return false;
        }
        public static boolean busquedaXProfundidad(String valor, Nodo raiz){
        Nodo getNode = raiz;
        System.out.println(getNode.valor);
        if (getNode.valor.equals(valor)){
            System.out.println("Encontrado: "+getNode.valor);
            return true;
        }else{
             for (Nodo n: getNode.noditos) {
                busquedaXProfundidad(valor,n);
            }
            }
        return false;
        }
 }


