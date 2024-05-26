package Test;

import Paket04.Bangunan;
import PaketInterface.MyInterface;

public class Rumah extends Bangunan implements MyInterface{

    @Override
    public String getStringInfoState() {
        return "Rumah adalah Bangunan";
    }
}
