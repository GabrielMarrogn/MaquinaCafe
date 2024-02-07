import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int um = sc.nextInt();
        int dois = sc.nextInt();
        int tres = sc.nextInt();
        int total = 0;
        sc.close();


        if(dois >= tres && dois>= um){
            total = um * 2 + tres * 2;
        }else if(tres >= um && (um + dois) <= tres){
            total = um * 4 + dois * 2;
        }else if(um >= tres && (tres + dois) <= um){
            total= tres * 4 + dois * 2; 
        }else{
            total = (tres + um) * 2;
        }

        System.out.println(total);
    }
}
