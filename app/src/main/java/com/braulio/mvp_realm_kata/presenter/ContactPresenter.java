package com.braulio.mvp_realm_kata.presenter;

import com.braulio.mvp_realm_kata.common.Presenter;
import com.braulio.mvp_realm_kata.view.ContactView;

/**
 * Created by Braulio on 21/11/2016.
 */

public class ContactPresenter implements Presenter {

    private ContactView contactView;

    public ContactPresenter(ContactView contactView){
        this.contactView = contactView;
    }

    @Override public void start() {

    }

    private void setData(){

    }
}
