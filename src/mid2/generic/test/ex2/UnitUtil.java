package mid2.generic.test.ex2;

import mid2.generic.test.ex2.unit.BioUnit;

public class UnitUtil{
    public static <T extends  BioUnit> T maxHp(T bioUnit1, T bioUnit2) {
        return bioUnit1.getHp() > bioUnit2.getHp() ? bioUnit1 : bioUnit2;
    }
}
