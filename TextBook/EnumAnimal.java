package TextBook;

enum EnumAnimal {
    MAMMAL(true), INVERTEBRATE(Boolean.FALSE), BIRD(false), REPTILE(false), AMPHIBIAN(false), FISH(false)  {
        public int swim() {
            return 4;
        }
    };

    boolean hasHair;

    EnumAnimal(boolean hasHair) {
        this.hasHair = hasHair;
    }

    public boolean hasHair() {
        return hasHair;
    }

    public int swim() {
        return 0;
    }

    public static void main(String[] args) {
        EnumAnimal[] ea = EnumAnimal.values();
        for (EnumAnimal ea1: ea) {
            System.out.print(ea1.name());
            System.out.print(" "+ea1.hasHair);
            System.out.print(" "+ea1.swim());
            System.out.println();
        }
    }
}
