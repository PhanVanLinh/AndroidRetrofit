package toong.vn.androidretrofit;

import io.reactivex.disposables.CompositeDisposable;
import toong.vn.androidretrofit.data.DataInjection;
import toong.vn.androidretrofit.screen.main.MainContract;
import toong.vn.androidretrofit.screen.main.MainPresenter;

/**
 * Created by PhanVanLinh on 11/04/2018.
 * phanvanlinh.94vn@gmail.com
 */

public class Injection {

    public static MainPresenter provideMainPresenter(MainContract.View view) {
        return new MainPresenter(view, new CompositeDisposable(),
                DataInjection.providePersonRepository());
    }
}
