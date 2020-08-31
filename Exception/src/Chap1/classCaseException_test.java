package Chap1;

public class classCaseException_test {
    public static void main(String[] args) {
        Animal animal = new Dog();
        //Dog dog = (Dog)animal;  //정상코드
        //Cat cat = (Cat)animal;  //비정상코드

        Dog dog1 = new Dog();
        changeDog(dog1);

        Cat cat1 = new Cat();
        changeDog(cat1);


    }

    public static void changeDog(Animal animal) {
        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
        } else {
            System.out.println("변환오류");
        }
    }
}

class Animal {
}

class Dog extends Animal {
}

class Cat extends Animal {
}
