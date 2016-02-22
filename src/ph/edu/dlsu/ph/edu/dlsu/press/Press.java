package ph.edu.dlsu.ph.edu.dlsu.press;

import ph.edu.dlsu.olives.Olive;

import java.util.Collection;

public interface Press {

    public void getOil(Collection<Olive> olives);
    public int getTotalOil();
    public void setTotalOil(int totalOil);

}
