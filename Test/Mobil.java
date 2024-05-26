package Test;

import Paket02.Kendaraan;
import PaketInterface.MyInterface;

public class Mobil extends Kendaraan implements MyInterface{

    @Override
    public String getStringInfoState() {
        return "Mobil Adalah kendaraan"; 
    }
    
}
