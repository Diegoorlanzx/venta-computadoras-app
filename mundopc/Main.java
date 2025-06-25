package mundopc;


import mundopc.modelo.Monitor;
import mundopc.modelo.Raton;
import mundopc.modelo.Teclado;



public class Main {
    public static void main(String[] args) {
        Raton ratonLenovo = new Raton("usb", "lenovo");
        System.out.println(ratonLenovo);
        Teclado tecladoLenovo = new Teclado("bluetooth","accer");
        System.out.println(tecladoLenovo);
        Monitor monitorLenovo = new Monitor("lenovo", 27);
        System.out.println(monitorLenovo);


    }
}