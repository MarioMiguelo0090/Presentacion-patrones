package commandpattern.objects;

import commandpattern.commands.Command;

/**
 * @author ivanr
 * @version 1.0
 * @created 19-abr.-2024 03:09:58 p. m.
 */
public class ControlRemoto {

    public Command[] command;
    CommandHistory history = new CommandHistory();

    public ControlRemoto() {
        command = new Command[10];
    }
    
    public void setCommand(int i, Command command) {
        this.command[i] = command;
    }

    public void presionBotonEncenderTelevision() {
        command[0].execute();
        history.push(command[0]);
    }

    public void presionBotonApagarTelevision() {
        command[1].execute();
        history.push(command[1]);
    }

    public void presionBotonEncenderBocina() {
        command[2].execute();
        history.push(command[2]);
    }

    public void presionBotonApagarBocina() {
        command[3].execute();
        history.push(command[3]);
    }
    
    public void presionBotonSubirVolumenTelevision() {
        command[4].execute();
        history.push(command[4]);
    }

    public void presionBotonBajarVolumenTelevision() {
        command[5].execute();
        history.push(command[5]);
    }

    public void presionBotonSubirVolumenBocina() {
        command[6].execute();
        history.push(command[6]);
    }

    public void presionBotonBajarVolumenBocina() {
        command[7].execute();
        history.push(command[7]);
    }
    
    public void presionBotonCambiarCanal() {
        command[8].execute();
        history.push(command[8]);
    }

    public void presionBotonRegresarCanal() {
        command[9].execute();
        history.push(command[9]);
    }
    
    public void presionBotonDeshacer() {
        history.pop().undo();
    }
}
