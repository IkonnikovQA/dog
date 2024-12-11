package dog;

import java.util.Random;

public class Shakal extends Dog {

    @Override
    void search() {
        System.out.println("Шакал ищет днем");
    }

    public void randoAction() {

        Random random = new Random();
        int randoNumber = random.nextInt(3);
        switch (randoNumber) {
            case 0:
                search();
                break;
            case 1:
                hunt();
                break;
            case 2:
                gavkay();
                break;
        }
    }

    public void hunt(){
            System.out.println("Шакал охотится");
        }

    public void gavkay(){
            System.out.println("Шакал гавкает");
        }
    }


