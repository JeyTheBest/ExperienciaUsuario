
package Preguntas_Y_Respuestas;

import java.util.StringTokenizer;

public class Respuestas {
    String[]respuestas ={
        "A.Diseño UX","A.Experiencia de usuario","B.Usabilidad","B.Usabilidad","B.Diseño de interfaz de Usuario"
    };
    
    String[] radioR ={
      
        "A.Diseño UX,B.Diseño UI,C.Diseño Uf,D.Diseño UD",
        "A.Experiencia de usuario,B.Interfaz usuario,C.Experiencia web,D.Interfaz web",
        "A.Accesibilidad,B.Usabilidad,C.Conectividad,D.Instancia",
        "A.Conectividad,B.Usabilidad,C.Accesibilidad,D.Compatibilidad",
        "A.Diseño de interfaz ,B.Diseño de interfaz de Usuario,C.Diseño de interfaz y experiencia,D.Diseño de datos",
        
    };
    
    
    
     String[]respuestas2 ={
        "A.Las emociones","B.La memoria","C.Diseño gráfico funcional","A.Obtener estimaciones más precisas","C.Retener al Usuario"
    };
    
    String[] radioR2 ={

        "A.Las emociones,B.La memoria,C.La motivación,D.El desempeño",
        "A.Las emociones,B.La memoria,C.La motivación,D.El desempeño",
        "A.Ayuda al usuario,B.Mostrar el contenido,C.Diseño gráfico funcional,D.Diseño",
        "A.Obtener estimaciones más precisas,B.Optimizar tiempos,C.Incrementar ventas,D.Acelerar procesos",
        "A.Ayudar al usuario,B.Facilidad al usuario,C.Retener al Usuario,D.Implementar alusuario",
        
    };
    
    
     String[]respuestas3 ={
        "D.El UI permite que la navegación sea fácil de comprender y las acciones simples de realizar.","B.El papel del UX es hacer que la navegación sea agradable.","C.Generación de alto valor para el público","B.Fortalecimiento de la marca","A.Altas posibilidades de retener y encantar a los usuarios"
    };
    
    String[] radioR3 ={

       





        "A.Direcciona al usuario y a lo que debe hacer.,B.El papel del UI es hacer que la navegación sea agradable.,C.Su Papel radica en la experiencia,D.El UI permite que la navegación sea fácil de comprender y las acciones simples de realizar.",
        "A.Direcciona al usuario y a lo que debe hacer.,B.El papel del UX es hacer que la navegación sea agradable.,C.Su Papel radica en la experiencia,<html>D.El UI permite que la navegación sea fácil de comprender y las acciones simples de realizar.<html>",
        "A.Altas posibilidades de retener y encantar a los usuarios,B.Fortalecimiento de la marca,C.Generación de alto valor para el público,D.Diseño intelectual",
        "A.Altas posibilidades de retener y encantar a los usuarios,B.Fortalecimiento de la marca,C.Generación de alto valor para el público,D.Diseño intelectual",
        "A.Altas posibilidades de retener y encantar a los usuarios,B.Fortalecimiento de la marca,C.Generación de alto valor para el público,D.Diseño intelectual",
        
    };
    
    
     String[]respuestas4 ={
        "A.Proceso de Negocio","C.Wireframes","B.Diseño en alta fidelidad","D.Screen Flow","A.Feedback"
    };
    
    String[] radioR4 ={

      

        "A.Proceso de Negocio,B.User persona,C.Wireframes,D.El Fireward",
        "A.Proceso de Negocio,B.User persona,C.Wireframes,D.El Fireward",
        "A.Proceso de Negocio,B.Diseño en alta fidelidad,C.Wireframes,D.El Fireward",
        "A.Proceso de Negocio,B.Diseño en alta fidelidad,C.Wireframes,D.Screen Flow",
        "A.Feedback,B.Diseño en alta fidelidad,C.Proceso de Negocio,D.Screen Flow",
        
    };
    
    public String getRespuesta4(int posicion){
        
        return respuestas4[posicion];
        
    }
    
    public String getRespuesta3(int posicion){
        
        return respuestas3[posicion];
        
    }
    
    public String getRespuesta2(int posicion){
        
        return respuestas2[posicion];
        
    }
    
    public String getRespuesta(int posicion){
        
        return respuestas[posicion];
        
    }
    
    
    
    
    
    public String[] separar(String cadena, String separador){
        StringTokenizer token = new StringTokenizer(cadena,separador);
        
        String[]a = new String[4];
        int i =0;
        while(token.hasMoreTokens()){
            a[i]= token.nextToken();
            i++;
        }
        return a;
    }
    
    public String[] setRespuestas(int posicion){
        String s1 = radioR[posicion];
        String[] s2 = separar(s1,",");
        return s2;
    }
    
     public String[] setRespuestas2(int posicion){
        String s1 = radioR2[posicion];
        String[] s2 = separar(s1,",");
        return s2;
    }
     
     public String[] setRespuestas3(int posicion){
        String s1 = radioR3[posicion];
        String[] s2 = separar(s1,",");
        return s2;
    }
     
     public String[] setRespuestas4(int posicion){
        String s1 = radioR4[posicion];
        String[] s2 = separar(s1,",");
        return s2;
    }
    
    
}

   
