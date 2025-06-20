import java.util.Arrays;

/**
 * Clase que gestiona un conjunto de empleados.
 * Permite dar de alta empleados, aumentar su salario y mostrar el listado.
 */
public class Empleados {
    /**
     * Array que almacena los empleados.
     */
    private Empleado[] lista;

    /**
     * Número actual de empleados dados de alta.
     */
    private int contador;

    /**
     * Constructor de la clase Empleados.
     * @param capacidad Número máximo de empleados que se pueden gestionar.
     */
    public Empleados(int capacidad) {
        this.lista = new Empleado[capacidad];
        this.contador = 0;
    }

    /**
     * Da de alta un nuevo empleado en la lista.
     * @param empleado El empleado a añadir.
     */
    public void altaEmpleado(Empleado empleado) {
        if (contador < lista.length) {
            lista[contador] = empleado;
            contador++;
        } else {
            System.out.println(Mensajes.NO_MAS_EMPLEADOS);
        }
    }

    /**
     * Aumenta el salario de todos los empleados en un porcentaje dado.
     * @param porcentaje Porcentaje de aumento.
     */
    public void aumentarSalario(double porcentaje) {
        for (Empleado empleado : lista) {
            if (empleado != null) {
                double nuevoSalario = empleado.getSalario() * (1 + porcentaje / 100);
                empleado.setSalario(nuevoSalario);
            }
        }
    }

    /**
     * Muestra el listado de todos los empleados dados de alta.
     */
    public void mostrarListado() {
        System.out.println(Mensajes.LISTA_EMPLEADOS);
        for (Empleado empleado : lista) {
            if (empleado != null) {
                System.out.println(empleado);
            }
        }
    }

    /**
     * Devuelve el array de empleados.
     * @return Array de empleados.
     */
    public Empleado[] getLista() {
        return lista;
    }
}