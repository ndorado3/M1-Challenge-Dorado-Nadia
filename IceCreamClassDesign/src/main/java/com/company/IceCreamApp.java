package com.company;

public class IceCreamApp {
    public static void main(String[] args) {

        com.company.factory.IceCream newIceCreamFlavor = new com.company.factory.IceCream(
                "Passion Fruit", 4.96,10, 2, "Milk, Passion Fruit, Salt");

        System.out.println(
                "New Flavor: " + newIceCreamFlavor.getFlavor() + "\n" +
                "Sale Price: " + "$" + newIceCreamFlavor.getSalePrice() + "\n" +
                        "Production Cost: " + "$" + newIceCreamFlavor.getProductionCost() + "\n" +
                        "Production Time: " + newIceCreamFlavor.getProductionTime() + " hours" +"\n" +
                        "Ingredients: " + newIceCreamFlavor.getIngredients()
        );

    }
}
