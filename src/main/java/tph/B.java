package tph;
import javax.persistence.*;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@Entity
@DiscriminatorValue("B")
public class B extends  A {
    public String getValueOne() {
        return valueOne;
    }

    public void setValueOne(String valueOne) {
        this.valueOne = valueOne;
    }

    private  String valueOne;

}
