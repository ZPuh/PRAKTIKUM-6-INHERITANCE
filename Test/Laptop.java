package Test;

import Paket07.BendaElektronik;
import PaketInterface.MyInterface;

public class Laptop extends BendaElektronik implements MyInterface{

    @Override
    public String getStringInfoState() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}
