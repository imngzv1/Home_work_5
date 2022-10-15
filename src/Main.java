public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setBossHit(100);
        System.out.println(boss.getBossHit());

        boss.setBossHelth(50);
        System.out.println(boss.getBossHelth());

        boss.setTypeOfDeff("Super");
        System.out.println(boss.getTypeOfDeff());
        for (int i = 0; i < createHero().length; i++) {
            System.out.println(" Hero helth наших героев  = " + createHero()[i].getHeroHelth()+ " Урон наших героев= " + createHero()[i].getHeroHit()+" Супер способность героев "+ createHero()[i].getSuper());
        }


    }

    public static Hero[] createHero() {
        Hero hero = new Hero(30, 20, "Zzz");
        Hero hero1 = new Hero(10, 10, "Sss");
        Hero hero2 = new Hero(10,20,"AAA");

        Hero[] Boews = {hero1, hero, hero2 };
        return Boews;
    }
}