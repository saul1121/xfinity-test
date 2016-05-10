package com.xfinity.xfinityapp.interfaces;

import com.xfinity.xfinityapp.models.CharacterResponse;


public interface CharacterRestAPIListener {
    void onSuccess(CharacterResponse data);

    void onFailure(String errorMsg);
}
