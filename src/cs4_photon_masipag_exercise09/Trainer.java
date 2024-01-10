package cs4_photon_masipag_exercise09;
import java.util.*;

public class Trainer {
    private String name;
    private Monster activeMonster;
    private ArrayList<Monster> team;

    public Trainer(String n){
        this.name = n;
        this.activeMonster = null;
        this.team = new ArrayList<>();
    }

    public Monster getActiveMonster(){
        return activeMonster;
    }
    public ArrayList<Monster> getTeam(){
        return team;
    }
    public String getName() {
        return name;
    }
    public void capture(Monster m){
        if(m.getHP() < m.getMaxHP()*0.2){
            team.add(m);
            System.out.println(this.getName() + " caught " + m.getName() + ".");
        }
        else{
            System.out.println(this.getName() + " failed to catch " + m.getName() + ".");
        }
    }
    public void battle(Monster m){
        activeMonster.attack(m);
    }
    public void battle(Trainer t){
        activeMonster.attack(t.getActiveMonster());
    }
    public void sureCapture(Monster m) throws AlreadyCapturedException, FullTeamException{
        if(team.contains(m)){
            throw new AlreadyCapturedException("The selected monster is already in the trainer's team.\n");
        } 
        if(team.size() == 6){
            throw new FullTeamException("The trainer's team is already full.\n");
        }
        team.add(m);
        System.out.printf("%s was successfully captured.\n", m.getName());
    }
    public void release(Monster m) throws NotInTeamException{
        if(!team.contains(m)){
            throw new NotInTeamException("The selected monster is not in the trainer's team.\n");
        }
        team.remove(m);
        System.out.printf("%s was released from the team.\n", m.getName());
    }
}
