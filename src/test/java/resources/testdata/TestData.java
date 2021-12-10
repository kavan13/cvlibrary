package resources.testdata;

import org.testng.annotations.DataProvider;

public class TestData {
    @DataProvider(name = "searchJob")
    public static Object[][] objectTestData() {
        return new Object[][]{
       {"Tester","Harrow","up to 5 miles","30000","500000","Per annum","Permanent","Permanent Tester Jobs in Harrow on the Harrow"},
       {"Tester","Manchester","up to 10 miles","38000","48000","Per annum","Permanent","Permanent Tester jobs in Manchester"},
       {"Tester","London","up to 5 miles","40000","45000","Per annum","Permanent","Permanent Tester jobs in London"},
       {"Tester","Leeds","up to 2 miles","42000","46000","Per annum","Permanent","Permanent Tester jobs in Leeds"},
       {"Tester","Kent","up to 7 miles","43000","47000","Per annum","Permanent","Permanent Tester jobs in Kent"},
       {"Tester","Scotland","up to 5 miles","45000","49000","Per annum","Permanent","Permanent Tester jobs in Scotland"},



        };
    }


}
