package com.assignment.question;

import com.assignment.question.external.AutoProtectApi;

public class AutoProtectApiAdapter implements TravelInsuranceAdapter {
    private final AutoProtectApi adaptee = new AutoProtectApi();

    // Dependency Injection
    // public AutoProtectApiAdapter(AutoProtectApi autoProtect) {
    //     this.adaptee = autoProtect;
    // }

    @Override
    public void submitClaim(String claimId, Double amount) {
        this.adaptee.addClaim(amount);
    }

    @Override
    public String getClaimStatus(String claimId) {
        return this.adaptee.getStatus(claimId).toString();
    }
    
}
