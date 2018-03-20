package toong.vn.androidretrofit.data.source.remote.api;

import io.reactivex.Observable;
import retrofit2.http.GET;
import toong.vn.androidretrofit.data.model.Person;

public interface SampleNoneAuthenticateAPI {
    @GET("person/sample-single-object-get/")
    Observable<Person> getSinglePerson();
}