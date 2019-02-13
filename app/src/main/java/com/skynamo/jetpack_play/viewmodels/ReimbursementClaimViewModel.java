package com.skynamo.jetpack_play.viewmodels;

import androidx.lifecycle.ViewModel;

public class ReimbursementClaimViewModel extends ViewModel {

    /*private MutableLiveData<Double> odoBefore;
    private MutableLiveData<Double> odoAfter;*/

    private Double odoBefore;
    private Double odoAfter;

    public Double getOdoBefore() {
        if (odoBefore == null) {
            odoBefore = 4658.0;
        }
        return odoBefore;
    }

    public Double getOdoAfter() {
        if (odoAfter == null) {
            odoAfter = 7556.1;
        }
        return odoAfter;
    }

//    private void loadOdoAfter() {
//        odoAfter = new MutableLiveData<>();
//    }
//
//    private void loadOdoBefore() {
//        odoBefore = new MutableLiveData<>();
//    }
}
