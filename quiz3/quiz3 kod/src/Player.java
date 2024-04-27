public abstract class Player {
    private String name;
    private String position;
    private String team;
    private int energy;

    public Player(){

    }
    public Player(String name,String position,String team){//it says enter three parameters so i did not include the energy parameter.I will set energy later in the other constructors.

        this.setName(name);
        this.setPosition(position);
        this.setTeam(team);


    }


    @Override
    public String toString(){//getenergy çıkartılabilir belki
        return "Player name: "+this.getName()+
                "\nPlayer position: "+this.getPosition()+
                "\nPlayer team: "+this.getTeam()+
                "\nPlayer energy: "+this.getEnergy() ;
    }

    public abstract void doTraining();


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }
}
