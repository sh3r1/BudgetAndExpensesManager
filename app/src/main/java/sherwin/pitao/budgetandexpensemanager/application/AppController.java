package sherwin.pitao.budgetandexpensemanager.application;

import android.app.Application;

import sherwin.pitao.budgetandexpensemanager.Dao.Helper.DbOpenHelper;
import sherwin.pitao.budgetandexpensemanager.model.DaoMaster;
import sherwin.pitao.budgetandexpensemanager.model.DaoSession;

public class AppController extends Application {

    private DaoSession daoSession;

    @Override
    public void onCreate() {
        super.onCreate();

        daoSession = new DaoMaster(new DbOpenHelper(this,"budgetexpensemngr.db").getWritableDb()).newSession();

    }

    public DaoSession getDaoSession() {
        return daoSession;
    }
}
