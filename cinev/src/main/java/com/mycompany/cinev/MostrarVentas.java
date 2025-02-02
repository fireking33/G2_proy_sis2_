
package com.mycompany.cinev;

/**
 *
 * @author fband
 */

import javax.swing.JOptionPane;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MostrarVentas {
    public static void mostrarVentasEnJOptionPane() {
        StringBuilder datos = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader("ventas.txt"))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                datos.append(linea).append("\n");
            }
            JOptionPane.showMessageDialog(null, datos.toString(), "Historial de Ventas", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al leer el archivo: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
