package Test;

import Paket01.Hewan;
import PaketInterface.MyInterface;

public class Kucing extends Hewan implements MyInterface{

    @Override
    public String getStringInfoState() {
        return "Kucing adalah Hewan";
    }
    
}
