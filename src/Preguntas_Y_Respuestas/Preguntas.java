
package Preguntas_Y_Respuestas;


public class Preguntas {
    
    String[] preguntas ={
        
        "<html>¿Cual es el diseño que hace referencia a lo que experimenta el usuario antes,durante y después de entrar en contacto con una página web.?<html>"
        ,"¿Qué significa UX?"
        ,"<html>Es la funcionalidad misma, la que permite que un producto cumpla el objetivo para el que fue creado sin problemas.<html>"
        ,"Se refiere a qué tan fácil resulta para el usuario entender el producto."
        ,"Es lo que se usa para interactuar con un producto o servicio."
    };
    
    String[] preguntas2 ={
        
        "<html>¿Son reacciones automáticas, y por lo tanto hay que entender cómo se generan y qué implicaciones tienen.<html>?"
        ,"<html>Cuando diseñamos una web tenemos que pensar en las limitaciones de las personas para recordar.<html>"
        ,"<html>Los elementos gráficos deben ir dirigidos a ayudar al usuario en encontrar lo que quiere, y no solamente como adorno.<html>"    
        ,"Podremos modificar elementos de diseño de manera más fácil."
        ,"<html>El usuario se quedará más tiempo si la página web tiene buena navegabilidad y encuentra lo que busca de manera rápida y sencilla.<html>"
    };
    
    String[] preguntas3 ={
        
       "¿Cuál es el papel del diseño UI?"
        ,"¿Cuál es el papel del diseño UX?"
        ,"<html>Una interfaz bien proyectada y conocimiento profundo sobre cómo tu buyer persona se comporta, es posible generar mucho más valor para tu público que si solo tuvieras a uno de los elementos en tu estrategia.<html>"    
        ,"<html>Las marcas que se preocupan por la experiencia completa que los clientes tienen en sus canales digitales logran el fortalecimiento de la relación con los usuarios.<html>"
        ,"<html>Esta pareja es responsable por la retención y encantamiento de los usuarios, lo que genera tráfico y más Engagement que viene de recomendaciones.<html>"
    };
    
    String[] preguntas4 ={
        
        "Entender lo que hace el negocio, como lo hace y para que lo hace."
        ,"Una vista rápida de los bloques que construyen cada pantalla."
        ,"<html>También conocido como “Diseño Visual”, es la capa superior que finaliza el diseño.<html>"    
        ,"Entender las pantallas que el usuario vero en su flujo de uso."
        ,"<html>Los comentarios de tu contraparte técnica y de los usuarios es sumamente relevante.<html>"
    };
    
     public String getPregunta4(int posicion){
        return preguntas4[posicion];
        
    } public String getPregunta3(int posicion){
        return preguntas3[posicion];
    }
    
    public String getPregunta2(int posicion){
        return preguntas2[posicion];
    }
    public String getPregunta(int posicion){
        return preguntas[posicion];
    }
    
}
