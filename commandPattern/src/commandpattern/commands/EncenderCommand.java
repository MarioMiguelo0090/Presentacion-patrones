package commandpattern.commands;


import commandpattern.objects.Dispositivo;
/**
 * @author ivanr
 * @version 1.0
 * @created 19-abr.-2024 03:09:46 p. m.
 */
public class EncenderCommand implements Command {

	public Dispositivo dispositivo;

	public EncenderCommand(Dispositivo dispositivo) {
            this.dispositivo = dispositivo;
	}

        @Override
	public void execute() {
            dispositivo.encender();
	}
        
        @Override
        public void undo() {
            dispositivo.apagar();
        }
}