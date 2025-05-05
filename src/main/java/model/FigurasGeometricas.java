
package model;


public abstract class FigurasGeometricas {
        
private String cor;
public FigurasGeometricas(){
this("");
}
public FigurasGeometricas(String cor){
this.cor = cor;
}
public String getCor() {
return cor;
}
public void setCor(String cor) {
this.cor = cor;
}
public abstract double getArea();
}
   

