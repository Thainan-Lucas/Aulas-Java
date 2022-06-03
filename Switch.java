package eXERCITANTO;

public class Switch {

	public static void main(String[] args) {
		
		byte dia = 2
				;
		// Os tipos de variavel que pode ser usado no switch
		// char, int, byte, short, enum e String
		
		switch(dia) {
		
		case 1:
			System.out.println(" Domingo, Seja bemvindo ao final de semana ");
			break;
		case 2:
			System.out.println(" Segunda-Feira ");
			break;
		case 3:
			System.out.println(" Terça-Feira ");
			break;
		case 4:
			System.out.println(" Quarta-Feira ");
			break;
		case 5:
			System.out.println(" Quinta-Feira ");
			break;
		case 6:
			System.out.println(" Sexta-Feira ");
			break;
		case 7:
			System.out.println(" Sabado ");
			break;
		
		default:
			System.out.println(" Opcão invalida ");
			
		}
		
		
	}

}
