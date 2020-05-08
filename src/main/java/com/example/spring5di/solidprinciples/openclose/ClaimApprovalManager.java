package com.example.spring5di.solidprinciples.openclose;

/* Created by arankhri on 08-05-2020 */
public class ClaimApprovalManager {
    public void processClaim(InsuranceSurveyor surveyor) {
        if (surveyor.isValidClaim()) {
            System.out.println("ClaimApprovalManager: Valid claim. Currently processing claim for approval....");
        }
    }
}
