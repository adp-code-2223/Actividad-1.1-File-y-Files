/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ud1.ejemplos.file;

import java.io.File;

/**
 *
 * @author maria
 */
public class EjemplosFile {

    public static void crearFichero(String ruta) {

        try {
// Creamos el objeto que encapsula el fichero
            File fichero = new File(ruta);
// A partir del objeto File creamos el fichero físicamente
            if (fichero.createNewFile()) //if comentado
            {
                System.out.println("El fichero " + ruta + " se ha creado correctamente");
            } else {
                System.out.println("No ha podido ser creado el fichero con ruta " + ruta);
            }
        } catch (Exception ioe) {
            ioe.getMessage();
        }

    }

    public static void borrarFichero(String ruta) {
        // Borrar fichero
        boolean borrado = false;
        File fichero = new File(ruta);
        if (fichero.exists()) {
            borrado = fichero.delete();
        }
        if (borrado) {
            System.out.println("El fichero " + ruta + " se ha borrado correctamente.");
        } else {
            System.out.println("El fichero " + ruta + " no se ha borrado correctamente.");
        }

    }

    public static void crearDirectorio(String rutaDir) {
        try {

            boolean exito = (new File(rutaDir)).mkdir();
            if (exito) {
                System.out.println("Directorio: " + rutaDir + " creado");
            } else {
                System.out.println("Directorio: " + rutaDir + " NO ha sido creado");
            }

        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    public static void crearDirectoriosIntermedios(String rutaDirs) {
        try {

            File file = new File(rutaDirs);

// Crear varios directorios
            boolean exito = file.mkdirs();
            if (exito) {
                System.out.println("Directorios: " + rutaDirs + " creados");
            } else {
                System.out.println("Directorios: " + rutaDirs + " NO creados");
            }

            System.out.println("La ruta de entrada es: " + file.getAbsolutePath());

        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    public static boolean borrar(File f) {
        boolean borradoAcumulado = true;
        boolean borradoIndividual = true;
        File[] hijos;
        if (f.isDirectory()) {
            hijos = f.listFiles();
            for (File hijo : hijos) {
                borrar(hijo);
            }

            borradoIndividual = f.delete();
            borradoAcumulado = borradoAcumulado && borradoIndividual;
            if (borradoIndividual) {
                System.out.println("Se ha borrado con éxito el directorio : " + f.getAbsolutePath());
            } else {
                System.out.println("NO se ha borrado con éxito el directorio : " + f.getAbsolutePath());
            }

            //  borrado = borrado && f.delete();
        } else {
            borradoIndividual = f.delete();
            borradoAcumulado = borradoAcumulado && borradoIndividual;
            if (borradoIndividual) {
                System.out.println("Se ha borrado con éxito el fichero : " + f.getAbsolutePath());
            } else {
                System.out.println("NO se ha borrado con éxito el fichero : " + f.getAbsolutePath());
            }
        }
        return borradoAcumulado;
    }

}
