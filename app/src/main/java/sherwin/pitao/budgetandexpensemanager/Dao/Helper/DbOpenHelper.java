package sherwin.pitao.budgetandexpensemanager.Dao.Helper;

import android.content.Context;

import org.greenrobot.greendao.database.Database;

import sherwin.pitao.budgetandexpensemanager.model.DaoMaster;

public class DbOpenHelper extends DaoMaster.OpenHelper {

    public DbOpenHelper(Context context,String name){
        super(context,name);
    }

    @Override
    public void onUpgrade(Database db, int oldVersion, int newVersion) {
        super.onUpgrade(db, oldVersion, newVersion);
        switch (oldVersion) {
            case 1:
            case 2:
        }
    }
}
