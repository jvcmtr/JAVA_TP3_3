import java.util.Scanner;

public class Program {
 
    public static void main (String[] args){
        String s = "";

        if (args.length == 0){
            Scanner in = new Scanner(System.in);
            System.out.println("Digite um nome : ");
            s = in.nextLine();
            in.close();
        }
        else{
            for (String string : args) {
                s += string + " ";
            }
            s = s.trim();
        }

        s.replaceAll("\\w[e(d[aeiou])]\\w", " ");
        System.out.println(s);
    }   
}
