package br.ceproirr.guidecity.utils;

import br.ceproirr.guidecity.dto.request.PhoneDTO;
import br.ceproirr.guidecity.entity.Phone;
import br.ceproirr.guidecity.enums.PhoneType;

public class PhoneUtils {

    private static final String PHONE_NUMBER = "9599188-7799";
    private static final PhoneType PHONE_TYPE = PhoneType.MOBILE;
    private static final long PHONE_ID = 1L;

    public static PhoneDTO createFakeDTO() {
        return PhoneDTO.builder()
                .number(PHONE_NUMBER)
                .type(PHONE_TYPE)
                .build();
    }

    public static Phone createFakeEntity() {
        return Phone.builder()
                .id(PHONE_ID)
                .number(PHONE_NUMBER)
                .type(PHONE_TYPE)
                .build();
    }
}
