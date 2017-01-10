package datebase.CrimeDbSchema;

/**
 * @name CriminalIntent
 * @class name：datebase.CrimeDbSchema
 * @class describe
 * @anthor Nsajdr QQ:1025910987
 * @time 2017/1/9 9:55
 * @change
 * @chang time
 * @class describe
 */

public class CrimeDbSchema {
    public static final class CrimeTable {
        public static final String NAME = "crimes";

        public static final class Cols {
            public static final String UUID = "uuid";
            public static final String TITLE = "title";
            public static final String DATE = "date";
            public static final String SOLVED = "solved";
            public static final String SUSPECT = "suspect";
        }
    }
}
