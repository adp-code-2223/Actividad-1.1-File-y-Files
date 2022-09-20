/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ud1.ejemplos.files;

import java.nio.file.Path;
import java.nio.file.Paths;
import ud1.util.Utils;

/**
 *
 * @author maria
 */
public class FilesMain {

    public static void main(String[] args) {
        Path pathCrear = Paths.get(Utils.DIRECTORIO_BASE, "ud1.txt");
        EjemplosFiles.createFile(pathCrear);

      

    }

}
