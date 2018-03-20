package toong.vn.androidretrofit.data.source.remote.api.service;

import java.util.ArrayList;
import okhttp3.Interceptor;
import okhttp3.logging.HttpLoggingInterceptor;
import toong.vn.androidretrofit.data.source.remote.api.APIGenerator;
import toong.vn.androidretrofit.data.source.remote.api.SampleAPI;
import toong.vn.androidretrofit.data.source.remote.api.middleware.SampleAuthenticateInterceptor;

/**
 * Created by PhanVanLinh on 11/04/2018.
 * phanvanlinh.94vn@gmail.com
 */

public class SampleService {
    private static final String BASE_URL = "http://samplerestfulwebservice.000webhostapp.com/";
    private volatile static SampleAPI service = null;

    public static SampleAPI getAPI() {
        if (service == null) {
            final HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
            logging.setLevel(HttpLoggingInterceptor.Level.BODY);

            service =
                    APIGenerator.generate(BASE_URL, SampleAPI.class, new ArrayList<Interceptor>() {{
                        add(new SampleAuthenticateInterceptor());
                        add(logging);
                    }});
        }
        return service;
    }
}
