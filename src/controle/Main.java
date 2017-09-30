/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Laryssa
 */
public class Main {

    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Instanciando a data de hoje nos vários formatos.
        Date date = new Date(System.currentTimeMillis());
        Timestamp t = new Timestamp(System.currentTimeMillis());
        Calendar cal = Calendar.getInstance();
        
        //Apresentando no concole
        System.out.println("Data de hoje Date "+date);
        System.out.println("Data de hoje TimeStamp "+t);
        System.out.println("Data de hoje Calendar "+cal.getTime());
        
        //pulando linha
        System.out.println("");
      
        
        //Instanciando a classe que converte em string e faz o reverso
//      passando também o padrão
//      dd = dia formato 01
//      MM = mes format 01
//      YYYY = ano format 2017
//      HH = hora format 24
//      hh = hora format 12
//      mm = minuto format 60
//      outros caracteres não reconhecidos como : serão apenas copiados na string 
//      ou na conversão
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        
//      Mostrando formatado no console.
        System.out.println("Convertando para String de Date "+sdf.format(date));
        System.out.println("Convertando para String de TimeStamp "+sdf.format(t));
        System.out.println("Convertando para String de Calendar "+sdf.format(cal.getTime()));
        
        //pulando linha
        System.out.println("");
       
        //Fazendo o reverso, convertendo string em data exemplos nos formatos.
        String dataString = "07/02/1989 23:30";
        try{
            Date dataConvertida = sdf.parse(dataString);
            System.out.println("Data convertida String para Date "+dataConvertida);
           
            Timestamp timeStampConvertido = new Timestamp(sdf.parse(dataString).getTime());
            System.out.println("Data convertida String para Time Stamp "+timeStampConvertido);
           
            Calendar calConvertido = Calendar.getInstance();
            calConvertido.setTime(sdf.parse(dataString));
            System.out.println("Data convertida String para Calendar "+calConvertido.getTime());
           
            
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
    }
    
}
