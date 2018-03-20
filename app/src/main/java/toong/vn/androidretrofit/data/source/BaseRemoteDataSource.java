package toong.vn.androidretrofit.data.source;

import toong.vn.androidretrofit.data.source.remote.api.SampleAPI;
import toong.vn.androidretrofit.data.source.remote.api.SampleNoneAuthenticateAPI;

/**
 * Created by PhanVanLinh on 11/04/2018.
 * phanvanlinh.94vn@gmail.com
 */

public class BaseRemoteDataSource {
    protected SampleAPI sampleAPI;
    protected SampleNoneAuthenticateAPI sampleNoneAuthenticateAPI;

    public BaseRemoteDataSource(SampleAPI sampleAPI,
            SampleNoneAuthenticateAPI sampleNoneAuthenticateAPI) {
        this.sampleAPI = sampleAPI;
        this.sampleNoneAuthenticateAPI = sampleNoneAuthenticateAPI;
    }
}
