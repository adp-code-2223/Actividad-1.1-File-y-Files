/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ud1.ejemplos.file;


import java.nio.file.Path;
import java.nio.file.Paths;
import ud1.util.Utils;

/**
 *
 * @author maria
 */
public class FileMain {

   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Path path = Paths.get(Utils.DIRECTORIO_BASE, "ejemplo.txt");
        System.out.println("La ruta creada es: " + path.toString());

        EjemplosFile.crearFichero(path.toString());

        EjemplosFile.borrarFichero(path.toString());

        Path nuevoDirectorio = Paths.get(Utils.DIRECTORIO_BASE, "Nueva carpeta");
        EjemplosFile.crearDirectorio(nuevoDirectorio.toString());

        Path nuevosDirectorios = Paths.get("carpeta1", "carpeta2", "carpeta3");
        
        
        System.out.println("La ruta creada es: " + nuevosDirectorios.toString());
        EjemplosFile.crearDirectoriosIntermedios(nuevosDirectorios.toString());


        
    }
    
}
