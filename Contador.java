import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		System.out.println("Imprimindo o numero 1");
		int parametroUm = terminal.nextInt;
		System.out.println("Imprimindo o numero 2");
		int parametroDois = terminal.nextInt;
		
		try {
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException e) {
			//imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
            System.out.println(e.getMessage());
        }       
        
        terminal.close();
		
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		
		int contagem = parametroDois - parametroUm;
		//realizar o for para imprimir os números com base na variável contagem

        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);

	}

}
}

