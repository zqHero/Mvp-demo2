package io.jpotts18.android_mvp.domain.presenter.interfas;

import java.util.List;

import io.jpotts18.android_mvp.domain.models.Repo;
import retrofit.RetrofitError;
import retrofit.client.Response;

/**
 * Created by jpotts18 on 5/12/15.
 */
public interface OnRepoTaskFinishedListener {
    void onNetworkSuccess(List<Repo> list, Response response);
    void onNetworkFailure(RetrofitError error);
}
