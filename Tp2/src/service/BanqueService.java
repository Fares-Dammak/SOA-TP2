package service;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class BanqueService {
	 List<Compt> comptes = new ArrayList<Compt>();
	    public double conversion(double montant) {
	        return 3.3*montant;
	    }
	    public Compt getCompt(int code) {
	        return new Compt(code, 0, new Date());
	    }
	    public List<Compt> getComptes(){
	        Compt c1 = getCompt(0);
	        Compt c2 = getCompt(1);
	        comptes.add(c1);
	        comptes.add(c2);
	        return comptes;
	    }
}
