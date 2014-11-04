package boletin70;
// @author dpazolopez
import javax.swing.JOptionPane;

public class Numeros {
    private double num1;
    public Numeros(){
    
}
    public Numeros (double n1){
        this.num1=n1;
    }
    public void setNum1(double n1){
        num1=n1;
    }
    public double pedirDato(){
        String resposta= JOptionPane.showInputDialog("introduce dato");
        double valor= Double.parseDouble(resposta);
        return valor;
    }
    
    public double Condicion(){
        if (num1>0)
            JOptionPane.showMessageDialog(null,num1+" E positivo");
        return num1;
       
    }
}

