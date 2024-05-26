package Test;

import Paket05.Permainan;
import PaketInterface.MyInterface;

public class Catur extends Permainan implements MyInterface{

    @Override
    public String getStringInfoState() {
        return "catur adalah permainan";
    }
}
