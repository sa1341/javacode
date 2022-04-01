package me.whiteship;

import org.junit.Assert;
import org.junit.Test;

public class MoimTest {

    @Test
    public void isFull() {
        Moim moim = new Moim();
        moim.maxNumberOfAttendees = 0;
        moim.numberOfEnrollment = 99;

        Assert.assertFalse(moim.isEnrollmentFull());
    }
}
