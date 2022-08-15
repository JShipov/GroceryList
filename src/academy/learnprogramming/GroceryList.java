package academy.learnprogramming;

import java.util.ArrayList;

public class GroceryList {

    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addGroceryItem (String item) {
      this.groceryList.add(item);
    }

    public void printGroceryList () {
        System.out.println("You have " + this.groceryList.size() + " items in your grocery list");
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println((i+1) + ". " + (String)this.groceryList.get(i));
        }
    }

    public void modifyGroceryItem (String currentItem, String newItem) {
        int position = this.findItem(currentItem);
        if (position >= 0) {
            this.modifyGroceryItem(position, newItem);
        }
    }

    private void modifyGroceryItem (int position, String newItem) {
        this.groceryList.set (position, newItem);
        System.out.println("Grocery item " + (position+1) + " has been modified");
    }

    public void removeGroceryItem (String item) {
        int position = this.findItem(item);
        if (position >= 0) {
            this.removeGroceryItem(position);
        }
    }

    private void removeGroceryItem (int position) {
        this.groceryList.remove(position);
    }

    private int findItem (String searchItem) {
         return this.groceryList.indexOf(searchItem);
    }

    public boolean onFile (String searchItem) {
        int position = this.findItem(searchItem);
        return position >= 0;
    }
}
