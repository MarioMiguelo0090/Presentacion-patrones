package patron.patronmementomain;

import java.util.ArrayList;
import java.util.List;
import patron.patronmementomain.EditorTexto.MementoEditorTexto;

public class CuidadorEditorTexto {
    private List<MementoEditorTexto> mementos=new ArrayList<>();    
    
    public void agregarMemento(MementoEditorTexto memento){
        this.mementos.add(memento);        
    }
    
    public MementoEditorTexto obtenerMemento(int indice){        
        return this.mementos.get(indice);
    }
    
}
