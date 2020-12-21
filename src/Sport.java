import java.util.Arrays;

class Sport implements FootballTeam,HockeyTeam{
    private final int[] hocScore;
    private final int[] footScore;

    public Sport(int[] hockeyPlayers, int[] footballPlayers) {
        this.hocScore = hockeyPlayers;
        this.footScore = footballPlayers;
    }
    @Override
    public int calculateHockeyScore() {
        return Arrays.stream(this.hocScore).sum();
    }
    @Override
    public int findHighestGoalByIndividualInHockey() {
        return Arrays.stream(this.hocScore).max().getAsInt();
    }
    @Override
    public int calculateFootballScore() {
        return Arrays.stream(this.footScore).sum();
    }
    @Override
    public int findHighestGoalByIndividualInFootball() {
        return Arrays.stream(this.footScore).max().getAsInt();
    }
}
