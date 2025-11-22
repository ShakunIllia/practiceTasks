public class Recipe {

    String name;
    String ingredients;
    int servingSize;
    double cost;

    public double costPerPerson() {
        return cost / servingSize;
    }

    @Override
    public String toString() {
        return "Recipe for " + name + " will require these ingredients:\n" +
                ingredients + "\n" +
                "This dish will serve " + servingSize + " people and cost a total of $ " + cost;
    }

}
