import java.util.Random;
import java.util.Scanner;
public class game {
    public static void main(String[] args) {
        java.util.Random rand;
        Object Random = rand = new Random();

        int random = rand.nextInt(3);
        System.out.println("Result = " + random); //biet trc may tinh ra j

        String may = null;

        if(random == 0) may = " bao ";
        if(random == 1) may = " keo ";
        if(random == 2) may = " bua ";

        
    
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap keo / bua / bao");
    

        String user = sc.nextLine();
        System.out.println("ban da nhap = " + user);
        System.out.println("may da nhap = " + may);
        if(user.equals(may)) System.out.println("hoa");
        
        if(user.equals("bao")){
            if(may == " keo ") System.out.println("may win");
            if(may == " bua ") System.out.println("nguoi win");
        }
        else if(user.equals("keo")){
            if(may == " bua ") System.out.println("may win");
            if(may == " bao ") System.out.println("nguoi win");
        }
        else if(user.equals("bua")){
            if(may == " bao ") System.out.println("may win");
            if(may == " keo") System.out.println("nguoi win");
        }

    }
}