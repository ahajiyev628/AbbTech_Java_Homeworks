package homework9;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class TestUnit {
    FamilyController fc = new FamilyController();

    @Test
    public void firstTest() {
        fc.createNewFamily(new Human("father","father"),new Human("mother","mother"), null);
        fc.createNewFamily(new Human("father","father"),new Human("mother","mother"), null);
        Assert.assertEquals(3, fc.count());

       // Assert.assertNotEquals(2, fc.getFamiliesBiggerThan(1).size());
    }
}
