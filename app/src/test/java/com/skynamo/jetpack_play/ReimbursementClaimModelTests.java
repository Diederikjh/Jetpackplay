package com.skynamo.jetpack_play;

import com.skynamo.jetpack_play.model.ReimbursementClaimModel;
import com.skynamo.jetpack_play.viewmodels.ReimbursementClaimViewModel;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class ReimbursementClaimModelTests {

    @Test
    public void modelInitCorrect() {

        ReimbursementClaimViewModel viewModel = new ReimbursementClaimViewModel();
        assertEquals( viewModel.getOdoBefore(), 4658.0, 0.0001);
        assertEquals( viewModel.getOdoAfter(), 7556.1, 0.0001);

        assertEquals( viewModel.getDistance(), 7556.1 - 4658.0, 0.0001);

        ReimbursementClaimViewModel viewModel2 = new ReimbursementClaimViewModel();
        assertEquals( viewModel2.getOdoAfter(), 7556.1, 0.0001);
        assertEquals( viewModel2.getOdoBefore(), 4658.0, 0.0001);

        assertEquals( viewModel2.getDistance(), 7556.1 - 4658.0, 0.0001);


        ReimbursementClaimViewModel viewModel3 = new ReimbursementClaimViewModel();
        assertEquals( viewModel3.getDistance(), 7556.1 - 4658.0, 0.0001);

    }

    @Test
    public void distanceCalculationCorrect() {

        ReimbursementClaimModel model = new ReimbursementClaimModel();
        model.setOdoAfter(111.1);
        model.setOdoBefore(98.4);

        assertEquals( model.getOdoBefore(), 98.4, 0.0001);
        assertEquals( model.getOdoAfter(), 111.1, 0.0001);
        assertEquals( model.getDistance(), 111.1 - 98.4, 0.0001);

    }

    @Test
    public void distanceCalculationCorrectNullCases() {

        ReimbursementClaimModel model = new ReimbursementClaimModel();
        model.setOdoAfter(null);
        model.setOdoBefore(98.4);

        assertEquals( 98.4, model.getOdoBefore(), 0.0001);
        assertNull(model.getOdoAfter());
        assertNull( model.getDistance());

        model.setOdoAfter(111.1);
        model.setOdoBefore(null);

        assertEquals( 111.1, model.getOdoAfter(), 0.0001);
        assertNull(model.getOdoBefore());
        assertNull( model.getDistance());

        model.setOdoAfter(null);
        model.setOdoBefore(null);

        assertNull(model.getOdoAfter());
        assertNull(model.getOdoBefore());
        assertNull( model.getDistance());

    }

    @Test
    public void distanceCalculationNegativeCases() {

        ReimbursementClaimModel model = new ReimbursementClaimModel();

        model.setOdoAfter(98.4);
        model.setOdoBefore(111.1);

        assertEquals( model.getOdoBefore(), 111.1, 0.0001);
        assertEquals( model.getOdoAfter(),98.4 , 0.0001);
        assertEquals( model.getDistance(), 98.4 - 111.1, 0.0001);
    }


}
