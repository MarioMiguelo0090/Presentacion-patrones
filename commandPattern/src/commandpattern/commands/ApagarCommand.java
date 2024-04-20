package commandpattern.commands;

import commandpattern.objects.Dispositivo; 

/**
 * @author ivanr
 * @version 1.0
 * @created 19-abr.-2024 03:09:48 p. m.
 */
public class ApagarCommand implements Command {

	public Dispositivo dispositivo;

	public ApagarCommand(Dispositivo dispositivo){
            this.dispositivo = dispositivo;
	}

        @Override
	public void execute(){
            dispositivo.apagar();
	}
        
        @Override
        public void undo() {
            dispositivo.encender();
        }
}