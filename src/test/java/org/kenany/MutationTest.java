package org.kenany;


import org.junit.Test;
import org.junit.Assert;

public class MutationTest {

    public MutationTest() {
    }

    @Test
    public void greaterThanTen() {
        Mutation mutation = new Mutation();
        Assert.assertTrue(mutation.greaterThanTen(12));
    }

    @Test
    public void greaterThanTenFalse() {
        Mutation mutation = new Mutation();
        Assert.assertFalse(mutation.greaterThanTen(8));
    }
}