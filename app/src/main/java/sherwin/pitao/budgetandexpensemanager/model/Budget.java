package sherwin.pitao.budgetandexpensemanager.model;


import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;
import org.greenrobot.greendao.annotation.Generated;

@Entity(nameInDb = "budget")
public class Budget {

@Id(autoincrement = true)
private Long id;

@Property(nameInDb = "amount")
private String amount;

@Property(nameInDb = "budgetForId")
private Long budgetForId;

@Property(nameInDb = "userId")
private Long userId;

@Generated(hash = 1774228582)
public Budget(Long id, String amount, Long budgetForId, Long userId) {
	this.id = id;
	this.amount = amount;
	this.budgetForId = budgetForId;
	this.userId = userId;
}

@Generated(hash = 1734026453)
public Budget() {
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

public Long getBudgetForId() {
	return this.budgetForId;
}

public void setBudgetForId(Long budgetForId) {
	this.budgetForId = budgetForId;
}

public Long getUserId() {
	return this.userId;
}

public void setUserId(Long userId) {
	this.userId = userId;
}

}