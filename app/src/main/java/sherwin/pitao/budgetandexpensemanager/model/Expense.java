package sherwin.pitao.budgetandexpensemanager.model;


import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;
import org.greenrobot.greendao.annotation.Generated;

@Entity(nameInDb = "expense")
public class Expense {

    @Id(autoincrement = true)
    private Long id;

    @Property(nameInDb = "amount")
    private String amount;

    @Property(nameInDb = "budgetId")
    private Long budgetId;

    @Property(nameInDb = "categoryId")
    private Long categoryId;

    @Generated(hash = 1982520165)
    public Expense(Long id, String amount, Long budgetId, Long categoryId) {
        this.id = id;
        this.amount = amount;
        this.budgetId = budgetId;
        this.categoryId = categoryId;
    }

    @Generated(hash = 2061519627)
    public Expense() {
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAmount() {
        return this.amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public Long getBudgetId() {
        return this.budgetId;
    }

    public void setBudgetId(Long budgetId) {
        this.budgetId = budgetId;
    }

    public Long getCategoryId() {
        return this.categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

}