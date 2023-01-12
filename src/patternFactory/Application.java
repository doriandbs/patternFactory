package patternFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Application {
    public static void main(String[] args) throws IOException {
        EnemyFactory enemyFactory = new EnemyFactory();
        EnemySoldier enemy = null;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Veuillez choisir l'ennemi (S/R)");
        String enemyType = br.readLine();
        enemy = enemyFactory.makeEnemy(enemyType);
        if(enemy!=null){
            enemy.shoot();
        }

    }
}
