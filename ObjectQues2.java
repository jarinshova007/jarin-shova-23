import java.util.Scanner;

class Person {
    String name;
    int age;
    int height; // in cm
    float weight;

    public void displayInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Height: " + this.height);
        System.out.println("Weight: " + this.weight);
    }

    public void feed(float kg) {
        weight = weight + (kg * 1 / 10);
        System.out.println(weight);
        System.out.println("Increased weight: " + weight);
    }

    public void sick(float kg) {
        weight = weight - (kg * 1 / 10);
        System.out.println("Decreased weight: " + weight);
    }

    Person(String name, int age, int height, float weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }
}
public class ObjectQues2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        System.out.print("Enter height: ");
        int height = sc.nextInt();
        System.out.print("Enter weight: ");
        float weight = sc.nextFloat();

        Person mrx = new Person(name, age, height, weight);
        mrx.displayInfo();
        System.out.print("Enter the amount of food (kg): "); // How much weight a person gains
        float kg1 = sc.nextFloat();
        mrx.feed(kg1);
        System.out.print("Enter the amount of food (kg): "); // How much weight a person loses
        float kg2 = sc.nextFloat();
        mrx.sick(kg2);

        sc.close();
        
    }
}
