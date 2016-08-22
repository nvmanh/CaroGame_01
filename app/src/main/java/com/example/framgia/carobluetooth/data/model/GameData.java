package com.example.framgia.carobluetooth.data.model;

import com.example.framgia.carobluetooth.data.enums.GameState;
import com.example.framgia.carobluetooth.data.enums.Navigation;
import com.example.framgia.carobluetooth.data.enums.TurnGame;

import java.io.Serializable;

/**
 * Created by framgia on 17/08/2016.
 */
public class GameData implements Serializable {
    private ItemCaro mItemCaro;
    private GameState mGameState;
    private TurnGame mTurnGame;
    private Navigation mNavigation;
    private String mWinLose;

    public GameData() {
    }

    public GameData(ItemCaro itemCaro, GameState gameState, TurnGame turnGame,
                    Navigation navigation, String winLose) {
        mItemCaro = itemCaro;
        mGameState = gameState;
        mTurnGame = turnGame;
        mNavigation = navigation;
        mWinLose = winLose;
    }

    public GameState getGameState() {
        return mGameState;
    }

    public ItemCaro getItemCaro() {
        return mItemCaro;
    }

    public TurnGame getTurnGame() {
        return mTurnGame;
    }

    public String getWinLose() {
        return mWinLose;
    }

    public void setWinLose(String winLose) {
        mWinLose = winLose;
    }

    public void updateGameData(ItemCaro itemCaro, GameState gameState, TurnGame turnGame,
                               Navigation navigation) {
        mItemCaro = itemCaro;
        mGameState = gameState;
        mTurnGame = turnGame;
        mNavigation = navigation;
    }

    public Navigation getNavigation() {
        return mNavigation;
    }

    public void setTurnGame(TurnGame turnGame) {
        mTurnGame = turnGame;
    }
}
