package ru.mirea.dogclass;

public class DogTest {
    public static void main(String[] args){
        Dog[] pets= new Dog[2];//а как сделать размер не фиксированным?
        pets[0] = new Dog("Frosya",2);
        pets[1] = new Dog("Seva");
        pets[1].setAge(19);
        System.out.print(pets[1]);
        pets[0].humanAge();


    }
}
