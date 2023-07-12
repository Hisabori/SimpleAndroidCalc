//Loc: .../java/com/jh/simple_calc/ExampleInstrumetedTest (JUnit_TEST)
//papkage name

//JUnit TEST SVC
package com.jh.simple_calc;


//import 
import android.content.Context;
//Android Test
import android.support.test.InstrumentationRegistry;
//Support SVC
import android.support.test.runner.AndroidJUnit4;


//Juniit Service
import org.junit.Test;
//Runner_Service
import org.junit.runner.RunWith;


//JunitTest
import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 * @run JUnit_Test for Android (use JUnit V4)
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)


//ExampleInstrumented_TEST_SVC
public class ExampleInstrumentedTest {

    ///TEST
    @Test
    public void useAppContext() {
        //계산기 유닛 TEST
        Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();
        //test
        assertEquals("com.jh.simple_calc", appContext.getPackageName());
    }
}