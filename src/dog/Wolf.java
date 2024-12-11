package dog;

import java.util.Random;

public class Wolf extends Dog{

    @Override
    void search(){
        System.out.println("Волк ищет ночью");
    }

    public void randoAction(){

        Random random =new Random();
        int randoNumber = random.nextInt(3);
        switch (randoNumber){
            case 0:
                search();
                break;
            case 1:
                eat();
                break;
            case 2:
                multiply();
                break;
        }
    }

    public void eat(){
        System.out.println("Волк кушает");

    }

    public void multiply(){
        System.out.println("Волк нашел волчицу");

    }
}
