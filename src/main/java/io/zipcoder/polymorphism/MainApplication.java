package io.zipcoder.polymorphism;



import java.util.ArrayList;
import java.util.Scanner;

public class MainApplication {
    public static void main(String[] args) {
        System.out.println("Welcome to Talking Pets. \nThere are only three kinds of pets in this world: cat, dog, and bird.\n");
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many pets do you have?");
        int petAmount = scanner.nextInt();
        scanner.nextLine();

        ArrayList<Pet> petList= new ArrayList<Pet>();


        for(int i = 0; i < petAmount; i++) {
            String petNum = String.valueOf(i + 1);
            System.out.println("What kind of pet is pet number " + petNum + "?");
            String petType = scanner.nextLine();
            System.out.println("What is your pets name?");
            String petName = scanner.nextLine();

            petList.add(createPet(petType, petName));
        }

        for (int j = 0; j < petList.size(); j++) {
            System.out.println(petList.get(j).getName() + " says " + petList.get(j).speak());
        }

    }

    public static Pet createPet(String pet, String petName) {
        if(pet.equalsIgnoreCase("cat")) {
            return new Cat(petName);
        } else if (pet.equalsIgnoreCase("dog")) {
            return new Dog(petName);
        } else if (pet.equalsIgnoreCase("bird")) {
           return new Bird(petName);
        }
        return null;
    }

}
