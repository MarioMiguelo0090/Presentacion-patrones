package patron.patronmementomain;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        EditorTexto editorTexto=new EditorTexto();
        CuidadorEditorTexto cuidadorEditorTexto=new CuidadorEditorTexto();
        Scanner leer=new Scanner(System.in);
        String texto="";
        int opcion=0;
        int indice=0;
        editorTexto.setTexto(texto);
        cuidadorEditorTexto.agregarMemento(editorTexto.crearMemento());
        do{
            if(indice<0||opcion==0){
                System.out.println("Elige una opcion");
                System.out.println("[1]Comenzar a escribir");
                System.out.println("[3]Salir");                            
            }else{
                System.out.println("Elige una opcion");
                System.out.println("[1]Seguir escribiendo");
                System.out.println("[2]Restaurar al ultimo estado");
                System.out.println("[3]Salir");            
            }            
            opcion = Integer.parseInt(leer.nextLine());
            switch(opcion){
                case 1:
                    System.out.println("Escribe y presiona enter al terminar: ");
                    System.out.println(texto);
                    texto+=leer.nextLine();
                    texto+=" ";
                    editorTexto.setTexto(texto);            
                    cuidadorEditorTexto.agregarMemento(editorTexto.crearMemento());
                    indice++;
                break;
                case 2:
                    if(indice>=0){
                        editorTexto.obtenerEstadoMemento(cuidadorEditorTexto.obtenerMemento(indice));                    
                        texto=editorTexto.getTexto();
                        System.out.println(texto);
                        indice--;                    
                    }else{
                        System.out.println("No hay versiones anteriores");
                    }                    
                break;
                case 3:
                    System.out.println("Hasta luego");
                break;
                default:
                    System.out.println("Opcion invalida");
                break;
            }            
        }while(opcion!=3);
        leer.close();
    }
    
}
