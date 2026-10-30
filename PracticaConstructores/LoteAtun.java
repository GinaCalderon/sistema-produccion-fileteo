package PracticaConstructores;

public class LoteAtun {
   private String codigo;
   private double pesoInicial;
   private double pesoLomos;
   private double pesoDesperdicio;
   private double temperatura;
   
   //1.Constructor por defecto 
   public LoteAtun() {
    this("LOTE-100", 100.0, 48.0, 52.0, 3.5);
   }
   //2.Constructor parametrizado
     public LoteAtun(String codigo, double pesoInicial, double pesoLomos, double pesoDesperdicio,double temperatura)
     {

   //Validar código
   if (codigo == null || codigo.trim().isEmpty()) {
       throw new IllegalArgumentException("El código de lote no puede estar vacio");
   }

   //Validar pesos
   if (pesoInicial <= 0 || pesoLomos < 0 || pesoDesperdicio < 0) {
    throw new IllegalArgumentException("Los pesos ingresados no son válidos");
   }

   //Validar balance de masas
   if(Math.abs(pesoLomos + pesoDesperdicio - pesoInicial) > 0.001) {
    throw new IllegalArgumentException("La suma de lomos y desperdicio debe coincidir con el peso inicial");
   }  
   
   //Validar temperatura
   if(temperatura < -273.15 || temperatura > 4.0) {
    throw new IllegalArgumentException("La temperatura debe estar entre -273.15 y 4.0 grados Celsius");
   }

   //Inicializar atributos usando this
   this.codigo = codigo;
   this.pesoInicial = pesoInicial;
   this.pesoLomos = pesoLomos;
   this.pesoDesperdicio = pesoDesperdicio;
   this.temperatura = temperatura;
}

//3.Constructor sobrecargado
public LoteAtun(String codigo, double pesoInicial, double pesoLomos, double pesoDesperdicio){
    this(codigo, pesoInicial, pesoLomos, pesoDesperdicio, 4.0);
}

//Mostrar datos de lote
public void mostrarDatos() {
        System.out.println("Codigo: " + this.codigo);
        System.out.println("Peso inicial: " + this.pesoInicial + " kg");
        System.out.println("Peso de lomos: " + this.pesoLomos + " kg");
        System.out.println("Peso de desperdicio: " + this.pesoDesperdicio + " kg");
        System.out.println("Temperatura: " + this.temperatura + " °C");

        double rendimiento = (this.pesoLomos / this.pesoInicial) * 100;
        
        System.out.println("Rendimiento: " + rendimiento + "%");
         if (rendimiento >= 45 && rendimiento <= 51) {
        System.out.println("Clasificacion: Rendimiento Bueno");
    } else {
        System.out.println("Clasificacion: Rendimiento Malo");
    }

}
}


