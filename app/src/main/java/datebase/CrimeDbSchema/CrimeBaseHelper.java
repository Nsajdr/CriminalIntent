package datebase.CrimeDbSchema;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import datebase.CrimeDbSchema.CrimeDbSchema.CrimeTable;

/**
 * @name CriminalIntent
 * @class name：datebase.CrimeDbSchema
 * @class describe
 * @anthor Nsajdr QQ:1025910987
 * @time 2017/1/9 10:33
 * @change
 * @chang time
 * @class describe
 */

public class CrimeBaseHelper extends SQLiteOpenHelper {
    private static final int VERSION = 1;
    private static final String DATABASE_NAME = "crimeBase.db";

    public CrimeBaseHelper(Context context) {
        super(context, DATABASE_NAME, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table "+ CrimeTable.NAME+"("+
                    " _id integer primary key autoincrement, "+
                    CrimeTable.Cols.UUID+", "+
                    CrimeTable.Cols.TITLE+", "+
                    CrimeTable.Cols.DATE+", "+
                    CrimeTable.Cols.SOLVED+", "+
                    CrimeTable.Cols.SUSPECT+
                    ")"
        );
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}

