package commandpattern.objects;

/**
 * @author ivanr
 * @version 1.0
 * @created 19-abr.-2024 03:09:35 p. m.
 */
public class Television extends Dispositivo {

    private int canalActual;
    private int numeroCanales;

    public Television(int noCanales) {
        this.numeroCanales = noCanales;
        canalActual = 1;
        encendido = false;
        volumen = 0;
    }
    
    public void setNumeroCanales(int numeroCanales) {
        this.numeroCanales = numeroCanales;
    }

    public void cambiarCanal() {
        canalActual = (canalActual % numeroCanales) + 1;
        System.out.println("Cambiando al canal " + canalActual);
    }

    @Override
    public void encender() {
        encendido = true;
        System.out.println("Se encendió la television");
    }

    @Override
    public void apagar() {
        encendido = false;
        System.out.println("Se apagó la television");
    }

    public void regresarCanal() {
        canalActual = (canalActual - 2 + numeroCanales) % numeroCanales + 1;
        System.out.println("Regresando al canal " + canalActual);
    }

    @Override
    public void subirVolumen() {
        if (volumen < 100) {
            volumen+= 1;
            System.out.println("Se subió el volumen de la televisión a: " + volumen);
        } else {
            System.out.println("No se puede subir más el volumen de la televisión");
        }
    }

    @Override
    public void bajarVolumen() {
        if (volumen > 0) {
            volumen-= 1;
            System.out.println("Se bajó el volumen de la televisión a: " + volumen);
        } else {
            System.out.println("No se puede bajar más el volumen de la televisión");
        }
    }
}
