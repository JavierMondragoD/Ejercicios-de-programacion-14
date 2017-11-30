/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.JOptionPane;
/**
 *
 * @author JOSE JAVIER
 */
public class Estatura {

    public void Calcular(double estatura,double peso,int edad){
		
double imc= peso/(estatura*estatura);
		
if (imc<18.5) {
			
JOptionPane.showMessageDialog(null," Tienes bajo peso");
} else if ( imc>=18.5 && imc<=24.9) {
JOptionPane.showMessageDialog(null,"Estas en el peso normal");
} else if (imc>=25 && imc<=29.9) {
JOptionPane.showMessageDialog(null,"Tienes sobrepeso");
 } else {
JOptionPane.showMessageDialog(null,"Tienes obesidad");
}
}
    }
