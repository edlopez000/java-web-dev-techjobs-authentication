package org.launchcode.javawebdevtechjobsauthentication.models.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class RegistrationFormDTO extends LoginFormDTO{

    private String verifyPassword;

    public String getVerifyPassword() {
        return verifyPassword;
    }

    public void setVerifyPassword(String verifyPassword) {
        this.verifyPassword = verifyPassword;
    }

}
