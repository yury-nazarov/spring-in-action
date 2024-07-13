package com.optimagrowth.license.service;

import java.util.Locale;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;
import com.optimagrowth.license.model.License;


@Service
public class LicenseService {
    @Autowired
    MessageSource messages;

    public License getLicense(String licenseId,
                              String organizationId
    ){
        License license = new License();

        license.setId(new Random().nextInt(1000));
        license.setLicenseId(licenseId);
        license.setOrganizationId(organizationId);
        license.setDescription("Software product");
        license.setProductName("Ostock");
        license.setLicenseType("full");

        return license;
    }

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

    public String updateLicense(License license, String organizationId, Locale locale){
        String responseMessage = null;

        if (license != null) {
            license.setOrganizationId(organizationId);
            responseMessage = String.format(
                    messages.getMessage("license.update.message", null, locale),
                    license.toString());
        }

        return responseMessage;
    }

    public String deleteLicense(String licenseId,
                                String organizationId,
                                Locale locale
    ){
        String responseMessage = null;

        responseMessage = String.format(
                messages.getMessage("license.delete.message", null, locale),
                licenseId, organizationId
        );
        return responseMessage;
    }
}
