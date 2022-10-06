/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PDF;

import MetodosSQL.MetodosSQL;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Properties;



/**
 *
 * @author javie
 */
/*public class plantilla {
    
    String nombre;
    String apellido;
    String correoMio;
    String contrasenaMio;
    String correoDestino;
    
    Document documento;
    FileOutputStream archivo;
    Paragraph titulo;
    
    
    public plantilla(String nombre, String apellido){
        
        this.nombre =nombre;
        this.apellido = apellido;
        
        documento = new Document();
        titulo = new Paragraph("Felicidades");
    }
    
    public void CrearPlantilla( ){
        try {
            archivo = new FileOutputStream(nombre +".pdf");
            PdfWriter.getInstance(documento,archivo);
            documento.open();
            titulo.setAlignment(1);
            documento.add(titulo);
            //documento.add(new Paragraph(MetodosSQL.BuscarNombre(nombre)));
            //documento.add(new Paragraph(MetodosSQL.BuscarNombre(apellido)));
            documento.add(new Paragraph("nombre:"+nombre));
            documento.add(new Paragraph("apellido:"+apellido));
            documento.add(Chunk.NEWLINE);
            
            Paragraph texto = new  Paragraph("El término UX viene de User Experience, o Experiencia del Usuario. Básicamente es cómo una persona se siente mientras usa cualquier producto o servicio digital que tu empresa ofrece.\n" +
"\n" +
"UX tiene que ver también con la sensación de esta persona después de usar tu producto.\n" +
"\n" +
"Eso incluye su experiencia con tu sitio web y blog, el sistema online o la aplicación, incluso, si tu negocio no es 100% digital también aplica.");
            
            texto.setAlignment(Element.ALIGN_JUSTIFIED);
            documento.add(texto);
            documento.add(Chunk.NEWLINE);
            //documento.add(new Paragraph("fecha:"+fecha));
            documento.close();
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        }catch(DocumentException e){
            System.err.println(e.getMessage());
        }
    }
    
    
    
   
    
}*/
