package com.sharma.utils;

import com.sharma.entity.Person;
import com.sharma.interfaces.PerformCheck;

public class PerformCheckAgeAndSex implements PerformCheck {

    @Override
    public boolean test(Person p) {
        boolean returnVal = false;

        if (p.getGender() == Person.Sex.FEMALE && (p.getAge() > 5 && p.getAge() < 55)) {
            returnVal = true;
        }

        return returnVal;
    }
}
