
public class FootballPlayer extends Player{
    private int assists;
    private int goals;

    public FootballPlayer(){

    }

    public FootballPlayer(String name,String position,String team,int energy,int assists,int goals){
        this.setEnergy(energy);
        this.setName(name);
        this.setTeam(team);
        this.setPosition(position);
        this.setGoals(goals);
        this.setAssists(assists);
    }

    @Override
    public String toString() {
        return super.toString()+"\ngoals: "+this.getGoals()+
                "\nassists: "+this.getAssists();
    }

    @Override
    public void doTraining() {
        int current_e=this.getEnergy()-50;
        this.setEnergy(current_e);
    }


    public int getAssists() {
        return assists;
    }

    public void setAssists(int assists) {
        this.assists = assists;
    }

    public int getGoals() {
        return goals;
    }

    public void setGoals(int goals) {
        this.goals = goals;
    }
}
