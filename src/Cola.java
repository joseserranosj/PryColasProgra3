import java.util.LinkedList;
import java.util.Queue;

public class Cola {
    Queue<Pasajero> coleccion;
    public Cola(){
        coleccion=new LinkedList<>();
        predefinir();
    }

    public  void  predefinir (){
        coleccion.offer(new Pasajero("Ana",10,"Ejecutiva"));
        coleccion.add(new Pasajero("Pepe",30,"Economica"));
        coleccion.add(new Pasajero("Jaime",3,"Primera Clase"));
        coleccion.add(new Pasajero("Flor",2,"Primera Clase"));

    }

    public void agregar(Pasajero dato){
        if(dato!=null){
            coleccion.add(dato);
        }

    }

    public Pasajero extraer() throws Exception {
        if (coleccion.isEmpty())
            throw new Exception("Cola sin elementos");
        return coleccion.poll();
    }

    public Pasajero peek() throws Exception {
        if (coleccion.isEmpty())
            throw new Exception("Cola vacia");
        return coleccion.peek();
    }

    public int size(){
        return coleccion.size();
    }


    @Override
    public String toString() {
        StringBuilder sb=new StringBuilder();
        for (Pasajero p:coleccion){
            sb.append(p.toString());
        }
        return sb.toString().length()!=0?sb.toString():"No hay elementos";
    }


}
