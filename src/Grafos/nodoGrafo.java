package Grafos;

import java.util.ArrayList;
import java.util.List;

public class nodoGrafo {
    String valor;
    boolean estado;
    List<nodoGrafo> noditos;

    public nodoGrafo(String valor){
        noditos=new ArrayList<>();
        this.valor=valor;
        this.estado=false;
    }

    void agregarHijo(nodoGrafo n){
        noditos.add(n);
    }
}
