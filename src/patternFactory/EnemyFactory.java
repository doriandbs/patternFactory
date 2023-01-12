package patternFactory;

public class EnemyFactory {

    public EnemySoldier makeEnemy(String enemyType) {
        EnemySoldier enemy = null;
        if (enemyType.equals("S")) {
            enemy = new SniperEnemy();
        } else if (enemyType.equals("R")) {

                enemy = new RocketLuncherEnemy();
            }
        else{
            return enemy;
        }

        return enemy;
    }


}
