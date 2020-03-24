package attractions;

import behaviours.ISecurity;
import behaviours.ITicketed;
import people.Visitor;




public class RollerCoaster  extends Attraction implements ISecurity, ITicketed {
    double cost;

    public RollerCoaster(String name, int rating,double cost) {
        super(name, rating);
        this.cost=cost;
    }

    public boolean isAllowed(Visitor visitor){
        if(visitor.getAge()>= 12 && visitor.getHeight() >145.00){
            return true;
        }else{
            return false;
        }
    }

    public double defaultPrice(){
        return this.cost;
    }

    public double priceFor(Visitor visitor){
        if (visitor.getHeight()>200){
            return cost*2;
        }else{
            return cost;
        }

    }
}
