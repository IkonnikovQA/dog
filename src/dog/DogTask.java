package dog;

import java.util.*;


public class DogTask {

    private static Random random = new Random();
    
    public static void main(String[] args) {
        List<Dog> dogs = new ArrayList<>();
        for(int i = 0; i < 30; i++){
            dogs.add(getRandomDog());
        }

        for(int i = 0; i < 365; i++){
            int randomIndex = random.nextInt(dogs.size());
            Dog tempDog = dogs.get(randomIndex);
            tempDog.randomAction();
            
            if (i % 30 == 0){
                dogs.add(getRandomDog());
            }
            
        }

        System.out.println(dogs.size());
        
        Map<String, Integer> animals = new HashMap<>();
        for (Dog dog : dogs) {
            String className = dog.getClass().getSimpleName();
            if (animals.containsKey(className)){
                int countName = animals.get(className);
                animals.put(className, countName + 1);
            } else {
                animals.put(className, 1);
            }
        }
        
        for (String className : animals.KeySet()){
            int count = animals.get(className);
            System.out.println(className + ": " + count);
        }
        
    }

    public static Dog getRandomDog() {
        Dog tempDog = null;
        int randomNumber = random.nextInt(3);
        switch (randomNumber) {
            case 0:
                tempDog = new Kayot();
                break;
            case 1:
                tempDog = new Shakal();
            case 2:
                tempDog = new Wolf();
        }
    return tempDog;
    }
}