package org.example;
// Sayısal analizde, Newton-Raphson yöntemi olarak da bilinen ve adını Isaac Newton ve Joseph Raphson'dan alan Newton
// metodu, gerçel değerli bir fonksiyonun köklerine (veya sıfırlarına) art arda daha iyi yaklaşımlar üreten bir kök bulma algoritmasıdır.
// Buradaki fikir, gerçek köke makul ölçüde yakın olan bir ilk tahminle başlamak, daha sonra kalkülüs kullanarak teğet doğrusuna göre
// fonksiyonu yakınsamak ve son olarak da bu teğet doğrunun x ekseniyle kesişimini temel cebir ile hesaplamaktır.

// Klavyeden girilen uygun başlangıç iterasyon değerine göre belirtilen hassasiyette x³-6x²-4x+24=0 denkleminin kökünü
// "Newton Raphson Yöntemi"yle hesaplayan program. Regula-false yönteminde köke,kirişlerle yaklaşılırken ; birçok türü mevcut olan
// Newton yöntemlerinde köke, teğetler ile yaklaşılmaktadır. Yani y=f(x) eğrisinin x eksenini kestiği noktayı (gerçek kökü ) bulmak için
// eğri üzerindeki  noktalardan çizilen teğetlerin x-eksenini kestiği noktalar hesaplandığından ; bu yöntemlere "teğetler yöntemi" denir.
// Özetle ,Newton-Raphson yönteminde f(x)=0 denkleminin [a,b] aralığındaki kökü xk+1 = xk-(f(xk))/(f'(xk)) iterasyon eşitliğiyle
// hesaplanmaktadır

import java.util.Scanner;

public class Main {
    public static double f(double x){
        return x*x*x-6*x*x-4*x+24;
    }
    public static double f1(double x){
        return 3*x*x-12*x-4;
    }
    public static void main(String[] args) {

        double x0,x1,h;
        Scanner scanner = new Scanner(System.in);
        System.out.print("İterasyon Başlangıç Değeri : ");
        x0 = scanner.nextDouble();
        System.out.print("Hassasiyet Değeri : ");
        h = scanner.nextDouble();

        do {
            x1=x0-f(x0)/f1(x0);
            x0=x1;
        }while (Math.abs(f(x1))>h);
        System.out.printf("\nKök : %.10f",x1);
    }
}