package paquete6;

public class EstudiantePresencial extends Estudiante {

    int numeroCreditos;
    double costoCredito;
    double matriculaPresencial;

    public EstudiantePresencial(String n, String a, String iden, int ed) {
        super(n, a, iden, ed);
    }

    public EstudiantePresencial(String n, String a, String iden, int ed,
            double costo, int creditos) {
        super(n, a, iden, ed);
        costoCredito = costo;
        numeroCreditos = creditos;
    }

    //  Métodos establecer y calcular para los datos o atributos de la clase
    // 2.  Método establecerNumeroCreditos(numero: Real)
    public void establecerNumeroCreditos(int numero) {
        numeroCreditos = numero;
    }

    // 3.  Método establecerCostoCredito(valor: Real)
    public void establecerCostoCredito(double valor) {
        costoCredito = valor;
    }

    // 4.  Método calcularMatriculaPresencial()
    public void calcularMatriculaPresencial() {
        matriculaPresencial = numeroCreditos * costoCredito;
    }

    //  Métodos obtener para los datos o atributos de la clase
    // 5. Método obtenerNumeroCreditos() : Entero
    public int obtenerNumeroCreditos() {
        return numeroCreditos;
    }

    // 6. Método obtenerCostoCredito() : Real
    public double obtenerCostoCredito() {
        return costoCredito;
    }

    // 7. Método obtenerMatriculaPresencial() : Real
    public double obtenerMatriculaPresencial() {
        return matriculaPresencial;
    }

    @Override
    public String toString() {
        String cadena = String.format("Nombre del estudiante: %s\n"
                + "Apellido del estudiante: %s\n"
                + "Id: %s\nEdad: %s\nCosto creditos: %.2f\n"
                + "Numero creditos %d\n", obtenerNombresEstudiante(),
                 obtenerApellidoEstudiante(), obtenerIdentificacionEstudiante(),
                 obtenerEdadEstudiante(), obtenerCostoCredito(),
                 obtenerNumeroCreditos());
        return cadena;
    }

}
