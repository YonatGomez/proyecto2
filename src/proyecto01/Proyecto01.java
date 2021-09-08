
package proyecto01;

class Proyecto01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      
         Empleado e=new Empleado("Diego","Moreno",1875000);
         for(int i=1;i<=2;i++){
             e.addAutosvendidos();
        
         }
         
         System.out.println("NOMINA");
         System.out.println("Nombre: "+e.getnombre() + "Apellido:"+e.get);
         
    }
    
}
