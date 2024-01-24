/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package photon.masipag.photon.serate.photon.ragsac_2ndqtrprojectdesign;

/**
 *
 * @author Photon-Masipag-Photon-Serate-Photon-Ragsac_2ndQtrProjectDesign
 */
public class Main {
  public static void main(String[] args) {

    // Location Declarations
    Player Player = new Player("Player");
    Location ElectricalRoom = new Location("Electrical Room", false, Player);
    Location PatientQuarters = new Location("Patient Quarters", false, Player);
    Location CommandCenter = new Location("Command Center", false, Player);
    Location DiningHall = new Location("Dining Hall", false, Player);
    Location Courtyard = new Location("Courtyard", true, Player);
    Location Outside = new Location("Outside", true, Player);

    ElectricalRoom.addConnection(CommandCenter);
    CommandCenter.addConnection(ElectricalRoom);

    CommandCenter.addConnection(DiningHall);
    DiningHall.addConnection(CommandCenter);

    DiningHall.addConnection(PatientQuarters);
    PatientQuarters.addConnection(DiningHall);
    
    DiningHall.addConnection(Courtyard);
    Courtyard.addConnection(DiningHall);

    Courtyard.addConnection(Outside);
      

    // Items
    // Keys
    Item KeyCardA = new Item("Key Card A",
        "A labeled plastic card with a magnetic strip. For usage in electronic readers and access panels");
    Item KeyCardB = new Item("Key Card B",
        "A labeled plastic card with a magnetic strip. For usage in electronic readers and access panels.");
    Item OddKey = new Item("Key",
        "A small metallic key with an engraved '2^11' on the side. Could be used to open a certain container.");

    // Tools
    Item Crowbar = new Item("Crowbar",
        "A sturdy metal crowbar for prying open doors and crates. Ideal for breaching locked areas, but beware of the noise it makes.");
    Item Screwdriver = new Item("Screwdriver",
        "A versatile tool. Could be used to open machinery and extract its components.");

    // Weapons
    Item Cleaver = new Item("Cleaver", "A bloody heavy kitchen knife for chopping... food?");
    Item TaserGun = new Item("Taser Gun",
        "A compact electroshock weapon for self-defense. Only has 1 charge, use strategically to incapacitate enemies.");
    Item Spoon = new Item("Spoon", "A simple utensil. Quite lonely without a fork.");
    Item Fork = new Item("Fork", "A simple utensil. Quite lonely without a spoon.");

    // Furniture (Storage Space) Declarations
    Furniture Cabinet = new StorageSpace("Cabinet", DiningHall, "A small wooden cabinet.", OddKey, Player);
    Furniture FoodTray = new StorageSpace("Food Tray", DiningHall, "A large tray with a variety of food chunks.", Spoon, Player);

    Furniture Desk = new StorageSpace("Desk", CommandCenter, "A large wooden desk.", Screwdriver, Player);

    Furniture BrokenLocker = new StorageSpace("Broken Locker", ElectricalRoom, "A broken locker.", KeyCardA, Player);

    Furniture BedsideTable = new StorageSpace("Bedside Table", PatientQuarters, "A worn out and rotten wooden table", Fork, Player);

    // Furniture (Gateways) Declarations

    Furniture ElectricalGate = new Gateway("Electrical Box", ElectricalRoom,"Contains the switch to unlock the Courtyard gate.", Outside, 2048);

 

    // ------------ SYSTEMS

    // Plot/Opening Scene
    System.out.println("The Edge of Midnight, a text-based " +
        "\npsychological horror game, unfolds in an" +
        "\noverrun lunatic asylum. You're an inspector " +
        "\nassigned to Project Lunarity, a mental health" +
        "\nhospital where the worst lunatics are placed." +
        "\nIncidents increase as midnight approaches." +
        "\n\nOn inspection day, a violent crowd forms in " +
        "\nthe main dining hall. As an inspector, you head" +
        "\nto the observation deck to gather information." +
        "\nScreams erupt, turning violent. Security guards" +
        "\nare overwhelmed, and patients take control." +
        "\nChaos spreads into other rooms. Knockout gas" +
        "\nengulfs the facility, but you're left behind." +
        "\nYou lose consciousness and fall 2 stories into" +
        "\nthe dining hall." +
        "\n\nYou wake up..." +
        "\nIt's 8pm. The dining hall is empty." +
        "\nYou hear noises from other rooms." +
        "\n\nWhat do you do?" +
        "\n\n----------------\n");
    ;

    // Game Loop
    int time = 1800;
// Replace forced scenario with this to put your own inputs: Player.getLocation().displayLocationMenu();

    
    // Scenario 1: Player runs out of time and loses
    System.out.println("Scenario 1: Player runs out of time and loses.");
    Player.moveLocation(DiningHall);
    time = 2380;
    while (time < 2400 && Player.getAlive() == true) {
      System.out.println("\nA move was done.");

      time = time + 10;

      if(time >=2400) {
        Player.setAlive(false);
      }
    } 
    if(!Player.getAlive()) {
      System.out.println("As midnight strikes, frenzied patients corner\nyou in the asylum's depths. Their haunting cries\ndrown you. The relentless pursuit reaches its\ncrescendo at the edge of midnight.\n\nGame Over. \n\nThe asylum's abyss claims your life, lost forever\nin its haunting horrors.");
    } else {
      System.out.println("With a surge of adrenaline, you sprint through the open gate, leaving the asylum's horrors behind. The cool night air embraces you as you step into the outside world. Congratulations, you've escaped the asylum at the edge of midnight. The nightmare is over, and a new chapter begins." + "\n\nYou Win! \n\n You've escaped!");
    }
    
    // Scenario 2: Player moves rooms
    System.out.println("\n----------------\n\nScenario 2: Player moves rooms");
    System.out.println("\nYou are in the " + Player.getLocation().getName() + ".\nWhat do you want to do: Move Rooms");
    System.out.println("\nEnter your choice: Command Center");
    
    Player.moveLocation(CommandCenter);
    System.out.println("You moved to the " + Player.getLocation().getName() + "."); 
    
    // Scenario 3: Player interacts with furniture
    System.out.println("\n----------------\n\nScenario 3: Player interacts with furniture");
    System.out.println("\nInspecting furniture..."); 
    Player.inspectFurniture(Cabinet);
  }
}