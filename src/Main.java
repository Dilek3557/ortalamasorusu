import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);


int mat, fzk, kmy, turk, tar, muzi;
//kullanıcıdan ndeger al
        System.out.println("mat");
        mat= input.nextInt();


        System.out.println("fzk");
        fzk= input.nextInt();


        System.out.println("kmy");
        kmy= input.nextInt();


        System.out.println("turkce");
        turk= input.nextInt();


        System.out.println("tar");
        tar= input.nextInt();

        System.out.println("muzi");
        muzi= input.nextInt();

double sonuc= (mat+ fzk+ kmy+ turk+ tar+ muzi)/6.0;
        System.out.println("sonuc"+sonuc);
    }
}
