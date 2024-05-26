package Test;

import Paket03.Makanan;
import PaketInterface.MyInterface;

public class Nasi extends Makanan implements MyInterface{

    @Override
    public String getStringInfoState() {
       return "NAsi adalah Makanan";
    }
}
