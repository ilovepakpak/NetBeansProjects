package tictactoee;
public abstract  class PlayerDetail  {
    double point , game ;

    public PlayerDetail() {
    }

    public PlayerDetail(double point, double game) {
        this.point = point;
        this.game = game;
    }

    public double getPoint() {
        return point;
    }

    public void setPoint(double point) {
        this.point = point;
    }

    public double getGame() {
        return game;
    }

    public void setGame(double game) {
        this.game = game;
    }

    @Override
    public String toString() {
        return  point + ", " + game ;
    }
    
   
    public abstract double tinhDiem();
    
   
}
