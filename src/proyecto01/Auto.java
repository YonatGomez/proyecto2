//package proyecto01;
public class Auto {
    private String marca;
    private int tipo;
    
    public Auto(String marca,int tipo){
        this.marca=marca;
        this.tipo=tipo;
    }
    public Auto(){
       marca="";
       tipo=0;
    }
     public String getMarca(){
        return marca;
     }
     public void setMarca(String marca){
        this.marca=marca;
    }
     public int getTipo(){
         return tipo;
     }
     public void setTipo(int tipo){
         this.tipo=tipo;
     }
    
    
}
