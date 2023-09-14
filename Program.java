import java.util.Scanner;

public class Program {
 
    public static void main (String[] args){
        String s = "";

        if (args.length == 0){
            Scanner in = new Scanner(System.in);
            System.out.println();
            System.out.print("Digite um nome : ");
            s = in.nextLine();
            in.close();
        }
        else{
            for (String string : args) {
                s += string + " ";
            }
            s = s.trim();
        }

        String sigla = s.toUpperCase().replaceAll(" (E|(D(A|E|I|O|U))) ", " ");
        String[] a = sigla.split(" ");
        sigla = "";
        for (String word : a) {
            sigla += word.trim().charAt(0);
        }
        System.out.println("SIGLA : " + s);
        System.out.println("\t" + sigla);
        System.out.println("\n");

    }   
}
