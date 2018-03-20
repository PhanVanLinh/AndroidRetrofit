package toong.vn.androidretrofit.data.source.remote.api;

import io.reactivex.Observable;
import retrofit2.http.GET;
import toong.vn.androidretrofit.data.model.Person;

public interface SampleAPI {
    @GET("person/sample-single-person-get.php")
    Observable<Person> getSinglePerson();
}