package multiples;

import javax.swing.JOptionPane;

public class multiplesClase3 {

	public static void main(String[] args) {
		String nota = JOptionPane.showInputDialog("ingrese la calificacion");
		int calificacion = 85;
		
		char letra;
		
		if (calificacion >=90) {
			letra ='A';
		} else if (calificacion >=80);{
		    letra ='B';
	    } else if (calificacion >=70);{
	        letra ='C';
        } else if (calificacion >=60);{
             letra ='D';
        } else {
        	letra ='F';
        }
		
		System.out.println("Ingrese la calificacion en letra es:" + letra);
	}

}
