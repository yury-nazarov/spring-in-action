package com.optimagrowth.license.service;

import java.util.Random;
import org.springframework.stereotype.Service;
import com.optimagrowth.license.model.License;

@Service
public class LicenseService {
    public License getLicense(String licenseId, String organizationId){
        License license = new License();

        license.setId(new Random().nextInt(1000));
        license.setLicenseId(licenseId);
        license.setOrganizationId(organizationId);
        license.setDescription("Software product");
        license.setProductName("Ostock");
        license.setLicenseType("full");

        return license;
    }

    public String createLicense(License license, String organizationId){
        String responseMessage = null;
        System.out.println("service demo");
        if (license != null) {
            license.setOrganizationId(organizationId);
            responseMessage = String.format(
                    "This is the post and the object is: %s",
                    license.toString()
            );
        }
        return responseMessage;
    }

    public String updateLicense(License license, String organizationId){
        String responseMessage = null;

        if (license != null) {
            license.setOrganizationId(organizationId);
            responseMessage = String.format(
                    "This is the put and the object is: %s",
                    license.toString()
            );
        }

        return responseMessage;
    }

    public String deleteLicense(String licenseId, String organizationId){
        String responseMeggage = null;

        responseMeggage = String.format(
                "Deleting license with id %s for the organization %s",
                licenseId, organizationId
        );
        return responseMeggage;
    }
}
