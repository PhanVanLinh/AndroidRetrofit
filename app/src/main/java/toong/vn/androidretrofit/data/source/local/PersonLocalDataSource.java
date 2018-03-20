package toong.vn.androidretrofit.data.source.local;

/**
 * Created by PhanVanLinh on 11/04/2018.
 * phanvanlinh.94vn@gmail.com
 */

public class PersonLocalDataSource {
    private static volatile PersonLocalDataSource instance;

    public static PersonLocalDataSource getInstance() {
        if (instance == null) {
            instance = new PersonLocalDataSource();
        }
        return instance;
    }
}
