public class Hero {
    private int HeroHelth;
    private int HeroHit;
    private String Super;

    public Hero(int heroHelth, int heroHit, String aSuper) {
        HeroHelth = heroHelth;
        HeroHit = heroHit;
        Super = aSuper;
    }

    public Hero(int heroHelth, int heroHit) {
        HeroHelth = heroHelth;
        HeroHit = heroHit;
    }

    public int getHeroHelth() {
        return HeroHelth;
    }

    public int getHeroHit() {
        return HeroHit;
    }

    public String getSuper() {
        return Super;
    }
}
