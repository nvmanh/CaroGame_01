package com.example.framgia.carobluetooth.ui.listener;

import android.support.annotation.DrawableRes;

import com.example.framgia.carobluetooth.data.model.GameData;

/**
 * Created by framgia on 18/08/2016.
 */
public interface OnGetBoardInfo {
    void sendGameData(GameData gameData);
    int getConnectionState();
    void setPlayerBackground(@DrawableRes int drawableRes1, @DrawableRes int drawableRes2);
    void onFinishGame();
}
