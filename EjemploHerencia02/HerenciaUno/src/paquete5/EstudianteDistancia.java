
package paquete5;

public class EstudianteDistancia extends Estudiante{
    
    int numeroAsignaturas;
    double costoAsignatura;
    double matriculaDistancia;
    
        
    public EstudianteDistancia(String n, String ap, String iden, int e, 
            int numAsg, double costoAsg){
        super(n, ap, iden, e);
        numeroAsignaturas = numAsg;
        costoAsignatura = costoAsg;
    }
    /*
    En este constructor a mas de recibir las variables que enviaremos a la clase
    super podemos recibir y asignar variables para esta misma clase
    ahorrandonos unas lineas de codigo
    */
    
    // 2.  Método establecerNumeroAsginaturas(numero: Real)
    public void establecerNumeroAsginaturas(int numero){
        numeroAsignaturas = numero;
    }
    
    // 3.  Método establecerCostoAsignatura(valor: Real)
    public void establecerCostoAsignatura(double valor){
        costoAsignatura = valor;
    }

    // 4.  Método calcularMatriculaDistancia()
    public void calcularMatriculaDistancia(){
        matriculaDistancia = numeroAsignaturas * costoAsignatura;
    }

    //  Métodos obtener para los datos o atributos de la clase
    // 5. Método obtenerNumeroAsignaturas() : Entero
    public int obtenerNumeroAsignaturas(){
        return numeroAsignaturas; 
    }

    // 6. Método obtenerCostoAsignatura() : Real
    public double obtenerCostoAsignatura(){
        return costoAsignatura;
    }

    // 7. Método obtenerMatriculaDistancia() : Real
    public double obtenerMatriculaDistancia(){
        return matriculaDistancia;
    }
    
    @Override
    public String toString(){
        String cadenaFinal = String.format("%s", super.toString());
        
        cadenaFinal = String.format("%s\n"
                + "Costo Asignatura: %.2f\n"
                + "Número de Asignaturas: %d\n"
                + "Total Matricula: %.2f\n",
                cadenaFinal,
                obtenerCostoAsignatura(),
                obtenerNumeroAsignaturas(),
                obtenerMatriculaDistancia());
        
        return cadenaFinal;
    }

}
