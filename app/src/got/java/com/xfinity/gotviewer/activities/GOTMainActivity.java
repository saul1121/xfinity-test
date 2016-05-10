package com.xfinity.gotviewer.activities;

import com.xfinity.xfinityapp.activities.MainActivity;
import com.xfinity.xfinityapp.network.CharacterRestAPI;


public class GOTMainActivity extends MainActivity {

    @Override
    protected void fetchData() {
        new CharacterRestAPI(this).getListOfGOTCharacters();
    }
}