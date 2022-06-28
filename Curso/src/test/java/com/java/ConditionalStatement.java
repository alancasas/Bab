package com.java;

public class ConditionalStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int velocidad = 70; //km
		int limiteVelocidad = 80; //km
		
//		if(velocidad > limiteVelocidad) {
//			System.out.println("el coche va a exceso de velocidad");
//		}else {
//			System.out.println("el coche va en la velocidad adecuada");
//		}
		
		// IF ANIDADO / IF Else
		
		boolean carretera = true;
		
		if(carretera) {
			System.out.println("Estas en una carretera");
			
			limiteVelocidad = 110;
			
			if(velocidad > limiteVelocidad) {
				System.out.println("El coche va a exceso de velocidad");
			}else {
				System.out.println("El coche va en la velocidad adecuada");
			}
		}else if(velocidad > limiteVelocidad) {
			System.out.println("El coche esta en una calle y va a exceso de velocidad");
		}else {
			System.out.println("El coche esta en una calle y va exceso de velocidad");
		}
		
		//Switch case 
		int temperatura = 10;
		
		switch(temperatura) {
		
		case 5:
			System.out.println("Mucho frio");
			break;
			
		case 10:
			System.out.println("Frio");
			break;
			
		case 30:
			System.out.println("Caliente");
			break;
		
		default:
			System.out.println("No encontro relacion con la temperatura/n");
			break;
		
		}
	}

}
