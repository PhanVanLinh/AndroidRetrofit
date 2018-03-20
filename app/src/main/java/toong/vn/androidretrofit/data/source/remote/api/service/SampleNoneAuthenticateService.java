package toong.vn.androidretrofit.data.source.remote.api.service;

import java.util.ArrayList;
import okhttp3.Interceptor;
import toong.vn.androidretrofit.data.source.remote.api.APIGenerator;
import toong.vn.androidretrofit.data.source.remote.api.SampleNoneAuthenticateAPI;
import toong.vn.androidretrofit.data.source.remote.api.middleware.SampleNoneAuthenticateInterceptor;

/**
 * Created by PhanVanLinh on 11/04/2018.
 * phanvanlinh.94vn@gmail.com
 */

public class SampleNoneAuthenticateService {
    private static final String BASE_URL = "http://samplerestfulwebservice.000webhostapp.com/";
    private volatile static SampleNoneAuthenticateAPI service = null;

    public static SampleNoneAuthenticateAPI getAPI() {
        if (service == null) {
            service = APIGenerator.generate(BASE_URL, SampleNoneAuthenticateAPI.class,
                    new ArrayList<Interceptor>(){{add(new SampleNoneAuthenticateInterceptor());}});
        }
        return service;
    }
}
