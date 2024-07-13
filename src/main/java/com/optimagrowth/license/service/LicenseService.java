package com.optimagrowth.license.service;

import java.util.Locale;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
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

    @Autowired
    MessageSource messages;
    public String createLicense(License license,
                                String organizationId,
                                Locale locale
    ){
        String responseMessage = null;
        System.out.println("service demo");
        if (license != null) {
            license.setOrganizationId(organizationId);
            responseMessage = String.format(
                    messages.getMessage(
                            "license.create.message", null, locale
                    ), license.toString());
        }
        return responseMessage;
    }

    public String updateLicense(License license, String organizationId){
        String responseMessage = null;

        if (license != null) {
            license.setOrganizationId(organizationId);
            responseMessage = String.format(
                    messages.getMessage("license.update.message", null, null),
                    license.toString());
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
