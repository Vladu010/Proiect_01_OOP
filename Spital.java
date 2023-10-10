
import java.util.Scanner;

public class Spital {
    private String numeSpital;
    private String adresaSpital;
    private static Pacient[] pacient;

    public Spital(String numeSpital, String adresaSpital){
        this.adresaSpital=adresaSpital;
        this.numeSpital=numeSpital;
    }
    public void setPacient(int nr){
        pacient = new Pacient[nr];
        for (int i = 0; i < nr; i++) {
            pacient[i] = new Pacient(); // Initializam fiecare element
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int meniu;
        int k=0;
        Spital hospital= new Spital("Spital Judetean", "Cornisa");

        do {
            System.out.println("1. Pacienti Spital" );
            System.out.println("2. Introducere Pacienti");
            System.out.println("3. Lista Pacienti");
            System.out.println("4. Diagnosticare pacienti" );


            System.out.println("Alegeti varianta :");
            meniu = sc.nextInt();
            switch (meniu) {
            case 1:
                hospital.setPacient(sc.nextInt());
                    break;
            case 2:{
                Spital.pacient[k] = new Pacient(sc.next(), sc.next(), sc.next(),sc.nextInt(),sc.nextInt());
                k++;
                break;
            }
            case 3:{
                for(int i = 0; i<k ; i++){
                    System.out.println(Spital.pacient[i].toString());}
                break;
            }
            case 4:{
                for(int i = 0 ;i<pacient.length;i++){
                    int tmp=pacient[i].getParametri();
                    if(tmp < 40 || tmp >100){
                        System.out.println("Introduceti Diagnostic : ");
                        pacient[i].setDiagnostic(sc.next());}
                }
               break;
            }

        }
	} while( meniu != 0 );
    sc.close();

    }

}

