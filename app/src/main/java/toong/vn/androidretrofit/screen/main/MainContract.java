package toong.vn.androidretrofit.screen.main;

import toong.vn.androidretrofit.data.model.Person;

/**
 * Created by PhanVanLinh on 11/04/2018.
 * phanvanlinh.94vn@gmail.com
 */

public interface MainContract {

    interface Presenter {

        void getPerson();
    }

    interface View {

        void onGetPersonSuccess(Person person);
    }
}
