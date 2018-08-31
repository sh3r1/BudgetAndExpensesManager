
package sherwin.pitao.budgetandexpensemanager.model;


import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;
import org.greenrobot.greendao.annotation.Generated;

@Entity(nameInDb = "category")
public class Category {

    @Id(autoincrement = true)
    private Long id;

    @Property(nameInDb = "value")
    private String value;

    @Generated(hash = 1425018706)
    public Category(Long id, String value) {
        this.id = id;
        this.value = value;
    }

    @Generated(hash = 1150634039)
    public Category() {
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}