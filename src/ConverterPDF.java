package src;

import java.io.*;
import com.lowagie.text.*;
import com.lowagie.text.pdf.*;



public class ConverterPDF{

    public String nomeTxt;
    public String nomePdf;
    public BufferedReader arquivo;

    ConverterPDF(String nomeTxt, String nomePdf){
        this.nomeTxt = nomeTxt;
        this.nomePdf = nomePdf;
        try{
        BufferedReader arqObj = new BufferedReader(new FileReader(nomeTxt));
        this.arquivo = arqObj;
        }catch(Exception e){
            System.out.println(e);
        }

    }

    public void lerArq(){
        try{
            BufferedReader lerArquivo = this.arquivo;
            Document documento = new Document(PageSize.A4, 40, 40, 40, 40);
            PdfWriter.getInstance(documento, new FileOutputStream(this.nomePdf+".pdf"));
            documento.open();
            while(lerArquivo.ready()){
                documento.add(new Paragraph(lerArquivo.readLine()));
            }
            lerArquivo.close();
            documento.close();

        }catch(Exception e){
            System.out.println(e);
        }      
    }
    public String toString(){
        return nomeTxt + " / PDF -> " + nomePdf;
    }

}