package florent37.github.com.rxsharedpreferences;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.github.florent37.rxsharedpreferences.RxBus;

import butterknife.ButterKnife;
import butterknife.OnClick;
import florent37.github.com.rxsharedpreferences.bus.RxBusUser;
import florent37.github.com.rxsharedpreferences.model.RxModel;
import florent37.github.com.rxsharedpreferences.model.User;

/**
 * Created by florentchampigny on 09/05/2017.
 */

public class MainFragment extends Fragment {

    private User user;
    private RxModel model;

    public static MainFragment newInstance() {
        
        Bundle args = new Bundle();
        
        MainFragment fragment = new MainFragment();
        fragment.setArguments(args);
        return fragment;
    }
    
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ButterKnife.bind(this, view);

        user = new User();
        user.setAge(10);
        user.setPseudo("YO YO");

        model = new RxModel("hello", user);
    }

    @OnClick(R.id.textEvent)
    public void onTextClicked(){
       // RxBusUser.getInstance().post("myMessage");
        //RxBus.getDefault().post("myMessage");
        RxBus.getDefault().post(new RxModel("Rx",new User("yoyo",10)));
      // RxBusUser.getInstance().userChanged(user);
    }

    @OnClick(R.id.userEvent)
    public void onUserClicked(){
        //RxBusUser.getInstance().userChanged(user);
    }
}
