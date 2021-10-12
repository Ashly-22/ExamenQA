public static void Tarifa(int z){
           if(z == 1000){
               System.out.println("imprimir prioridad");
           }
           if(z >500){
               System.out.println("Tarifa a pagar minima");
            }  
            else if((z <500) && (z > 100)){
           System.out.println("Tarifa normal");
           }
            else if(z > 0){
               System.out.println("Tarifa por unidad");
            }
     }
