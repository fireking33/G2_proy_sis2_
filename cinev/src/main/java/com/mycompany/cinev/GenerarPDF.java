
package com.mycompany.cinev;

import com.itextpdf.kernel.pdf.*;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class GenerarPDF {
    public static void main(String[] args) throws IOException {
        try {
            // Ruta del escritorio en Windows
            String desktopPath = System.getProperty("user.home") + "\\Desktop\\documento.pdf";

            // Crear el escritor PDF con la ruta especificada
            PdfWriter writer = new PdfWriter(desktopPath);

            // Crear el documento PDF
            PdfDocument pdf = new PdfDocument(writer);
            Document document = new Document(pdf);

            // Agregar un párrafo al PDF
            document.add(new Paragraph("Reporte generado por el luna y cumeado por el bluej"));

            // Cerrar el documento y guardar el archivo
            document.close();

            // Imprimir mensaje de confirmación
            System.out.println("PDF creado en: " + desktopPath);
        } catch (FileNotFoundException e) {
            // Manejar errores si no se puede crear el archivo
            System.out.println("Error al crear el PDF: " + e.getMessage());
        }
    }
}