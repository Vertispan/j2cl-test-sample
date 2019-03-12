package com.vertispan.j2cl.sample;

import com.google.j2cl.junit.apt.J2clTestInput;
import elemental2.promise.Promise;
import org.junit.Assert;
import org.junit.Test;

@J2clTestInput(TestSample.class)
public class TestSample /*extends GWTTestCase*/ {

    @Test(timeout = 20000)
    public Promise<String> doStuff() {
        Assert.assertTrue(true);//yay.
//        delayTestFinish(1000);

        A.create();

        return Promise.resolve("success").then(ignore -> Promise.resolve("pass"));
    }

    public String getModuleName() {
        return "this.does.nothing";
    }
}
