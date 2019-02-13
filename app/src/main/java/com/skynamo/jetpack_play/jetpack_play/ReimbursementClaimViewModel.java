package com.skynamo.jetpack_play.jetpack_play;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ReimbursementClaimViewModel extends ViewModel {

    private MutableLiveData<Double> odoBefore;
    private MutableLiveData<Double> odoAfter;

    public MutableLiveData<Double> getOdoBefore() {
        if (odoBefore == null) {
            loadOdoBefore();
        }
        return odoBefore;
    }

    public MutableLiveData<Double> getOdoAfter() {
        if (odoAfter == null) {
            loadOdoAfter();
        }
        return odoAfter;
    }

    private void loadOdoAfter() {
        odoAfter = new MutableLiveData<>();
    }

    private void loadOdoBefore() {
        odoBefore = new MutableLiveData<>();
    }
}
