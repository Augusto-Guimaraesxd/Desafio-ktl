import java.util.Scanner;

public class GerenciaGeek {



        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            double media = scanner.nextDouble();

            if(media <= 4.5){
                System.out.println("REP");
            }
            else if(media >= 5 && media <= 6){
                System.out.println("MED");
            }
            else{
                System.out.println("APR");
            }

            //TODO: Verifique a média lida e imprima a avaliação do funcionário.
            //Onde: "APR" é bom, "MED" é médio e "REP" é ruim.
        }
    }

