class Dog {
    protected String name;

    Dog(String n) {
        name = n;
    }

    String getName() {
        return name;
    }

    String speak() {
        return "Bark";
    }
}

class labrador extends Dog {
    private String color;
    private int weight;

    labrador(String n, int w, String c) {
        super(n);
        color = c;
        weight = w;

    }

    String speak() {
        return "Woof";
    }

    int breedWeight() {
        return weight;
    }

    String printColor() {
        return color;
    }
}

class printBreed {
    public static void main(String args[]) {
        labrador l = new labrador("Labrador", 60, "Brown");

        System.out.println("Name: " + l.name + "\nColor: " + l.printColor() + "\nWeigth: " + l.breedWeight()
                + "\nSpeaks: " + l.speak());
    }
}