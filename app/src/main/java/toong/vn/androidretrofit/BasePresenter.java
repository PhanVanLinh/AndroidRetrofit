package toong.vn.androidretrofit;

import android.support.annotation.CallSuper;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;

/**
 * Created by PhanVanLinh on 11/04/2018.
 * phanvanlinh.94vn@gmail.com
 */

public class BasePresenter {
    CompositeDisposable compositeDisposable;

    protected BasePresenter(CompositeDisposable compositeDisposable) {
        this.compositeDisposable = compositeDisposable;
    }

    protected void start() {

    }

    @CallSuper
    protected void stop() {
        stopSubscriptions();
    }

    protected void startSubscriber(Disposable disposable) {
        compositeDisposable.add(disposable);
    }

    private void stopSubscriptions() {
        compositeDisposable.clear();
    }
}
