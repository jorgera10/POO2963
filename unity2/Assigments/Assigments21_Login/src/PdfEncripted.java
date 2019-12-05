/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfStamper;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.File;
import java.io.FileOutputStream;
import javax.swing.JOptionPane;

/**
 *
 * @author Lenovo
 */
public class PdfEncripted {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        byte[] USER = "123456".getBytes();
        byte[] OWNER = "123456".getBytes();
        try {
            File pdf = new File("C:/Users/Lenovo/Desktop/Contraseña/Prueba.pdf");
            if (pdf.exists()) {

                PdfReader pdfr = new PdfReader("C:/Users/Lenovo/Desktop/Contraseña/Prueba.pdf");
                PdfStamper pdfs = new PdfStamper(pdfr, new FileOutputStream("C:/Users/Lenovo/Desktop/Contraseña/PruebaEncriptado.pdf"));
                pdfs.setEncryption(USER, OWNER, PdfWriter.ALLOW_PRINTING, PdfWriter.ENCRYPTION_AES_128 | PdfWriter.DO_NOT_ENCRYPT_METADATA);
                pdfs.close();
                pdfr.close();

            } else {
                JOptionPane.showMessageDialog(null, "Este archivo no existe");
            }

        } catch (Exception e) {

        }
    }

}
