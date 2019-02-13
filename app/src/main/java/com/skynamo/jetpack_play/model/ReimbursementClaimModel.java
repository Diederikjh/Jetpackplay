package com.skynamo.jetpack_play.model;

public class ReimbursementClaimModel {

    public Double getOdoBefore() {
        return odoBefore;
    }

    public void setOdoBefore(Double odoBefore) {
        this.odoBefore = odoBefore;
    }

    public Double getOdoAfter() {
        return odoAfter;
    }

    public void setOdoAfter(Double odoAfter) {
        this.odoAfter = odoAfter;
    }

    private Double odoBefore;
    private Double odoAfter;

    public Double getDistance() {
        if (odoBefore != null && odoAfter != null) {
            return odoAfter - odoBefore;
        }
        return null;
    }
}
