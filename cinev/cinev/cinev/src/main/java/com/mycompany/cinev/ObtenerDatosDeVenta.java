
package com.mycompany.cinev;
import java.io.FileWriter;
import java.io.IOException;

public class ObtenerDatosDeVenta {
    private String nombreDePelicula;
    private String horarioDePelicula;
    private String sala;
    private String nombreCliente;
    private String apellidosCliente;
    private String nit;
    private String ci;
    private String formato;
    private int precioBoleto;
    private int precioTotal;
    private int numeroBoletos;
    
    // Constructor
    public ObtenerDatosDeVenta(String nombreDePelicula, String horarioDePelicula, String sala,
                               String nombreCliente, String apellidosCliente, String nit,
                               String ci, String formato, int precioBoleto, int precioTotal, int numeroBoletos) {
        this.nombreDePelicula = nombreDePelicula;
        this.horarioDePelicula = horarioDePelicula;
        this.sala = sala;
        this.nombreCliente = nombreCliente;
        this.apellidosCliente = apellidosCliente;
        this.nit = nit;
        this.ci = ci;
        this.formato = formato;
        this.precioBoleto = precioBoleto;
        this.precioTotal = precioTotal;
        this.numeroBoletos = numeroBoletos;
    }

    // Método para guardar los datos de la venta en un archivo de texto
    public void guardarDatosEnArchivo() {
        try (FileWriter writer = new FileWriter("ventas.txt", true)) { // Modo append (true)
            writer.write("Pelicula: " + nombreDePelicula + "\n");
            writer.write("Horario: " + horarioDePelicula + "\n");
            writer.write("Sala: " + sala + "\n");
            writer.write("Cliente: " + nombreCliente + " " + apellidosCliente + "\n");
            writer.write("NIT: " + nit + "\n");
            writer.write("CI: " + ci + "\n");
            writer.write("Formato: " + formato + "\n");
            writer.write("Numero de Boletos: " + numeroBoletos + "\n");
            writer.write("Precio Boleto: " + precioBoleto + " Bs.\n");
            writer.write("Precio Total: " + precioTotal + " Bs.\n");
            writer.write("-----------------------------------------\n");
        } catch (IOException e) {
            System.out.println("Error al guardar los datos en el archivo: " + e.getMessage());
        }
    }
}
