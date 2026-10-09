public class ControladorDeAcceso {

    public boolean verificarAcceso(Credencial credencial, String zona) {

        return credencial.getNivelAcceso() >= 3 == true;

    }
}
