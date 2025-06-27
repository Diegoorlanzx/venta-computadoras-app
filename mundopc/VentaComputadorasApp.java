package mundopc;


import mundopc.modelo.Computadora;
import mundopc.modelo.Monitor;
import mundopc.modelo.Raton;
import mundopc.modelo.Teclado;
import mundopc.servicio.Orden;


public class VentaComputadorasApp {
    public static void main(String[] args) {
        Raton ratonLenovo = new Raton("usb", "lenovo");
       // System.out.println(ratonLenovo);
        Teclado tecladoLenovo = new Teclado("bluetooth","accer");
        //System.out.println(tecladoLenovo);
        Monitor monitorLenovo = new Monitor("lenovo", 27);
        //System.out.println(monitorLenovo);

        Computadora computadoraLenovo =
                new Computadora("Computadora lenovo",monitorLenovo,tecladoLenovo,ratonLenovo);
        //System.out.println(computadoraLenovo);

        Monitor monitorDell= new Monitor("Dell", 15);
        Teclado tecladoDell= new Teclado("USB","Dell");
        Raton ratonDell= new Raton("USB","Dell");
        Computadora computadoraDell= new Computadora("Computador Dell",
                monitorDell,tecladoDell,ratonDell);

        Monitor monitorMac= new Monitor("Mac", 28);
        Teclado tecladoMac= new Teclado("USB","Mac");
        Raton ratonMac= new Raton("USB","Mac");
        Computadora computadoraMac= new Computadora("Computador Mac",
                monitorMac,tecladoMac,ratonMac);

        Orden orden1 = new Orden();
        orden1.agregarComputador(computadoraLenovo);
        orden1.agregarComputador(computadoraDell);
        orden1.agregarComputador(computadoraMac);

        orden1.mostrarOrden();

        Orden orden2 = new Orden();
        orden2.agregarComputador(computadoraMac);
        orden2.agregarComputador(computadoraDell);
        orden2.agregarComputador(computadoraLenovo);

        orden2.mostrarOrden();
    }


}