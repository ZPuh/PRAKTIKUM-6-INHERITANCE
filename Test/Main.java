package Test;

import Paket06.AlatMusik;
import Paket07.BendaElektronik;
import Paket08.Pakaian;
import Paket09.Tanaman;
import Paket10.PerlengkapanOlahraga;

public class Main {

    public static void main(String[] args) {
        // Class 1
        Kucing object1 = new Kucing();
        System.out.println(object1.getStringInfoState());

        // Class 2
        Mobil object2 = new Mobil();
        System.out.println(object2.getStringInfoState());

        // class 3
        Nasi object3 = new Nasi();
        System.out.println(object3.getStringInfoState());

        // class 4
        Rumah object4 = new Rumah();
        System.out.println(object4.getStringInfoState());

        // class 5
        Catur object5 = new Catur();
        System.out.println(object5.getStringInfoState());

        // class 6
        // Super Class
        AlatMusik object6 = new AlatMusik();
        object6.Info();
        // Sub Class
        Gitar object7 = new Gitar();
        System.out.println(object7.getStringInfoState());

        // class 7
        BendaElektronik object8 = new BendaElektronik();
        Laptop object9 = new Laptop();
        System.out.println(object9.getStringInfoState());
        
        // class 8
        Pakaian object10 = new Pakaian();
        Baju object11 = new Baju();
        System.out.println(object11.getStringInfoState());
        
        // class 9
        Tanaman object12 = new Tanaman();
        Pohon object13 = new Pohon();
        System.out.println(object13.getStringInfoState());
        
        // class 10
        PerlengkapanOlahraga object14 = new PerlengkapanOlahraga();
        Bola object15 = new Bola();
        System.out.println(object15.getStringInfoState());

    }
}
