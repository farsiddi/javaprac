package AbstractInterface.Section_11.Interface;

public class HeroesDemo {
    public static void main(String[] args) {
        IronmanImpl ironman1 = new IronmanImpl();
        System.out.println(ironman1.usePower());
        System.out.println(ironman1.stopVillain('y'));

        CaptainAmericaImpl captainAmerica1 = new CaptainAmericaImpl();
        System.out.println(captainAmerica1.usePower());
        System.out.println(captainAmerica1.stopVillain('y'));
//        So insstead of using reference IronmanImple or CaptainAmericaImpl
//         Use this
        SuperHero spiderMan1 = new SpidermanImpl();
        System.out.println(spiderMan1.usePower());
        System.out.println(spiderMan1.stopVillain('n'));

//        Or below make a method so that we dont have to write the code again and again
        invokeSuperHeroMethods(captainAmerica1);
    }

    //    This is also a polymorphism since a common method is acting differently for different objects
    private static void invokeSuperHeroMethods(SuperHero superHero) {
        System.out.println(superHero.usePower());
        System.out.println(superHero.stopVillain('Y'));
    }
}
