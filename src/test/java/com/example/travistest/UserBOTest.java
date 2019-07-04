package com.example.travistest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;


@RunWith(MockitoJUnitRunner.class)
public class UserBOTest {

    private UserBO userBO = new UserBO();

    @Test
    public void isExistUser_true() {
        //given
        String userId = "rlgh";

        //when
        boolean result = userBO.isExistUser(userId);

        //then
        assertTrue(result);
    }

    @Test
    public void isExistUser_false() {
        //given
        String userId = "";

        //when
        boolean result = userBO.isExistUser(userId);

        //then
        assertFalse(result);
    }
}