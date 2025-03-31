package ForLoop;

public class Main {
    public static void main(String[] args) {
        int i;
        for (i = 2; i <= 20; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println(" ");
        i = 3;
        while (i <= 15) {
            System.out.print(i + " ");
            i+=3;
        }
        System.out.println(" ");
        i =5;
        do{
            System.out.print(i + " ");
            i--;
        }while(i>0);
        System.out.println(" ");
        int a =2;
        for(i=1;i<=10;i++){
            System.out.println(a + " x "+ i + " = " + (a*i));
        }
        String ast = "*";
        for (i = 1; i <= 5; i++) {
            System.out.println(ast);
            ast = ast + "*";
            }
        }

    }

