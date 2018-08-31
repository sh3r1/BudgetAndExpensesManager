
package sherwin.pitao.budgetandexpensemanager.model;


import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;
import org.greenrobot.greendao.annotation.Generated;

@Entity(nameInDb = "budgetFor")
public class BudgetFor {

    @Id(autoincrement = true)
    private Long id;

    @Property(nameInDb = "name")
    private String name;

    @Generated(hash = 1320071469)
    public BudgetFor(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    @Generated(hash = 718055397)
    public BudgetFor() {
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

}