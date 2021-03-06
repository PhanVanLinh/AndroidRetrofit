package toong.vn.androidretrofit.data.source.remote;

import io.reactivex.Observable;
import toong.vn.androidretrofit.data.model.Person;
import toong.vn.androidretrofit.data.source.BaseRemoteDataSource;
import toong.vn.androidretrofit.data.source.remote.api.SampleAuthenticateAPI;
import toong.vn.androidretrofit.data.source.remote.api.SampleNoneAuthenticateAPI;

/**
 * Created by PhanVanLinh on 11/04/2018.
 * phanvanlinh.94vn@gmail.com
 */

public class PersonRemoteDataSource extends BaseRemoteDataSource {
    private static volatile PersonRemoteDataSource instance;

    private PersonRemoteDataSource(SampleAuthenticateAPI sampleAuthenticateAPI,
            SampleNoneAuthenticateAPI sampleNoneAuthenticateAPI) {
        super(sampleAuthenticateAPI, sampleNoneAuthenticateAPI);
    }

    public static PersonRemoteDataSource getInstance(SampleAuthenticateAPI sampleAuthenticateAPI,
            SampleNoneAuthenticateAPI sampleNoneAuthenticateAPI) {
        if (instance == null) {
            instance = new PersonRemoteDataSource(sampleAuthenticateAPI, sampleNoneAuthenticateAPI);
        }
        return instance;
    }

    public Observable<Person> getPerson() {
        return sampleAPI.getSinglePerson();
    }
}
