package mundopc.servicio;

import mundopc.modelo.Computadora;

import java.util.ArrayList;
import java.util.List;

public class Orden {
    private  final  int idOrden;
    private  final List<Computadora> computadoras;
    private  static  int contadorOrden;

    public Orden(){
        computadoras = new ArrayList<>();
        this.idOrden = ++contadorOrden;
    }

    public void agregarComputador(Computadora computadora){
        computadoras.add(computadora);

    }
    public void mostrarOrden(){
        System.out.println("Orden #: " + idOrden);
        System.out.println("Total computadoras: " + computadoras.size());

        computadoras.forEach(System.out::println);
        System.out.println();
    }

}


