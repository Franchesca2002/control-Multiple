package multiples;

public class multiplesClase1 {

	public static void main(String[] args) {
		int lado1 =5;
		int lado2 =5;
		int lado3 =5;
		
		if (lado1 == lado2 && lado2 == lado3) {
			System.out.println("El triangulo es equilatero");
			}else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
				System.out.println("El triangulo es isosceles");
			}else {
				System.out.println("El triangulo es escaleno");
			}

	}

}
