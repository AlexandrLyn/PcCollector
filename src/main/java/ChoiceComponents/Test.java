package ChoiceComponents;


import Reader.ReaderM;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        /*MinPriceComponent minPriceComponent = new MinPriceComponent();
        int i = minPriceComponent.minPrice("partspc.gpugame", "GPU_line", "'GTX1660S'");
        int b = minPriceComponent.minPrice("partspc.gamecooling", "tdp", "'150'");
        System.out.println(i);
        System.out.println(b);
        */
        //Choice choice = new Choice();
        /*HierarchyComponentGame hierarchyComponentGame = new HierarchyComponentGame();
        int i = choice.newMinPrice( 16, hierarchyComponentGame.hierarchyCpu(), "partspc.gamecpu", "generation").getPrice();
        MinPriceComponent minPriceComponent = new MinPriceComponent();
        System.out.println(i);*/
        /*HierarchyComponentGame hierarchy = new HierarchyComponentGame();
        Choice choice = new Choice();
        ComponentChoice choice1 = choice.newMinPriceI(7, hierarchy.hierarchyBlockPower(), "partspc.gameblockpower", "capacity");
        System.out.println(choice1.getModel());*/
        /*Choice choice = new Choice();
        choice.finalParts(120000, "Game PC");*/
        /*FinalAssembly finalAssembly = new FinalAssembly();
        finalAssembly.assembly("partspc.officecpu", "mark", "generation", 6050, "'G6400'", "generation");
        System.out.println();*/
        /*FinalAssembly finalAssembly = new FinalAssembly();
        ComponentChoice componentChoice = new ComponentChoice("'12400f'", 13740);
        ComponentChoice componentChoice1 = finalAssembly.assembly("partspc.gamecpu", componentChoice , "model" );
        System.out.println(componentChoice1.getModel());
        System.out.println(componentChoice1.getPrice());
        System.out.println(componentChoice1.getMark());
        System.out.println(componentChoice1.getModelComponent());*/
        /*FinalAssembly finalAssembly = new FinalAssembly();
        List<ComponentChoice> list = finalAssembly.assemblyFullName(18000, "Office PC");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getMark() + " " + list.get(i).getModel());
        }*/
        /*String total = "Game PC";
        HierarchyComponentPC hierarchy;
        int minBudget;
        if (total.equals("Game PC")) {
            hierarchy = new HierarchyComponentGame();
            minBudget = hierarchy.minBudget();
        } else {
            hierarchy = new HierarchyComponentOffice();
            minBudget = hierarchy.minBudget();
        }
        System.out.println(minBudget);*/
    }
}
