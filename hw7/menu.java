import java.util.*;
import java.io.IOException;
public class menu {
    public static void main(String[] args) throws IOException,InterruptedException,IllegalStateException {
        int key;
        String a[] = {"","",""};
        int count[] = {0,0,0};
        Scanner in = new Scanner(System.in);
        prt(a);
        while(true){
            try {
                while(in.hasNext()){
                    key = in.nextInt();
                    for(int j = count[key - 1]*key;j > 0; j--){
                        java.awt.Toolkit.getDefaultToolkit().beep();
                        Thread.sleep(500);
                    }
                    clearScreen();
                    int i = count[key - 1];
                    switch(key){
                        case 1:
                            for(;i>0;i--) a[key - 1] += "\t";
                            a[key - 1] += count[key - 1] == 0?1:(count[key - 1]*1);
                            prt(a);
                            break;
                        case 2:
                            for(;i>0;i--) a[key - 1] += "\t";
                            a[key - 1] += count[key - 1] == 0?1:(count[key - 1]*2);
                            prt(a);
                            break;
                        case 3:
                            for(;i>0;i--) a[key - 1] += "\t";
                            a[key - 1] += count[key - 1] == 0?1:(count[key - 1]*3);
                            prt(a);
                            break;
                    }
                    count[key - 1]++;
                }
                in.close();
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Please enter the number between 1~3");
                in.next();
            } catch (InputMismatchException e){
                System.out.println("Please enter the number between 1~3");
                in.next();
            } catch (IllegalStateException e){
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                System.out.println("Exit");
                break;
            }
        }
    }
    public static void prt(String [] a){
        System.out.println("\tNCKU(type ctrl+z to exit)");
        System.out.println("1." + a[0]);
        System.out.println("2." + a[1]);
        System.out.println("3." + a[2]);
    }
    public static void clearScreen() throws IOException, InterruptedException {  
   //     System.out.print("\033[H\033[2J");
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    //    System.out.flush();  
    }  
    
}
