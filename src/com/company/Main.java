package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        SolarSystem FactorX=new SolarSystem();
        FactorX.Sun="1";
        FactorX.Moon="4";
        FactorX.Planet="2";
        FactorX.Star="10000";

        // adding features to our sun
        FeatureSun Xfact= new FeatureSun();
        Xfact.color="green";
        Xfact.radius="1000000000km";
        Xfact.heat="309324934898kj";

        // adding features fot stars in the solar system
        FeatureStars FactX = new FeatureStars();
        FactX.size = "999999999m";
        FactX.color = "green";
        FactX.radius = "7398754653km";

        // adding features for Planet2
        Planet2Features P2 = new Planet2Features();
        P2.name = "Red Dragon";
        P2.size = "986578342798km";
        P2.color = "Red";
    }
}
