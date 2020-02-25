import java.util.ArrayList;
import java.util.List;

public class Nodo {

    String valor;
    List<Nodo> noditos;

    public Nodo(String valor){
        noditos=new ArrayList<>();
        this.valor=valor;
    }

     void agregarHijo(Nodo n){
        noditos.add(n);
    }
}
