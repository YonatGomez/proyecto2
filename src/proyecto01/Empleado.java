package proyecto01;
import java.util.ArrayList;
import javax.swing.JOptionPane;
public class Empleado {
    private int id;
    private  String nombre;
    private  String apellido;
    private ArrayList<Auto> autos=new ArrayList();
    private  int salario;
    
    public Empleado(String nombre, String apellido,int salario){
        
        this.nombre=nombre;
        this.apellido=apellido;
        this.salario=salario;

    }

    public void setid(int id){
        this.id=id;
    }
    public int getid(){
        return id;
    }
    public void setnombre(String nombre){
        this.nombre=nombre;
    }
    public String getnombre(){
        return nombre;
    }
   
    public String getapellido(){
        return apellido;
    }
    public void setapellido(String apellido){
        this.apellido=apellido;
       
    }
    public ArrayList getautos(){
        return autos;
    }
    public void setautos(ArrayList auto){
        this.autos=auto;
    }
    public int getsalario(){
         return salario;
    }
    public void setsalario(int salario){
        this.salario=salario;
    }
     
    public String input(String cadena){
        return JOptionPane.showInputDialog(cadena);
    } 
    
    public void addAutosvendidos(){
        String marca= input("Marca auto");
        String tipo= input("Tipo auto");
        Auto auto=new Auto();
        auto.setmarca(marca);
        auto.settipo(Integer.parseInt(tipo));
        autos.add(auto);   
    }
  
    public static double calcularMiNomina(Empleado empleado){
        double nomina;
        int comision=0;
        
        for(int i=0;i<empleado.autos.size();i++){
            if(empleado.autos.get(i).gettipo()==1){
                comision =comision+750000;
                
            }
            if(empleado.autos.get(i).gettipo()==2){ 
                   comision =comision +500000; 
                    
            }
            if(empleado.autos.get(i).gettipo()==3){ 
                   comision =comision + 350000; 
                    
                   }

        }
        nomina=empleado.salario + comision;
        nomina= nomina - 2*(nomina*4/100);
        return  nomina ;

    }
    public  double calcularPago(Empleado empleado){
        double nomina;
        int comision=0;
        
        for(int i=0;i<empleado.autos.size();i++){
            if(empleado.autos.get(i).gettipo()==1){
                comision =comision+750000;
                
            }
            if(empleado.autos.get(i).gettipo()==2){ 
                   comision =comision +500000; 
                    
            }
            if(empleado.autos.get(i).gettipo()==3){ 
                   comision =comision + 350000; 
                    
                   }

        }
        nomina=empleado.salario + comision;
        
        return  nomina ;

    }
    
}
