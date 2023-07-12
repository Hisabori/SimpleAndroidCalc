//Package Name
package com.jh.simple_calc;


//android resource import

//context
import android.content.Context;

//Test.Inst
import android.support.test.InstrumentationRegistry;

//AndroidJuit_V4
import android.support.test.runner.AndroidJUnit4;


//Test Service
//유닛 테스트 진행
import org.junit.Test;

//Target: com.jh.simple_calc
import org.junit.runner.RunWith;


//Juit Test (juit V4)
import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Test
    public void useAppContext() {
        // com.jh.calc test service
        Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();
        assertEquals("com.jh.simple_calc", appContext.getPackageName());
    }
}