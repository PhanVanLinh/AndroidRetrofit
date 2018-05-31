package toong.vn.androidretrofit.data.source.remote.api.service;

import java.util.ArrayList;
import okhttp3.Interceptor;
import okhttp3.logging.HttpLoggingInterceptor;
import toong.vn.androidretrofit.data.source.remote.api.APIGenerator;
import toong.vn.androidretrofit.data.source.remote.api.SampleAuthenticateAPI;
import toong.vn.androidretrofit.data.source.remote.api.middleware.SampleAuthenticateInterceptor;

/**
 * Created by PhanVanLinh on 11/04/2018.
 * phanvanlinh.94vn@gmail.com
 */

public class SampleAuthenticateService {
    private static final String BASE_URL = "http://samplerestfulwebservice.000webhostapp.com/";
    private volatile static SampleAuthenticateAPI service = null;

    public static SampleAuthenticateAPI getAPI() {
        if (service == null) {
            final HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
            logging.setLevel(HttpLoggingInterceptor.Level.BODY);

            service =
                    APIGenerator.generate(BASE_URL, SampleAuthenticateAPI.class, new ArrayList<Interceptor>() {{
                        add(new SampleAuthenticateInterceptor());
                        add(logging);
                    }});
        }
        return service;
    }
}
public final class Singleton {
    private static volatile Singleton instance = null;

    private Singleton() {}

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized(Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
