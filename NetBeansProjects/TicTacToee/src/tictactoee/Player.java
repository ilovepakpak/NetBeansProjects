package tictactoee;

public class Player extends PlayerDetail {

    protected String name, id;

    public Player(String name, String id, int point, int game) {
        super(point, game);
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Player() {
    }

    @Override
    public String toString() {
        return name + ", " + id +", " +super.toString() + ", " + tinhDiem() + "%";
    }

    @Override
    public double tinhDiem() {
        return (double)super.point/(double)super.game*100;
    }

}
