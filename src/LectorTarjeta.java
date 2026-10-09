public class LectorTarjeta {
    ControladorDeAcceso control;
    public LectorTarjeta(ControladorDeAcceso control) {
        this.control = control;
    }

    public void leerTarjeta(Credencial credencial, String zona) {
        System.out.println("leyendo tarjeta: "+ credencial.getCodigo());

        if (control.verificarAcceso(credencial,zona)) {
            System.out.println("Tarjeta autorizada.");
        }else {
            System.out.println("Acceso denegado.");
        }
    }
}
