package toong.vn.androidretrofit.data.source;

import io.reactivex.Observable;
import toong.vn.androidretrofit.data.model.Person;
import toong.vn.androidretrofit.data.source.local.PersonLocalDataSource;
import toong.vn.androidretrofit.data.source.remote.PersonRemoteDataSource;

/**
 * Created by PhanVanLinh on 20/03/2018.
 * phanvanlinh.94vn@gmail.com
 */

public class PersonRepository {
    private PersonLocalDataSource localDataSource;
    private PersonRemoteDataSource remoteDataSource;
    private static PersonRepository instance;

    private PersonRepository(PersonLocalDataSource localDataSource,
            PersonRemoteDataSource remoteDataSource) {
        this.localDataSource = localDataSource;
        this.remoteDataSource = remoteDataSource;
    }

    public static PersonRepository getInstance(PersonLocalDataSource localDataSource,
            PersonRemoteDataSource remoteDataSource) {
        if (instance == null) {
            return new PersonRepository(localDataSource, remoteDataSource);
        }
        return instance;
    }

    public Observable<Person> getPerson() {
        return remoteDataSource.getPerson();
    }
}
