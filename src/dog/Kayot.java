package dog;

import java.util.Random;

public class Kayot extends Dog{

    @Override
    void search() {
        System.out.println("Кайот ищет утром");
    }
    public void randoAction() {

        Random random = new Random();
        int randoNumber = random.nextInt(3);
        switch (randoNumber) {
            case 0:
                search();
                break;
            case 1:
                sleep();
                break;
            case 2:
                swim();
                break;
        }
    }

    public void sleep(){
        System.out.println("Кайот спит");
    }

    public void swim(){
        System.out.println("Кайот плавает");
    }
}
