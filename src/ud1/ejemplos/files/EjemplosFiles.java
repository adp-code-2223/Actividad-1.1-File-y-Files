/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ud1.ejemplos.files;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;


/**
 *
 * @author maria
 */
public class EjemplosFiles {

    public static void createFile(Path path) {
        Path ficheroCreado;
        try {
            if (Files.notExists(path)) {
                ficheroCreado = Files.createFile(path);

                System.out.println("Se ha creado el fichero en: " + ficheroCreado);
            }
            else{
                System.out.println("El fichero " + path.toAbsolutePath() + " ya existe");
            }

        } catch (IOException ex) {
            System.err.println("Se ha producido una excepción: " + ex.getMessage());
        }
    }

   
}
