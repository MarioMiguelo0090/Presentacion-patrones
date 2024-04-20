package patron.patronmementomain;

public class EditorTexto {
    private String texto;

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
    
    public MementoEditorTexto crearMemento(){
        return new MementoEditorTexto(texto);
    }
    
    public void obtenerEstadoMemento(MementoEditorTexto memento){
        this.texto=memento.getTexto();        
    }
    
    public class MementoEditorTexto{
        private String texto;
        
        public MementoEditorTexto(String texto){
            this.texto=texto;
        }

        public String getTexto() {
            return texto;
        }            
    }
            
    
}
