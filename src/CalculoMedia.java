import java.util.Scanner;

public class CalculoMedia {
    public static void main(String[] args) {

        inputNotas();

    }
    public static void inputNotas(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Por favor digite o nome do aluno: ");
        String nome = teclado.nextLine();
        System.out.println("Por favor digite a Primeira nota: ");
        float nota1 = teclado.nextFloat();
        System.out.println("Por favor digite a Segunda nota: ");
        float nota2 = teclado.nextFloat();
        System.out.println("Por favor digite a Terceira nota: ");
        float nota3 = teclado.nextFloat();
        System.out.println("Por favor digite a Quarta nota: ");
        float nota4 = teclado.nextFloat();


        float media = (nota1 + nota2 +nota3 + nota4)/4;

        System.out.println("Aluno(a) "+ nome +" obteve a media de "+ media );
    }

}