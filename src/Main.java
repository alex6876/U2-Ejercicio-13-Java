public class Main {
    public static void main(String[] args) {
        ControladorDeAcceso control = new ControladorDeAcceso();

        LectorTarjeta lector =  new LectorTarjeta(control);

        Credencial tarjetaValida = new Credencial("Tarjeta001", 5);
        Credencial tarjetaInvalida = new Credencial("Tarjeta002", 1);

        lector.leerTarjeta(tarjetaValida, "Laboratorio");
        lector.leerTarjeta(tarjetaInvalida, "Laboratorio");
    }
}