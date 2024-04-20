package commandpattern.commands;

import commandpattern.objects.Television;

/**
 * @author ivanr
 * @version 1.0
 * @created 19-abr.-2024 03:09:54 p. m.
 */
public class CambiarCanalCommand implements Command {

	public Television television;

	public CambiarCanalCommand(Television television){
            this.television = television;
	}

        @Override
	public void execute() {
            television.cambiarCanal();
	}
        
        @Override
        public void undo() {
            television.regresarCanal();
        }
}