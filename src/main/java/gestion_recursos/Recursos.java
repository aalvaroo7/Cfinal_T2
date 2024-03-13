package gestion_recursos;
public class Recursos {
    private int totalAlimentos;
    private int totalMedicamentos;
    private int totalPersonal;

    public Recursos(int totalAlimentos, int totalMedicamentos, int totalPersonal) {
        this.totalAlimentos = totalAlimentos;
        this.totalMedicamentos = totalMedicamentos;
        this.totalPersonal = totalPersonal;
    }

    public int obtenerTotalAlimentos() {
        return totalAlimentos;
    }

    public void actualizarTotalAlimentos(int totalAlimentos) {
        this.totalAlimentos = totalAlimentos;
    }

    public int obtenerTotalMedicamentos() {
        return totalMedicamentos;
    }

    public void actualizarTotalMedicamentos(int totalMedicamentos) {
        this.totalMedicamentos = totalMedicamentos;
    }

    public int obtenerTotalPersonal() {
        return totalPersonal;
    }

    public void actualizarTotalPersonal(int totalPersonal) {
        this.totalPersonal = totalPersonal;
    }

    // Este método muestra la cantidad actual de recursos disponibles
    public void mostrarRecursosDisponibles() {
        System.out.println("Total de alimentos: " + totalAlimentos);
        System.out.println("Total de medicamentos: " + totalMedicamentos);
        System.out.println("Total de personal: " + totalPersonal);
    }
}