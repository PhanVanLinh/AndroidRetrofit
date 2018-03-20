package toong.vn.androidretrofit.screen.main;

import android.util.Log;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import toong.vn.androidretrofit.BasePresenter;
import toong.vn.androidretrofit.ObserverUtil;
import toong.vn.androidretrofit.data.model.Person;
import toong.vn.androidretrofit.data.source.PersonRepository;

/**
 * Created by PhanVanLinh on 11/04/2018.
 * phanvanlinh.94vn@gmail.com
 */

public class MainPresenter extends BasePresenter implements MainContract.Presenter {
    private String TAG = getClass().getSimpleName();
    private PersonRepository personRepository;
    private MainContract.View view;

    public MainPresenter(MainContract.View view, CompositeDisposable compositeDisposable,
            PersonRepository personRepository) {
        super(compositeDisposable);
        this.view = view;
        this.personRepository = personRepository;
        this.view = view;

    }

    @Override
    protected void start() {
        super.start();
    }

    @Override
    protected void stop() {
        super.stop();
    }

    @Override
    public void getPerson() {
        personRepository.getPerson();
        startSubscriber(personRepository.getPerson().doOnSubscribe(new Consumer<Disposable>() {
            @Override
            public void accept(Disposable disposable) throws Exception {
                Log.i(TAG, Thread.currentThread().getName() + " doOnSubscribe");
            }
        }).compose(ObserverUtil.<Person>applyAsyncSchedulers()).subscribe(new Consumer<Person>() {
            @Override
            public void accept(Person person) throws Exception {
                Log.i(TAG, Thread.currentThread().getName() + " accept " + person.getAbout());
                view.onGetPersonSuccess(person);
            }
        }, new Consumer<Throwable>() {
            @Override
            public void accept(Throwable throwable) throws Exception {
                throwable.printStackTrace();
            }
        }));
    }
}
