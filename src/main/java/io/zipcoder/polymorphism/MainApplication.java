package io.zipcoder.polymorphism;



import java.util.Scanner;

public class MainApplication {
    public static void main(String[] args) {
        System.out.println("Welcome to Talking Pets. \nThere are only three kinds of pets in this world. cat, dog, and bird.\n");
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many pets do you have?");

        int petAmount = scanner.nextInt();
        String[] pets = new String[petAmount];
        int i = 0;
        String petNum = "";
        Pet[] petHouse = new Pet[petAmount];

        while (i < petAmount) {

        petNum = String.valueOf(i + 1);
        Scanner scan = new Scanner(System.in);
        System.out.println("What kind of pet is pet number " + petNum + "?");
        String petType = scan.nextLine();
        pets[i] = petType;
            if(pets[i].equals("cat")) {
                Cat cat =  new Cat();
                petHouse[i] = cat;
            } else if (pets[i].equals("dog")) {
                Dog dog =  new Dog();
                petHouse[i] = dog;
            } else if (pets[i].equals("bird")) {
                Bird bird =  new Bird();
                petHouse[i] = bird;
            }
            Scanner scanName = new Scanner(System.in);
            System.out.println("What is your pets name?");
            String petName = scanName.nextLine();

            petHouse[i].setName(petName);
            i++;
        }

        for (int j = 0; j < pets.length; j++) {
            System.out.println(petHouse[j].getName() + " says " + petHouse[j].speak());
        }

    }

}
