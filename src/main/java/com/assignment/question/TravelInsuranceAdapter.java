package com.assignment.question;

// Target Interface - expected by the client
public interface TravelInsuranceAdapter {
    public void submitClaim(String claimId, Double amount);
    public String getClaimStatus(String claimId);
}