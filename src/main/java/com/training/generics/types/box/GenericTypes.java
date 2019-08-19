package com.training.generics.types.box;

public class GenericTypes {
    public static void main(String[] args) {
        Chocolate poiana = new Chocolate("Poiana", 100);
        Chocolate milka = new Chocolate("Milka", 300);
        MilkChocolate milkaWithMilk = new MilkChocolate("Milka cu lapte", 100, 10);
        Waffle joe = new Waffle("Joe", 50);

        withoutGenerics(poiana, joe);

        withGenerics(milka, joe);

        withGenericsAndConstraints(milka, milkaWithMilk);
    }

    private static void withoutGenerics(final Chocolate poiana, final Waffle joe) {
        // Without generics
        BoxWithoutGenerics boxOfChocolateWithoutGenerics = new BoxWithoutGenerics(poiana);
        Chocolate poianaFromTheBox;
        Object objectFromTheBox = boxOfChocolateWithoutGenerics.getObject();
        if (objectFromTheBox instanceof Chocolate) {
            poianaFromTheBox = (Chocolate) objectFromTheBox;
        }

        boxOfChocolateWithoutGenerics.setObject(joe);
    }

    private static void withGenerics(final Chocolate milka, final Waffle joe) {
        // With generics
        Box<Chocolate> chocolateBox = new Box<>(milka);
        Chocolate milkaFromTheBox = chocolateBox.getObject();
        // The following will never work
        //box.setObject(joe);
        Box<Waffle> waffleBox = new Box<>(joe);
    }

    private static void withGenericsAndConstraints(final Chocolate milka, final MilkChocolate milkaWithMilk) {
        // With generics and constraints
        ChocolateBox<Chocolate> theChocolateBox = new ChocolateBox<>(milka);
        // The following will never work
        //ChocolateBox<Waffle> theWaffleBox = new ChocolateBox<>(joe);
        // But any subclass of Chocolate will work
        ChocolateBox<MilkChocolate> theMilkChocolateBox = new ChocolateBox<>(milkaWithMilk);
    }
}