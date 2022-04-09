package metier;

import dao.IDao;

public class MetierImpl implements IMetier {
    private IDao dao;
    @Override
    public double calcule() {
        double res;
        res = dao.getData()/1.5;
        return res;
    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
