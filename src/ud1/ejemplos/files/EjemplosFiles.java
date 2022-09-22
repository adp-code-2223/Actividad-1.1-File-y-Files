/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ud1.ejemplos.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.attribute.FileTime;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author maria
 */
public class EjemplosFiles {

    private static final int KB = 1024;

    public static void createFile(Path path) {
        Path ficheroCreado;
        try {
            if (Files.notExists(path)) {
                ficheroCreado = Files.createFile(path);

                System.out.println("Se ha creado el fichero en: " + ficheroCreado);
            } else {
                System.out.println("El fichero " + path.toAbsolutePath() + " ya existe");
            }

        } catch (IOException ex) {
            System.err.println("Se ha producido una excepción: " + ex.getMessage());
        }
    }

    public static void copiar(Path origen, Path destino) {

        if (Files.exists(destino)) {
            System.out.println("No se puede copiar el fichero. Ya existe en destino " + destino.toString());
        } else {
            try {
                Files.copy(origen, destino);
            } catch (IOException ex) {
                System.err.println("Se ha producido una excepción: " + ex.getMessage());
            }
        }

    }

    public static void getFileInfo(Path path) {
        if (Files.exists(path)) {
            try {
                System.out.println("Nombre: " + path.getFileName());
                System.out.println("Ruta absoluta: " + path.toAbsolutePath());
                FileTime ftime = Files.getLastModifiedTime(path);

                System.out.println("Última modificación: " + ftime);
                long bytes = Files.size(path);
                System.out.println("Tamaño(KB): " + bytes / KB);

            } catch (IOException ex) {
                Logger.getLogger(EjemplosFiles.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

}
