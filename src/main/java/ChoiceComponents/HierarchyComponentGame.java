package ChoiceComponents;

import java.util.ArrayList;
import java.util.List;

public class HierarchyComponentGame {
    protected String[] hierarchyCpu() {
        String[] hierarchy = new String[] { "'10100f'", "'12100f'", "'10400f'", "'12400f'", "'10700f'", "'10700kf'", "'12700f'",
        "'12700kf'", "'10900f'", "'12900kf'"};
        return hierarchy;
    }
    protected String[] hierarchyGpu() {
        String[] hierarchy = new String[] { "'GTX1650'", "'GTX1660S'", "'GTX1660TI'", "'RTX3050'", "'RTX2060'", "'RTX3060'",
                "'RTX3060TI'", "'RTX3070'", "'RTX3080'", "'RTX3080TI'", "'RTX3090'"};
        return hierarchy;
    }
    protected String[] hierarchyMotherBoard() {
        String[] hierarchy = new String[] { "'h410'", "'h610'", "'b560'", "'h610'", "'b560'", "'z590'", "'h610'",
                "'z690'", "'b560'", "'z690'"};
        return hierarchy;
    }
    protected int[] hierarchyHdd() {
        int[] hierarchy = new int[] { 1000, 1000, 2000 };
        return hierarchy;
    }
    protected int[] hierarchySsd() {
        int[] hierarchy = new int[] { 240, 500, 1000 };
        return hierarchy;
    }
    protected int[] hierarchyRam() {
        int[] hierarchy = new int[] { 8, 16, 32 };
        return hierarchy;
    }
    protected int[] hierarchyBlockPower() {
        int[] hierarchy = new int[] { 500, 500, 500, 700, 700, 700, 700, 850, 850, 850, 850 };
        return hierarchy;
    }
    protected int[] hierarchyCase() {
        int[] hierarchy = new int[] { 1, 2 };
        return hierarchy;
    }
    protected String[] hierarchyCooling() {
        String[] hierarchy = new String[] { "'150'", "'150'","'150'","'150'","'200'","'380'","'200'","'380'","'380'",
                "'380'"};
        return hierarchy;
    }
}
