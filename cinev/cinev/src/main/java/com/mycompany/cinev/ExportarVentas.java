/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cinev;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;


public class ExportarVentas {
    public static void generarReportes() {
        Conexion conexion = new Conexion();
        Connection con = conexion.establecerConexion();

        if (con == null) {
            System.out.println("Error en la conexión a PostgreSQL.");
            return;
        }

       String consulta = "SELECT fecha_hora_venta, monto_total FROM venta ORDER BY fecha_hora_venta";
        Map<String, List<String>> ventasPorMes = new LinkedHashMap<>();
         List<String> todasLasVentas = new ArrayList<>();

    try (
     PreparedStatement pstmt = con.prepareStatement(consulta);
     ResultSet rs = pstmt.executeQuery()) {

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    while (rs.next()) {
        LocalDate fecha = rs.getDate("fecha_hora_venta").toLocalDate();
        double monto = rs.getDouble("monto_total");
        String claveMes = fecha.getMonthValue() + "-" + fecha.getYear();
        String venta = fecha.format(formatter) + " - " + monto;

        if (!ventasPorMes.containsKey(claveMes)) {  
    ventasPorMes.put(claveMes, new ArrayList<>());  
                }
          ventasPorMes.get(claveMes).add(venta);

        todasLasVentas.add(venta);
    }

       } catch (SQLException e) {
          e.printStackTrace();
}

      String escritorio = System.getProperty("user.home") + "/Desktop/";
      guardarArchivo(escritorio + "registros_mensuales.txt", ventasPorMes);
      guardarArchivo(escritorio + "registros_totales.txt", todasLasVentas);

       System.out.println("¡Advertencia! Los reportes han sido creados en el escritorio.");

    }

    private static void guardarArchivo(String ruta, Map<String, List<String>> datos) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(ruta))) {
            for (Map.Entry<String, List<String>> gu : datos.entrySet()) {
                bw.write("Mes-Año: " + gu.getKey());
                bw.newLine();
                for (String venta : gu.getValue()) {
                    bw.write(venta);
                    bw.newLine();
                }
                bw.newLine();
            }
            System.out.println("Archivo generado: " + ruta);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void guardarArchivo(String ruta, List<String> datos) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(ruta))) {
            for (String venta : datos) {
                bw.write(venta);
                bw.newLine();
            }
            System.out.println("Archivo generado: " + ruta);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

