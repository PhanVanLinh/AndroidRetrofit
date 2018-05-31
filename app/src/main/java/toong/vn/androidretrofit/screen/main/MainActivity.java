package toong.vn.androidretrofit.screen.main;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import toong.vn.androidretrofit.Injection;
import toong.vn.androidretrofit.R;
import toong.vn.androidretrofit.data.model.Person;

public class MainActivity extends AppCompatActivity implements MainContract.View {

    private MainContract.Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        presenter = Injection.provideMainPresenter(this);

        findViewById(R.id.button_get_person).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.getPerson();
            }
        });
    }

    @Override
    public void onGetPersonSuccess(Person person) {
        Intent intent = null;
        Person person =null;
        intent.putExtra("s", person);

        Bundle bundle = null;
        bundle.putParcelable();
    }
}
