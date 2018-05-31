package toong.vn.androidretrofit.data;

import toong.vn.androidretrofit.data.source.PersonRepository;
import toong.vn.androidretrofit.data.source.local.PersonLocalDataSource;
import toong.vn.androidretrofit.data.source.remote.PersonRemoteDataSource;
import toong.vn.androidretrofit.data.source.remote.api.SampleAuthenticateAPI;
import toong.vn.androidretrofit.data.source.remote.api.SampleNoneAuthenticateAPI;
import toong.vn.androidretrofit.data.source.remote.api.service.SampleNoneAuthenticateService;
import toong.vn.androidretrofit.data.source.remote.api.service.SampleAuthenticateService;

/**
 * Created by PhanVanLinh on 11/04/2018.
 * phanvanlinh.94vn@gmail.com
 */

public class DataInjection {
    public static SampleAuthenticateAPI provideSampleAuthAPI() {
        return SampleAuthenticateService.getAPI();
    }

    public static SampleNoneAuthenticateAPI provideNoneSampleNoneAuthenticateAPI() {
        return SampleNoneAuthenticateService.getAPI();
    }

    public static PersonRepository providePersonRepository() {
        return PersonRepository.getInstance(PersonLocalDataSource.getInstance(),
                PersonRemoteDataSource.getInstance(provideSampleAuthAPI(),
                        provideNoneSampleNoneAuthenticateAPI()));
    }
}
