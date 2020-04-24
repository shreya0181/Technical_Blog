package tph;
import javax.persistence.*;
@Entity
@DiscriminatorValue("C")
public class C  extends  A{
    private  String valuetwo;
    public String getValuetwo() {
        return valuetwo;
    }

    public void setValuetwo(String valuetwo) {
        this.valuetwo = valuetwo;
    }



}
