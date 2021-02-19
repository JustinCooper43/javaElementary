package com.streltsov.javaElementary.course.homeworks.hw8;

public class TestArrayGen {

    public static void main(String[] args) {

        DynamicList<Dog> listDog = new DynamicArray<>();
        DynamicList<Cat> listCat = new DynamicArray<>();

        Dog dog1 = new Dog("Tuzik", 1);
        Dog dog2 = new Dog("Sharik", 2);
        Dog dog3 = new Dog("Bobik", 3);
        Dog dog4 = new Dog("Barbos", 4);
        Dog dog5 = new Dog("Mailo", 5);
        Dog dog6 = new Dog("Rex", 6);

        listDog.add(dog1);   // add method
        listDog.add(dog2);
        listDog.add(dog3);
        listDog.add(dog4);
        listDog.add(dog5);
        listDog.add(dog6);

        Cat cat1  = new Cat("Murzik",1);
        Cat cat2  = new Cat("Pushok",2);
        Cat cat3  = new Cat("Murka",3);
        Cat cat4  = new Cat("Koshka",4);
        Cat cat5  = new Cat("Kompot",5);
        Cat cat6  = new Cat("Karamelka",6);
        Cat cat7  = new Cat("Keks",7);
        Cat cat8  = new Cat("Cherniysh",8);

        listCat.add(cat1);     // add method
        listCat.add(cat2);
        listCat.add(cat3);
        listCat.add(cat4);
        listCat.add(cat5);
        listCat.add(cat6);
        listCat.add(cat7);
        listCat.add(cat8);

        listDog.add(null);  // add method (null)

        listDog.addAll(null); // addAll method (null)

        Object removeFirstObject = listDog.removeFirst(cat1); // removeFirst method

        Object removeFirstNull = listDog.removeFirst(null); // removeFirst method (null)

        Object removeObject = listDog.remove(4); // remove method

        Object replaceObject = listDog.replace(2,cat4); // replace method

        DynamicList<Dog> subList = listDog.sublist(5); // sublist method from i

        DynamicList<Dog> partList = listDog.sublist(2,7); // sublist method from i to i

        int lengthDynamicList = partList.size();

        subList.removeAll();

        subList.add(cat1);

        subList.removeAll();

        listDog.addAll(listDog);

    }

}
