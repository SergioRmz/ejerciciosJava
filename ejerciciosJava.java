package ejerciciosJava;

import java.text.MessageFormat;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Programas {
	
	static void triangulo() {

		Scanner myScanner = new Scanner(System.in);
		
		System.out.println("Ingresa el primer lado:");
		double ladoA = myScanner.nextDouble();
		System.out.println("Ingresa la base:");
		double ladoB = myScanner.nextDouble();
		System.out.println("Ingresa el tercer lado:");
		double ladoC = myScanner.nextDouble();
		myScanner.close();
		
		double area = 0;
		String triangulo = "";
		if (ladoA == ladoB && ladoB == ladoC) {
			triangulo = "Equilatero";
			area = (Math.pow(ladoA,2) * (Math.sqrt(3))) / 4;
		} else {
			if(ladoA == ladoB || ladoA == ladoC || ladoC == ladoB) {
				triangulo = "Isoceles";
				area = (ladoB * (Math.sqrt((Math.pow(ladoA,2) - (Math.pow(ladoB,2)/4)))) /2);
			} else {
				if(ladoA != ladoB || ladoA != ladoC|| ladoC != ladoB) {
					triangulo = "Escaleno";
					double semiPerim = (ladoA + ladoB + ladoC) / 2;
					area = Math.sqrt((semiPerim) * (semiPerim - ladoA)* (semiPerim - ladoB) * (semiPerim - ladoC));
				}
			}
		}
		
		
		String msg = MessageFormat.format("Es un triangulo de tipo {0} y su area es: {1} ",triangulo, area);
		System.out.println(msg);
		
	}
	
	static void areaPerimetroCirculo() {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("Introduce el radio");
		double radio = myScanner.nextDouble();
		
		myScanner.close();
		
		double perimetro = (2 * Math.PI) * radio;
		double area = Math.PI * (Math.pow(radio,2));
		
		String msg = MessageFormat.format("Tomando en cuenta el radio de {0} "
				+ "el perimetro es de: {1} y el area: {2}"
				,radio, perimetro, area);
		
		System.out.println(msg);
		
	}
	
	
	static void horaSistema() {
		int hora = LocalDateTime.now().getHour();
		int minutos = LocalDateTime.now().getMinute();
		
		String msg = MessageFormat.format("La hora del sistema es {0}:{1}", hora, minutos);
		
		System.out.println(msg);
		
	}
	
	static void segundosMinutosHoras() {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("Introduce el numero de segundos: ");
		double segundos = myScanner.nextDouble();
		
		myScanner.close();
		
		double minutos = (segundos / 60);
		double horas = (segundos / 3600);
		
		
		String msg = MessageFormat.format("Hay {0} hora(s) y {1} minuto(s)", horas, minutos);
		System.out.println(msg);
		
	}
	
	static void volumenEsfera() {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("Introduce el radio de la esfera: ");
		double radio = myScanner.nextDouble();
		myScanner.close();
		
		double volumen = ((4 * Math.PI) * Math.pow(radio,3)) / 3;
		
		String msg = MessageFormat.format("El volumen es de: {0}", volumen);
		System.out.println(msg);
		
	}
	
	static void volumenCono() {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("Introduce el radio del cono: ");
		double radio = myScanner.nextDouble();
		System.out.println("Introduce la altura del cono: ");
		double altura = myScanner.nextDouble();
		myScanner.close();
		
		double volumen = (Math.PI * Math.pow(radio, 2) * altura) / 3;
		String msg = MessageFormat.format("El volumen es de: {0}", volumen);
		System.out.println(msg);
	}

	static void areaCubo() {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("Introduce uno de los lados del cubo: ");
		double lado = myScanner.nextDouble();
		myScanner.close();
		
		double areaSuperficial = 6 * (Math.pow(lado,2));
		
		String msg = MessageFormat.format("El area superficial del cubo es de: {0}", areaSuperficial);
		System.out.println(msg);
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		triangulo();
		
//		areaPerimetroCirculo();
		
//		horaSistema();	
		
//		segundosMinutosHoras();
		
//		volumenEsfera();
		
//		volumenCono();
	}

}
