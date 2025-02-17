package com.assignment.question;

import com.assignment.question.external.TravelGuardApi;

public class TravelGuardApiAdapter implements TravelInsuranceAdapter {
    private final TravelGuardApi adaptee = new TravelGuardApi();
    
    // Dependency Injection
    // public TravelGuardApiAdapter(TravelGuardApi travelGuard) {
    //     this.adaptee = travelGuard;
    // }

    @Override
    public void submitClaim(String claimId, Double amount) {
        this.adaptee.submitClaim(claimId, amount);
    }

    @Override
    public String getClaimStatus(String claimId) {
        return this.adaptee.getClaimStatus(claimId);
    }
    
}
