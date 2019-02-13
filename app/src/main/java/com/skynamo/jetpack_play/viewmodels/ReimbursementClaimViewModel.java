package com.skynamo.jetpack_play.viewmodels;

import com.skynamo.jetpack_play.model.ReimbursementClaimModel;

import androidx.lifecycle.ViewModel;

public class ReimbursementClaimViewModel extends ViewModel {

    private ReimbursementClaimModel mModel;

    public Double getOdoBefore() {
        if (mModel == null) {
            loadModel();
        }
        return mModel.getOdoBefore();
    }

    public Double getOdoAfter() {
        if (mModel == null) {
            loadModel();
        }
        return mModel.getOdoAfter();
    }

    public Double getDistance() {
        if (mModel == null) {
            loadModel();
        }

        return mModel.getDistance();
    }

    private void loadModel() {
        mModel = new ReimbursementClaimModel();
        mModel.setOdoBefore(4658.0);
        mModel.setOdoAfter(7556.1);
    }

}
