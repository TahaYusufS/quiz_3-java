public class BasketballPlayer extends Player{
    private int assists;
    private int ribounds;
    private int points;
    public BasketballPlayer(){

    }
    public BasketballPlayer(String name,String position,String team,int energy,int assists,int ribounds,int points){
        this.setName(name);
        this.setPosition(position);
        this.setTeam(team);
        this.setPoints(points);
        this.setAssists(assists);
        this.setRibounds(ribounds);
        this.setEnergy(energy);

    }

    @Override
    public String toString() {
        return super.toString()+"\nplayer Number of assist: "+this.getAssists()+
                "\nPlayer number of ribound: "+ this.getRibounds()+
                "\nPlayer number of points: "+this.getPoints();
    }

    @Override
    public void doTraining() {
        int current_e=this.getEnergy()-30;
        this.setEnergy(current_e);
    }

    public int getAssists() {
        return assists;
    }

    public void setAssists(int assists) {
        this.assists = assists;
    }

    public int getRibounds() {
        return ribounds;
    }

    public void setRibounds(int ribounds) {
        this.ribounds = ribounds;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
}
