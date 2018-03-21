package tests;

import java.io.File;
import java.util.List;
import org.checkerframework.framework.test.FrameworkPerDirectoryTest;
import org.junit.runners.Parameterized.Parameters;
import testlib.supportedquals.SupportedQualsChecker;

public class SupportedQualsTest extends FrameworkPerDirectoryTest {

    public SupportedQualsTest(List<File> testFiles) {
        super(testFiles, SupportedQualsChecker.class, "simple", "-Anomsgtext", "-AprintErrorStack");
    }

    @Parameters
    public static String[] getTestDirs() {
        return new String[] {"simple"};
    }
}
