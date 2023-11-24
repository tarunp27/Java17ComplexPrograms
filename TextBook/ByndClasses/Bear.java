package TextBook.ByndClasses;


public class Bear {
    enum FOOD {
        BERRIES {
            @Override
            public boolean isHealthy() {
                return false;
            }
        }, INSECTS {
            public boolean isHealthy() { return true; }},
        FISH {
            @Override
            public boolean isHealthy() {
                return false;
            }
        }, ROOTS {
            @Override
            public boolean isHealthy() {
                return false;
            }
        }, COOKIES {
            @Override
            public boolean isHealthy() {
                return false;
            }
        }, HONEY {
            @Override
            public boolean isHealthy() {
                return true;
            }
        };
        public abstract boolean isHealthy();
    }
    public static void main(String[] args) {
        System.out.println(FOOD.INSECTS);
        System.out.println(FOOD.INSECTS.ordinal());
        System.out.println(FOOD.INSECTS.isHealthy());
        System.out.println(FOOD.COOKIES.isHealthy());
    }
}