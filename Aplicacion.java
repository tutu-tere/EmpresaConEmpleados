import com.clases.Director;
import com.clases.Empleado;
import com.clases.Gerente;

public class Aplicacion {
  public static void main(String[] args) {
    Empleado empleado = new Empleado("Ana", 1, 10.0);
    Gerente gerente = new Gerente("Luis", 2, 15, 2000);
    Director director = new Director("María", 3, 20, 3000, 5000);

    empleado.mostrarInformacion();
    gerente.mostrarInformacion();
    director.mostrarInformacion();
  }
}
