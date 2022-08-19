import java.util.Scanner;

public class KombinasyonHesaplama {
    public static void main(String[] args) {

        int n,r, nFaktoriyel=1,rFaktoriyel=1;

        Scanner input = new Scanner(System.in);
        System.out.print("n elemanini giriniz: ");
        n = input.nextInt();
        System.out.print("r elemanini giriniz: ");
        r = input.nextInt();

        int a, aFaktoriyel=1;
        a=n-r;
        for (int i=1; i<=n; i++) {
            nFaktoriyel = nFaktoriyel * i;
        }
            for (int k=1; k<=r; k++) {
                rFaktoriyel = rFaktoriyel * k;
            }
                for (int j=1; j<=a; j++){
                    aFaktoriyel=aFaktoriyel*j;
                }
                
        double total= nFaktoriyel/(rFaktoriyel*aFaktoriyel);
        System.out.println(n+ " sayisinin " + r +"`li kombinasyonu= "+ total);

    }
}

/*
N elemanlı bir kümenin elemanları ile oluşturulacak r elemanlı farklı grupların sayısı
n’in r’li kombinasyonu olarak adlandırılır. N’in r’li kombinasyonu C(n,r) şeklinde gösterilir.

Java ile kombinasyon hesaplayan program yazınız.
C(n,r) = n! / (r! * (n-r)!)
 */