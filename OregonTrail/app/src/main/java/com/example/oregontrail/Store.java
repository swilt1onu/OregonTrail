package com.example.oregontrail;

import com.example.oregontrail.Items;

public class Store {



    Items Food = new Items(.05, 2000, "Food0", "food description");
    Items Clothing = new Items(.40, 8, "Clothing1", "Clothing Description");
    Items CookingItems = new Items(1, 20, "CookingItems2", "Cooking Item Description" );
    Items Oxen = new Items(30, 6, "Oxen", " Oxen Description3");
    Items SpareWagonWheel = new Items(8, 3, "SpareWagonWheel4", "SpareWagonWheel Description");
    Items MedKit = new Items(3, 1, "Medkit5", "Medkit Description");
    Items Blankets = new Items(.50, 6, "Blankets6", "Blanket Description");
    Items SewingKit = new Items(2, 1, "SewingKit7", "SewingKit Description" );
    Items ExtraWagonTarp = new Items(3, 2, "ExtraWagonTarp8", "Description extrawagontarp");
    Items FireStartingKit = new Items(.30, 4, "FireStartingKit9", "fireStartingKit description");


    Items[] itemsArray = {Food, Clothing,CookingItems,Oxen ,SpareWagonWheel ,MedKit ,Blankets , SewingKit,ExtraWagonTarp , FireStartingKit};
    public void moneyUsed(int position,int amountOfMoney){
        itemsArray[position].moneyUsed(amountOfMoney);
    }
/**
 System.out.println("Item 0 - " + item0.getItemName() + ", Cost: $" + item0.getCost() + ", Available: " + item0.getAmountAvailable() + "lbs" + " : "+ item0.getItemDescription());
 System.out.println("Item 1 - " + item1.getItemName() + ", Cost: $" + item1.getCost() + ", Available: " + item1.getAmountAvailable() + "lbs" + " : "+ item1.getItemDescription());
 System.out.println("Item 2 - " + item2.getItemName() + ", Cost: $" + item2.getCost() + ", Available: " + item2.getAmountAvailable() + "lbs" + " : "+ item2.getItemDescription());
 System.out.println("Item 3 - " + item3.getItemName() + ", Cost: $" + item3.getCost() + ", Available: " + item3.getAmountAvailable() + "lbs" + " : "+ item3.getItemDescription());
 System.out.println("Item 4 - " + item4.getItemName() + ", Cost: $" + item4.getCost() + ", Available: " + item4.getAmountAvailable() + "lbs" + " : "+ item4.getItemDescription());
 System.out.println("Item 5 - " + item5.getItemName() + ", Cost: $" + item5.getCost() + ", Available: " + item5.getAmountAvailable() + "lbs" + " : "+ item5.getItemDescription());
 System.out.println("Item 6 - " + item6.getItemName() + ", Cost: $" + item6.getCost() + ", Available: " + item6.getAmountAvailable() + "lbs" + " : "+ item6.getItemDescription());
 System.out.println("Item 7 - " + item7.getItemName() + ", Cost: $" + item7.getCost() + ", Available: " + item7.getAmountAvailable() + "lbs" + " : "+ item7.getItemDescription());
 System.out.println("Item 8 - " + item8.getItemName() + ", Cost: $" + item8.getCost() + ", Available: " + item8.getAmountAvailable() + "lbs" + " : "+ item8.getItemDescription());
 System.out.println("Item 9 - " + item9.getItemName() + ", Cost: $" + item9.getCost() + ", Available: " + item9.getAmountAvailable() + "lbs" + " : "+ item9.getItemDescription());
 **/

}
